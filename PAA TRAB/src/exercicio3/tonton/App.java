package exercicio3.tonton;

import java.util.Random;

import exercicio3.tonton.Problems.KnapsackProblem.Item;
import exercicio3.tonton.Problems.KnapsackProblem.KnapsackProblem;
import exercicio3.ex3;

import java.util.ArrayList;
import java.util.List;


public class App {

    public static void main(String[] args) {



        long tempoInicio = 0;
        int cap = 0;

        List<Item> items1 = new ArrayList<>();
        items1.add(new Item(100, 2));
        items1.add(new Item(200, 4));
        items1.add(new Item(300, 6));
        items1.add(new Item(400, 8));
        items1.add(new Item(500, 9));
        items1.add(new Item(600, 10));
        items1.add(new Item(700, 11));

        int cap1[] = new int[]{7, 9, 10, 37, 55, 17, 26, 40, 20, 90};
        int weight1[] = new int[7];
        int value1[] = new int[7];

        ArrayList<Integer> weight01 = new ArrayList<>();
        ArrayList<Integer> value01 = new ArrayList<>();

        for(int i = 0; i < 7; i++){
            weight1[i] = (int)items1.get(i).getWeight();
            value1[i] = (int)items1.get(i).getValue();
            weight01.add(weight1[i]);
            value01.add(value1[i]);
        }

//        for(cap = 0; cap < cap1.length; cap++){
//        tempoInicio = System.nanoTime();
//        KnapsackProblem demo = new KnapsackProblem(cap1[cap], items1);
//        demo.startDemo(16, items1.size(), 40);
//        System.out.println("Capacidade: " + cap1[cap] + " Tempo gasto para itens 1 no ALGORITMO GENETICO: " + (System.nanoTime() - tempoInicio));}

//        for(cap = 0; cap < cap1.length; cap++){
//        int memo1[][] = ex3.criaVetorDin();
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.dinamic(6,cap1[cap],memo1,value1,weight1));
//        System.out.println("Capacidade: " + cap1[cap] + " Tempo gasto para itens 1 na programacao dinamica: " + (System.nanoTime() - tempoInicio));}
//        System.out.println("\n\n");

//
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.greedy(value01,weight01,cap1[0],0));
//        System.out.println("Capacidade: " + cap1[0] + " Tempo gasto para itens 1 no algoritmo guloso: " + (System.nanoTime() - tempoInicio)+ "\n");



//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.greedy(value01,weight01,cap1[1],0));
//        System.out.println("Capacidade: " + cap1[1] + " Tempo gasto para itens 1 no algoritmo guloso: " + (System.nanoTime() - tempoInicio) + "\n");

//
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.greedy(value01,weight01,cap1[2],0));
//        System.out.println("Capacidade: " + cap1[2] + " Tempo gasto para itens 1 no algoritmo guloso: " + (System.nanoTime() - tempoInicio) + "\n");
//
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.greedy(value01,weight01,cap1[3],0));
//        System.out.println("Capacidade: " + cap1[3] + " Tempo gasto para itens 1 no algoritmo guloso: " + (System.nanoTime() - tempoInicio) + "\n");
//
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.greedy(value01,weight01,cap1[4],0));
//        System.out.println("Capacidade: " + cap1[4] + " Tempo gasto para itens 1 no algoritmo guloso: " + (System.nanoTime() - tempoInicio) + "\n");
//
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.greedy(value01,weight01,cap1[5],0));
//        System.out.println("Capacidade: " + cap1[5] + " Tempo gasto para itens 1 no algoritmo guloso: " + (System.nanoTime() - tempoInicio) + "\n");
//
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.greedy(value01,weight01,cap1[6],0));
//        System.out.println("Capacidade: " + cap1[6] + " Tempo gasto para itens 1 no algoritmo guloso: " + (System.nanoTime() - tempoInicio) + "\n");
//
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.greedy(value01,weight01,cap1[7],0));
//        System.out.println("Capacidade: " + cap1[7] + " Tempo gasto para itens 1 no algoritmo guloso: " + (System.nanoTime() - tempoInicio) + "\n");
//
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.greedy(value01,weight01,cap1[8],0));
//        System.out.println("Capacidade: " + cap1[8] + " Tempo gasto para itens 1 no algoritmo guloso: " + (System.nanoTime() - tempoInicio) + "\n");
//
        tempoInicio = System.nanoTime();
        System.out.println(ex3.greedy(value01,weight01,10000,0));
        System.out.println("Capacidade: " + cap1[9] + " Tempo gasto para itens 1 no algoritmo guloso: " + (System.nanoTime() - tempoInicio) + "\n");











        List<Item> items2 = new ArrayList<>();
        items2.add(new Item(10, 16));
        items2.add(new Item(25, 3));
        items2.add(new Item(30, 5));
        items2.add(new Item(45, 7));
        items2.add(new Item(53, 8));
        items2.add(new Item(60, 10));
        items2.add(new Item(75, 11));
        items2.add(new Item(80, 12));

        int cap2[] = new int[]{5, 11, 15, 27, 45, 19, 76, 80, 21, 99};
        int weight2[] = new int[8];
        int value2[] = new int[8];

        ArrayList<Integer> weight02 = new ArrayList<>();
        ArrayList<Integer> value02 = new ArrayList<>();

        for(int i = 0; i < 8; i++){
            weight2[i] = (int)items2.get(i).getWeight();
            value2[i] = (int)items2.get(i).getValue();
            weight02.add(weight2[i]);
            value02.add(value2[i]);
        }

//        for(cap = 0; cap < cap2.length; cap++){
//        tempoInicio = System.currentTimeMillis();
//        KnapsackProblem demo2 = new KnapsackProblem(cap2[cap], items2);
//        demo2.startDemo(16, items2.size(), 40);
//        System.out.println("Capacidade: " + cap2[cap] + " Tempo gasto para itens 2 no ALGORITMO GENETICO: " + (System.currentTimeMillis() - tempoInicio));}

//
//        for(cap = 0; cap < cap2.length; cap++){
//        int memo2[][] = ex3.criaVetorDin();
//
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.dinamic(7,cap2[cap],memo2,value2,weight2));
//        System.out.println("Capacidade: " + cap2[cap] + " Tempo gasto para itens 2 na programacao dinamica: " + (System.nanoTime() - tempoInicio));}
//        System.out.println("\n\n");

        for(cap = 0; cap < cap2.length; cap++){
        tempoInicio = System.nanoTime();
        System.out.println(ex3.greedy(value02,weight02,cap2[cap],0));
        System.out.println("Capacidade: " + cap2[cap] + " Tempo gasto para itens 2 no algoritmo guloso: " + (System.nanoTime() - tempoInicio));}




        List<Item> items3 = new ArrayList<>();
        items3.add(new Item(102, 11));
        items3.add(new Item(207, 21));
        items3.add(new Item(330, 31));
        items3.add(new Item(498, 42));
        items3.add(new Item(534, 48));
        items3.add(new Item(634, 59));
        items3.add(new Item(764, 79));
        items3.add(new Item(770, 99));
        items3.add(new Item(781, 79));


        int cap3[] = new int[]{15, 13, 20, 35, 67, 60, 10, 82, 77, 92};
        int weight3[] = new int[9];
        int value3[] = new int[9];

        ArrayList<Integer> weight03 = new ArrayList<>();
        ArrayList<Integer> value03 = new ArrayList<>();

        for(int i = 0; i < 9; i++){
            weight3[i] = (int)items3.get(i).getWeight();
            value3[i] = (int)items3.get(i).getValue();
            weight03.add(weight3[i]);
            value03.add(value3[i]);
        }

//        for(cap = 0; cap < cap3.length; cap++){
//        tempoInicio = System.nanoTime();
//        KnapsackProblem demo3 = new KnapsackProblem(cap3[cap], items3);
//        demo3.startDemo(16, items3.size(), 40);
//        System.out.println("Capacidade: " + cap3[cap] + " Tempo gasto para itens 3 no ALGORITMO GENETICO: " + (System.nanoTime() - tempoInicio));}
//
//        for(cap = 0; cap < cap3.length; cap++){
//        int memo3[][] = ex3.criaVetorDin();
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.dinamic(8,cap3[cap],memo3,value3,weight3));
//        System.out.println("Capacidade: " + cap3[cap] + " Tempo gasto para itens 3 na programacao dinamica: " + (System.nanoTime() - tempoInicio));}
//        System.out.println("\n\n");
//
            for(cap = 0; cap < cap3.length; cap++){
        tempoInicio = System.nanoTime();
        System.out.println(ex3.greedy(value03,weight03,cap3[cap],0));
        System.out.println("Capacidade: " + cap3[cap] + " Tempo gasto para itens 3 no algoritmo guloso: " + (System.nanoTime() - tempoInicio));}



        List<Item> items4 = new ArrayList<>();
        items4.add(new Item(120, 12));
        items4.add(new Item(170, 82));
        items4.add(new Item(198, 47));
        items4.add(new Item(250, 52));
        items4.add(new Item(270, 27));
        items4.add(new Item(304, 31));
        items4.add(new Item(320, 22));
        items4.add(new Item(401, 42));
        items4.add(new Item(509, 48));
        items4.add(new Item(607, 59));
        items4.add(new Item(712, 69));


        int cap4[] = new int[]{50, 87, 25, 98, 105, 129, 76, 89, 27, 29};
        int weight4[] = new int[11];
        int value4[] = new int[11];

        ArrayList<Integer> weight04 = new ArrayList<>();
        ArrayList<Integer> value04 = new ArrayList<>();

        for(int i = 0; i < 11; i++){
            weight4[i] = (int)items4.get(i).getWeight();
            value4[i] = (int)items4.get(i).getValue();
            weight04.add(weight4[i]);
            value04.add(value4[i]);
        }

//            for(cap = 0; cap < cap4.length; cap++){
//        tempoInicio = System.nanoTime();
//        KnapsackProblem demo4 = new KnapsackProblem(54, items4);
//        demo4.startDemo(cap4[cap], items4.size(), 40);
//        System.out.println("Capacidade: " + cap4[cap] + " Tempo gasto para itens 4 no ALGORITMO GENETICO: " + (System.nanoTime() - tempoInicio));}
//
//
//        for(cap = 0; cap < cap4.length; cap++){
//        int memo4[][] = ex3.criaVetorDin();
//
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.dinamic(10,cap4[cap],memo4,value4,weight4));
//        System.out.println("Capacidade: " + cap4[cap] + " Tempo gasto para itens 4 na programacao dinamica: " + (System.nanoTime() - tempoInicio));}
//        System.out.println("\n\n");
//
//
            for(cap = 0; cap < cap4.length; cap++){
        tempoInicio = System.nanoTime();
        System.out.println(ex3.greedy(value04,weight04,cap4[cap],0));
        System.out.println("Capacidade: " + cap4[cap] + " Tempo gasto para itens 4 no algoritmo guloso: " + (System.nanoTime() - tempoInicio));}



        List<Item> items5 = new ArrayList<>();
        items5.add(new Item(123, 32));
        items5.add(new Item(321, 12));
        items5.add(new Item(543, 29));
        items5.add(new Item(654, 40));
        items5.add(new Item(533, 41));

        int cap5[] = new int[]{78, 111, 215, 127, 34, 119, 71, 88, 121, 92};
        int weight5[] = new int[5];
        int value5[] = new int[5];

        ArrayList<Integer> weight05 = new ArrayList<>();
        ArrayList<Integer> value05 = new ArrayList<>();

        for(int i = 0; i < 5; i++){
            weight5[i] = (int)items5.get(i).getWeight();
            value5[i] = (int)items5.get(i).getValue();
            weight05.add(weight5[i]);
            value05.add(value5[i]);
        }

//            for(cap = 0; cap < cap5.length; cap++){
//        tempoInicio = System.nanoTime();
//        KnapsackProblem demo5 = new KnapsackProblem(cap5[cap], items5);
//        demo5.startDemo(16, items5.size(), 40);
//        System.out.println("Capacidade: " + cap5[cap] + " Tempo gasto para itens 5 no ALGORITMO GENETICO: " + (System.nanoTime() - tempoInicio));}
//
//
//        for(cap = 0; cap < cap5.length; cap++){
//        int memo5[][] = ex3.criaVetorDin();
//
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.dinamic(4,cap5[cap],memo5,value5,weight5));
//        System.out.println("Capacidade: " + cap5[cap] + " Tempo gasto para itens 5 na programacao dinamica: " + (System.nanoTime() - tempoInicio));}
//        System.out.println("\n\n");
//
            for(cap = 0; cap < cap5.length; cap++){
        tempoInicio = System.nanoTime();
        System.out.println(ex3.greedy(value05,weight05,cap5[cap],0));
        System.out.println("Capacidade: " + cap5[cap] + " Tempo gasto para itens 5 no algoritmo guloso: " + (System.nanoTime() - tempoInicio));}




        List<Item> items6 = new ArrayList<>();
        items6.add(new Item(199, 18));
        items6.add(new Item(212, 21));
        items6.add(new Item(365, 51));
        items6.add(new Item(445, 105));
        items6.add(new Item(454, 12));
        items6.add(new Item(495, 101));
        items6.add(new Item(512, 38));
        items6.add(new Item(643, 79));
        items6.add(new Item(765, 88));
        items6.add(new Item(885, 95));

        int cap6[] = new int[]{81, 101, 125, 177, 54, 21, 90, 188, 131, 90};
        int weight6[] = new int[10];
        int value6[] = new int[10];

        ArrayList<Integer> weight06 = new ArrayList<>();
        ArrayList<Integer> value06 = new ArrayList<>();

        for(int i = 0; i < 10; i++){
            weight6[i] = (int)items6.get(i).getWeight();
            value6[i] = (int)items6.get(i).getValue();
            weight06.add(weight6[i]);
            value06.add(value6[i]);
        }

//            for(cap = 0; cap < cap6.length; cap++){
//        tempoInicio = System.nanoTime();
//        KnapsackProblem demo6 = new KnapsackProblem(cap6[cap], items6);
//        demo6.startDemo(16, items6.size(), 40);
//        System.out.println("Capacidade: " + cap6[cap] + " Tempo gasto para itens 6 no ALGORITMO GENETICO: " + (System.nanoTime() - tempoInicio));}
//
//
//            for(cap = 0; cap < cap6.length; cap++){
//        int memo6[][] = ex3.criaVetorDin();
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.dinamic(9,cap6[cap],memo6,value6,weight6));
//        System.out.println("Capacidade: " + cap6[cap] + " Tempo gasto para itens 6 na programacao dinamica: " + (System.nanoTime() - tempoInicio));}
//        System.out.println("\n\n");
//
            for(cap = 0; cap < cap6.length; cap++){
        tempoInicio = System.nanoTime();
        System.out.println(ex3.greedy(value06,weight06,cap6[cap],0));
        System.out.println("Capacidade: " + cap6[cap] + " Tempo gasto para itens 6 no algoritmo guloso: " + (System.nanoTime() - tempoInicio));}




        List<Item> items7 = new ArrayList<>();
        items7.add(new Item(17, 3));
        items7.add(new Item(29, 5));
        items7.add(new Item(32, 7));
        items7.add(new Item(35, 72));
        items7.add(new Item(38, 39));
        items7.add(new Item(45, 25));
        items7.add(new Item(49, 11));
        items7.add(new Item(51, 15));
        items7.add(new Item(53, 56));
        items7.add(new Item(63, 17));
        items7.add(new Item(74, 18));
        items7.add(new Item(77, 81));
        items7.add(new Item(81, 95));


        int cap7[] = new int[]{148, 134, 245, 187, 84, 19, 61, 180, 129, 91};
        int weight7[] = new int[13];
        int value7[] = new int[13];

        ArrayList<Integer> weight07 = new ArrayList<>();
        ArrayList<Integer> value07 = new ArrayList<>();

        for(int i = 0; i < 13; i++){
            weight7[i] = (int)items7.get(i).getWeight();
            value7[i] = (int)items7.get(i).getValue();
            weight07.add(weight7[i]);
            value07.add(value7[i]);
        }

//            for(cap = 0; cap < cap7.length; cap++){
//        tempoInicio = System.nanoTime();
//        KnapsackProblem demo7 = new KnapsackProblem(cap7[cap], items7);
//        demo7.startDemo(16, items7.size(), 40);
//        System.out.println("Capacidade: " + cap7[cap] + " Tempo gasto para itens 7 no ALGORITMO GENETICO: " + (System.nanoTime() - tempoInicio));}
//
//
//            for(cap = 0; cap < cap7.length; cap++){
//        int memo7[][] = ex3.criaVetorDin();
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.dinamic(12,cap7[cap],memo7,value7,weight7));
//        System.out.println("Capacidade: " + cap7[cap] + " Tempo gasto para itens 7 na programacao dinamica: " + (System.nanoTime() - tempoInicio));}
//        System.out.println("\n\n");

            for(cap = 0; cap < cap7.length; cap++){
        tempoInicio = System.nanoTime();
        System.out.println(ex3.greedy(value07,weight07,cap7[cap],0));
        System.out.println("Capacidade: " + cap7[cap] + " Tempo gasto para itens 7 no algoritmo guloso: " + (System.nanoTime() - tempoInicio));}




        List<Item> items8 = new ArrayList<>();
        items8.add(new Item(19, 3));
        items8.add(new Item(27, 5));
        items8.add(new Item(30, 8));
        items8.add(new Item(45, 9));

        int cap8[] = new int[]{18, 11, 25, 17, 34, 29, 15, 48, 51, 12};
        int weight8[] = new int[4];
        int value8[] = new int[4];

        ArrayList<Integer> weight08 = new ArrayList<>();
        ArrayList<Integer> value08 = new ArrayList<>();

        for(int i = 0; i < 4; i++){
            weight8[i] = (int)items8.get(i).getWeight();
            value8[i] = (int)items8.get(i).getValue();
            weight08.add(weight8[i]);
            value08.add(value8[i]);
        }

//            for(cap = 0; cap < cap8.length; cap++){
//        tempoInicio = System.nanoTime();
//        KnapsackProblem demo8 = new KnapsackProblem(cap8[cap], items8);
//        demo8.startDemo(16, items8.size(), 40);
//        System.out.println("Capacidade: " + cap8[cap] + " Tempo gasto para itens 8 no ALGORITMO GENETICO: " + (System.nanoTime() - tempoInicio));}
//
//
//            for(cap = 0; cap < cap8.length; cap++){
//        int memo8[][] = ex3.criaVetorDin();
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.dinamic(3,cap8[cap],memo8,value8,weight8));
//        System.out.println("Capacidade: " + cap8[cap] + " Tempo gasto para itens 8 na programacao dinamica: " + (System.nanoTime() - tempoInicio));}
//        System.out.println("\n\n");
//
            for(cap = 0; cap < cap8.length; cap++){
        tempoInicio = System.nanoTime();
        System.out.println(ex3.greedy(value08,weight08,cap8[cap],0));
        System.out.println("Capacidade: " + cap8[cap] + " Tempo gasto para itens 8 no algoritmo guloso: " + (System.nanoTime() - tempoInicio));}



        List<Item> items9 = new ArrayList<>();
        items9.add(new Item(5, 12));
        items9.add(new Item(9, 29));
        items9.add(new Item(35, 35));
        items9.add(new Item(47, 44));
        items9.add(new Item(50, 42));
        items9.add(new Item(77, 57));
        items9.add(new Item(98, 65));
        items9.add(new Item(102, 79));
        items9.add(new Item(112, 81));
        items9.add(new Item(117, 77));
        items9.add(new Item(119, 61));
        items9.add(new Item(137, 55));

        int cap9[] = new int[]{128, 171, 115, 27, 124, 59, 74, 82, 142, 62};
        int weight9[] = new int[12];
        int value9[] = new int[12];

        ArrayList<Integer> weight09 = new ArrayList<>();
        ArrayList<Integer> value09 = new ArrayList<>();

        for(int i = 0; i < 12; i++){
            weight9[i] = (int)items9.get(i).getWeight();
            value9[i] = (int)items9.get(i).getValue();
            weight09.add(weight9[i]);
            value09.add(value9[i]);
        }
//
//            for(cap = 0; cap < cap9.length; cap++){
//        tempoInicio = System.nanoTime();
//        KnapsackProblem demo9 = new KnapsackProblem(cap9[cap], items9);
//        demo9.startDemo(16, items1.size(), 40);
//        System.out.println("Capacidade: " + cap9[cap] + " Tempo gasto para itens 9 no ALGORITMO GENETICO: " + (System.nanoTime() - tempoInicio));}
//
//            for(cap = 0; cap < cap9.length; cap++){
//        int memo9[][] = ex3.criaVetorDin();
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.dinamic(11,cap9[cap],memo9,value9,weight9));
//        System.out.println("Capacidade: " + cap9[cap] + " Tempo gasto para itens 9 na programacao dinamica: " + (System.nanoTime() - tempoInicio));}
//        System.out.println("\n\n");
//
            for(cap = 0; cap < cap9.length; cap++){
        tempoInicio = System.nanoTime();
        System.out.println(ex3.greedy(value09,weight09,cap9[cap],0));
        System.out.println("Capacidade: " + cap9[cap] + " Tempo gasto para itens 9 no algoritmo guloso: " + (System.nanoTime() - tempoInicio));}





        List<Item> items10 = new ArrayList<>();
        items10.add(new Item(231, 30));
        items10.add(new Item(355, 54));
        items10.add(new Item(417, 107));


        int cap10[] = new int[]{75, 71, 90, 50, 40, 55, 44, 122, 182, 108};
        int weight10[] = new int[3];
        int value10[] = new int[3];

        ArrayList<Integer> weight010 = new ArrayList<>();
        ArrayList<Integer> value010 = new ArrayList<>();



        System.out.println(weight10[1]);

        for(int i = 0; i < 3; i++){
            weight10[i] = (int)items10.get(i).getWeight();
            value10[i] = (int)items10.get(i).getValue();
            weight010.add(weight10[i]);
            value010.add(value10[i]);
        }


//            for(cap = 0; cap < cap10.length; cap++){
//        tempoInicio = System.nanoTime();
//        KnapsackProblem demo10 = new KnapsackProblem(cap10[cap], items10);
//        demo10.startDemo(16, items10.size(), 40);
//        System.out.println("Capacidade: " + cap10[cap] + " Tempo gasto para itens 10 no ALGORITMO GENETICO: " + (System.nanoTime() - tempoInicio));}
//        System.out.println("\n\n");
//
//
//            for(cap = 0; cap < cap10.length; cap++){
//        int memo10[][] = ex3.criaVetorDin();
//        tempoInicio = System.nanoTime();
//        System.out.println(ex3.dinamic(2,cap10[cap],memo10,value10,weight10));
//        System.out.println("Capacidade: " + cap10[cap] + " Tempo gasto para itens 10 na programacao dinamica: " + (System.nanoTime() - tempoInicio));}
//        System.out.println("\n\n");
//
//
            for(cap = 0; cap < cap10.length; cap++){
        tempoInicio = System.nanoTime();
        System.out.println(ex3.greedy(value010,weight010,cap10[cap],0));
        System.out.println("Capacidade: " + cap10[cap] + " Tempo gasto para itens 10 no algoritmo guloso: " + (System.nanoTime() - tempoInicio));}




    }
}

