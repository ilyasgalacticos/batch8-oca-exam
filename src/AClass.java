public class AClass {

    private void printData(){
        System.out.println("Printing");
    }

    public static void main(String[] args) {
        AClass aClass = new AClass();
        aClass.printData();
    }

    class BClass extends AClass{
        private void printData(){

        }
    }

}
