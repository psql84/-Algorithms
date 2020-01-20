package lesson6;

public class Main {
    public static void main(String[] args) {
        int kol=0;
        for (int i = 0; i < 20; i++) {

            MyTreeMap<Integer, Integer> map = new MyTreeMap<>();
            while (map.height() != 6) {
                map.put((int) (Math.random() * (200 + 1)) - 100, (int) (Math.random() * (200 + 1)) - 100);
            }
            System.out.println(map);
            System.out.println(map.size());
            System.out.println(map.isBalanced());
            if(!map.isBalanced()) kol++;

        }
        System.out.println("unbalanced "+((kol*100)/20)+"%");
    }
}
