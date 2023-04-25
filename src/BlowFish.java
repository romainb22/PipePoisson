public class BlowFish {

    protected final byte[][][] sBoxes; //F function keys
    protected final byte[][] pArray; // subkeys

    public BlowFish(byte[][][] sBoxes,byte[][] pArray)
    {
        this.sBoxes = sBoxes;
        this.pArray = pArray;
    }

    public static byte[] add(byte[] a,byte[] b)//addition modulo 2^32
    {
        byte[] c = new byte[a.length];
        byte carry = 0;
        for(int i = a.length-1;i>=0;i--)
        {
            c[i] = (byte) (a[i] + b[i] + carry);
            if(c[i] < a[i])
            {
                carry = 1;
            }
            else
            {
                carry = 0;
            }
        }
        return c;
    }

    public static byte[] xor(byte[] a,byte[] b)
    {
        for(int i = 0;i<a.length;i++)
        {
            a[i] ^= b[i];
        }
        return a;
    }

    public byte[] F(byte[] half)
    {
        byte a = half[0];
        byte b = half[1];
        byte c = half[2];
        byte d = half[3];
        byte[] result = add(sBoxes[0][Math.abs(a)],sBoxes[1][Math.abs(b)]);
        byte[] r2 = xor(result,sBoxes[2][Math.abs(c)]);
        return add(r2,sBoxes[3][Math.abs(d)]);
    }

    public byte[] blow_rec(byte[] left, byte[] right, int i)
    {
        byte[] newLeft;
        byte[] newRight;
        if(i == 16)
        {
            byte[] result = new byte[8];
            newRight = xor(left,pArray[i]);
            newLeft = xor(right,pArray[i+1]);
            System.arraycopy(newLeft, 0, result, 0, 4);
            System.arraycopy(newRight, 0, result, 4, 4);
            return result;
        }
        newRight = xor(left,pArray[i]);
        newLeft = xor(right,F(newRight));
        return blow_rec(newRight,newLeft,i+1);
    }

    public byte[] blow(byte[] block64)
    {
        if(block64.length != 8) {
            throw new IllegalArgumentException("block must be 8 bytes (64 bits))");
        }
        byte[] left = new byte[4];
        byte[] right = new byte[4];
        System.arraycopy(block64, 0, left, 0, 4);
        System.arraycopy(block64, 4, right, 0, 4);
        left[0] ^= pArray[0][0];
        left[1] ^= pArray[0][1];
        left[2] ^= pArray[0][2];
        left[3] ^= pArray[0][3];
        byte[] nr = xor(right,F(left));
        return blow_rec(nr,left,0);
    }
}
