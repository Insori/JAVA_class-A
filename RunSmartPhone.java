package Test_smartphone;

public class RunSmartPhone {

	public static void main(String[] args) {
		S21 s=new S21();
		s.sendCall("010 2222 7777");
		s.receiveSMS("010-5555-1111");
		s.installApp("Google Map");
		s.runApp("Google Map");
		String music=s.searchMusic("Hello future");
		s.playMusic(music);
		s.stopMusic();
	}

}
