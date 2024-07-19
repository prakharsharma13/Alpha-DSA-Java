package Arrays;

import java.util.*;

public class InOutUpd {
    public static void main(String[] args) {
        int marks[] = new int[100];

        Scanner sc = new Scanner(System.in);

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();

        System.out.println("Phy marks is: " + marks[0]);
        System.out.println("Chem marks is: " + marks[1]);
        System.out.println("Maths marks is: " + marks[2]);

        int percentage = (marks[0] + marks[1] + marks[1]) / 3;
        System.out.println("percentage is : " + percentage + "%");
    }
}
