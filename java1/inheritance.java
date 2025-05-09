
public class inheritance {
    public static void main(String[] args) {
        Driver d = new Driver();
        d.drive();
    }
}

class User {
    int id;
    String name;
    int age;
    String phno;
    String address;
}

class UseWoo extends User {
    String petname;
    String petId;

    public void welcome() {
        System.out.println("Welcome to the user");
    }
}

class Driver {
    public void drive() {
        UseWoo u = new UseWoo();
        u.name = "Alex";
        u.petname = "Buddy";
        u.welcome();
        System.out.println("User name: " + u.name);
        System.out.println("Pet name: " + u.petname);
    }
}
