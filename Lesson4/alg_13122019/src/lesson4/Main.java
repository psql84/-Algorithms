package lesson4;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<String> mll = new MyLinkedList<>();
        mll.insertFirst("Katia");
        mll.insertFirst("Maria");
        mll.insertFirst("Luba");
        mll.insertFirst("Luba");

        System.out.println(mll);
        mll.insertLast("Sania");
        System.out.println(mll);

        mll.insert(3, "Petia");
        System.out.println(mll);

        mll.remove("Luba");
        System.out.println(mll);


        Iterator<String> iterator = mll.iterator();
        while(iterator.hasNext()){
            System.out.print(iterator.next()+" index= "+ ((ListIterator<String>) iterator).nextIndex()+ " ");
        }
        System.out.println();
        while(((ListIterator<String>) iterator).hasPrevious()){
            System.out.print(((ListIterator<String>) iterator).previous()+" index= "+
                    ((ListIterator<String>) iterator).previousIndex()+ " ");
        }
    }
}
