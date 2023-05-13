package exer;
import java.util.Scanner;
public class Exer01 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		String respo, pim = "\nPIM";
		String batata = "Batatinha quando nasce espalha a rama pelo chão.";
		String menina = "Menininha quando dorme põe a mão no coração.";
		String sou = "Sou pequenininha do tamanho de um botão.";
		System.out.println("Deseja escrever?");
		respo = ler.nextLine();
		if(respo.equals("sim")) {
			System.out.println(batata + pim);				
		} else {
			System.out.println(batata);
		} 
		System.out.println("Deseja escrever?");
		respo = ler.nextLine();
		if (respo.equals("sim")) {
			System.out.println(menina + pim);
		} else {
			System.out.println(menina);
		}
		System.out.println("Deseja escrever?");
		respo = ler.nextLine();
		if(respo.equals("sim")) {
			System.out.println(sou + pim);
		} else {
			System.out.println(sou);
		}
		ler.close();	
	}
}
