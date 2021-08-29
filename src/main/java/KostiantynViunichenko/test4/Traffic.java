package KostiantynViunichenko.test4;

// создать enum для цветов светофора, на каждый цвет обозначить действие

// заполнить enum  Traffic с перечислением цветов светофора и действиями которые предпринимаются к кадому цвету
//// и методом возвращающим это действие из enum
//// далее вывести на экран все сигналы и их действия в классе TrafficSignal
//public class TrafficSignal {
//    public static void main(String args[]) {
//

  public enum Traffic {
      RED ( "Stop"),
      GREEN ("Do"),
      YELLOW ("Wait");
      private String action ;

      Traffic(String action) {
          this.action = action;
      }

      public String getAction() {
          return action;
      }
  }



