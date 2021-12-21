package com.company;
//import java.util.Arrays;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("введите слова, разделенные пробелами");
        Scanner Like = new Scanner(System.in);
        String str = Like.nextLine();
        String[] result = str.split(" ");
        //System.out.println(Arrays.toString(result));
        int schet = 0;
            for (int i = 0; i < result.length; i++) {
                String word = result[i];
                boolean v = word.matches("^[A-Za-z]+$");
                if (v == true) {
                    System.out.println(word);
                    schet++;
                }
            }
                System.out.printf("%d подходящих слов/слова \n", schet);
            }
}


