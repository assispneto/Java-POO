// Questao 16
// Verifique se o valor de A é igual a 10. Se essa afirmação for verdadeira,
// imprima "A == 10". Em seguida, verifique se a soma de A e B é igual a
// 20. Se essa afirmação for verdadeira, imprima "A + B == 20". Depois
// disso, verifique se o valor de B é igual a 10. Se essa afirmação for
// verdadeira, imprima "B == 10"

package lista1_estruturas_de_decisao;
import java.util.Scanner;

public class Questao16 {
	public static void main(String[] args) {
		Scanner valorA = new Scanner(System.in);
		Scanner valorB = new Scanner(System.in);
		int a = 0;
		int b = 0;
		 
		System.out.print("Digite o valor A > ");
		a = valorA.nextInt();
		System.out.print("Digite o valor B > ");
		b = valorB.nextInt();
		
		System.out.print("\n");
		
		if (a==10) {
			System.out.println("# A=10");
		}
		if (a+b==20) {
			System.out.println("# A+B=20");
		}
		if (b==10) {
			System.out.println("# B=10");
		}
	}
}

