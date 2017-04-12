
public class Cloths {
private String color;
private double size;
private double price;
private boolean isOnSale;
public Cloths(String color, double size, double price, boolean isOnSale) {
	super();
	this.color = color;
	this.size = size;
	this.price = price;
	this.isOnSale = isOnSale;
}
public String getColor() {
	return color;
}
public double getSize() {
	return size;
}
public double getPrice() {
	return price;
}
public boolean isOnSale() {
	return isOnSale;
}

public static void printInfo(){
	int tshirtCounter=0;
	int dressCounter=0;
	int pantCounter=0;
	for (Cloths item:Shop.cloths){
		if(item instanceof Tshirt){
			tshirtCounter+=1;
		}else if(item instanceof Dress){
			dressCounter+=1;
		}else if(item instanceof Pants){
			pantCounter+=1;
		}
	}
	System.out.println("Total number of tshirts is "+tshirtCounter);
	System.out.println("Total number of dresses is "+dressCounter);
	System.out.println("Total number of pants is "+pantCounter);
	System.out.println("Taptal number of Cloths in the shop is "+Shop.cloths.size());
	
}
public static void printSale(){
	double tshirtSaleCounter=0;
	double dressSaleCounter=0;
	double pantSaleCounter=0;
	double totalSale=0;
	for (Cloths item:Shop.cloths){
		if ((item instanceof Tshirt)&&(((Tshirt)item).isOnSale()==true)){
			tshirtSaleCounter+=((Tshirt)item).discount(item);
		}else if((item instanceof Dress)&&(((Dress)item).isOnSale()==true)){
			dressSaleCounter+=((Dress)item).discount(item);
		}else if((item instanceof Pants)&&((Pants)item).isOnSale()==true){
			pantSaleCounter+=((Pants)item).discount(item);
		}
	}
	totalSale= tshirtSaleCounter+dressSaleCounter+pantSaleCounter;
	System.out.println("Total sale of tshirts is "+tshirtSaleCounter);
	System.out.println("Total sale of dresses is "+dressSaleCounter);
	System.out.println("Total sale of pants is "+pantSaleCounter);
	System.out.println("Total sale of items in the shop is "+totalSale);
}
public double discount(Cloths item){return 0.0;}

}
