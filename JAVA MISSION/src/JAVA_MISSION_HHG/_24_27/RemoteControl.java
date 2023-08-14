package JAVA_MISSION_HHG._24_27;

public interface RemoteControl {
	
	int MAX_SPEED = 200;			
	int MIN_SPEED = 10;
	
	public abstract void turnOn();
	public abstract void turnOff();
	public abstract void setSpeed(int speed);
	
	default void setMute(boolean mute) {
		if( mute ) {
			System.out.println("최고속력 설정");
			setSpeed(200);
		}
		else {
			System.out.println("최저속력 설정");
			setSpeed(10);
		}
	}
	
	static void changeBattery() {
		System.out.println("배터리 교체");
	}
}


