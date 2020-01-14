package lesson2;

import java.util.Random;

public class Main {
    static Random rand = new Random();
    static double time;

    public static void main(String[] args) {

        MyArrayList<Integer> mal = new MyArrayList<>(1000000);
        fill(mal);
       // System.out.println(mal);
        time = System.currentTimeMillis();
        mal.insertionSort();
       // System.out.println(mal);
        System.out.println("Сортировка методом выбора "+(System.currentTimeMillis()-time)/1000);

        clear(mal);
        fill(mal);
      //  System.out.println(mal);
        time = System.currentTimeMillis();
        mal.bubbleSort();
      //  System.out.println(mal);
        System.out.println("Пузырьковая сортировка "+(System.currentTimeMillis()-time)/1000);
        clear(mal);
        fill(mal);

        time = System.currentTimeMillis();
        mal.selectionSort();
        System.out.println("Сортировка методом вставки "+(System.currentTimeMillis()-time)/1000);


    }
    static void clear(MyArrayList arrayList){
       /* for (int i = 0; i <1000000 ; i++) {
            arrayList.remove(0);
        }
        */
       arrayList.setSize(0);
    }
    static void fill(MyArrayList arrayList){
        for (int i = 0; i <1000000;i++) {
            arrayList.add(rand.nextInt(100));

        }
    }



}
