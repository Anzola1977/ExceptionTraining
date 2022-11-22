public class Test {
    /*public static void main(String[] args) {
        try {
            readFromFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.print("Done");
    }

    public static void readFromFile() throws IOException {
        System.out.print("Reading line ");
    }*/
    public static double someMethod() throws ArithmeticException{
        //try {
        //
        System.out.println("Hallo!");
            double a = 3.34;
            int b = 14;
            double c = 2.27;
            return (b/a*c)*Math.random();
            //throw new NullPointerException();

        /*} catch (NullPointerException e) {
            return "catch";
        } finally {
            return "finally";
        }*/

    }

    public static void main(String[] args) {
        try {
            System.out.println(someMethod());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Big deal");
        }
        System.out.println("Good morning!");
    }
}
