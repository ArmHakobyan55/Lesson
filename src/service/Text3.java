package service;

import java.awt.image.AreaAveragingScaleFilter;

public class Text3 {
    public static void main(String[] args) {
        //281 harc
//                int[] numbers = {-5, 7, 10, -4 , 4, -9, 8};
//
//                int count = 0;
//                for (int i = 0; i < numbers.length; i++){
//            if (numbers[i] > 0) {
//                count++;
//            }
//
//        }
//        int [] numbers1 = new int[count];
//        for (int i = 0, j = 0; i < numbers.length; i++){
//
//            if (numbers[i] > 0){
//                numbers1[j] = numbers[i];
//                j++;
//            }
//
//        }
//        for (int i = 0; i < numbers1.length; i++){
//            System.out.println(numbers1[i]);
//        }

        //282 harc

//        int[] numbers = {-5, 7, 10, 0, 4, -9, 8};
//
//        int count = 0;
//        for (int i = 0; i < numbers.length; i++){
//            if (numbers[i] != 0) {
//                count++;
//            }
//
//        }
//        int [] numbers1 = new int[count];
//        for (int i = 0, j = 0; i < numbers.length; i++){
//
//            if (numbers[i] != 0){
//                numbers1[j] = numbers[i];
//                j++;
//            }
//
//        }
//        for (int i = 0; i < numbers1.length; i++){
//            System.out.println(numbers1[i]);
//        }

        //283 harc

//        int[] numbers = {-5, 7, 10, 0, 4, -9, 8};
//
//        int count = 0;
//        for (int i = 0; i < numbers.length; i++){
//            if (numbers[i] % 2 != 0) {
//                count++;
//            }
//
//        }
//        int [] numbers1 = new int[count];
//        for (int i = 0, j = 0; i < numbers.length; i++){
//
//            if (numbers[i] % 2 != 0){
//                numbers1[j] = numbers[i];
//                j++;
//            }
//
//        }
//        for (int i = 0; i < numbers1.length; i++){
//            System.out.println(numbers1[i]);

        //284 harc
        int[] numbers = {-5, 7, 10, 0, 4, -9, 8};
        int a = 7;
        int b = -9;

        for (int i = 0; i < numbers.length; i++){
            if (numbers[i] == a) {
                continue;
            }
        }
        int [] numbers1 = new int[a];
        for (int i = 0, j = 0; i < numbers.length; i++){

            if (numbers[i] == -9){
                break;
                j++;
            }

        }
        for (int i = 0; i < numbers1.length; i++){
            System.out.println(numbers1[i]);

//????????????????????

        //285 harc

//        int[] numbers = {-5, 7, 10, 6, 4, -9, 8};
//        int p = 2;
//        int count = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % p == 0) {
//                count++;
//            }
//
//        }
//        int[] numbers1 = new int[count];
//        for (int i = 0, j = 0; i < numbers.length; i++) {
//
//            if (numbers[i] % p == 0) {
//                numbers1[j] = numbers[i];
//                j++;
//            }
//
//        }
//        for (int i = 0; i < numbers1.length; i++) {
//            System.out.println(numbers1[i]);
//
//        }

        //286 harc

//        int[] numbers = {-5, 7, 10, -6, 4, -9, 8};
//        int count = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 2 == 0) {
//                count++;
//            }
//
//        }
//        int[] numbers1 = new int[count];
//        for (int i = 0, j = 0; i < numbers.length; i++) {
//
//            if (numbers[i] % 2 == 0) {
//                numbers1[j] = numbers[i];
//                j++;
//            }
//
//        }
//        for (int i = 0; i < numbers1.length; i++) {
//            System.out.println(numbers1[i]);
//
//        }

        //287 harc

//        int[] numbers = {0, 1, 10, 3, 4, 6, 5};
//        int count = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i]  == i) {
//                count++;
//            }
//
//        }
//        int[] numbers1 = new int[count];
//        for (int i = 0, j = 0; i < numbers.length; i++) {
//
//            if (numbers[i]  == i) {
//                numbers1[j] = numbers[i];
//                j++;
//            }
//
//        }
//        for (int i = 0; i < numbers1.length; i++) {
//            System.out.println(numbers1[i]);
//
//        }

        //288 harc

//        int[] numbers = {0, 1, 10, 3, 4, 6, 5};
//        int count = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (i  % 2 == 1) {
//                count++;
//            }
//
//        }
//        int[] numbers1 = new int[count];
//        for (int i = 0, j = 0; i < numbers.length; i++) {
//
//            if (i  % 2 == 1) {
//                numbers1[j] = numbers[i];
//                j++;
//            }
//
//        }
//        for (int i = 0; i < numbers1.length; i++) {
//            System.out.println(numbers1[i]);
//
//        }

        //289 harc

        //??????????????????
        //290 harc

//        int[] numbers = {7, 2, 13, 19, 4, 6, 5};
//        int count = 0;
//        for (int i = 0; i < numbers.length; i++) {
//            if (numbers[i] % 6 == 1) {
//                count++;
//            }
//
//        }
//        int[] numbers1 = new int[count];
//        for (int i = 0, j = 0; i < numbers.length; i++) {
//
//            if (numbers[i] % 6 == 1) {
//                numbers1[j] = numbers[i];
//                j++;
//            }
//
//        }
//        for (int i = 0; i < numbers1.length; i++) {
//            System.out.println(numbers1[i]);
//
//        }
    }
}
