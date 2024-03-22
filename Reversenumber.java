package gani.assignments;

import java.util.Scanner;

public class Reversenumber {

	public static void main(String[] args) {
		// print the reverse number of given number
		int n,a,b=0;
		System.out.print("enter the 4 digit number :");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		while(n>0){
			a=n%10;
			b=(b+a)*10;
			n=n/10;
		}
		b=b/10;
		System.out.println("reverse number is :"+b);
		sc.close();
	}
}
