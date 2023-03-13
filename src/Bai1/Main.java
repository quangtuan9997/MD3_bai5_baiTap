package Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Circle circle=new Circle();
        Scanner scanner=new Scanner(System.in) ;
        System.out.print("nhap ban kinh r=");
        double radius=scanner.nextDouble();
        circle.setRadius(radius);
        System.out.println(circle.getRadius());
        System.out.println("S="+circle.getArea());
        System.out.println( circle.toString());
    }


}
