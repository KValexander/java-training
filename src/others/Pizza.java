package others;

public class Pizza {

//	Variables
	private String bread;
	private String sauce;
	private String cheese;
	private String topping;

//	Constructors
	Pizza() {
	}
	
	Pizza(String bread) {
		this.setBread(bread);
	}
	
	Pizza(String bread, String sauce) {
		this.setBread(bread);
		this.setSauce(sauce);
	}
	
	Pizza(String bread, String sauce, String cheese) {
		this.setBread(bread);
		this.setSauce(sauce);
		this.setCheese(cheese);
	}
	
	Pizza(String bread, String sauce, String cheese, String topping) {
		this.setBread(bread);
		this.setSauce(sauce);
		this.setCheese(cheese);
		this.setTopping(topping);
	}
	
//	Constructor copy object
	Pizza(Pizza x) {
		this.copy(x);
	}
	
//	toString
	public String toString() {
		return bread + " " + sauce+ " " + cheese + " " + topping;
	}
	
//	Copy object
	public void copy(Pizza x) {
		this.setBread(x.getBread());
		this.setSauce(x.getSauce());
		this.setCheese(x.getCheese());
		this.setTopping(x.getTopping());
	}
	
//	Get
	public String getBread() {
		return this.bread;
	}
	
	public String getSauce() {
		return this.sauce;
	}
	
	public String getCheese() {
		return this.cheese;
	}
	
	public String getTopping() {
		return this.topping;
	}
	
//	Set
	public void setBread(String bread) {
		this.bread = bread;
	}
	
	public void setSauce(String sauce) {
		this.sauce = sauce;
	}
	
	public void setCheese(String cheese) {
		this.cheese = cheese;
	}
	
	public void setTopping(String topping) {
		this.topping = topping;
	}

}
