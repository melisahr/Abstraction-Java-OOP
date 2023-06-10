public class Main {
    public static void main(String[] args) {
        //Abstract classes can have a subclass but cannot be instantiated.
        //Abstract method can be declared without an implementation.

       //Instantiated
            // Vehicle vehicle = new Vehicle();
        Car car = new Car();

        car.go();
    }
}