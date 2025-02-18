package ex_16_Arrays;

public class Lab148_Arrays_Max_Value_Interview {
    public static void main(String[] args) {
        int [] array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
        // Max, Min
        // logic Building
        // 1 input -> array -> int
        // output -> Int - 77

        int max_output = give_max(array);
        int min_output = give_min( array);

        System.out.println(max_output);
        System.out.println(min_output);

    }

    static int give_max(int[]array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

        static int give_min(int[]array){
            int min = array[0];
            for (int i= 0;  i < array.length;i++) {
                if (array[i] < min ){
                    min = array[i];
                }
            }
            return  min;
        }


}
