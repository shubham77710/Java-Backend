public class Demo {
   public static void main(String[] args) {
    
    // int status = Paymentstatus.SUCCESS;

    // System.out.println(status);

    // int status2 = 100;

    // if(status== Role.ADMIN){

    // }

    String status = Paymentstatus.SUCCESS;
    System.out.println(status);

    if(status == "success"){
        
    }

   } 
}


// payment status -->> success, failed, pending
// final

// problems
/*
Problems with this approach : 
1. Type safety
2. poor readability
3. No grouping of related entities
*/


class Paymentstatus{
    // public static final int SUCCESS = 1;
    // public static final int FAILED  = 2;
    // public static final int PENDING = 3;

    public static final String SUCCESS = "Success";
    public static final String FAILED  = "Failed";
    public static final String PENDING = "Pending";
}

class Role{
    public static final int USER = 1;
    public static final int ADMIN = 2;
}