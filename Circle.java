package Test_class3;

public class Circle {
	private int r;
	private double circum, area;
	
	public int getR() {
		return r;
	}
	public void setR(int r) {
		this.r = r;
	}
	public double getCircum() {
		return circum;
	}
	public double getArea() {
		return area;
	}
	
	public void calcCircum() {
		circum=2*Math.PI*r;	//원 둘레
	}
	
	public void clacArea() {
		area=Math.PI*Math.pow(r,2);	//원의 면적		//Math.PI=파이, Math.pow(r,2)=r을 2제곱함
	}
}
