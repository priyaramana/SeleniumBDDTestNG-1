package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class configReader {

	private static Properties properties;
	
	public static void loadconfig() {
		try {
			FileInputStream fs = new FileInputStream("src/test/resources/config.properties");
			properties = new Properties();
			properties.load(fs);
		}
		catch (IOException e){
			System.out.println("unable to load properties");
			
		}
	}
	public static String get(String key) {
		if(properties==null) {
			loadconfig();
		}
		return properties.getProperty(key);
	}
	
}
