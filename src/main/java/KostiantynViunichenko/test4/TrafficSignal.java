package KostiantynViunichenko.test4;

public class TrafficSignal {

    public static void main(String[] args) {
        Traffic[] array = Traffic.values();

        for (Traffic item : array) {
            System.out.println("Name: " + item.name() + " Action: " + item.getAction());
        }
    }
}
