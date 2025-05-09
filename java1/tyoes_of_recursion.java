public class tyoes_of_recursion {
    //direct
    public class DirectRecursion {
        public static void printNumbers(int n) {
            if (n == 0) return;
            System.out.println(n);
            printNumbers(n - 1); 
        }
    
        public static void main(String[] args) {
            printNumbers(5);
        }
    }
    //indirect
    public class IndirectRecursion {
        public static void methodA(int n) {
            if (n <= 0) return;
            System.out.println("A: " + n);
            methodB(n - 1);
        }
    
        public static void methodB(int n) {
            if (n <= 0) return;
            System.out.println("B: " + n);
            methodA(n / 2);
        }
    
        public static void main(String[] args) {
            methodA(10);
        }
    }
    //tail
    public class TailRecursion {
        public static void tail(int n) {
            if (n == 0) return;
            System.out.println(n);
            tail(n - 1); // Tail call
        }
    
        public static void main(String[] args) {
            tail(5);
        }
    }
    //head
    public class HeadRecursion {
        public static void head(int n) {
            if (n == 0) return;
            head(n - 1); // Head call
            System.out.println(n);
        }
    
        public static void main(String[] args) {
            head(5);
        }
    }
    //tree
    public class TreeRecursion {
        public static void tree(int n) {
            if (n == 0) return;
            System.out.println(n);
            tree(n - 1);
            tree(n - 1);
        }
    
        public static void main(String[] args) {
            tree(3);
        }
    }
    //nested
    public class NestedRecursion {
        public static int nested(int n) {
            if (n > 100) return n - 10;
            return nested(nested(n + 11));
        }
    
        public static void main(String[] args) {
            System.out.println(nested(95)); // Output: 91
        }
    }
    //eg
    public class SumNaturalNumbers {
        public static int sum(int n) {
            if (n == 1) return 1; // Base case
            return n + sum(n - 1); // Recursive case
        }
    
        public static void main(String[] args) {
            int n = 5;
            System.out.println("Sum of first " + n + " natural numbers: " + sum(n));
        }
    }
    
}
