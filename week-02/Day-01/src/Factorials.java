public class Factorials {
    public static void main(String[] args) {

//  Create the usual class wrapper
//  and main method on your own.

// - Create a function called `factorio`
//   that returns it's input's factorial

        int a = 0;

        System.out.println(fact(a));


    }
    public static int fact (int factorialOfInt){
        int facto = 1;
        for (int i = 1; i <= factorialOfInt ; i++) {
            facto = facto * i;
        }
        return facto;
    }
}
