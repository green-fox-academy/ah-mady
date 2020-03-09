import java.util.Arrays;

public class PracticeFunctions {

    static int [] myArrayOutsideOfFunction = new int[5];
    static int counter = 0;

    public static void main(String[] args) {
        // METHOD1: get two ints from user input and return it as an array

        int [] myArray = twoNumsReturnArray(3, 4);
        System.out.println(Arrays.toString(myArray));

        doubleInputArray(myArray);

        doubleInputArray(twoNumsReturnArray(3, 4));

        System.out.println("Before storing " + Arrays.toString(myArrayOutsideOfFunction));
        storeTheNumInTheArray(6);
        storeTheNumInTheArray(6);
        System.out.println("After storing " + Arrays.toString(myArrayOutsideOfFunction));
        storeTheNumInTheArray(6);
        System.out.println("After storing " + Arrays.toString(myArrayOutsideOfFunction));



        //METHOD2: double the values of the previous array
        // and print out the old and new values as arrays
    }

    public static void storeTheNumInTheArray(int n){
        myArrayOutsideOfFunction[counter] = n;
        counter++;
    }

    // 1. access modifiers 2.static/non-static 3. return value 4. name 5. (input parameter(s))
    public static int[] twoNumsReturnArray(int n, int n2){
        int [] myArray2 = new int[2];
        myArray2[0] = n;
        myArray2[1] = n2;
        return myArray2;
    }

    public static void doubleInputArray(int [] myIntArray){
        System.out.println("Before doubling the values " + Arrays.toString(myIntArray));
        for (int i = 0; i <myIntArray.length ; i++) {
            myIntArray[i] *=2;
        }
        System.out.println("After doubling the values "+ Arrays.toString(myIntArray));
    }
}
