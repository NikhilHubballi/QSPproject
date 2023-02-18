package genericlibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
/**
 * This class contains all resuasable methods to perform operatopns on properties
 * @author SHAMBHULING
 *
 */

public class proprertiesfileUtility {
private	Properties property;
/**
 * this method is used to initialize propertieas file
 * @param filepath
 */
	

	public void propertiFileInitilization(String filepath)
	{
		FileInputStream  fis=null;
				{
			
			   try {
				   fis=new FileInputStream(filepath);
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
				
			}
			   /**
			    * This method returns the data from propetis file based on the key passed 
			    * @param return
			    * 
			    */
			   property=new Properties();
			   try
			   {
				   property.load(fis);
			   }
			   catch (IOException e) {
				e.printStackTrace();
			   }
				}
				
				}
				
				/**
				 * This method returns the data from properties file based on thr key pass
				 * @param key
				 * @return
				 */
				public  String fetchproperty(String Key)
				{
					return property.getProperty(Key);
				}
	
	
}
