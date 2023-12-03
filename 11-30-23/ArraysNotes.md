#### DSA 11-30-23
Arrays
1. A finite sequence of data item occupying a continuous set of memory location, all
of which is the same type. 

2. An array is a data structure

3. Set of homogenous elements.

Types of arrays:
1. One (1) Dimensional Array

Declaration:
Datatype VarName[Length];
int A[10]

Complete version: 
int[] A = new int[10]

2. Two (2) Dimensional Array

Declaration: 
Type VarName[#][#]
int A[5][4]

3. Three (3) Dimensional Arrays

Declaration: 
Type VarName[#][#][#]
int A[3][5][4]

4. Four (4) Dimensional Array
Declaration:
Type VarName[#][#][#][#]
int A[2][3][5][4]

==========================================================================================

Creating an integer array:
int[] A = new int[10];

Assigning the value 56 to index 8 of the array

A[8] = 56;

The code above assigns 56 to index 8 in our A array

11 at index 5

A[5] = 11;

This assigns the integer value of 11 to index 5

Creating a two dimensional array:

int[][] B = new int[5][4]; 

The array above has 5 elements and within each of those elements, there are 4 elements [0]
in each of the inner array.

Think of two dimensional array as a box, the first index being the rows and the second
index being the columns. This could be seen when we print these two dimensional array
elements.

Three Dimensional Arrays
[Side][Row][Column]
int[][][] A = new int[3][5][4];

Four Dimensional Arrays
[Box][Side][Row][Column]
int[][][][] A = new int[2][3][5][4];

==========================================================================================

When incrementing an index, we increment by byte value.
	
Example: index 0 of an integer array will be 256 in memory and index 1 will be in 260 
because we increment it by 4 bytes, the byte value of an integer.

Bit = 0 / 1
Qubit = 1111/0000
Byte = 8 bits or 00000000 / 11111111
Word = 16 bits
DWord = 32 bits

An integer is an example of a Qubit because it has 4 bytes. The amount of byte is has
is categorized in different categories shown above.

Integer Array
Array Indexes: A 0 1 2 3 4 5 6 7 8 9
Memory Addresses: [256][260][264][][][][][][][]

Creating an integer array:
int[] A = new int[10];

Assigning the value 56 to index 8 of the array

A[8] = 56;

The code above assigns 56 to index 8 in our A array

11 at index 5

A[5] = 11;

This assigns the integer value of 11 to index 5

Creating a two dimensional array:

int[][] B = new int[5][4]; 

The array above has 5 elements and within each of those elements, there are 4 elements [0]
in each of the inner array.

Think of two dimensional array as a box, the first index being the rows and the second
index being the columns. This could be seen when we print these two dimensional array
elements.

==========================================================================================

Array Exercises:

Create an integer array with 10 elements
int[] A = new int[A];

Assigning the numbers 1 to 10 within our array
for (int i = 1; i <= 10; i++) {
	A[i - 1] = i;
}

Displaying the array elements to our console
for (int eachNum : A) {
	System.out.println(eachNum)
}

Put the number 56 at index 8
A[8] = 56;

Put the number 11 at index 5
A[5] = 11;

Put the number 3 at index 0
A[0] = 3;

Put the number 45 at index 5
A[5] = 45;

Create 2 two dimensional array and prints its elements
int[][] A = new int[5][4];

The array created above will have 5 rows and 4 columns when we iterate through it using
a for loop

for (int i = 0; i < A.length; i++) {
	for (int j = 0; j < A[i].length; j++) {
		System.out.print(A[i][j] + " ");
	}	
	System.out.println();
}

This will be the output of the for loop
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0
0 0 0 0

The output has 5 rows (the first index) and 4 columns (the second index).

==========================================================================================

## Additional Resources
Java Arrays: https://www.w3schools.com/java/java_arrays.asp
Loop Through An Array: https://www.w3schools.com/java/java_arrays_loop.asp
Multidimensional Arrays: https://www.w3schools.com/java/java_arrays_multi.asp
