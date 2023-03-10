import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

public class Logger {
    private String path;
    private FileOutputStream logs;
    public Logger(String path) throws Exception {
        this.path = path;
        FileOutputStream fs = new FileOutputStream(path);
        logs = fs;
    }
    public void log(String message) throws Exception {
        message = new Date() + " [INFO] " + message + "\n";
        logs.write(message.getBytes());
    }
    public void logError(String message) throws Exception {
        message = new Date() + " [ERROR] " + message + "\n";
        logs.write(message.getBytes());
    }
    public void logWarning(String message) throws Exception {
        message = new Date() + " [WARNING] " + message + "\n";
        logs.write(message.getBytes());
    }
    public void close() throws Exception {
        logs.close();
    }

}
