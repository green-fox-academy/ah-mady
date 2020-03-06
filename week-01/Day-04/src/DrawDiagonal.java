import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class DrawDiagonal {
    public static void main(String[] args) {

        int n = 7;
        System.out.println(n);

        for (int i = 1; i <= n ; i++) {

            for (int j = 1; j <= i -1; j++) {
//                System.out.print("% ");
                if (
                        i >= 2 && j <=i-2
                ){
                    System.out.print(" ");
                } else{
                    System.out.print("%");
                }
            }
            System.out.println(" ");

        }
    }
}
