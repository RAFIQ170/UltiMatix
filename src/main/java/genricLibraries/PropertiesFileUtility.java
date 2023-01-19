package genricLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * This Class contains reusable method related to actions performed
 * @author mrafi
 *
 */
public class PropertiesFileUtility {
	private Properties property;
/**
 * 
 * @param path
 */
	public void propertyFileInitialization(String path) {
		
		
		FileInputStream fis=null;
		try {
			fis=new FileInputStream(path);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		property =new Properties();
		try {
			property.load(fis);
			
		} catch (IOException e) {
			
		e.printStackTrace();
		
			
		}
		
	}
/**
 * This method is used to 	Fetch The DataFrom The Properties 	File
 * @param key
 * @return
 */
public String fetchProperty(String key) {
	
	return property.getProperty(key);
}
/**
 * This Method is used to modify properties file
 * @param key
 * @param value
 * @param path
 * @param message
 */
public void modifyPropertiesFile(String key, String value, String path, String message) {
	
	property.put(key, value);
	FileOutputStream fos=null;
	
	try {
		fos=new FileOutputStream(path);			
	}catch (FileNotFoundException e) {
		e.printStackTrace();
	}
	try {
		property.store(fos, message);
	}catch (IOException e) {
		e.printStackTrace();
	}
}

}
