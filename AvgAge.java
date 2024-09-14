//sum all elements using for loop then find average

public class AvgAge {

    public static void main(String[] args) {
        int ages[] = {1, 2, 3, 4, 5};
        float avg, sum = 0;
        int length = ages.length;
        for (int age : ages) {
            sum += age;
        }
        avg = sum / length;
        System.out.println(avg);

//assignment operator += is cumulative when loop
        String x[] = {"1", "2", "3", "4", "5"};
        String sum2 = "0";
        for (String X : x) {
            sum2 += X;
        }
        System.out.println(sum2);

//replaced by minimum when for loop through the array, start from index 0
        int min = ages[0];
        for (int age : ages) {
            if (min > age) {
                min = age;
            }
        }
        System.out.println(min);
    }
}
