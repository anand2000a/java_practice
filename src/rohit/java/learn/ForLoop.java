package rohit.java.learn;

public class ForLoop {
    public static void main(String[] args) {
        int i;
        //   init  condition  update
        //                    i=i++
        for ( i=Math.abs(0);    i<5;   i++  ) {
            System.out.println(Math.abs(i));
        }

        System.out.println("value of i = "+ i);
    }
}
