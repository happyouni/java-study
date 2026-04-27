
class Counter {
    static int cnt = 0;

    static void increase() {
        cnt++;
    }
}

public class StaticTest2 {
    public static void main(String[] args) {

        Counter.increase();
        Counter.increase();

        System.out.println("count: " + Counter.cnt);
    }
}