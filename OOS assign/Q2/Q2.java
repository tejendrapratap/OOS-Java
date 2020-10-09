package Q2;

class Student{
	String name = "none";
	int marks[] = new int[3];
	Student(String name, int mark[]) {
		this.name = name;
		marks[0] = mark[0];
		marks[1] = mark[1];
		marks[2] = mark[2];
	}
	void getAvg() {
		System.out.println("Average marks: " + (marks[0]+marks[1]+marks[2])/3);
	}
	void disp() {
		System.out.print("name: "+name+"\nMarks: ");
		for(int i=0;i<3;i++) {
			System.out.print(marks[i] + " ");
		}
	}
}
public class Q2 {

	public static void main(String[] args) {
		int mark[] = {100,98,93};
		Student s = new Student("tej", mark);
		s.getAvg();
		s.disp();
	}
}
