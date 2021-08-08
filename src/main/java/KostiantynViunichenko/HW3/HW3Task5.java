package KostiantynViunichenko.HW3;

public class HW3Task5 {
  public static void main(String[] args) {

      String  seasonName = "Winter";
      String result ;

      result = ((seasonName == "Winter")|(seasonName == "autumn")|(seasonName == "spring")  ? "It`s cold" : "It`s hot");
        System.out.println(result);
    }
}
