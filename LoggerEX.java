import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;

public class LoggerEX {
    private static final Logger logger = Logger.getLogger(LoggerEX.class);

    public static void main(String[] args) {
       BasicConfigurator.configure();
        logger.debug("this is debugging");
        logger.info("This is an info message");
        logger.error("This is an error message");
        logger.debug("This is a debug message");
    }
}
