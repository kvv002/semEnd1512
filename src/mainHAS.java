
public class mainHAS {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			homeLights home1=new homeLights("tubeLight");
			home1.setOn();
			if(home1.isOn()){
				System.out.println("Lights are On");
			}
			else{
				System.out.println("Lights are off");
			}
			home1.setOff();
			if(home1.isOn()){
				System.out.println("Lights are On");
			}
			else{
				System.out.println("Lights are off");
			}
			
			
			TV myTv=new TV("BedRoomTv");
			myTv.setOn();
			myTv.channelUp();
			myTv.channelUp();
			System.out.println("channel number "+myTv.getChannelNumber());
			myTv.setOff();
			myTv.channelDown();
			System.out.println("channel number "+myTv.getChannelNumber());
			myTv.setOn();
			myTv.VolumeUp();
			System.out.println(myTv.getVolume());
			
			
			
			AC ac1=new AC("flipAc",23.4);
			ac1.setOn();
			System.out.println(ac1.isOn());
			
	}

}
