package exer;
import java.util.Scanner;
public class Exer04 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a,b;
		System.out.println("Digite o 1º número");
		a = Integer.parseInt(ler.nextLine());
		System.out.println("Digite o 2º número");
		b = Integer.parseInt(ler.nextLine());
		if(a > b) {
			System.out.println(a+" é o maior que "+b);
		} else {
			System.out.println(b+" é maior que "+a);
		}
		ler.close();
	}
}
