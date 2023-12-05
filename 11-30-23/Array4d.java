public class Array4d {

    public static void main(String[] args) {

        int[][][][] A = new int[5][4][3][2];

        for (int i = 0; i < A.length; i++) {
            System.out.println("Box: " + i);
            for (int j = 0; j < A[i].length; j++) {
                System.out.println("\tSide: " + j);
                for (int k = 0; k < A[i][j].length; k++) {
                    System.out.println("\t\tRow: " + k);
                    System.out.print("\t\t\t");
                    for (int l = 0; l < A[i][j][k].length; l++) {
                        System.out.print(A[i][j][k][l] + " ");
                    }
                    System.out.println("\n");
                }
            }

        }

    }

}