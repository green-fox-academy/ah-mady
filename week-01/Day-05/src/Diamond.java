public class Diamond {
    public static void main(String[] args) {

/*        int star = 5;

        for (int i = 0; i < star; i++) {
            if (star % 3 == 0) {
                for (int j = 0; j < star - i; j += 2) {
                    System.out.print(" ");
                }
                for (int k = 0; k <= i; k++) {
                    System.out.print("%");
                }
                System.out.println();

                for (int m = star; m >= 1; m--) {
                    for (int n = 0; n < star - m; n += 2) {
                        System.out.print(" ");
                    }
                    for (int k = 0; k <= m; k++) {
                        System.out.print("%");
                    }
                    System.out.println();
                }
            }
        }*/


   /*     int num = 7;
        if (num%2!=0){
            for (int i = 0; i < num; i++) {
                System.out.print(" ");
                for (int j = 0; j < num; j++) {
                    System.out.print("*");
                }
                for (int k = 0; k <=i ; k++) {
                    System.out.print("");

                }

                System.out.println();
            }*/


   /*     int i,j,r;

        r = 7;
        if (r%2 != 0) {
            for (i = 0; i <= r; i+=2) {
                for (j = 1; j <= r - i; j++)
                    System.out.print(" ");
                for (j = 1; j <= i - 1; j++)
                    System.out.print("*");
                System.out.print("\n");
            }*/

/*        int rows = 7;

        if (rows%2 != 0){

            for (int i = 0; i < rows ; i++) {
//                System.out.print(" ");
                System.out.println();
                for (int j = 1; j <=rows-1 ; j++) {
                    System.out.print("*");
                    for (int k = 1; k <=i ; k++) {
                        System.out.print(" ");

                    }
                }
            }
            System.out.println();

        }*/


 /*       int i, j, r;

        r = 5;
        for (i = 0; i <= r; i++) {
            for (j = 0; j < r - i; j++)
                System.out.print(" ");
            for (j = 0; j <2* i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for (i = r - 1; i >= 1; i--) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2*i - 1; j++)
                System.out.print("*");
            System.out.println();*/


        int i, j, r;

        r = 5;
        for (i = 0; i <= r; i++) {
            for (j = 0; j < r - i; j++)
                System.out.print(" ");
            for (j = 0; j <i - 1; j++)
                System.out.print("*");
            System.out.print("\n");
        }

        for (i = r - 1; i >= 1; i--) {
            for (j = 1; j <= r - i; j++)
                System.out.print(" ");
            for (j = 1; j <= 2*i - 1; j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

