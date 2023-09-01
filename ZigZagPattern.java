
    import java.util.Scanner;  
 
public class ZigZagPattern {
    public static void main(String[] args)   
    {  
        // Take user input for no for rows   
        System.out.print("Enter the number of characters in a line you want to print: ");  
        Scanner sc= new Scanner(System.in);  
        int r,c,row;  
        // store the input value in row  
        row=sc.nextInt();  
         System.out.print("Enter the number of zig zag line you want to print: ");  
        int count=sc.nextInt();  
        System.out.print("Enter any character: ");  
        char ch=sc.next().charAt(0);  
          
        for (int i=1;i<=count;i++)  
        {  
          
            // backward  
           for(r=1; r<=row; r++)  
           {     
               // inner loop to print symbol  
              for(c=1; c<=row; c++)  
              {     
                  // if row and column have same value print symbol       
                 if(r==c)        
                    System.out.print(ch+" ");        
                 else            
                    System.out.print("  ");        
              }   
              System.out.println("");  
           }   
             
           // forward  
            for(r=1;r<=row;r++)  
            {  
              // loop for printing star symbol  
              for(c=1;c<=row;c++)  
              {  
                    // if c<= row+1-r print symbol else spaces  
                    if(c <= (row+1-r))  
                    {  
                       if( c == (row+1-r) )  
                          System.out.print(ch+" ");  
                       else  
                          System.out.print("  ");  
                    }  
              }  
              System.out.println("");  
           }  
        }  
    }  
}  
    
