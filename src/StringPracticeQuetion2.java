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
public class StringPracticeQuetion2 {
    public static void main(String[] args) {
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
        int count = 0 ;
        for (String element : names) {
            if(element.startsWith("a") ||
            element.startsWith("e") ||
                    element.startsWith("i") ||
                    element.startsWith("o") ||
                    element.startsWith("u") ||
                    element.startsWith("A") ||
                    element.startsWith("E") ||
                    element.startsWith("I") ||
                    element.startsWith("O") ||
                    element.startsWith("U")
            ){
                count ++;
                System.out.println(element);
            }
        }
        System.out.println("count = " + count);
    }
}