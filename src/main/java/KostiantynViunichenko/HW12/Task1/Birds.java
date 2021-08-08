package KostiantynViunichenko.HW12.Task1;

import java.util.Objects;

public abstract class Birds {
    public  void bird () { System.out.println("I am bird!\n "+"I have Beak =  "+ haveBeak);}

    private boolean haveBeak = true;

    public boolean isHaveBeak() {
        return haveBeak;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Birds)) return false;
        Birds birds = (Birds) o;
        return haveBeak == birds.haveBeak;
    }

    @Override
    public int hashCode() {
        return Objects.hash(haveBeak);
    }

}

