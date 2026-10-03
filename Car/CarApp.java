package Car;

public class CarApp {
    public static void main(String[] args) {

        Car bentley = new Car("bentley", "XUV");
        Car mercedes = new Car("mercedes", "Benz");

        bentley.accelerate(20);
        mercedes.accelerate(30);
        
        bentley.displayStatus();
        System.out.println("==================");
        mercedes.displayStatus();
    }
}
