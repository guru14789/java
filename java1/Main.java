public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota");

        myCar.start();     
        myCar.drive();             
        myCar.honk();     
        myCar.stop();      
    }

    public interface Driveable {
        void drive();     
        void stop();      
    }

    public static abstract class Vehicle {
        String brand;

        public Vehicle(String brand) {
            this.brand = brand;
        }

        public abstract void start();

        public void honk() {
            System.out.println(brand + " says: Honk honk!");
        }
    }

    public static class Car extends Vehicle implements Driveable {

        public Car(String brand) {
            super(brand);
        }

        @Override
        public void start() {
            System.out.println(brand + " is starting...");
        }

        @Override
        public void drive() {
            System.out.println(brand + " is driving...");
        }

        @Override
        public void stop() {
            System.out.println(brand + " has stopped.");
        }
    }
}
