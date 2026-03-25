public class Ifcode {
    public static void main(String[] args) {
        
        // boolean b = true;
        //  int i = 6;
        // selection statments
        // Normal if

        // if(i > 5 && i < 10){
        //     System.out.println("i is greater than  5");
        // }
        // else{
        //         System.out.println("i is less than or equal to 5");
        // }

        // int i = 7;

        // if(i%2==0){
        //     System.out.println("i is even number");
        // }
        // else{
        //     System.out.println("i is odd number");
        // }

        // Nested ifs
        // i = 8
        // if(i > 5){
        //     // execute
        //     if( i < 10){
        //         // execute
        //         if(i==7){
        //             // execute
        //         }
        //     }
        //     else{
        //         // not execute
        //     }
        // }
        // else{
        //     // not execute
        // }

        // if(i>5 && i<10 && i==7){
        //     System.out.println("Exe");
        // }


        // boolean b = true;
        // int i = 9;

        // //if-else-if ladder
        // if(i == 5){
        //     // execute this
        //     System.out.println("i is 5");
        // }
        // else if(i == 6){
        //     // execute this
        //     System.out.println("i is 6");
        // }
        // else if(i == 7){
        //     System.out.println("i is 7");
        // }
        // else if(i == 8){
        //     System.out.println("i is 8");
        // }
        // else if(i == 9){
        //     System.out.println("i is 9");
        // }
        
        int age = 50;

        if(age > 80){
            System.out.println("You are very old");
        }
        else if(age > 60){
            System.out.println("You are old");
        }
        else if(age > 40){
            System.out.println("You are becoming old");
        }
        else if(age > 20){
            System.out.println("You are young");
        }
        else{
            System.out.println("You are child");
        }

    // bytecode---> jvm---> machine code
}

}
