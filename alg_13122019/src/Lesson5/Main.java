package Lesson5;

public class Main {
    public static int BACKPACK=15;
    public static Items [] items= {
            new Items(4,12),
            new Items(1,2),
            new Items(2,2),
            new Items(1,1),
            new Items(16,10)};

    public static void main(String[] args) {

//                items[0]=new Items(4,12);
//                items[1]=new Items(1,2);
//                items[2]=new Items(2,2);
//                items[3]=new Items(1,1);
//                items[4]=new Items(4,10);
        System.out.println(step(5,5));
        System.out.println(res(items.length - 1, BACKPACK));

    }
    private static int res(int i, int weight) {
        if (i < 0) {
            return 0;
        }
        if (items[i].getWeight() > weight) {
            return res(i-1, weight);
        }
        else {
            return Math.max(res(i-1, weight), res(i-1, weight - items[i].getWeight()) + items[i].getPrice());
        }
    }
    private static int step(int a, int b){
        if (b==1)return 1;
        return a*step(a,b-1);
    }
}
