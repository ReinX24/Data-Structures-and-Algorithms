public class Array2d {

    public static void main(String[] args) {

        int[][] A = new int[5][4];

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();
        }

    }

}
