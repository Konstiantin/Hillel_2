package KostiantynViunichenko.HW12.Task1;

import java.util.Objects;

public abstract class RubberToys {
    public void rubberToys() { System.out.println("I am Rubber!! \n" + "I have Beak =  "+ haveBeak);}

    public boolean isHaveBeak() {
        return haveBeak;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof RubberToys)) return false;
        RubberToys that = (RubberToys) o;
        return haveBeak == that.haveBeak;
    }

    @Override
    public int hashCode() {
        return Objects.hash(haveBeak);
    }

    private boolean haveBeak = true;
}
