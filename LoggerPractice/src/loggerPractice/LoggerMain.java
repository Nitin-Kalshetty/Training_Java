package loggerPractice;


import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoggerMain {

	public static final Logger logger = LogManager.getLogger(LoggerMain.class);
//	public static final Logger logger = Logger.class.
	
	
	public static void main(String[] args) {
		logger.info("I am first");
//		org.apache.logging.log4j.core.config.Configurator.setRootLevel(org.apache.logging.log4j.Level.DEBUG);
		logger.info("I am info");
		logger.warn("I am warn");
		logger.fatal("I am fatal");
		logger.error("I am error");
		logger.debug("I am debug");
		logger.trace("I am trace");
		
	}

}

