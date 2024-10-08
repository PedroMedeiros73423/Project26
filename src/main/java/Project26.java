import java.util.Scanner;



public class Project26 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int qtd;
        int vetor[];
        int aux = 0;
        System.out.println("Informe a quantidade de números do vetor: ");
        qtd = in.nextInt();
        System.out.println("Informe os números do Vetor: ");
        vetor = new int[qtd];
        for(int i = 0; i < qtd; i++){
            System.out.println("Digite o número: " + (i + 1));
            vetor[i] = in.nextInt();
        }
        for(int i = 0; i < qtd; i++){
        for(int j = i; j < qtd; j++){
            if(vetor[j] < vetor[i]){
                aux = vetor[i];
                vetor[i] = vetor[j];
                vetor[j] = aux;
            }
        }
    }
        for(int i = 0; i< qtd; i++){
            System.out.println("Vetor[i]: " + vetor[i]);
        }
        
    }
}