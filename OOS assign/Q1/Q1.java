package Q1;

class Room{
	int height,width,breadth;
	
	Room(){
		this(0,0,0);
	}
	
	Room(int i, int j, int k) {
		height = i;
		width = j;
		breadth = k;
	}
	
	void getVolume() {
		System.out.println(height*width*breadth);
	}
}

public class Q1 {
	
	public static void main(String args[]) {
		Room r = new Room(40,20,15);
		r.getVolume();
	}
}
