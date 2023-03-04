package exercicio3.entities;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();


        List<Shape> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.println("Shape #" + (i + 1) + " data ");
            System.out.print("Rectangle or Circle (r/c)? ");
            char ch = sc.next().charAt(0);
            System.out.println("Color (BLACK/BLUE/RED): ");
            Color color = Color.valueOf(sc.next());

            if (ch == 'r') {
                System.out.println("Width: ");
                double width = sc.nextDouble();
                System.out.println("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color,radius));
            }
        }

        System.out.println();
        System.out.println("SHAPE AREAS: ");
        for(Shape i: list){
            System.out.println(String.format("%.2f", i.area()));
        }


        sc.close();
    }
}
