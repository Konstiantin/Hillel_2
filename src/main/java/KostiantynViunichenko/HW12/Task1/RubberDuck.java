package KostiantynViunichenko.HW12.Task1;

import KostiantynViunichenko.HW12.Task1.CanSwim;
import KostiantynViunichenko.HW12.Task1.RubberToys;

public class RubberDuck extends RubberToys implements CanSwim {

    @Override
    public void canSwim() {
        System.out.println("I can swim!! ");
    }

    public void rubberToys() {
    }
}
