import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number: ");
        int num1 = sc.nextInt();
        System.out.println("Enter the 2nd number: ");
        int num2 = sc.nextInt();
        int Sum = num1 + num2;
        int diff = num1 - num2;
        int product = num1 * num2;
        int div = num1 / num2;
        int mod = num1 % num2;
        System.out.println("Addition : " + Sum);
        System.out.println("Difference : " + diff);
        System.out.println("Product : " + product);
    }

}
