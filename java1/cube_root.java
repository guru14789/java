public class  cube_root {
    public static void main(String[] args) {
        double number = 27;
        double root =3;
        double middle=0;
        double error=0.0000001;
        double right=number;
        double left=0;
        

        multiply(number,root);
        while((right-left)>error)
        {
            middle=(left+right)/2;
            if(multiply(number, root)>number)
            {
                right=middle;
            }
            else{
                left=middle;
            }
            
        }
        System.out.println(middle);
    }
    public static double multiply(double number, double root) {
        double nultvalue=1;
        for (int i = 0; i < root; i++) {
            nultvalue = nultvalue * number;
        }
        return nultvalue;
    }    
}
