package Q10;

class Student{
	static int Count = 0;
	String name;
	int rollNo;
	String[] subjects = new String[5];
	
	Student(){
		name = "No Name";
		rollNo = ++Count;
		for(int i=0;i<5;i++) {
			subjects[i] = "No Subject";
		}
	}
	
	Student(String name, int rn, String sub[]){
		this.name = name;
		rollNo = rn;
		for(int i=0;i<5;i++) {
			subjects[i] = sub[i];
		}
	}
	
	void disp() {
		System.out.println("Name: " + name);
		System.out.println("Roll No: " + rollNo);
		System.out.println("Subjects");
		for(int i=0;i<5;i++) {
			System.out.print(subjects[i] + "\t");
		}
		System.out.println();
	}
}

class TabulationSheet{
	int roll[];
	int marks[];
	
	TabulationSheet(){
		roll = new int[1];
		marks = new int[1];
	}
	
	TabulationSheet(int r[], int m[]) {
		roll = r;
		marks = m;
	}
	
	void add(int r, int m) {
		int ro[] = new int[roll.length + 1];
		for(int i=0;i<roll.length;i++) {
			ro[i] = roll[i];
		}
		ro[roll.length] = r;
		roll = ro;
		
		int mk[] = new int[marks.length + 1];
		for(int i=0;i<marks.length;i++) {
			mk[i] = marks[i];
		}
		mk[marks.length] = m;
		marks = mk;
	}
}

class marksheet{
	Student s;
	int marks[] = new int[5];
	
	marksheet() {
		s = new Student();
	}
	
	marksheet(Student st, int mk[]){
		s = st;
		marks = mk;
	}
	
	void print() {
		s.disp();
		for(int i=0;i<marks.length;i++) {
			System.out.print(marks[i] + "\t\t\t");
		}
		System.out.println();
	}
}

public class Q10 {

	public static void main(String[] args) {
		Student s[] = new Student[3];
		for(int i=0;i<3;i++) {
			s[i] = new Student();
		}
		TabulationSheet ts[] = new TabulationSheet[5];
		for(int i=0;i<5;i++) {
			ts[i] = new TabulationSheet();
		}
		marksheet m[] = new marksheet[3];
		for(int i=0;i<3;i++) {
			m[i] = new marksheet();
			m[i].print();
		}
	}
}
