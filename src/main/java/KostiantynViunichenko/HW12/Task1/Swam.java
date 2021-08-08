package KostiantynViunichenko.HW12.Task1;

import Task1.CanEat;
import Task1.CanFly;

public class Swam extends Birds implements CanSwim, CanFly, CanEat {

    @Override
    public void canEat() { System.out.println("I can eat grass!! !"); }

    @Override
    public String toString() { return super.toString(); }

    @Override
    public boolean equals(Object o) { return super.equals(o); }

    @Override
    public int hashCode() { return super.hashCode(); }

    @Override
    public void canFly() { System.out.println("I can Fly!! "); }

    @Override
    public void canSwim() { System.out.println("I can Swim!!"); }
}

