import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        String letters = "ABC \t abc \r\n 123!";
        System.out.println(letters);
//        for(char c : letters.toCharArray()){      // TO RE-ENABLE
        for(int p = 0; p < letters.length(); p++) { //REMOVE ME 1
            char c = letters.toCharArray()[p];      //REMOVE ME 2
            int i = (int) c;
            System.out.print(p);
            System.out.print(" ");
            System.out.print("'" + c + "'");
            System.out.print("=");
            System.out.print(i);
            System.out.print(" ");
            System.out.print(Integer.toString(i, 16));
            System.out.print(" ");
            System.out.print(Integer.toString(i, 2));
            System.out.print("\n");
        }
    }
}