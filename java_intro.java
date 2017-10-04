import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        String s = "";
        while(scan.hasNext())
        {
            s=scan.nextLine();
        }

    

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
        
        ///JAVA OUTPUT FORMATTING
        /*Each String is left-justified with trailing whitespace through the 
         *first  characters. The leading digit of the integer is the  character, 
         *and each integer that was less than  digits now has leading zeroes.
         */
        Scanner sc=new Scanner(System.in);
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                System.out.printf("%-15s%03d%n", s1, x);
            }
            System.out.println("================================");
        
        ///JAVA LOOPS1
        /*Given an integer, , print its first  multiples. Each multiple  (where )
         *should be printed on a new line in the form: N x i = result.
         */
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        for(int i = 1; i <= 10; i++){

            System.out.printf("%d x %d = %d%n", N, i, N*i);
        }
        
        ///JAVA LOOPS2
         Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int tempAnswer = 0; 
            for (int j = 0; j < n; j++) {
                tempAnswer += (Math.pow(2, j) * b); 
                System.out.print(tempAnswer + a + " "); 
                
            }System.out.print("\n");
        }
        in.close();
    }
}
