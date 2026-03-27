public class Arrays {
    public static void main(String[] args) {
        // int[] rollnumbers = new int[3];
        // int rollnumbers[] = new int[3];
        // 101 , 102 , 103

        // rollnumbers[0] = 101;
        // rollnumbers[1] = 102;
        // rollnumbers[2] = 103;
        // System.out.println(rollnumbers[0]);
        // System.out.println(rollnumbers[1]);
        // System.out.println(rollnumbers[2]);
        // System.out.println(rollnumbers.length);

        // int x = 101;
        // for(int i = 0 ; i < rollnumbers.length ; i++){
        //         rollnumbers[i] = x;
        //         x++;
        // }

        // for(int i = 0 ; i < rollnumbers.length ; i++){
        //     System.out.println(rollnumbers[i]);
        // }


        // 2D array
        // Multi dimensional array

        // int[][] marks = new int[3][3];

        // marks[0][0] = 23;
        // marks[0][1] = 25;
        // marks[0][2] = 28;

        // marks[1][0] = 33;
        // marks[1][1] = 35;
        // marks[1][2] = 38;

        // marks[2][0] = 43;
        // marks[2][1] = 45;
        // marks[2][2] = 48;

        // for(int row = 0;  row < marks.length; row++){
        //     for(int col = 0; col < marks[row].length; col++){
        //         System.out.print(marks[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // Multi dimensional array--> each array differnet size
        // int[][] marks = new int[3][];
        // marks[0] = new int[1];
        // marks[1] = new int[2];
        // marks[2] = new int[3];

        // marks[0][0] = 23;
        
        // marks[1][0] = 32;
        // marks[1][1] = 33;
        
        // marks[2][0] = 43;
        // marks[2][1] = 44;
        // marks[2][2] = 45;  
               
    
        // for(int row = 0;  row < marks.length; row++){
        //     for(int col = 0; col < marks[row].length; col++){
        //         System.out.print(marks[row][col] + " ");
        //     }
        //     System.out.println();
        // }

        // 1-D Array
        // int[] rollnumbers = {101,102,103};

        // for(int row = 0;  row < rollnumbers.length; row++){
            
        //         System.out.print(rollnumbers[row]+" ");
            
        // }

        //2-D Array
        int[][] marks = {
            {2,5,1},
            {2,5,1},
            {2,5,1}
        };

         for(int row = 0;  row < marks.length; row++){
            for(int col = 0; col < marks[row].length; col++){
                System.out.print(marks[row][col] + " ");
            }
            System.out.println();
        }
        
    }
}
