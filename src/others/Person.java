package others;

public abstract class Person {
	
	private String name;
	private int age;
	
	Person(String name, int age) {
		this.setName(name);
		this.setAge(age);
	}
	
	abstract void go();
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getAge() {
		return this.age;
	}
	
	public String toString() {
		return this.name + " " + this.age + " ";
	}

}
