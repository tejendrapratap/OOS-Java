package Q4;

class Stack{
    int size,top;
    int st[];
    Stack(int size){
        this.size=size;
        st=new int[size];
        top=-1;
    }
    void push(int num){
        if(top==size-1){
            System.out.println("Stack Overflow");
            return;
        }
        st[++top]=num;
    }
    void pop(){
        if(top==-1){
            System.out.println("Stack underflow");
            return;
        }
        top--;
    }
    void disp(){
        int p=top;
        while(p>-1){
            System.out.print(st[p--]+" ");
        }
        System.out.print("\n");
    }
}

public class Q4 {
	
	public static void main(String args[]){
	    Stack s1 = new Stack(10);
	    s1.push(2);
	    s1.push(39);
	    s1.push(34);
	    s1.push(10);
	    s1.push(25);
	    s1.disp();
	    s1.pop();
	    s1.pop();
	    s1.pop();
	    s1.disp();
	}
	
}
