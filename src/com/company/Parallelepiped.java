/*
 * Classname Parallelepiped
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

public class Parallelepiped implements IGeometry, IPackaging {

    private int lengthA;
    private int widthB;
    private int heightC;

    // Constructor full

    public Parallelepiped(int lengthA, int widthB, int heightC) {
        this.lengthA = lengthA;
        this.widthB = widthB;
        this.heightC = heightC;
    }

    // Getters and Setters

    public int getLengthA() {
        return lengthA;
    }

    public void setLengthA(int lengthA) {
        this.lengthA = lengthA;
    }

    public int getWidthB() {
        return widthB;
    }

    public void setWidthB(int widthB) {
        this.widthB = widthB;
    }

    public int getHeightC() {
        return heightC;
    }

    public void setHeightC(int heightC) {
        this.heightC = heightC;
    }

    // the perimeter of the parallelepiped

    public int getPerimeterBase() {
        return 2 * (this.lengthA + this.widthB);
    }

    // the area of the base of the parallelepiped

    public int getAreaBase() {
        return this.lengthA * this.widthB;
    }

    // the area of the side surface of the parallelepiped

    public int getAreaSideSurface() {
        return this.getPerimeterBase() * this.heightC;
    }

    // the area of the parallelepiped

   /* public int getArea(){
        return this.getAreaSideSurface() + 2 * this.getAreaBase();
    }*/

    @Override
    public double getArea() {
        return this.getAreaSideSurface() + 2 * this.getAreaBase();
    }

    @Override
    public double getLength() {
        return 2 * (this.lengthA + this.widthB);
    }

    // the volume of the parallelepiped

    public double getVolume() {
        return this.getAreaBase() * this.heightC;
    }

    // Override toString() method

    @Override
    public String toString() {
        return "Parallelepiped{" +
                "lengthA=" + lengthA +
                ", widthB=" + widthB +
                ", heightC=" + heightC +
                '}';
    }

    // Method toJSON()

    @Override
    public String toJSON() {
        String json = "Parallelepiped {"
                + "\"" + "length\": " + this.getLengthA()
                + ", "
                + "\"" + "width\": " + this.getWidthB()
                + ", "
                + "\"" + "heigth\": " + this.getHeightC()
                +  ", "
                + "\"" + "PerimeterBase\": " + this.getPerimeterBase()
                +  ", "
                + "\"" + "Area\": " + this.getArea()
                +  ", "
                + "\"" + "Volume\": " + this.getVolume()
                + " }";
        return json;
    }

    // Method toXML()

    @Override
    public String toXML() {
        String xml = "<Parallelepiped>"
                + "<length>" + this.getLengthA() + "</length>"
                + "<width>" + this.getWidthB() + "</width>"
                + "<heigth>" + this.getHeightC() + "</heigth>"
                + "<perimeter>" + this.getPerimeterBase() + "</perimeter>"
                + "<area>" + this.getArea() + "</area>"
                + "<volume>" + this.getVolume() + "</volume>"
                + "</Parallelepiped>";
        return xml;
    }

    // Method toConsole()

    @Override
    public String toConsole() {
        return "Parallelepiped = {"
                + " Length = " + this.getLengthA() + ", "
                + "Width = " + this.getWidthB() + ", "
                + "Heigth = " + this.getHeightC() + ", "
                + "Perimeter Base = " + this.getPerimeterBase() + ", "
                + "Area = " + this.getArea() + ", "
                + "Volume = " + this.getVolume()
                + " }";

    }

    // Override hash() and equals() methods.

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Parallelepiped that = (Parallelepiped) o;
        return getLengthA() == that.getLengthA() &&
                getWidthB() == that.getWidthB() &&
                getHeightC() == that.getHeightC();
    }

}