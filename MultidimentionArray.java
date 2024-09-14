//multidimentional array is an array of arrays

public class MultidimentionArray {

    public static void main(String[] args) {
        int num[][] = {{1, 2, 3}, {4, 5, 6}};
//access 2nd array 2nd element
        System.out.println(num[1][1]);
//change 1st array 3rd element
        num[0][2] = 7;
        System.out.println(num[0][2]);
//nest for loop inside for loop to point to array index & element index
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j]);
            }
        }
        System.out.println(".");
//for-each loop easier
        for (int[] x : num) {
            for (int y : x) {
                System.out.print(y);
            }
        }
    }
}
