public class Array1d {

    public static void main(String[] args) {

        int[] A = new int[10];

        for (int i = 1; i <= 10; i++) {
            A[i - 1] = i;
        }

        for (int i : A) {
            System.out.println(i);
        }

    }

}