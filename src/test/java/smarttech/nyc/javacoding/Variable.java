package smarttech.nyc.javacoding;

import java.util.Scanner;

public class Variable {
	
	public static void main(String[] args) {
		
//		NormalClass obj = new NormalClass();
//		obj.helloThere(30);
//		//obj.helloThere(55);		
//		System.out.println(obj.num);
//		System.out.println(obj.number);
//		//System.out.println(obj.hello = 50);
	
//		int a,b;
//		a= 15;
//		b=27;
//		System.out.println("Before swapping : a,b="+a+", "+ +b);
//		
//		
//		a=a+b;
//		b=a-b;
//		a=a-b;
//		
//		System.out.println("After swapping : a,b="+a+", "+ +b);
		
		int a,b,temp;
		a= 15;
		b=27;
		System.out.println("Before swapping : a,b="+a+", "+ +b);
			
		temp=a;
		a=b;
		b=temp;
		
		
		
		System.out.println("After swapping : a,b="+a+", "+ +b);
		
		
		int x, y, z;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Input the first number: ");
		x = in.nextInt();
		System.out.println("Input the second number: ");
		y = in.nextInt();
		z = x;
		x = y;
		y = z;
		
		System.out.println("Swapped values are: "+x + " and " +y);
		
		
		
	}
	

}
