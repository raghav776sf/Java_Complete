import java.util.Locale;

public class WorkingWithStrings {
    public static void main(String[] args) {

        // Convert String into lowercase
        String userName = "Anurag Kesarwani";
        userName = userName.toLowerCase();
//        String convertedString = userName.toLowerCase();
        System.out.println(userName);

        // replace spaces into underscore
        userName = userName.replace(" ", "_");
        System.out.println(userName);

        // dedect double and tripple space

        String text = "this string cotains double  and tripple   spaces for  testing..";
        System.out.println(text.indexOf("  "));
        System.out.println(text.indexOf("   "));
        System.out.println(text.indexOf(" "));
        System.out.println(text.length());
    }
}
