public class Demo {
    
    public static void main(String[] args) {
        String s1 = new String("");
        //String
        String s2 = new String("Hello");

        String s3 = "Aditya";
        String s4 = new String(s3);

        System.out.println(s1);

        System.out.println(s2);

        // char array
        char[] arr = {'A', 'd', 'i', 't', 'y','a',' ', 'T','a','n','d','a','n'};
        String s5 = new String(arr); // values
        // arr[0] = 'B'; // String muttable

        System.out.println(s5);

        //char array subset
        String s6 = new String(arr,0,7);

        System.out.println(s6);

        byte[] arr2 = {97, 98, 99};
        String s7 = new String(arr2);

        System.out.println(s7);

        String s8 = new String(arr2,0,1);
        System.out.println(s8);

        //String builder //Stringbuffer
        StringBuffer sb = new StringBuffer("Hello");
        String s9 = new String(sb);

        System.out.println(s9);
    }
}



//[0,6)

// constructor

// heap --> s4 --> Aditya
// String pool ---> s3 ---> Aditya

