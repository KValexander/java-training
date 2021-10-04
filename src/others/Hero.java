package others;

public class Hero extends Person implements Good,Evil {
	
	private String power;
	
	public Hero(String name, int age, String power) {
		super(name, age);
		this.setPower(power);
	}
	
	public void setPower(String power) {
		this.power = power;
	}
	
	@Override
	public void go() {
		System.out.println("Hero does *brrrrrrrrrrrrr*");
	}
	
	@Override
	public String toString() {
		return super.toString() + this.power;
	}
	
	@Override
	public void saveHuman() {
		System.out.println(this.getName() + " saves human");
	}
	
	@Override
	public void doomHuman() {
		System.out.println(this.getName() + " doom human");
		
	}
}
