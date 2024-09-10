import java.util.Scanner;

public class SearchString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the String");
        String input = scanner.nextLine();
        System.out.println("Enter the character to search in string");
        //k -> "k".charAt(0)
        char searchElement = scanner.nextLine().charAt(0);
        boolean isFound = false;
// WAP to count the occurrence of given character in the String
        //WAP to print the last index of given character,from the given String
        // char given = 'a'
        // String input = "java ka baba"
        for (int i = 0; i < input.length(); i++) {
            if (searchElement == input.charAt(i)) {
                isFound = true;
                break;
            }
        }
        if (isFound) {
            System.out.println("Found");
        } else {
            System.out.println("Not Found");
        }
    }
}


