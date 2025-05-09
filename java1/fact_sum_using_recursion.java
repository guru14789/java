import java.util.Scanner;
public class fact_sum_using_recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
         
        System.out.print(welcomemsg(n));
        sc.close();

        
    }
    
    public static int welcomemsg(int n)
    {
        
        if(n==1)
        {
            return 1;
        }
                
        
        return n+welcomemsg(n-1);
        
    }
    
}
       