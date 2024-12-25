package Savarjisho5;

public class Car implements InterfaceX, InterfaceY {
    @Override
    public void Left() {
        System.out.println("The Car Went left");
    }

    @Override
    public void Right() {
        System.out.println("The Car Went Right");
    }

    @Override
    public void Start() {
        System.out.println("The Car Started");
    }

    @Override
    public void Stop() {
        System.out.println("The Car Stopped");
    }
}
