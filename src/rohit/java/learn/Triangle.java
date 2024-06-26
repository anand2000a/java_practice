package rohit.java.learn;

public class Triangle {
    public static void main(String[] args) {
        int i,j;

        for (i=0 ; i<6; i++) {    //number of line
            for (j = 6; j>i; j--) {   //Charter in a line */for (j = i; j<6; j++){
                System.out.print(" ");    //to print charter
            }
            for(j=0 ; j<(2*i+1); j++){
               System.out.print("*");
            }
            System.out.println("");   //new line
        }
    }
}
