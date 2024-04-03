public class Atividade6 {
    public static void main(String[] args) {
        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int soma = calculatorSoma(vetor);
        System.out.println("A soma do vetor é: " + soma);
    }
    public static int calculatorSoma(int[] vetor) {
        int soma = 0;
        for (int element : vetor) {
            soma += element;
        }
        return soma;
    }
}
