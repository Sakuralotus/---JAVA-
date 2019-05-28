import java.util.Scanner;
public class km {
	public static void main(String[] args) {
		int a1;
		Scanner scanner = new Scanner(System.in);
        System.out.print("輸入英哩: ");
        a1 = scanner.nextInt();
        System.out.println("換算公里是: " + (a1 * 1.6 * 10));
    }
 
}