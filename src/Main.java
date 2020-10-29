import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Loop pertama
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            // add(sc.nextInt())
        }

        // Loop kedua
        int m = sc.nextInt();
        for (int i = 0; i < m; i++) {
            String command = sc.next();

            if (command.equalsIgnoreCase("disband")) {
                int x = sc.nextInt();
                int y = sc.nextInt();

                // disband(x,y)
            } else if (command.equalsIgnoreCase("rotate")) {
                // rotate()
            } else if (command.equalsIgnoreCase("add")) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                // add(x,y)
            }
        }
    }
}
