package com.springEdu.techcareer.week5.Saturday.Entity;

public class test {

    public static void main(String[] args) {
        Flower flower = new Flower();
        flower.setName("Rose");
        flower.setNumber("2347628");

        Flower flower1 = new Flower("Rose", "3482");
     //   System.out.println(flower.getName() + " " + flower.getNumber());


        System.out.println(flower);
    }
}
