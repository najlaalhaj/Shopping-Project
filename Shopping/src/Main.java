
public class Main {

	public static void main(String[] args) {
		 
		Shop shop = new Shop();
		Tshirt tshirt1 = new Tshirt("Red",38,150,false);
		Tshirt tshirt2 = new Tshirt("Blue",38,150,false);
		Tshirt tshirt3 = new Tshirt("Yellow",38,150,false);
		Tshirt tshirt4 = new Tshirt("Brown",38,150,true);
		Tshirt tshirt5 = new Tshirt("Purple",38,150,true);
		Shop.cloths.add(tshirt1);
		Shop.cloths.add(tshirt2);
		Shop.cloths.add(tshirt3);
		Shop.cloths.add(tshirt4);
		Shop.cloths.add(tshirt5);	
		Dress dress1 = new Dress("Red",36,500,true);
		Dress dress2 = new Dress("White",36,400,true);
		Dress dress3 = new Dress("Pink",38,250,false);
		Dress dress4 = new Dress("Red",38,250,true);
		Shop.cloths.add(dress1);
		Shop.cloths.add(dress2);
		Shop.cloths.add(dress3);
		Shop.cloths.add(dress4);
		Pants pant1 = new Pants("Blue",36,250,true);
		Pants pant2 = new Pants("Blue",38,250,false);
		Pants pant3 = new Pants("Black",36,400,true);
		Pants pant4 = new Pants("Black",38,400,false);
		Shop.cloths.add(pant1);
		Shop.cloths.add(pant2);
		Shop.cloths.add(pant3);
		Shop.cloths.add(pant4);
		shop.printInfo();
		Cloths.printInfo();
		Cloths.printSale();
			
		

	}

}
