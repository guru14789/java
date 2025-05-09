import java.util.*;
public class complement {
	public static void main(String[] args) {
		int n;
		System.out.println("Enter a number : ");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		if(n==0)
			System.out.println("1");
		int bitlength=Integer.toBinaryString(n).length();
		int res=(1<<bitlength)-1;
		int finalres;
		finalres=res^n;
		System.out.println(finalres);
		sc.close();
	}

}