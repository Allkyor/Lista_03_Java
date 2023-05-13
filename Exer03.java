package exer;
import java.util.Scanner;
public class Exer03 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int hora;
		System.out.println("Que horas são?");
		hora = Integer.parseInt(ler.nextLine());
		if(hora < 12) {
			System.out.println("Bom dia!");
		} else if (hora > 18) {
			System.out.println("Boa noite!");
		} else {
			System.out.println("Boa Tarde.");
		}	
		ler.close();
	}
}
