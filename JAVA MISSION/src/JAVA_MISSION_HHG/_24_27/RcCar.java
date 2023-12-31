package JAVA_MISSION_HHG._24_27;
	
	public class RcCar implements RemoteControl {

		private int Speed;			
        private String changeBattery;
        
		@Override
		public void turnOn() {
			System.out.println("RcCar 전원을 켭니다.");
		}

		@Override
		public void turnOff() {
			System.out.println("RcCar 전원을 끕니다.");
		}

		@Override
		public void setSpeed(int Speed) {
			
			if( Speed > RemoteControl.MAX_SPEED ) {
				this.Speed = RemoteControl.MAX_SPEED;
			}
			
			else if( Speed < RemoteControl.MIN_SPEED ) {
				this.Speed = RemoteControl.MIN_SPEED;
			}
			else {
				this.Speed = Speed;
			}
			System.out.println("현재 RcCar 속력 : " + this.Speed);
		}
		
	}


