import java.util.*;


public class java_Exception_handling {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numerator = sc.nextInt();
        int denominator = sc.nextInt();
        try
        {
            System.out.println(numerator/denominator);
        }
        catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed");
        }
        finally{
            sc.close();
            System.out.println("Exiting...");
        }
       
        

    
}
}
