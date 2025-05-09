import java.util.Arrays;
public class sorting {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 8, 9};
        int[] arr1 = {2, 2, 28, 2};

        int[] newArr = new int[arr.length + arr1.length];

        System.arraycopy(arr, 0, newArr, 0, arr.length);
        System.arraycopy(arr1, 0, newArr, arr.length, arr1.length);

        for (int i = 0; i < newArr.length - 1; i++) {
            for (int j = 0; j < newArr.length - 1 - i; j++) {
                if (newArr[j] > newArr[j + 1]) {
                    int temp = newArr[j];
                    newArr[j] = newArr[j + 1];
                    newArr[j + 1] = temp;
                }
            }
        }

        System.out.println("Merged and sorted array (manual sort): " + Arrays.toString(newArr));
    }
}