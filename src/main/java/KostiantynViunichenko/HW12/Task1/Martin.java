package Task1;

import KostiantynViunichenko.HW12.Task1.Birds;

public class Martin extends Birds implements CanFly,CanEat  {

    @Override
    public String toString() { return super.toString(); }

    @Override
    public boolean equals(Object o) { return super.equals(o); }

    @Override
    public int hashCode() { return super.hashCode(); }

    @Override
    public void canEat() { System.out.println("I can eat bugs!!"); }

    @Override
    public void canFly() { System.out.println("I can Fly!!! "); }

}
