public class encapsulation {
    public static void main(String[] args) {
        wooberuser woo = new wooberuser(18, "sreekumar", 72, "kamarajapuram", "7200021788");

        System.out.println("The current age: " + woo.getAge());

        woo.setAge(93); 
        System.out.println("Updated age: " + woo.getAge());
    }
}

class wooberuser {
    private int id;
    private String name;
    private int age;
    private String address;
    private String phno;

    public wooberuser(int id, String name, int age, String address, String phno) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.address = address;
        this.phno = phno;
    }

    public int getId() { return id; }
    public String getName() { return name; }
    public int getAge() { return age; }
    public String getAddress() { return address; }
    public String getPhno() { return phno; }

    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }
    public void setAge(int age) { this.age = age; }
    public void setAddress(String address) { this.address = address; }
    public void setPhno(String phno) { this.phno = phno; }
}
