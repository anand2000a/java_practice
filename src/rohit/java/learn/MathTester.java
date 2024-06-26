package rohit.java.learn;



public class MathTester {
    public static void main(String[] args) {

        int x=2,y=7,z=47;
        int result;
        result =  max(x,max(y,z));
        System.out.println(result);
        System.out.println(56<57);
    }

//    private static int max(int x, int y) {
//        int ans;
//        if (x>=y)
//            ans =x;
//        else
//            ans =y;
//        return ans;
//    }

    private static int max(int x, int y) {
//        int ans;
//        ans = (x>=y) ? x : y;
//        return ans;

//        int ans = (x>=y) ? x : y;
//        return ans;

        return  (x>=y) ? x : y;
    }


}
