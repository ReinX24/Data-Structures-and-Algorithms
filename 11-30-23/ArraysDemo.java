import java.util.Arrays;

public class ArraysDemo {

    public static void main(String[] args) {

        // Creating a one dimensional array
        // Characteristics of Arrays: linear, homogenous, and static
        // Datatype VarName[Length]
        int[] oneDimensionalArr = new int[10];
        // System.out.println(Arrays.toString(oneDimensionalArr));

        // Filling the array elements with a for loop
        for (int i = 1; i <= 10; i++) {
            oneDimensionalArr[i - 1] = i;
        }

        // Displaying the elements in our array
        for (int eachNum : oneDimensionalArr) {
            System.out.println(eachNum);
        }

        // Accessing indexes of the array
        // Putting the value 56 at index 8 of our Array
        // oneDimensionalArr[8] = 56;
        // System.out.println(Arrays.toString(oneDimensionalArr));

        // Putting the value 11 at index 5
        // oneDimensionalArr[5] = 11;
        // System.out.println(Arrays.toString(oneDimensionalArr));

        // 3 at index 0
        // oneDimensionalArr[0] = 3;
        // System.out.println(Arrays.toString(oneDimensionalArr));

        // 45 at index 5
        // oneDimensionalArr[5] = 45;
        // System.out.println(Arrays.toString(oneDimensionalArr));

        // Filling the array with the multiples of 7
        // for (int i = 0; i < oneDimensionalArr.length; i++) {
        // oneDimensionalArr[i] = i * 7;
        // }
        // System.out.println(Arrays.toString(oneDimensionalArr));

        // Two dimensional array
        // int[][] twoDimensionalArr = new int[5][4];
        // Printing the elements of our two dimensional array
        // for (int i = 0; i < twoDimensionalArr.length; i++) {
        // for (int j = 0; j < twoDimensionalArr[i].length; j++) {
        // System.out.print(twoDimensionalArr[i][j] + " ");
        // }
        // System.out.println();
        // }

        // Three dimensional array
        // [Side][Row][Column]
        int[][][] threeDimensionalArr = new int[5][4][3];

        // Four dimensional array
        // [Box][Side][Row][Column]
        int[][][][] fourDimensionalArr = new int[5][4][3][2];

    }

}