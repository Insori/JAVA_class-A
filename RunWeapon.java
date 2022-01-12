package Test_abstract1;

public class RunWeapon {

	public static void main(String[] args) {
		Soldier s=new Soldier();
		Tank t=new Tank();
		Fighter f=new Fighter();
		
		s.message();
		
		s.fire();
		s.walk();
		
		t.message();
		t.fire();
		t.forward();
		
		f.fire();
		f.fly();

	}

}
