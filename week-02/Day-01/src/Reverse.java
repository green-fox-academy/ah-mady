import java.util.Arrays;

public class Reverse {
    public static void main(String[] args) {
        // - Create an array variable named `numbers`
//   with the following content: `[3, 4, 5, 6, 7]`
// - Reverse the order of the elements in `numbers`
// - Print the elements of the reversed `numbers`
        int[] numbers = {3,4,5,6,7};

/*        for (int i = 0; i < (numbers.length)/2 ; i++) {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i -1];
            //numbers[numbers.length - i -1] = temp;
        }
        System.out.println(Arrays.toString(numbers));*/

        int left = 0;
        int right = numbers.length - 1;

        while( left < right ) {
            // swap the values at the left and right indices
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;

            // move the left and right index pointers in toward the center
            left++;
            right--;
        }
        System.out.println(Arrays.toString(numbers));
    }
}
