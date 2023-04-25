import java.nio.charset.StandardCharsets;
import java.security.SecureRandom;

public class Main {
	public static final Logger logger;

	static {
		try {
			logger = new Logger("logs.txt");
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	public static void main(String[] args) {
		logger.log("Starting...");
		SecureRandom random = new SecureRandom();
		byte[] key = new byte[16];
		random.nextBytes(key);
		byte[] bcrypt = new Bcrypt(10, key, "Test").encrypt();
		//byte to utf-8 string
		String bcryptString = new String(bcrypt, StandardCharsets.UTF_8);
		logger.log("Encrypted: "+bcryptString);
		logger.log("Done.");
		try {
			logger.close();
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
}
