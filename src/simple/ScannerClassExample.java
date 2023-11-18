package simple;
import java.util.*;
import java.io.*;

public class ScannerClassExample {

	public static void main(String[] args) throws IOException {
		double i=10;
		float y = 60;
		int j=20;
		char z= 'a';
		String fname = "Kanya";
		long l = 40;
		//io streams.
		/**
		 * 3 types of io streams
		 * 1) System.in  (Read data from keyboard)
		 * 2) System.out (Display data on screen)
		 * 3) System.err (Display errors)
		 */
		System.out.print("kanya ");
		System.out.println(10>20);
		System.out.println("kumari");
		System.out.printf("%f %f %d %c %s %d", i, y, j, z, fname, l);
		
		//We need to pass "System.in" as a parameter to Scanner class.
		Scanner sc = new Scanner(System.in);
		String lname = sc.next();
		String name = sc.next();
		int a = sc.nextInt();
		int e= sc.nextInt();
		float b = sc.nextFloat();
		double c = sc.nextDouble();
		sc.close();
		if(a>e) {
			System.out.println("you are eligible to vote");
		}
		else {
			System.out.println("you are not eligible to vote.");
		}
		System.out.println("your last name " + lname);
		System.out.println("your name " + name);
		System.out.println("integer value " + a);
		System.out.println("Float value " + b);
		System.out.println("Double value " + c);
		
		//read file line by line by using FileInputStream
		FileInputStream fis = new FileInputStream("C:\\Users\\kdarisi\\Desktop\\disc\\testFile.txt");
		Scanner sc1 = new Scanner(fis);
		while(sc1.hasNextLine()) {
			System.out.println(sc1.nextLine());
		}
		sc1.close();
		}
}
