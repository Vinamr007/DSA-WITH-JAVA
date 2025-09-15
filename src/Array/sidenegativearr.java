package Array;

import java.util.Arrays;

public class sidenegativearr {


        static int[] move(int[] arr) {
            Arrays.sort(arr);
            return arr;
        }

        public static void main(String[] args) {
            int[] arr = {-56, 14, -15, 1, 2, -65, 45};
            int[] ans = move(arr);

            for (int num : ans) {
                System.out.println(num + " ");
            }
        }
    }
