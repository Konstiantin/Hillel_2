package KostiantynViunichenko.Testttt;

// Допишите собственное (“пользовательское”) исключение c методом myOwnExceptionMsg?
public class TestExc {

    public static class ExcClass extends Exception {

        private String str1;

        public ExcClass (String string) {
            this.str1 = string;
            System.out.println( "Exeption ExcClass " );
        }

        public void myOwnExceptionMsg() {
            System.err.println("This is exception message for string: " + str1);
        }
    }
   public static void main(String[] args) {
        try {
            String s = "SomeString";
            throw new ExcClass(s);
        } catch (ExcClass ex) {
            ex.myOwnExceptionMsg();
        }
    }
}