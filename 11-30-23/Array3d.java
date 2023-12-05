public class Array3d {

    public static void main(String[] args) {

        int[][][] A = new int[5][4][3];

        for (int i = 0; i < A.length; i++) {
            System.out.println("\nSide: " + i);
            for (int j = 0; j < A[i].length; j++) {
                System.out.println("\tRow: " + j);
                System.out.print("\t\t");
                for (int k = 0; k < A[i][j].length; k++) {
                    System.out.print(A[i][j][k] + " ");
                }
                System.out.println("\n");
            }
        }

    }

}