public class checkofarrayofsorted{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 9,8};
        
        System.out.println((arr));
        for (int i = 0; i < arr.length - 1; i+=1) {
            if (arr[i] > arr[i + 1]) {
                System.out.println("Array is not sorted");
                return;
            
            }
            System.out.println("Array is sorted");
            break;
        }
        

    }
    
}
