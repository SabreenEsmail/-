import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args)
    {

        Scanner scanner =new
                Scanner(System.in);
        System.out.print("4");
        int intValue =Scanner.nextInt();
        System.out.println("4:"+intValue);
        System.out.print("10");
        float floaValue =scanner.nextFloat();
        System.out.println("10"+floaValue);
        System.out.print("s");
        char charValue = scanner.next().charAt(0);
        System.out.println("s"+charValue);
        System.out.print("2");
        boolean booleanValue =scanner.nextBoolean();
        System.out.println("2"+booleanValue);
        scanner.close();
    }

}
