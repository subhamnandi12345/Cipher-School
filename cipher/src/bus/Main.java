package bus;

public class Main {
    public static void main(String[] args) {

        String name,email,street,city,state,password;
        long phone;
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter name: ");
//        name=scanner.next();
//        System.out.println("Enter email:");
//        email=scanner.next();
//        System.out.println("Enter phone : ");
//        phone=scanner.nextLong();
//        System.out.println("Enter street: ");
//        street=scanner.next();
//        System.out.println("Enter city: ");
//        city=scanner.next();
//        System.out.println("Enter state: ");
//        state=scanner.next();
//        System.out.println("Enter password: ");
//        password=scanner.next();

        //SignupLogin signupLogin=new SignupLogin();
         // User user= signupLogin.signup(name,phone,email,street,city,state,password);
        // System.out.println(user);
        //System.out.println(signupLogin.signup("kamal",83221,"kamal@k.com","xyz","jaipur","rajasthan","k1234"));
        //System.out.println(signupLogin.login("kamal@k.com","k1234"));

        BusOperations busOperations=new BusOperations();
        busOperations.addBus("HR0001","xyz","panchkula","delhi",500);
        busOperations.addBus("UP0001","abc","Lucknow","delhi",500);
        busOperations.addBus("D0001","abcd","panchkula","delhi",800);
        busOperations.addBus("UP0001","xyz","panchkula","delhi",900);

        System.out.println(busOperations.searchBus("panchkula","delhi"));
    }

}
