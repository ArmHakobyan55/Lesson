package service;

import java.awt.image.AreaAveragingScaleFilter;

public class Text2 {
    public static void main(String[] args) {
        //241 harc

//        int[] numbers = {4, 1, 9, 2, 12, 7, 16, 3};
//
//        int k = 3;
//        int sum = 0;
//        for (inti = 0; i < numbers.length; i++) {
//            if(numbers[i] % k == 0) {
//                sum += numbers[i];
//            }
//        }
//        System.out.println(sum);

        //242 harc

//        int[] numbers = {4, 1, 9, 2, 7, 16, 3};
//
//        int m = 3;
//        int product = 1;
//        for (inti = 0; i < numbers.length; i++) {
//            if(numbers[i] % m == 0) {
//                product *= numbers[i];
//            }
//        }
//        System.out.println(product);

        //243 harc

//        int[] numbers = {4, 1, 9, 2, 7, 16, 3};
//
//        int t = 3;
//        int count = 0;
//        for (inti = 0; i < numbers.length; i++) {
//            if(numbers[i] % t == 0) {
//                count++;
//            }
//        }
//        System.out.println(count);

        //244 harc

//        int[] numbers = {3, 1, 12, 8, 7, 16, 3};
//
//        int product = 1;
//        for (inti = 0; i < numbers.length; i++) {
//            if(numbers[i] % 5 == 2) {
//                product *= numbers[i];
//            }
//        }
//        System.out.println(product);

        //245 harc
//    int[] numbers = {3, 1, 12, 3};
//
//    int sum = 0;
//        for (inti = 0; i<numbers.length; i++){
//
//        if ((numbers[i] += i) % 3 == 0) {
//            sum += numbers[i] * numbers[i];
//        }
//    }
//        System.out.println(sum);

        //248 harc
//    int[] numbers = {3, 2, 4, 7};
//    int k = 2;
//    int sum = 0;
//        for (inti = 0; i<numbers.length; i++){
//
//        if ((numbers[i] + i) * (numbers[i] + i) % k == 0) {
//            sum += numbers[i];
//        }
//    }
//        System.out.println(sum);
        //249 harc
//        int[] numbers = {3, 2, 5, 6};
//        int k = 2;
//
//        int count = 0;
//
//        for (inti = 0; i < numbers.length; i++) {
//
//            int dif = numbers[i] - i;
//
//            if (dif < 0) {
//                dif = -dif;
//            }
//
//            if (dif > k) {
//                count++;
//            }
//        }
//
//        System.out.println(count);
        //250 harc
//        int[] numbers = {3, 2, 4, 4, 5};
//        int product = 1;
//        for (inti = 0; i < numbers.length; i++){

//        if ((numbers[i] * i) % 3 == 2) {
//            product *= numbers[i] * numbers[i];
//        }
//    }
//        System.out.println(product);

        //251 harc

//        int[] numbers = {3, 7, 10, 4, 5};
//
//        int max = numbers[0];
//        for (inti = 1; i < numbers.length; i++) {
//            if (numbers[i] > max){
//                max = numbers[i];
//            }
//        }
//        System.out.println(max);

        //252 harc
//        int[] numbers = {3, 7, 10, 4, 5};
//
//        int min = numbers[0];
//        for (inti = 1; i < numbers.length; i++) {
//            if (numbers[i] < min){
//                min = numbers[i];
//            }
//        }
//        System.out.println(min);

        //253 harc
//        int[] numbers = {3, 7, 10, 4, 5};
//        int max = numbers[0];
//        int min = numbers[0];
//        int sum = 0;
//        for (inti = 1; i < numbers.length; i++) {
//            if (numbers[i] < min){
//                min = numbers[i];
//            }
//            if (numbers[i] > max){
//                max = numbers[i];
//            }
//            sum = max + min;
//        }
//        System.out.println(sum);
        //254 harc

//                int[] numbers = {3, 7, 10, 4, 5};
//                int max = numbers[0];
//                int min = numbers[0];
//                int product = 1;
//                for (inti = 1; i < numbers.length; i++) {
//                    if (numbers[i] < min){
//                        min = numbers[i];
//                    }
//                    if (numbers[i] > max){
//                        max = numbers[i];
//                    }
//                    product = max * min;
//                }
//                System.out.println(product);

        //255 harc

//                int[] numbers = {3, 7, 10, 4, 5};
//                int max = numbers[0];
//                int sum = 0;
//                int index = 0;
//                for (inti = 0; i < numbers.length; i++) {
//
//                    if (numbers[i] > max){
//                        max = numbers[i];
//                        index = i;
//                    }
//                    sum = max + index;
//                }
//                System.out.println(sum);

        //256 harc
//                int[] numbers = {5, 7, 10, 4, 5};
//                int min = numbers[0];
//                int sum = 0;
//                int index = 0;
//                for (inti = 0; i < numbers.length; i++) {
//
//                    if (numbers[i] < min){
//                        min = numbers[i];
//                        index = i;
//                    }
//                    sum = min + index;
//                }
//                System.out.println(sum);


        //257 harc
//        int[] numbers = {5, 7, 10, 4, 5, 7 , 9, 10, 8};
//        int max = numbers[0];
//        int index = 0;
//        for (inti = 0; i < numbers.length; i++) {
//
//            if (numbers[i] > max) {
//                max = numbers[i];
//                index = i;
//            }
//        }
//        System.out.println(index);

        //258 harc
//        int[] numbers = {5, 7, 10, 4, 5, 7 , 9, 10, 8};
//        int max = numbers[0];
//        int index = 0;
//        for (inti = 0; i < numbers.length; i++) {
//
//            if (numbers[i] >= max) {
//                max = numbers[i];
//                index = i;
//            }
//        }
//        System.out.println(index);
        //259 harc
//        int[] numbers = {5, 7, 10, 4, 5, 7 , 4, 9, 10, 8};
//        int min = numbers[0];
//        int index = 0;
//        for (inti = 0; i < numbers.length; i++) {
//
//            if (numbers[i] < min) {
//                min = numbers[i];
//                index = i;
//            }
//        }
//        System.out.println(index);

        //260 harc
//        int[] numbers = {5, 7, 10, 4, 5, 7 , 4, 9, 10, 8};
//        int min = numbers[0];
//        int index = 0;
//        for (inti = 0; i < numbers.length; i++) {
//
//            if (numbers[i] <= min) {
//                min = numbers[i];
//                index = i;
//            }
//        }
//        System.out.println(index);

        //261 harc
//        int[] X = {5, 7, 4, 2};
//        int[] Y = {4, 2, 5, 6};
//
//        double sum1 = 0;
//        double sum2 = 0;
//
//        for (inti = 0; i < X.length; i++) {
//            sum1 += X[i];
//        }
//
//        for (inti = 0; i < Y.length; i++) {
//            sum2 += Y[i];
//        }
//
//        double arithmetic_mean = sum1 / X.length;
//        double arithmetic_mean1 =  sum2 / Y.length;
//
//        double product = arithmetic_mean * arithmetic_mean1;
//
//        System.out.println(product);

    }
}