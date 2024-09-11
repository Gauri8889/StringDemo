public class StringPracticeQuestion {
    /*
    WAP to find the smallest String from the given
     String[] names = {"Piyush Sahu","Harish Chourasiya","Anjali Prajapati"
                ,"Gauri Dahake",
                "Ankita Bobde","Shiddharth Patel",
                "Madhur Sahu","Aaditya Rajawat","Akshay Mishra","Devansh Sharma",
                "Kanishka singh kushwaha","Anushka Shrivastava",
                "Devanshi Choudhary",
                "Devanshi bamaliya","Divyansh Malviya","Adarsh Tiwari",
                "Aatmik kushwaha","Ankit Gujre",
                "shanawaz alam","Raman Jatav","Aditya Tanwani","Mohd Nadir Ansari","Deepika Patel","Megha thakre",
                "Dharam singh"};
    A String is said to be small based on its length
     */

    /*
    WAP to count all the Strings those are starting with vowels from the given
     String[] names = {"Piyush Sahu","Harish Chourasiya","Anjali Prajapati"
                ,"Gauri Dahake",
                "Ankita Bobde","Shiddharth Patel",
                "Madhur Sahu","Aaditya Rajawat","Akshay Mishra","Devansh Sharma",
                "Kanishka singh kushwaha","Anushka Shrivastava",
                "Devanshi Choudhary",
                "Devanshi bamaliya","Divyansh Malviya","Adarsh Tiwari",
                "Aatmik kushwaha","Ankit Gujre",
                "shanawaz alam","Raman Jatav","Aditya Tanwani","Mohd Nadir Ansari","Deepika Patel","Megha thakre",
                "Dharam singh"};
     */

    /*
    Steps for q1
    1.will take 1 variable minLength to store length of string
    and another variable to store the minLengthString
    2.travers the array and compare, minLength with the length of String, if minLength is
     greater than any String length then, swap the lengths and store the string in minLengthString

    3. at the end print the smallest String

     */
    public static void main(String[] args) {
        String[] names = {"Piyush Sahu", "Harish Chourasiya", "Anjali Prajapati"
                , "Gauri Dahake",
                "Ankita Bobde", "Shiddharth Patel",
                "Madhur Sahu", "Aaditya Rajawat", "Akshay Mishra", "Devansh Sharma",
                "Kanishka singh kushwaha", "Anushka Shrivastava",
                "Devanshi Choudhary",
                "Devanshi bamaliya", "Divyansh Malviya", "Adarsh Tiwari",
                "Aatmik kushwaha", "Ankit Gujre",
                "shanawaz alam", "Raman Jatav", "Aditya Tanwani", "Mohd Nadir Ansari", "Deepika Patel", "Megha thakre",
                "Dharam singh" };
        int minLength = names[0].length();
        String smallestString = names[0];
        for (String element : names) {
            if (minLength > element.length()) {
                minLength = element.length();
                smallestString = element;
                System.out.println(element);
            }
        }
        System.out.println("smallestString = " + smallestString);
    }
}