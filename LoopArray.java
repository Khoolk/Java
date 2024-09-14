//for loop length to output elements in array

public class LoopArray {

    public static void main(String[] args) {
        String[] alp = {"A", "B", "C", "D"};
        for (int i = 0; i < alp.length; i++) {
            System.out.println(alp[i]);
        }
//for-each loop to output all elements in array
        for (String x : alp) {
            System.out.println(x);
        }
    }
}
