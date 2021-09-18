import java.util.Scanner;

public class hhh {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int value = scanner.nextInt();

        if(value%2==0)
            System.out.println("чмсло четное");
        else
            System.out.println("число нечетное");
    }
}
