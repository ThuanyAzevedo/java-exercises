import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite um numero de 1 a 10: ");
        int n = sc.nextInt();
        if (n >0 && n<=10){
            int n1= n * 2;
            n1= n1 * 5;
            n1= n1 / n;
            n1= n1 - 7;
            System.out.println("O resultado final é igual a: " + n1);  
        } else {
            System.out.println("Numero invalido!!");
       }

       sc.close();
    }
   
}

/**Faça um programa que peça para o usuário digitar um número de 1 a 10. 
Depois, o programa deve realizar as seguintes operações, nesta ordem:
Multiplicar o número por 2.
Multiplicar o resultado do passo anterior por 5.
Dividir o resultado do passo anterior pelo primeiro número digitado.
Subtrair 7 do resultado.
 No final, o programa deve escrever na tela o resultado final obtido.**/
