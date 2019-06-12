package exercicio4;
import java.util.Collections;
import java.util.ArrayList;

public class ex4 {


    public static void apagandoGanhando(ArrayList<Integer> array, int remover) {
        ArrayList<Integer> aux = new ArrayList<Integer>();
        aux = (ArrayList<Integer>) array.clone();

        ArrayList<Integer> resp = new ArrayList<>();

        Collections.sort(aux);



        for (int i = 0; i < remover; i++)
            aux.remove(0);


        for (int i = 0; i < aux.size(); i++) {
            if (aux.contains(array.get(i)))
                resp.add(array.get(i));
        }


        System.out.println("Total a ser levado: " + resp.toString());

    }
}
