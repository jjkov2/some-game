package com.company;

import java.util.Scanner;

class Main {
    public static void main(String args[]) {
        System.out.println("1 - paper;2 - scissors;3 - stone");
        System.out.println("hello people!");
        System.out.println("this is game \"stone scissor spaper\"");
        Scanner in = new Scanner(System.in);
        System.out.print("first player enter number: ");
        byte y = in.nextByte();
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
        System.out.print("second player enter number: ");
        byte x = in.nextByte();
        boolean isTrue = true;
        while (isTrue) {
            // algorithm for processing moves
            if (x == 3 && y == 1) {
                System.out.print("first player win!");
                isTrue = false;
            } else if (x == 3 && y == 2) {
                System.out.println("second player win!");
                isTrue = false;
            } else if (x == 1 && y == 3) {
                System.out.print("second player win");
                isTrue = false;
            } else if (x > y) {
                System.out.print("second player win!");
                isTrue = false;
            } else if (x < y) {
                System.out.print("first player win");
                isTrue = false;
            }
        }
    }
}
// by jjkov