package exer;
import java.util.Scanner;
public class Exer10 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		String ast = " *";
		String o = " o";
		System.out.println("Digite um número");
		num = Integer.parseInt(ler.nextLine());	
		String forma[][] = new String[num][num];
		for(int a = 0; a < forma.length; a++) {
			for(int b = 0; b < forma.length; b++) {
				if(a == b) {
					forma[a][b] = o;
					System.out.print(forma[a][b]);
				}else {
					forma[a][b] = ast;
					System.out.print(forma[a][b]);
				}		
			}
			System.out.println();
		}	
		ler.close();
	}
}
