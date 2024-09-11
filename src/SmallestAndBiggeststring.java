public class SmallestAndBiggeststring {
    // first = "Vaibhav"
    // second = "Vivek
    // int compareTo(String anotherString)

    public static void main(String[] args) {
        String first = "Vaibhav";
        String second = "Vivek";

        int compareTo = first.compareTo(second);
        System.out.println("compareTo = " + compareTo);
        // how to identify smaller or bigger
        if (compareTo == 0) {
            System.out.println("Both Strings are same");
        } else if (compareTo < 0) {
            System.out.println("First String " + first + " is smaller");
        } else {
            System.out.println("First String " + first + " is Bigger");
        }
    }
}