import java.util.ArrayList;

public class Atividade4 {

    public static void main(String[] args) {
        ArrayList<Integer> vetor = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            vetor.add(i);
        }
        System.out.println("Tamanho do vetor: " + vetor.size());
        for (int element : vetor) {
            System.out.println(element);
        }
    }
}
