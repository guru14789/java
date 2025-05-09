public class stringrev {
    public static void main(String[] args) {
        String input= "four";
        System.out.println(revstr(input));

        
    }
    public static String revstr(String input)
    {
        if(input.isEmpty())
        {
            return input;
        }
        return revstr(input.substring(1))+input.charAt(0);
        
    }

}