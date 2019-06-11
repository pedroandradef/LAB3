package exercicio4;
import java.util.Collections;
import java.util.ArrayList;

public class ex4 {


    public static void apagandoGanhando(ArrayList<Integer> array, int remover) {
        ArrayList<Integer> aux = new ArrayList<Integer>();
        aux = (ArrayList<Integer>) array.clone();

        Collections.sort(aux);

        System.out.println(aux.toString());

        for (int i = 0; i < remover; i++)
            aux.remove(0);

        System.out.println(aux.toString());

        for (int i = 0; i < aux.size(); i++) {
            if (!aux.contains(array.get(i)))
                array.remove(i);
        }


        System.out.println(array.toString());

    }
}
