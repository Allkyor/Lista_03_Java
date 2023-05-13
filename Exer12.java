package exer;
import java.util.Scanner;
public class Exer12 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		Float peso, altura, media;		
		System.out.println("Digite sua altura.");
		altura = Float.parseFloat(ler.nextLine());
		System.out.println("Digite seu peso.");
		peso = Float.parseFloat(ler.nextLine());
		media = peso /(altura * altura);
		if(media < 17) {
			System.out.println("Muito abaixo do peso.");
		} else if( media >=17 && media <=18.5) {
			System.out.println("Abaixo do peso.");
		}else if(media > 18.5 && media <= 25 ) {
			System.out.println("Peso normal");
		}else if( media > 25 && media <= 30) {
			System.out.println("Pouco acima do peso");
		}else if(media > 30 && media <= 35) {
			System.out.println("Obesidade 1");
		} else if (media > 35 && media <= 39.99) {
			System.out.println("Obesidade 2");
		} else {
			System.out.println("Obesidade 3");
		}	
		ler.close();
	}
}
