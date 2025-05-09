import java.util.Scanner;
public class factor_finder{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        int count=0;
        for(int i=5;n/i>=1;i*=5)
        {
            count+=n/i;
        }
        System.out.println("Number of factors of "+n+" is "+count);
        sc.close();

    }
}
