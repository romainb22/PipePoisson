import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Date;

public class Logger {
    private final FileOutputStream logs;
    public Logger(String path) throws Exception {
        logs = new FileOutputStream(path);
    }
    public void log(String message){
        message = new Date() + " [INFO] " + message + "\n";
        try {
            logs.write(message.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void logError(String message) {
        message = new Date() + " [ERROR] " + message + "\n";
        try {
            logs.write(message.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void logWarning(String message) {
        message = new Date() + " [WARNING] " + message + "\n";
        try {
            logs.write(message.getBytes());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public void close() throws Exception {
        logs.close();
    }

}
