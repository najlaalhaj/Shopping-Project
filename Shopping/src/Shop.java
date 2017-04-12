import java.util.ArrayList;

public class Shop {

	public static ArrayList<Cloths>cloths = new ArrayList<>();
	
	public void printInfo(){
		for(Cloths piece :cloths){
			if(piece instanceof Tshirt){
				((Tshirt)piece).printInfo(piece);
			}else if(piece instanceof Dress){
				((Dress)piece).printInfo(piece);
			}else if(piece instanceof Pants){
				((Pants)piece).printInfo(piece);
			}
		}
	}
}
