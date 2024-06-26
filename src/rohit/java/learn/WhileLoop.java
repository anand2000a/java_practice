package rohit.java.learn;

public class WhileLoop {
    public static void main(String[] args) {
        int start=3;
        int stop=10;
        int score=0;
//        while (true)
//        {
//            System.out.println("Winner "+ score);
//            score++;
//            if(score>=10)
//                break;
//        }
//
        do {
            System.out.println("doing:"+ score);
            score+=2;
        }while (score<stop);
//        System.out.println("Exist Score = "+score);
    }
}
