import java.util.ArrayList;
import java.util.Random;

public class Atividade5 {
    public static void main(String[] args) {

        ArrayList<Integer> vetor = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1000; i++) {
            vetor.add(random.nextInt());
        }
        System.out.println("Tamanho do vetor: " + vetor.size());
        for (int i = 0; i < 20; i++) {
            System.out.println(vetor.get(i));
        }
    }
}
