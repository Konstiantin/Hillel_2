package Task1;

import java.util.Objects;

public abstract class Mammal  {

    public void mammal() { System.out.println("I am Mammal!! \n" + "I have Beak =  "+ haveBeak);}
    private boolean haveBeak = true;

    @Override
    public boolean equals(Object o) {

        if (this == o) return true;
        if (!(o instanceof Mammal)) return false;
        Mammal mammal = (Mammal) o;
        return haveBeak == mammal.haveBeak;
    }

    @Override
    public int hashCode() {
        return Objects.hash(haveBeak);
    }

    public boolean isHaveBeak() {
        return haveBeak;
    }

}
