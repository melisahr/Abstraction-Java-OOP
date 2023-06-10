public class Main {
    public static void main(String[] args) {
        //Abstract classes  cannot be instantiated but have a subclass instead.
        //Abstract method can be declared without an implementation.

       //Instantiated
            // Vehicle vehicle = new Vehicle();
        Car car = new Car();

        car.go();
    }
}