package Bai2;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Student student=new Student();
        Scanner scanner=new Scanner(System.in);
        System.out.print("nhap ten Student: ");
        String name=scanner.nextLine();
        System.out.print("nhap Classes:");
        String classes=scanner.nextLine();
        student.setName(name);
        student.setClasses(classes);
        System.out.println( student.toString());
    }
}
