
public class Pants extends Cloths{

	public Pants(String color, double size, double price, boolean isOnSale) {
		super(color, size, price, isOnSale);
	}

	public void printInfo(Cloths item) {
		if(item.isOnSale()== true){
			System.out.println("The "+item.getColor()+" pant size "+item.getSize()+" is on sale. The original price is "
					+item.getPrice()+" SEK, now it is "+item.discount(item));
		}
			else{
				System.out.println("The "+item.getColor()+" pant size "+item.getSize()+" is not on sale. its price is "
						+item.getPrice()+" SEK.");
			}
	}

	@Override
	public double discount(Cloths item) {
		double promotion = item.getPrice()- item.getPrice()*0.50;
		return promotion;
	}
	
	

	
	
}
