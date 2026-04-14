public class Demo {
    public static void main(String[] args) {
        //upcasting
        String s = "Helllo";
        Object obj = s;

        System.out.println(obj);


        //Downcasting
        Object obj2 = "Aditya";
        String str = (String)obj2;

        System.out.println(str);

        Object obj3 = 10;
        String str3 = (String)obj3;

        System.out.println(str3);

    }
    
}
