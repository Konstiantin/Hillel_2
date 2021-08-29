package KostiantynViunichenko.test;

public class test3 {

    public static class Dog {
        private final String name;
        private boolean isCollarPutOn;
        private boolean isLeashPutOn;
        private boolean isMuzzlePutOn;

        public Dog(String name) {
            this.name = name;
        }
        //Напишите методы putCollar(), putLeash(), putMuzzle(), в которых вы совершаете действие надевания и выводите действие на экран,
        // потом в методе walk() для того, чтобы погулять с собакой,
        // перед выходом на прогулку необходимо проверить, надеты ли на собаку ошейник,
        // поводок и намордник. Если что-то из этого отсутствует, выбросим собственное исключение DogIsNotReadyException.
        public class DogIsNotReadyException extends Exception {

            public DogIsNotReadyException(String message) {
                super(" My error \n" + message + "\n" );
                // что сюда добавляем?
            }
        }

        public void putCollar(){
            System.out.println(" Collar is on!");
            this.isCollarPutOn = true;
        }
        public void putLeash(){
            System.out.println(" Leash is on!");
            this.isLeashPutOn = true;
        }

        public void  putMuzzle(){
            System.out.println(" Muzzle is on!");
            this.isMuzzlePutOn = true;
        }

        public static void main(String[] args)  {
            Dog dog = new Dog("Асти");
            try {
                dog.putCollar();
                dog.putMuzzle();
                dog.putLeash();
                dog.walk();
            }catch (DogIsNotReadyException e){
                System.out.println(e.getMessage());
                System.out.println (" Collar put on?" + dog.isCollarPutOn +
                        " Leash put on?"+dog.isLeashPutOn + "Muzzle put on? " + dog.isMuzzlePutOn);
            }
        }

        public void walk() throws DogIsNotReadyException {
            System.out.println(" We are going for a walk ");
            if (isCollarPutOn && isLeashPutOn && isMuzzlePutOn){
                System.out.println(" And we go "+ name);
            }
            else {
                throw new DogIsNotReadyException(" Dog " + name + " not ready!");
            }
        }
    }
}
