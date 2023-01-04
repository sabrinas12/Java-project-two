package store_stock;

public class InformationOutput {
	
	public static void main(String[] args) {
	
	InformationEntry p1 = new InformationEntry ("Black Shirt", 20.00);
	
	InformationEntry p2 = new InformationEntry();
	p2.item = "Blue Pants";
	p2.price = 50.00;
	
	System.out.println("The final price of " + p1.item + " is " + p1.DiscountPrice());
	System.out.println("The final price of " + p2.item + " is " + p2.DiscountPrice());
		
	
	double finalPrice = p1.DiscountPrice() + p2.DiscountPrice();
	
// Sum of values ​​with discount applied
	
	System.out.printf("The final price of the cart is R$%.2f", finalPrice);
	
	}
}
