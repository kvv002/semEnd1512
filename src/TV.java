
public class TV extends HAS{

	String tvName;
	int channelNumber=0;
	int volume=0;
	public TV(String tvName){
		this.tvName=tvName;
	}
	
	public void channelUp(){
		if(this.on==true){
		if(channelNumber==100){
			System.out.println("Maximum channel number Reached");
		}
		else
			channelNumber++;
		}
		else{
			System.out.println("TV IS OFF,PLEASE SWITCH ON");
		}
	}
	
	public void channelDown(){
		if(this.on==true){
		if(channelNumber==0){
			System.out.println("Minimum channel number Reached");
		}
		else
			channelNumber--;
		}
		else{
			System.out.println("TV IS OFF,PLEASE SWITCH ON");
		}
	}
	
	
	public void VolumeUp(){
		if(this.on==true){
		if(volume==100){
			System.out.println("Maximum volume Reached");
		}
		else
			volume=volume+5;
		}
		else{
			System.out.println("TV IS OFF,PLEASE SWITCH ON");
		}
	}
	
	public void VolumeDown(){
		if(this.on==true){
		if(volume==0){
			System.out.println("Minimum volume Reached");
		}
		else
			volume=volume-5;
		}
		else{
			System.out.println("TV IS OFF,PLEASE SWITCH ON");
		}
	}
	
	public int getChannelNumber() {
		return channelNumber;
	}
	
	public int getVolume() {
		return volume;
	}
	
	 
}
