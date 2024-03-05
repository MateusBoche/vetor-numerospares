import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        NumerosPares app = new NumerosPares();
        app.start();
    }

    private void start() {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        System.out.println("Quantos numeros vc quer digitar? ");
        n = sc.nextInt();
        int[] vetor = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Digite um numero: ");
            vetor[i] = sc.nextInt();
        }
        String numeroPares = "";
        int contador = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 == 0){
                numeroPares += vetor[i] + " ";
                contador +=1;


            }
            
        }
        System.out.println("Numeros pares: ");
        System.out.println(numeroPares);
        System.out.println("Quantidade de pares= "+ contador);

    }
}
