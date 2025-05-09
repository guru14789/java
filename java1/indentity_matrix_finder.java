public class indentity_matrix_finder {
    public static void main(String[] args) {
        int[][] arr = {{1, 0, 0, 0, 0},{0, 1, 0, 0, 0},{0, 0, 1, 0, 0},{0, 0, 0, 1, 0},
            {0, 0, 0, 0, 1}
        };  

        boolean isIdentity = true;

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j && arr[i][j] != 1) {
                    isIdentity = false;
                } else if (i != j && arr[i][j] != 0) {
                    isIdentity = false;
                }
            }
        }

        if (isIdentity) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}
