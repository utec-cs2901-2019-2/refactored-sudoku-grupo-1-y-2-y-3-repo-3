import java.util.Scanner;

public class Main {
    public Main() {
    }

    public static void Main(String[] var0) {
        while(true) {
            Sudoku var1 = new Sudoku();
            Scanner var2 = new Scanner(System.in);
            System.out.println("Enter x: ");
            int var3 = var2.nextInt();
            System.out.println("Enter y: ");
            int var4 = var2.nextInt();
            System.out.println("Enter value: ");
            int var5 = var2.nextInt();
            boolean var6 = var1.makeMove(var3, var4, var5);
            if (!var6) {
                System.out.println("Invalid move");
            } else {
                var1.printBoard();
                if (var1.isEnd()) {
                    System.out.println("Win");
                    return;
                }
            }
        }
    }
}
