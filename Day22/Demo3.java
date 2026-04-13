public class Demo3 {
    public static void main(String[] args) {
        // StringBuilder sb = new StringBuilder(100);
        StringBuilder sb = new StringBuilder();
        sb.append("Aditya");
        sb.append("Tandan");
        sb.append("Huiii");
        //6 + 6 + 5 = 17

        // System.out.println(sb);

        // //insert()

        // sb.insert(2, 'o');

        // System.out.println(sb); // Adoitya

        // //delete()

        // sb.delete(0, 2);

        // System.out.println(sb);

        // sb.deleteCharAt(1);

        //replace()
        // sb.replace(1, 3, "XY");
        // System.out.println(sb);

        // //reverse()
        // sb.reverse();
        // System.out.println(sb);

        // //charAt()
        // sb.charAt(3);
        // sb.setCharAt(3, 'r');


       // System.out.println(sb.length());
       // System.out.println(sb.capacity());

       // sb.ensureCapacity(100);

       System.out.println(sb.capacity()); // 34

       sb.trimToSize();

       System.out.println(sb.capacity());
    }
    
}
