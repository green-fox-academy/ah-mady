import javax.imageio.plugins.tiff.TIFFImageReadParam;

public class DrawDiagonal {
    public static void main(String[] args) {

        int n = 5;
        System.out.println(n);

        for (int i = 0; i <= n-1 ; i++) {

            for (int j = 0; j <= n-1; j++) {
                System.out.print("% ");
                if (
                        i == 1 && j !=1
                ){
                    System.out.print( "");
                }
            }
            System.out.println(" ");

        }
    }
}
