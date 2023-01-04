package store_stock;

public class InformationEntry {

	String item;
	double price;
	static double discount = 0.20;
	
	
//	Constructor without parameters
	
	InformationEntry() {
	}
	

//	Constructor with parameters
	
	InformationEntry(String item, double price) {
		this.item = item;
		this.price = price;
	}

//	Discount for customers
	
	double DiscountPrice() {
		return price * (1 - discount);
		
	}	
}
