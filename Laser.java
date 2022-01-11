package Test_overriding1;

public class Laser extends Weapon {
	public void fire() {
		super.fire();
		System.out.println("ÂîÀÌ~À×!");
	}
}
