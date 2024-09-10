public class PartyString {
    public static void main(String[] args) {
        // printing each character of String
        /*
        o 1 2 3 4 6 5
        v a i b h a v
        //step 1
        v,a,i,b,h,a,v
        taking one character form String
        char charAt(int index)
         */
        String name = "Vaibhav";
        // for to print indexes
        for (int i = 0; i < name.length(); i++) {
            System.out.print(i);
            System.out.print(" ");
        }
        System.out.println();
        for (int i = 0; i < name.length(); i++) {
            char nameCharacter = name.charAt(i);
            System.out.print(nameCharacter);
            if (i != name.length() -1){
                System.out.print(" ");
            }
        }
    }
}
