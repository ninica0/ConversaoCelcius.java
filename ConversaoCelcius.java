
import java.util.Scanner;

public class ConversaoCelcius {

	public static void main(String[] args) {
		int num1, num2, num3, num4, res;
		num2 = 9;
		num3 = 5;
		num4 = 32;
		
		Scanner sc =  new Scanner(System.in);
		
		//processamentp
		System.out.print("Digite os graus Celcius: ");
		num1 = sc.nextInt();
		
		res = num1 * num2/ num3 + num4;
		
		System.out.println("O resultado em graus Farenheit é: " + res);


	}

}