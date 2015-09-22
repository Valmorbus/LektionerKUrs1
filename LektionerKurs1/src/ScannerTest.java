import java.util.Scanner;


public class ScannerTest {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String text = scanner.next();
		System.out.println(text);
		scanner.close();

	}

}
