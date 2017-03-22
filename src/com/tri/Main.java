package com.tri;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// import java.util.Scaner;
        double a;
        double P;
        System.out.println("Программа высчитывает длину стороны квадрата по периметру:");
        System.out.println("а=P/4");
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите периметр квадрата: ");
        P = sc.nextDouble();
        System.out.println("Сторона квадрата = " + P/4);

          }
}
