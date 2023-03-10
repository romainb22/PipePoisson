import java.io.File;
import java.io.FileOutputStream;
import java.util.Date;

public class Logger {
    private final FileOutputStream logs;
    public Logger(String path) throws Exception {
        logs = new FileOutputStream(path);
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
