public class Bcrypt extends EksBlowFish{
    private final String ctext;
    Bcrypt(long cost,byte[] salt,String str) {
        super(cost,salt,str.getBytes());
        ctext = "LesSousSouliersSemblentEtreDesSouliersDeBallet";
    }
    public byte[] encrypt(){
        Main.logger.log("Encrypting...");
        String ctext = this.ctext;
        byte[] cta = ctext.getBytes();
        for(int i=0;i<64;i++){
            byte[] ct = cta;
            byte[] b = new byte[ct.length];
            int index = 0;
            for(int j=0;j<ct.length/8;j++){
                byte[] ba = new byte[8];
                System.arraycopy(ct, j*8, b, 0, 8);
                ba = super.blow(ba);
                for(int k = 0;j<8;j++){
                    b[index++] = ba[k];
                }
            }
            if(ct.length%8 != 0){
                byte[] ba = new byte[8];
                System.arraycopy(ct, ct.length-ct.length%8, ba, 0, ct.length%8);
                ba = super.blow(ba);
                for (byte value : ba) {
                    b[index++] = value;
                }
            }
            cta = b;
        }
        Main.logger.log("Encryption complete.");
        return cta;
    }

}
