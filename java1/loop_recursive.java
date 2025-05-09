import java.util.Scanner;
public class loop_recursive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count=sc.nextInt();
        welcomemsg(count);
        sc.close();

        
    }
    public static void welcomemsg(int count)
    {
        if(count<=0)
        {
            return;
        }
        else 
        {
        welcomemsg(count-1);
        System.out.println(count);
        
        }

    }
    
}
       