package exer;
import java.util.Scanner;
public class Exer06 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double nota1, nota2, media;
		System.out.println("Digite sua 1º nota");
		nota1 = ler.nextDouble();
		System.out.println("Digite sua 2º nota.");
		nota2 = ler.nextDouble();
		media = (nota1 + nota2)/2;
		if(media >= 7) {
			System.out.println("Aprovado.");
		} else {
			System.out.println("Reprovado.");
		}
		ler.close();
	}
}
