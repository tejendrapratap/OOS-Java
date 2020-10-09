package Q9;

class Employee{
	String name, address;
	int id, salary;
	Employee(){
		name = "noname";
		address = "none";
		id = 000000;
		salary = 000000;
	}
	Employee(String name, String address, int id, int sal){
		this.name = name;
		this.address = address;
		this.id = id;
		salary = sal;
	}
}

class Dept{
	String name, location;
	Employee e[];
	int size, index = 0;
	Dept(){
		e = new Employee[3];
		size = 3;
		name = "No Name";
		location = "Mount Everest";
	}
	Dept(String name, String loc, int size){
		this.name = name;
		location = loc;
		e = new Employee[size];
		this.size = size;
	}
	void add(Employee emp) {
		if(index == size-1) {
			System.out.println("Size is Full");
		}
		else {
			e[index] = emp;
			index++;
		}
	}
	
	void remove(int ind) {
		if(index <= 0 || index >= e.length) {
			System.out.println("No Employee in the dept");
		}
		else {
			for(int i=ind;i<e.length;i++) {
				e[i] = e[i+1];
			}
			index--;
		}
	}
}

public class Q9 {

	public static void main(String[] args) {
		
		Dept IT = new Dept("Information Technology", "salt lake", 5);
		IT.add(new Employee("RB", "Esplanade", 03, 900000));
		IT.add(new Employee("UKR", "Howrah", 01, 1500000));
		IT.add(new Employee("MB", "Garia", 02, 1200000));
		IT.add(new Employee("MKR", "Salt Lake", 04, 1000000));
		int sum = 0;
		for(int i=0;i<IT.index;i++) {
			sum += IT.e[i].salary;
		}
		System.out.println("Total Yearly Expenditure: " + sum);
	}
}
