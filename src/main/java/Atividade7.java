public class Atividade7 {

    public static void main(String[] args) {

        int[] vetor = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        double media = calculated(vetor);
        System.out.println("A média é: " + media);
    }
    public static double calculated(int[] vetor) {
        int soma = 0;
        for (int element : vetor) {
            soma += element;
        }
        return soma / (double) vetor.length;
    }
}
