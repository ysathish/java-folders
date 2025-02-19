package collections;

public class Phone
{
	String mobName;
	int price;
	public Phone(String mobName, int price) {
		super();
		this.mobName = mobName;
		this.price = price;
	}
	@Override
	public String toString() {
		return "mobName=" + mobName + ", price=" + price ;
	}
	

}
