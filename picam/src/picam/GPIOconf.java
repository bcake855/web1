package picam;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GPIOconf {

//	private  final static String GPIO_PROPERTIES = File.pathSeparator + "home" + File.pathSeparator + "pi" + File.pathSeparator + "cam" + File.pathSeparator ;
	
//	private  String optionalXml = "/Users/bcake855/Desktop/piconfig/";
	
	private GPIO enabledGpio;
	
	public GPIO getEnabledGpio() {
		return enabledGpio;
	}


	public void setEnabledGpio(GPIO enabledGpio) {
		this.enabledGpio = enabledGpio;
	}


	public GPIOconf(int activeGpio) {
		this.enabledGpio = new GPIO();
		init(this.enabledGpio, activeGpio);
	}
	

	public void init(GPIO enabledGpio,int num){
		
		File propFile = new File(num + "_gpio.properties");
		System.out.println(propFile.getAbsolutePath());
		try (InputStream input = new FileInputStream(propFile.getAbsolutePath())) {

            Properties prop = new Properties();
            prop.load(input);

    		System.out.println("Reading properties");

            if (prop.getProperty("frequence") != null){
            	enabledGpio.setFrequency(Integer.parseInt(prop.getProperty("frequence")));
        		System.out.println("frequence:" + enabledGpio.getFrequency());

            }
            if (prop.getProperty("width") != null){
            	enabledGpio.setWidth(Integer.parseInt(prop.getProperty("width")));
        		System.out.println("width:" + enabledGpio.getWidth());

            }
            if (prop.getProperty("height") != null){
            	enabledGpio.setHeight(Integer.parseInt(prop.getProperty("height")));
        		System.out.println("height:" + enabledGpio.getHeight());

            }

        } catch (IOException ex) {
            ex.printStackTrace();
        }
	}
	
//	public static void main(String[] args) {
//		GPIOconf conf = new GPIOconf(0);
//		System.out.println(conf.getEnabledGpio().getWidth());
//		
//	}
}
