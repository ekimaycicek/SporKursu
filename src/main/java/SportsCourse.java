import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SportsCourse {
    private String name;
    private String gender;
    private double kilo;
    private double size;

    public SportsCourse(String name, String gender, double kilo, double size) {

        this.name = name;
        this.gender = gender;
        this.kilo = kilo;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public double getKilo() {
        return kilo;
    }

    public double getSize() {
        return size;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the number of students: ");
        int NumberOfStudents = input.nextInt();

        List<SportsCourse> studentList = new ArrayList<>();

        for (int i = 1; i <= NumberOfStudents; i++) {
            System.out.println("Student " + i + " enter your information:");

            System.out.print("Name: ");
            String name = input.next();

            System.out.print("Gender (E/K): ");
            String gender = input.next();

            System.out.print("Kilo (kg): ");
            double kilo = input.nextDouble();

            System.out.print("Size (m): ");
            double size = input.nextDouble();

            SportsCourse ogrenci = new SportsCourse(name, gender, kilo, size);
            studentList.add(ogrenci);

            System.out.println();
        }

        for (SportsCourse student : studentList) {

            if (student.getGender().equalsIgnoreCase("E")) {
                if (student.getSize() >= 1.60 && student.getKilo() >= 70 && student.getKilo() <= 90) {
                    System.out.println(student.getName() + " accepted to the sports course.");
                } else {
                    System.out.println(student.getName() + " She was not accepted to the sports course.");
                }

            } else if (student.getGender().equalsIgnoreCase("K")) {
                if (student.getSize() >= 1.50 && student.getKilo() >= 50 && student.getKilo() <= 70) {
                    System.out.println(student.getName() + " accepted to the sports course.");
                } else {
                    System.out.println(student.getName() + " She was not accepted to the sports course.");
                }
            } else {
                System.out.println("Invalid login. Please enter 'E' or 'K'.");
            }


        }





    }
}
