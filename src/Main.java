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

/* EXPECTED OUTPUT
ABC 	 abc
 123!
0 'A'=65 41 1000001
1 'B'=66 42 1000010
2 'C'=67 43 1000011
3 ' '=32 20 100000
4 '	'=9 9 1001
5 ' '=32 20 100000
6 'a'=97 61 1100001
7 'b'=98 62 1100010
8 'c'=99 63 1100011
9 ' '=32 20 100000
'=13 d 1101
11 '
'=10 a 1010
12 ' '=32 20 100000
13 '1'=49 31 110001
14 '2'=50 32 110010
15 '3'=51 33 110011
16 '!'=33 21 100001

Process finished with exit code 0
*/