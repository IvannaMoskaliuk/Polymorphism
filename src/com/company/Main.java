/*
 * Classname Main
 *
 * 08/06/2020
 *
 * Copyright Moskaliuk Ivanna KNUTE
 *
 * Module 2. Task 3.
 * Polymorphism
 * Create and implement two interfaces for your class.
 */
package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("---------OOP--------");

        Parallelepiped parallelepiped1 = new Parallelepiped(7, 5, 7);
        System.out.println(parallelepiped1);
        System.out.println(parallelepiped1.toXML());
        System.out.println(parallelepiped1.toJSON());
        System.out.println(parallelepiped1.toConsole());

    }
}
