public class Diagonal {
    public static void main(String[] args) {
        int rows = 10;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < rows ; j++) {
                if (i == j){
                    System.out.print("%");
                }else if (i == 0){
                    System.out.print("%");
                }else if (j == 0){
                    System.out.print("%");
                }else if(j == rows -1 ){
                    System.out.print("%");
                }else if (i == rows-1){
                    System.out.print("%");
                }else{

                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
