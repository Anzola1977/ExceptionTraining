import java.io.IOException;
import java.text.NumberFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {
        int[] array = {1, 2, -1, 5, 3};
        int s = 0, i;
        for (i = 0; i < array.length; i++) {
            //for (int i : array) {
            s += array[i];//if (i < array.length -1) {
            System.out.println(s);//
        }
        /*try {
            NumberFormat nf = NumberFormat.getInstance();
            //специально создаем ситуацию, которая приведет к исключению
            System.out.println(nf.parse("489"));
        }
        catch (ParseException e) {
            System.out.println(e.getMessage());
        }
        System.out.println("Конец программы!");
        String string = "123";
        try
        {
            char chr = string.charAt(2);
            System.out.println(chr);
        }
        catch(StringIndexOutOfBoundsException ex)
        {
            System.out.println(ex.toString());
        }
        System.out.println("Конец программы!");*/

        try {
            int a = (int)(Math.random() * 2);
            System.out.println("a = " + a);
            int c[] = { 1/a }; // опасное место #1
            c[a] = 71; // опасное место #2
        } catch(ArithmeticException e) {
            e.printStackTrace();
            //System.err.println("деление на 0 " + e);
        } catch(ArrayIndexOutOfBoundsException e) {
            System.err.println("out of bound: " + e);
        } catch (Exception e) {
            System.out.println("Exception" + e);
        }
        // окончание try-catch блока*/
        System.out.println("after try-catch");
    }
}
