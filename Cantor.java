import java.util.Scanner;

class Cantor {

    static void georgeCantor(int n) {

        int i = 1; // numerator
        int j = 1; // denominator
        int k = 1; // term counter

        while (k < n) {

            j++;
            k++;

            // move down-left diagonally
            while (j > 1 && k < n) {
                i++;
                j--;
                k++;
            }

            if (k >= n) break;

            i++;
            k++;

            // move up-right diagonally
            while (i > 1 && k < n) {
                i--;
                j++;
                k++;
            }
        }

        System.out.print(i + "/" + j + " ");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms you want: ");
        int a = sc.nextInt();

        for (int n = 1; n <= a; n++) {
            georgeCantor(n);
        }

        sc.close();
    }
}
