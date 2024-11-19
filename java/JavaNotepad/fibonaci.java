import java.util.Scanner;

 class fibonaci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int n = scanner.nextInt();

        int a = 0, b = 1; 
        int count = 0;

        System.out.println("Fibonacci Series:");
        do {
            System.out.print(a + " ");
            int nextTerm = a + b; 
            a = b; 
            b = nextTerm; 
            count++;
        } while (count < n);

        scanner.close();
    }
}
