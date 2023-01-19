package genricLibraries;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
/**
 * 
 * @author mrafi
 *
 */
public class JavaUtility {
/**
 * This Method Generate Random number
 * @param limit
 * @return
 */
	
	public int genrateRandomNumber(int limit) {
	Random random=new Random();
		return random.nextInt(limit);
		
	}
	
/**
 * This Method is used to fetch the current date and time	
 * @return
 */
	public String getCurrentTime() {
		
		Date date=new Date();
		SimpleDateFormat sdf= new SimpleDateFormat("dd_mm_yyyy_hh_mm_sss");
		return sdf.format(date);
		

	}
	
	

}
