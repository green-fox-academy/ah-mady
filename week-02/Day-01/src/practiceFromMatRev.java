import java.util.Arrays;

public class practiceFromMatRev {
    public static void main(String[] args) {
// 1. TASK: CREATING ARRAYS
        // 5(6) WAYS

        //1. Instantiating an empty array
        int[] myFirstArray = new int[3];

        //2. Assign values to array one-by-one
        myFirstArray[0] = 1;
        myFirstArray[1] = 2;
        myFirstArray[2] = 3;

        //2.B.
        for (int i = 1; i <= myFirstArray.length; i++) {
            myFirstArray[i - 1] = i;
        }

        //3. Assign values at the instantiation

        int[] mySecondIntArray = {2, 4, 6};

        //4. Use an already existing array to create a new array

        int[] myThirdArray = Arrays.copyOf(myFirstArray, 3);

        //Print out the memory address
        System.out.println("My third array is " + myThirdArray);

        //Print out the array in one line
        System.out.println("My third array in one line " + Arrays.toString(myThirdArray));

        //5. Copy only a part of an array

        int[] copyRangOfAnArray = Arrays.copyOfRange(myFirstArray, 1, 3);
        System.out.println("A Copy of a Range from an Array is now " + Arrays.toString(copyRangOfAnArray));
        for (int i = 0; i < myFirstArray.length; i++) {
            System.out.println(myFirstArray[i]);
        }


        //Finding an element in the array
        int n2 = 3;

        System.out.println("The index of the searched item " + Arrays.binarySearch(myFirstArray, n2));

        for (int i = 0; i < myFirstArray.length; i++) {
            if (myFirstArray[i] == n2) {
                System.out.println("Index of the searched number is " + i);
            } else {
                System.out.println("Could not find the desired number");
            }
        }

        // creating a multidimensional array

        int[][] matrix9Times9 = {
                {1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10}
        };

        //int [row][column] matrix
        System.out.println(matrix9Times9[0][1]);

        // doubling the values of a multidimensional array and printing it out

        for (int i = 0; i < matrix9Times9.length; i++) {
            for (int j = 0; j < matrix9Times9[i].length; j++) {
                matrix9Times9[i][j] *= 2;
                System.out.print("| " + matrix9Times9[i][j] + " |");
            }
            System.out.println();
        }
        //  give the type of element stored in the array: array/list

        //FOR EACH 1. can not change value 2. starts at the beginning 3. loops through each element
        System.out.println("My first array before foreach is " + Arrays.toString(myFirstArray));
        for (int n : myFirstArray) {
            n += 2;
            System.out.println(n);
        }
        System.out.println("My first array is after for each is" + Arrays.toString(myFirstArray));

        for (int[] row : matrix9Times9) {
            for (int n : row) {
                System.out.print("| " + n + " |");
            }
        }

        //THREE DIMENSIONAL ARRAY
        int[][][] myThreeDimensionalArray = new int[3][3][3];

        for (int[][] matrix : myThreeDimensionalArray) {
            for (int[] row : matrix) {
                for (int k : row) {
                    System.out.print("| " + k + " |");
                }
                System.out.println();
            }
        }
    }
}
