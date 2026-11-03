class Bicycle {
    int cadence = 0;          // fields = the object's state
    int speed = 0;
    int gear = 1;

    void changeCadence(int newValue) { cadence = newValue; }    // methods = behaviour
    void changeGear(int newValue) { gear = newValue; }
    void speedUp(int increment) { speed = speed + increment; }
    void applyBrakes(int decrement) { speed = speed - decrement; }
    void printStates() {
        System.out.println("cadence:" + cadence + " speed:" + speed + " gear:" + gear);
    }
}

public class BicycleDemo {
    public static void main(String[] args) {
        Bicycle bike1 = new Bicycle();      // create two different Bicycle objects
        Bicycle bike2 = new Bicycle();

        bike1.changeCadence(50);            // invoke methods on those objects
        bike1.speedUp(10);
        bike1.changeGear(2);
        bike1.printStates();

        bike2.changeCadence(50);
        bike2.speedUp(10);
        bike2.changeGear(2);
        bike2.changeCadence(40);
        bike2.speedUp(10);
        bike2.changeGear(3);
        bike2.printStates();
    }
}