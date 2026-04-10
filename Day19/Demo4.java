public class Demo4 {
    public static void main(String[] args) {
        // Direction d = new North();

        // //d.move();

        // Direction eastdirection = new Direction() {
        //     @Override
        //     public void move(){
        //         System.out.println("MOVE RIGHT OR (X+1)");
        //     }
        // };

        // eastdirection.move();

        Direction d = Direction.NORTH;

        d.move();
    }
}

enum Direction{
    NORTH{
        @Override
        public void move(){
        System.out.println("MOVE UP OR (Y+1)");
    }
    },
    SOUTH{
        @Override
        public void move(){
        System.out.println("MOVE DOWN OR (Y-1)");
    }
    },
    EAST{
        @Override
        public void move(){
        System.out.println("MOVE RIGHT OR (X+1)");
    }
    },
    WEST{
        @Override
        public void move(){
        System.out.println("MOVE WEST OR (X-1)");
    }
    };

    public abstract void move();

    
}


// abstract class Direction{
//     public abstract void move();
// }

// class North extends Direction{
//     @Override
//     public void move(){
//         System.out.println("MOVE UP OR (Y+1)");
//     }
// }

// class South extends Direction{
//     @Override
//     public void move(){
//         System.out.println("MOVE DOWN OR (y-1)");
//     }
// }