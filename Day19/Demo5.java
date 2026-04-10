public class Demo5 {
    public static void main(String[] args) {
        // Direction[] directions = Direction.values();

        // for(Direction d : directions){
        //     System.out.println(d.name());
        // }

        // Direction d = Direction.valueOf("EasT"); // Exception
        // System.out.println(d.name());

        Direction d = Direction.valueOf("EAST"); // Exception
        System.out.println(d.name());
        System.out.println(d.toString());
        System.out.println(d);

        System.out.println(d.ordinal()); //2
    }
}

// values() --- > we can iterate in this enum
//valueOf() ---> covert a string into an enum constant
// name() ---> class name or enum name
// name() vs  toString() ---> toString ko override kar saktay hai..
//ordinal()
// toString //equals //hashcode

enum Direction{
    NORTH,
    SOUTH,
    EAST,
    WEST;

    // @Override
    // public 
}
