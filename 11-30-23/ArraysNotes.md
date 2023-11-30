#### DSA 11-30-23
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

Three Dimensional Arrays
[Side][Row][Column]
int[][][] A = new int[3][5][4];

Four Dimensional Arrays
[Box][Side][Row][Column]
int[][][][] A = new int[2][3][5][4];
