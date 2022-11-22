public class TestException {
    /*public static void main(String[] args) {
        readFromFile();
        System.out.print("Done");
    }

    public static void readFromFile() {
        try {
            System.out.print("Reading line ");
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
    public static void main(String[] args) {
        System.out.println(method1());
    }

    public static String method1() {
        try {
            System.out.print("Try ");
            throw new Exception();
        } catch (Exception e) {
            return "Catch ";
        } finally {
            System.out.print("Finally ");
        }
    }*/

    public static String someMethod() {
        try {
            throw new NullPointerException();
        } catch (NullPointerException e) {
            return "catch";
        } finally {
            System.out.println("finally");
            return "fine";
        }
    }

    public static void main(String[] args) {
        System.out.println(someMethod());
    }
}

