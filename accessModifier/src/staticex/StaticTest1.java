package staticex;

class Counter1 {
	 int cnt = 0;  // 일반 변수

	    void increase() {
	        cnt++;
	    }
	}

public class StaticTest1 {
   public static void main(String[] args) {
       Counter1 c1 = new Counter1();
       Counter1 c2 = new Counter1();

       c1.increase();
       c2.increase();

       System.out.println("c1: " + c1.cnt);
       System.out.println("c2: " + c2.cnt);
   }
}