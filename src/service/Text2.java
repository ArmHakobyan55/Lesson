package service;

import java.awt.image.AreaAveragingScaleFilter;

public class Text2 {
    public static void main(String[] args) {
        //241 harc
//
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

//        double sum1 = 0;
//        double sum2 = 0;

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

//        int[] numbers = {-5, 7, 10, -4, 5, 7 , 4, -9, 10, 8};
//
//        int count = 0;

//        for (int i = 0; i < numbers.length; i++){
//            if (numbers[i] < 0) {
//                count++;
//            }
//
//        }
//        int [] numbers1 = new int[count];
//        for (int i = 0, j = 0; i < numbers.length; i++){
//
//            if (numbers[i] < 0){
//                numbers1[j] = numbers[i];
//                j++;
//            }
//
//        }
//        for (int i = 0; i < numbers1.length; i++){
//            System.out.println(numbers1[i]);
//        }

//        int [][] array = { {1, 2, 3, 4}, {8, 5, 0, 4}, {2, 1, 6, 8}, {1, 0, 7, 3}};
//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j < array[i].length; j++){
//                System.out.print(array[i][j] + "  ");
//            }
//            System.out.println();
//        }
//        System.out.println("--------------");
//        for(int i = 0; i < array.length; i++){
//            for(int j = 0; j < array[i].length; j++) {
//                if (i + j >= array.length-1){
//                    System.out.print(array[i][j] + "  ");
//                }else{
//                    System.out.print("   ");
//                }
//            }
//            System.out.println();

        //263 harc

//        int[] X = {5, -7, 4, -2};
//        int[] Y = {-1, -8, -2, 6};
//        int count = 0;
//        for (int i = 0; i < X.length; i++) {
//            if (X[i] > 0) {
//                count++;
//            }
//
//        }
//            for (int i = 0; i < Y.length; i++) {
//                if (Y[i] > 0) {
//                    count++;
//                }
//        }
//        System.out.println(count);
        //264 harc

//        int[] X = {5, -7, 4, -2};
//        int[] Y = {-1, -8, -2, 6};
//        int count = 0;
//        for (int i = 0; i < X.length; i++) {
//            if (X[i] < 0) {
//                count++;
//            }
//
//        }
//        for (int i = 0; i < Y.length; i++) {
//            if (Y[i] < 0) {
//                count++;
//            }
//        }
//        System.out.println(count);

        //265 harc

//        int[] X = {5, 7, 4, 2};
//        int[] Y = {1, 8, 2, 6};
//        double sum = 0;
//        int product = 1;
//        for (int i = 0; i < X.length; i++) {
//                sum += X[i];
//
//        }
//        for (int i = 0; i < Y.length; i++) {
//            product *= Y[i];
//
//        }
//        double dif = sum / product;
//        System.out.println(dif);

        //266 harc
//        int[] X = {-5, 7, -4, 14};
//        int[] Y = {12, -7, 6, -6};
//        int sum1 = 0;
//        int sum2 = 0;
//        for (int i = 0; i < X.length; i++) {
//            if (X[i] < 0) {
//                sum1 += X[i];
//            }
//        }
//        for (int i = 0; i < Y.length; i++) {
//            if (Y[i] > 0) {
//                sum2 += Y[i];
//            }
//
//        }
//        System.out.println(sum1 + sum2);

        //267 harc

//        int[] X = {5, 7, 4, 14};
//        int[] Y = {1, 7, 2, 6};
//        int sum = 0;
//        for (int i = 0; i < X.length; i++) {
//            if (X[i] % 7 == 0) {
//                sum += X[i];
//            }
//        }
//        for (int i = 0; i < Y.length; i++) {
//            if (Y[i] % 7 == 0) {
//                sum += Y[i];
//            }
//
//        }
//        System.out.println(sum);

        //268 harc
//        int[] X = {5, 7, 4, 14};
//        int[] Y = {12, 7, 6, 6};
//        int k = 2;
//        int count = 0;
//        for (int i = 0; i < X.length; i++) {
//            if (X[i] % k == 0) {
//                count++;
//            }
//        }
//        for (int i = 0; i < Y.length; i++) {
//            if (Y[i] % k == 0) {
//                count++;
//            }
//
//        }
//        System.out.println(count);

        //269 harc

//        int[] X = {5, 7, 4, 2};
//        int[] Y = {8, 7, 3, 6};
//        int sum = 0;
//        for (int i = 0; i < X.length; i++) {
//            if (X[i] % 2 == 0) {
//                sum += X[i];
//            }
//        }
//        for (int i = 0; i < Y.length; i++) {
//            if (Y[i] % 2 == 1) {
//                sum += Y[i];
//            }
//
//        }
//        System.out.println(sum);

        //270 harc

//        int[] X = {1, 2, 3, 2};
//        int[] Y = {1, 1, 3, 2};
//        int square = 1;
//        int sum = 0;
//        for (int i = 0; i < X.length; i++) {
//            square = X[i] * X[i];
//            sum += square;
//        }
//        for (int i = 0; i < Y.length; i++) {
//                square = Y[i] * Y[i];
//                sum += square;
//            }
//        System.out.println(sum);
    }
}