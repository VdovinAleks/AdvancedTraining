package org.example;

public class kata {
    static int stray(int[] numbers) {
        int temp = 0;
        if (numbers[0] == numbers[1] || numbers[0] == numbers[2]) {
             temp = numbers[0];
        }
        else {
            return numbers[0];
        }
        System.out.println(temp);
        for (int i = 0; i < numbers.length - 1; i++) {
            if (temp != numbers[i+1]){
                return numbers[i+1];
            }
        }
        return temp;
    }


    public static void main(String[] args) {
        int[] arr = {1, 1, 1, 2};
        int[] arr1 = {1, 2, 2, 2};
        int[] arr2 = {1, 1, 6, 1};
        System.out.println(stray(arr1));

    }

}
