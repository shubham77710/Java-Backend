public class Demo2 {
    public static void main(String[] args) {
        
        String s1 = new String("Aditya"); // 97 + 98 + 99
        String s2 = new String("abd");

        //Length/ Emptiness
        // System.out.println(s1.length());//6
        // System.out.println(s1.isEmpty()); // false
        // System.out.println(s1.isBlank()); //false

        // String s2 = new String("");

        // //Length/ Emptiness
        // System.out.println(s2.length());//
        // System.out.println(s2.isEmpty()); // true
        // System.out.println(s2.isBlank()); //true

        //Character access
        // System.out.println(s1.charAt(2));
        // char[] arr = s1.toCharArray();
        // System.out.println(arr);

        //comparison
        // System.out.println(s1 == s2); //false
        // System.out.println(s1.equals(s2));// true //false
        // System.out.println(s1.equalsIgnoreCase(s2)); // true --> ignoring uppercase and lowercase


        //Lexico graphical comparison -- > Dictionary
        // compareTo --> -ve. 0, +ve
        // System.out.println(s1.compareTo(s2));

        //Searching
        // System.out.println(s1.contains("ity")); // true
        // System.out.println(s1.indexOf('i')); // 2

        // System.out.println(s1.indexOf("ity")); // 2
        // System.out.println(s1.lastIndexOf("ity"));// 6

        // System.out.println(s1.startsWith("Ad")); // true 
        // System.out.println(s1.endsWith("ya")); // true


        // //Extraction / transformation
        // System.out.println(s1.substring(1,4));
        // System.out.println(s1.substring(1));

        // System.out.println(s1.toUpperCase());
        // System.out.println(s1.toLowerCase());
        // System.out.println(s1.trim()); // trim spaces "   Aditya " --> Aditya
        // System.out.println(s1.strip()); // unicode friendly
        // System.out.println(s1.repeat(3));
        // System.out.println(s1.replace('i', 'o'));
        // System.out.println(s1.replace("ity", "oda"));

        // System.out.println(s1.replaceAll("Ad", "ab"));


        // split()
        // String s3 = "Aditya, Rohit, Rohan";

        // String[] arr = s3.split(",");

        // for(String i : arr){
        //     System.out.println(i);
        // }

        //join()

    //    System.out.println(String.join("-", "a","b")); 

       //conversion
    //    String s4 = new String(String.valueOf(10));
    //    System.out.println(s4);

    //    byte[] arr = s1.getBytes();
    //    for(byte i : arr){
    //     System.out.print(i+" ");
    //    }

    // Advance -- > intern(), format()
    String s5 = new String("Hello");
    String s6 = s5.intern(); // heap se utha ke stringpool

    System.out.println(s5 == s6);

    //format
    String name = "Aditya";
    int age = 28;

    // Hello Aditya , your age is 28

    System.out.println("Hello"+" "+name+","+" "+"your age is"+" "+age);
    System.out.println(String.format("Hello %s, your age is %s", name, age));


    }
    
}
//equals() --> == --> References ko compare
// compareTo --> -ve. 0, +ve

// substring --> [inclusive , exclusive)

/*
String pool : "Hello"
Heap : s5 --> "Hello" <--- s6


after using s5.intern()
String pool : "Hello" <--- s6
Heap : s5 --> "Hello" 

 */
