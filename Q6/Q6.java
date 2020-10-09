package Q6;

class Complex{
	int real, imaginary;
	
	Complex(){
		real = 0;
		imaginary = 0;
	}
	
	Complex(int r){
		real = r;
		imaginary = 0;
	}
	
	Complex(int r, int i){
		real = r;
		imaginary = i;
	}
	
	Complex add(Complex c) {
		Complex temp = new Complex();
		temp.real = real + c.real;
		temp.imaginary = imaginary + c.imaginary;
		return temp;
	}
	
	Complex multiply(Complex c) {
		Complex t = new Complex();
		t.real = real*c.real - (imaginary * c.imaginary);
		t.imaginary = real*c.imaginary + imaginary*c.real;
		return t;
	}
	
	void print() {
		System.out.println(real+" +i"+imaginary);
	}
}

public class Q6 {

	public static void main(String[] args) {
		Complex c1 = new Complex(3,2);
		Complex c2 = new Complex(4,-2);
		c1.add(c2).print();
		c1.multiply(c2).print();
	}
	
}
