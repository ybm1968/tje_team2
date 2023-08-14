package _24_27;

public class Driver {
	
	public static void main(String[] args) {

		RemoteControl RcCarRc = new RcCar();
		RcCarRc.turnOn();
		RcCarRc.setSpeed(150);
		RcCarRc.setMute(true);
		RcCarRc.turnOff();
		RemoteControl.changeBattery();
		System.out.println();
		
		RemoteControl DroneRc = new Drone();
		DroneRc.turnOn();
		DroneRc.setSpeed(150);
		DroneRc.setMute(false);
		DroneRc.turnOff();
		RemoteControl.changeBattery();
		System.out.println();
		
	}
}


