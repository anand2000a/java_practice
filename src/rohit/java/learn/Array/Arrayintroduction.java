package rohit.java.learn.Array;

class Arrayintroduction {

    public static void main(String[] args) {
        // collection of similar data type
        int[] arrayOfIntegers = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        //indexing always starts from 0
        // creat a variable to store length of array, it saves time otherwise length is
        // calculated many times
        int size = arrayOfIntegers.length;

        // use a for loop to access array elements, start from 0 to < size
        int i;
        for (i = 0; i < size; i++) {
            System.out.println("index = "+ i+ " ; num = " +arrayOfIntegers[i]);
        }
        System.out.println("Total number in array = " + size);

    }
}