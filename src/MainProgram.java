import java.util.Scanner;

/**
 * Created by user on 6/1/2016.
 */
public class MainProgram {

    public static void main(String[] args) {
        IntegerValue value = new IntegerValue();
        int name = 0;
        //value.setValue(5);
        //System.out.print("value = "+value.getValue());
        Scanner in = new Scanner(System.in);
        System.out.print("число: ");
        name = in.nextInt();
        //value.setValue(name);
        Printer printer = new Printer();
        printer.Printer();
    }
}
