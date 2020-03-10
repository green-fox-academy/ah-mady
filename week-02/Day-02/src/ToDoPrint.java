import java.util.ArrayList;

public class ToDoPrint {
    public static void main(String[] args) {
        String todoText = " - Buy milk\n";

        // Add "My todo:" to the beginning of the todoText
        // Add " - Download games" to the end of the todoText
        // Add " - Diablo" to the end of the todoText but with indention

        // Expected output:

        // My todo:
        //  - Buy milk
        //  - Download games
        //      - Diablo

        String myTodo = "My todo\n";

        todoText = myTodo + todoText;

        todoText = todoText.concat(" - Download games\n");
        todoText = todoText.concat("\t - Diablo\n");

        System.out.println(todoText);



    }
}
