public class addExampleForTheSakeOfPresentation {
    public static void main(String[] args) {

        String firstName = "Muhamma";
        String secondName = "Ahme";

        firstName = firstName.concat("d");
        secondName = secondName.concat("d");
        System.out.println(add(firstName,secondName));

        String xyz = "Thank ";
        String abc = "you!";
        System.out.println(xyz + abc);
    }
    public static String add(String firstString, String secondString){
        return firstString +  " " + secondString;
    }
    public static char concat (char myCharacter){
        myCharacter += 'd';
        return myCharacter;
    }
}
