// 38.Create class Tile to store the edge length of a square tile , and create another class Floor to store length and width of a rectangular floor. Add method totalTiles(Tile t) in Floor class with Tile as argument to calculate the whole number of tiles needed to cover the floor completely.
import java.util.Scanner;

class Tile{
	private int edge;	
	private int area;
	
	Tile(int edge){
		this.edge=edge;
		
	}

	int getArea(){
        this.area=edge*edge;
		return area;
	}
}

class Floor{
	private int length;
	private int width;

	Floor(int length, int width){
		this.length = length;
		this.width = width;
	}

	void totalTiles(Tile t){
		double tileArea = t.getArea();
		double floorArea = length*width;
		double noOfTiles = floorArea/tileArea;
		System.out.println("Number of Tiles: "+noOfTiles);
	}
}
class Ass13_38_oops{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the length of Tile: ");
		int tileLength = sc.nextInt();
		Tile t = new Tile(tileLength);
		
		System.out.println("Enter the length and width of Floor: ");
		int fLength = sc.nextInt();
		int fWidth = sc.nextInt();
		Floor obj = new Floor(fLength,fWidth);
		
		obj.totalTiles(t);
	}
}