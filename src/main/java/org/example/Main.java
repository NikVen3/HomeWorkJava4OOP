package org.example;

public class Main {

    public static void main(String[] args) {


        Box<Apple> appleBox1 = new Box<>();
        Box<Apple> appleBox2 = new Box<>(new Apple(), new Apple(), new Apple());
        Box<Orange> orangeBox = new Box<>(new Orange(), new Orange(),new Orange());


        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());
        appleBox1.addFruit(new Apple());




        System.out.println("Вес коробки с яблокоми: " + appleBox1.getWeight());
        System.out.println("Вес второй коробки с яблоком: " + appleBox2.getWeight());
        System.out.println("Вес коробки с апельсинами: " + orangeBox.getWeight());


        System.out.println("Вес коробок с яблоками: " + appleBox1.compare(appleBox2));



        appleBox1.transfer(appleBox2);


        System.out.println("Вес первой коробки с яблоками после переноса: " + appleBox1.getWeight());
        System.out.println("Вес второй коробки с яблоками после переноса: " + appleBox2.getWeight());
    }
}