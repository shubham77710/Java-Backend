public class Question2 {
    public static void main(String[] args) {
        // square pattern
        // for(int i = 1; i <= 4; i++){
        //     for(int j = 1; j<=4; j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        //Perpendicular line
        // for(int i = 1; i <= 5; i++){
        //     System.out.print("* ");
        // }
        // for(int j = 1; j<=4; j++){
        //         System.out.println("    *");
        // }

        //right triangle
        // for(int i = 1;i<=5;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // Inverted Right Triangle
        // for(int i = 1;i<=5;i++){
        //     for(int j = 5;j>=i;j--){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // number square pattern
        // for(int i = 1; i <= 4; i++){
        //     for(int j = 1; j<=4; j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // //increasing right triangle
        // for(int i = 1;i<=5;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //continuous number triangle
        // int a = 1;
        // for(int i = 1;i<=5;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print(a+" ");
        //         a++;
        //     }
        //     System.out.println();
        // }

        // pyramid pattern
        // int a = 4;
        // for(int i = 1; i <= 5;i++){
        //     for(int j = 1;j<=a;j++){
        //         System.out.print(" ");
        //     }a--;
        //     for(int k = 1;k<=i;k++){
        //         System.out.print("* ");
        //     }
        //     System.out.println();
        // }

        // // inverted pyramid pattern
        // int a = 1;
        // int b = 3;
        // for(int i = 1; i <= 3;i++){
        //     for(int k = 1;k<=a;k++){
        //         System.out.print(" ");
        //     }a++;
        //     for(int j = 1;j<=b;j++){
        //         System.out.print("* ");
        //     }b--;
            
        //     System.out.println();
        // }

        // half pyramid with same numbers
       
        // for(int i = 1; i <= 5;i++){
        //     for(int j = 1;j<=i;j++){
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // print binary pattern
      
        // for(int i = 1; i <=5; i++){
        //     for(int j = 1;j<=i;j++){
        //         if((i+j)%2==0){
        //             System.out.print(" 1");
        //         }
        //         else{
        //             System.out.print(" 0");
        //         }
        //     }
        //     System.out.println();
        // }

        // print diamond pattern
        
        // int n = 5;

        // // Upper part
        // for(int i = 1; i <= n; i++){
        //     for(int j = 1; j <= n - i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int j = 1; j <= i; j++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

        // // Lower part
        // for(int i = n - 1 ; i>=1; i--){
        //     for(int j = 1; j<= n - i; j++){
        //         System.out.print(" ");
        //     }
        //     for(int k = 1; k <=i; k++){
        //         System.out.print(" *");
        //     }
        //     System.out.println();
        // }

        // floyd's triangle
        int a = 1;
        for(int i = 1 ;i<=5;i++){
            for(int j = 1;j<=i;j++){
                System.out.print(" "+a);
                a++;
            }
            System.out.println();
        }



    }
}
