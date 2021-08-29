package KostiantynViunichenko.test6;

    public class ExceptionOfMine extends Exception {
        public static void main(String[] args) {
            // что нужно дописать чтобы при раскоментирование выброса исключения у нас не было ошибки
            try {
                //    throw new ExceptionOfMine();

            } finally {
                System.out.println("c");
            }
        }
    }


