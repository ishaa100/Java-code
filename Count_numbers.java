import java.util.Scanner;
public class Count_numbers {
   
public static int count(int n){
		if (n/10 == 0)
			return 1;
		return 1 + count(n / 10);
	}

	
	public static void main(String[] args){
		System.out.println("Enter the number: ");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		System.out.print( "The number of digits in " +n+ ":" +count(n));
	}}
