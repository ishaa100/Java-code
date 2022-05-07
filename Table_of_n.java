
    import java.util.Scanner;
public class Table_of_n {
    public static void main(String [] args){
        System.out.println("Enter the table number here: ");
        Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
        int i;
         for(i=1;i<=10;i++) {
             System.out.println(n + " * " + i + " = "+ n * i);
         }
    }


    
}
