public class Operators {
    public static void main(String[] args) {
        // Operators in java

        //Arithmetic Operation --> +, -, *, /, %, +=, -+, /=, *=, ++, --

        int a = 5;
        int b = 10;

        int c = a+b; // 15
        int d = a-b; // -5
        int e = a*b; // 50
        int f = b/a; // 2
        int g  = b%a; // 0

        System.out.println(c+ " , "+ d + " , "+ e + " , "+ f +" ,"+g);

        int h = a +  2;

        // h = h + 2; //Since this is ok in CSE
        h += 2; // h = h + 2;

        h -= 2;// 7

        h *= 3; // 21
        h /= 5; // h = h /5;
        h %= 5;

        System.out.println(h);

        int i = 6;
        i++; // i = i + 1; ----> i += 1; i = 7;
        i--; // i = i - 1;---> i -+ 1; 

        System.out.println(i);

        // pre increment and post increment/decrement

        int j = 7;
        j++; // postfix increment
        ++j; // --j; prefix increment / prefix decrement
        // j = 9
        int k = j++; // j = 10 and k = 9
       
        System.out.println(j+" "+k);
       
         int l = ++j; // j = 11 and l = 11
        System.out.println(j+" "+l);

    



    }
}
