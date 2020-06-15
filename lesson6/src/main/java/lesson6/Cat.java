package lesson6;

public class Cat extends Animal {
    Cat(String type, String name, double RunLimit, double SwimLimit, double JumpLimit) {
        super(type, name, RunLimit,SwimLimit,JumpLimit);
    }

    @Override
    public boolean Swim(double value) {
        return false;
    }
}
