package exer;
import java.util.Scanner;
public class Exer02 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String respo;
		System.out.println("Você tem 18 anos ou mais?");
		respo = ler.nextLine();
		if(respo.equals("sim")) {
			System.out.println("Permitido o Acesso.");
		} else {
			System.out.println("PROIBIDO O ACESSO.");
		}			
		ler.close();
	}
}
