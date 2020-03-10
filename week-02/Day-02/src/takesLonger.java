public class takesLonger {
    public static void main(String[] args) {
        String quote = "Hofstadter's Law: It you expect, even when you take into account Hofstadter's Law.";

        // When saving this quote a disk error has occurred. Please fix it.
        // Add "always takes longer than" to the StringBuilder (quote) between the words "It" and "you"
        // Using pieces of the quote variable (instead of just redefining the string)

        StringBuilder quote2 = new StringBuilder(quote);
        String toAdd = " always takes longer than";
        String itEquals = "It";

        int intQuote = quote.indexOf(itEquals);
        System.out.println(intQuote);


        quote2.insert(intQuote+itEquals.length(), toAdd);
        System.out.println(quote2);

    }
}
