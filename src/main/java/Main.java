import java.util.Scanner;

public class Main {
    static int userChoice;
    public static void main(String[] args) {
        System.out.println("Please enter your choice from below:\n"+"1.Chrome "+"2.FireFox or "+"3.Edge");
        Scanner sc = new Scanner(System.in);
        userChoice  = sc.nextInt();
        BrowserChoiceTest input = new BrowserChoiceTest();
        input.browserChoice();
    }
}
