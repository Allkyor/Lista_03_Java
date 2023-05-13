package exer;
import java.util.Scanner;
public class Exer05 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int a,b,c;
		System.out.println("Digite o 1º número");
		a = Integer.parseInt(ler.nextLine());
		System.out.println("Digite o 2º número");
		b = Integer.parseInt(ler.nextLine());
		System.out.println("Digite o 3º número");
		c = Integer.parseInt(ler.nextLine());
		if(a > b && a > c) {
			System.out.println(a+" é o maior que "+b+" e "+c);
		} else if(b > a && b > c) {
			System.out.println(b+" é maior que "+a+ " e "+c);
		}else {
			System.out.println(c+" é maior que "+b+" e "+a);
		}
		ler.close();
	}
}
