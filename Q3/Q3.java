package Q3;

class Box{
	int height,width,breadth;
	
	Box(){
		this(0,0,0);
	}
	
	Box(int i, int j, int k) {
		height = i;
		width = j;
		breadth = k;
	}
	
	void getArea() {
		System.out.println(width*breadth);
	}
	
	void getVolume() {
		System.out.println(height*width*breadth);
	}
}

public class Q3 {

	public static void main(String[] args) {
		Box b = new Box(10,20,15);
		b.getArea();
		b.getVolume();
	}

}
