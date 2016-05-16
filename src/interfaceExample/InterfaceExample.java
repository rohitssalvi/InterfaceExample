package interfaceExample;

import java.util.Scanner;

public class InterfaceExample {
	public static void main(String[] args) {
		System.out.print("Enter the number:");
		Scanner takeinput=new Scanner(System.in);
		int in=takeinput.nextInt();
		FirstClass value1=new FirstClass();
		PrintSqure value2=new PrintSqure();
		value1.getValue(in);
		value2.getValue(in);
	}

}

interface value{
	
	void getValue(int i);
	
}


class FirstClass implements value {
 int i;
	@Override
	public void getValue(int i) {
		// TODO Auto-generated method stub
		this.i=i;
		System.out.println("integer Number is :"+this.i);
	}

	
	
}

class PrintSqure implements value{
int j;
	@Override
	public void getValue(int i) {
		j=i;
		System.out.println("Square of Number is:"+j*j);
		
		
	}
	
}