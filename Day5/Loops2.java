public class Loops2 {
    public static void main(String[] args) {
        // 1 to 10

        // for(int i = 1  /*intialization */; i <= 10 /*condition */; i++ /*increment or decrement */){
        //     System.out.println(i); // do something
        // }

        /*
        Flow of control
        1. First assignment statement is executed (variable definition)
        2. Then second conditional statement is evaluated {true/false)
        3. If true, control flow will evaluate the body of the loop
        4.Once loop body is finished, control flow will go back to the for statement, and third increment statement will be evaluated.
        5. Again conditional statement is evaluated
        6. Repeat 2 - 5
        
        */
        // int i = 5;

        // while (i < 10) {
        // // infinite loop
        // }
        // System.out.println("Hello");


        // for(int i = 1;  ;i++){ // infinite loop
        //     System.out.println("Hello");
        // }

        // for(int i = 1; i < 10; ){ // infinite loop
        //     System.out.println("Hello");
        //}

        // infinite loop
        // for( ; ; ){ // infinite loop
        //     System.out.println("Hello");
        // }

        // comma seprated variation
        // for(int i = 1, j = 1; i<=10 ;i++,j+=2){
        //     System.out.println(i*j);
        //     // 1 * 1
        //     // 2 * 3       
        //     // 3 * 5
        //     //.
        // }

        // boolean b  = true;
        // for(int i = 1, j = 1; i<=10 || j <= 5;i++,j+=2){
        //     System.out.println(i*j);
            
        // }

        // boolean b  = true;
        // for(int i = 1; b  = true;i++){
        //     if (condition) {
        //         b = false;
        //     }
        //     System.out.println(i);
            
        // }


        //Integers ---> byte,short,int,long
        // type promotion
        // for(int i = 1; i <= 10; i++){
        //     System.out.println(i);
        // }

        
        // nested loops
        for(int i = 1; i <= 5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print('*'+" ");
            }
            System.out.println();
        }
        /*
        *
        **
        ***
        ****
        *****
        
        */
    }
    
}
