package exer;
import java.util.Scanner;
public class Exer08 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		System.out.println("Digite um número");
		num = Integer.parseInt(ler.nextLine());
		for(int i = 1; i <= num; i++) {
			if(i % 3 != 0) {
				System.out.println(i);
			} 		
		}
		ler.close();
	}

}
