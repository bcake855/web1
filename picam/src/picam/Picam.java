package picam;

import com.pi4j.io.gpio.GpioController;
import com.pi4j.io.gpio.GpioFactory;
import com.pi4j.io.gpio.GpioPinDigitalInput;
import com.pi4j.io.gpio.PinPullResistance;
import com.pi4j.io.gpio.RaspiPin;

public class Picam {

	public Picam() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {

		System.out.println("Reading GPIOs");
		
		// create gpio controller instance
		final GpioController gpio = GpioFactory.getInstance();
		System.out.println("set GPIOs");
		if (gpio != null){
			System.out.println("Reading GPIO 0");
			final GpioPinDigitalInput gpio0 = gpio.provisionDigitalInputPin(RaspiPin.GPIO_00, 
	                  PinPullResistance.PULL_DOWN);	
			if (gpio0 != null){
				if (gpio0.isHigh()){
					System.out.println("GPIO 0 is high. Configure pi for periodic snapshot. ..");
					GPIOconf enabledGpioConfig = new GPIOconf(0);
					System.out.println(enabledGpioConfig.getEnabledGpio().getFrequency());
					System.out.println(enabledGpioConfig.getEnabledGpio().getWidth());
					System.out.println(enabledGpioConfig.getEnabledGpio().getHeight());
				}else {
					System.out.println("GPIO is low");

				}
			}
		}
		
		
		
		  
	}

}
