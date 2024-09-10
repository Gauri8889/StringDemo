public class IndexOfCharacter {
    public static void main(String[] args) {
        //  WAP to print the first index of given character , from the given String
        // char given = 'a';
        // string input = "java ka Baba";
        String input = "java ka Baba";
        char given = 'b';
        int index = -1;
        for (int i = 0; i < input.length(); i++) {
            if(input.charAt(i) == given){
                index = i;
                break;
            }
        }
        System.out.println("cost index of char 'a' is " + index);
        System.out.println("input.indexof('b') = " + input.indexOf('b'));
    }
}
