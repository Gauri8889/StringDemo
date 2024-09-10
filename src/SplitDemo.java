public class SplitDemo {
    public static void main(String[] args) {
        String sampleData = "split this string around matches of the given regular expression";
        String[] spliteData = sampleData.split(" ");
        for(String element : spliteData){
            System.out.println(element);
        }
    }
}
