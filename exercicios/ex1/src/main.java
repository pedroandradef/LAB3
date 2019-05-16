
public class main {
    public static int countNumbers(int[] sortedArray, int lessThan, int contador, int indice) {
        if (sortedArray.length > 0) {
            int tamArray = sortedArray.length -1 ;
            if (tamArray == indice) {
                if (sortedArray[indice] < lessThan)
                    return 1;
                else return 0;
            }
            if (tamArray > indice) {
                if (sortedArray[indice] < lessThan) {
                    return 1 + countNumbers(sortedArray, lessThan, contador, indice + 1);
                } else {
                    return countNumbers(sortedArray, lessThan, contador, indice + 1);
                }
            }
            {
                if (contador > 0) {
                    return contador;
                }
                throw new UnsupportedOperationException("Não contém número menor");
            }
        }
        throw new UnsupportedOperationException("Array vazio");
    }

    public static void main(String[] args) {
        System.out.println(main.countNumbers(new int[]{9,1,1,1,2,5,4,21,23,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1000,125,156,1,561,61,3}, 100, 0, 0));
    }
}
