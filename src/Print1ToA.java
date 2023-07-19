import java.util.Scanner;

public class Print1ToA {
    static void print1toA(int N){
        if(N == 1) {
            System.out.print(N+" ");
            return;
        }
        print1toA(N-1);
        System.out.print(N+" ");
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        print1toA(scanner.nextInt());
    }
}
