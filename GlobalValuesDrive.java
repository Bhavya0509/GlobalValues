import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class GlobalValuesDrive {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		Properties prop = new Properties();
		FileInputStream file = new FileInputStream("C:\\Users\\2046171\\eclipse-workspace\\Globalvalues\\src\\data.properties");
		prop.load(file);
		System.out.println(prop.getProperty("browser"));
		System.out.println(prop.getProperty("url"));
		
		//if we want to change values at runtime then 
		
		prop.setProperty("browser", "gecko");
		System.out.println(prop.getProperty("browser"));
		
		//to write the changed value in properties file we use fileoutputstream
		
		FileOutputStream files = new FileOutputStream("C:\\Users\\2046171\\eclipse-workspace\\Globalvalues\\src\\data.properties");
		prop.store(files, null);
		

	}

}
