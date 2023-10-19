import java.util.Scanner;

public class BMICaculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap can nang:");
        double weight = scanner.nextDouble();
        System.out.println("Nhap chieu cao: (m)");
        double height = scanner.nextDouble();
        double bmi = weight / Math.pow(height,2);
        if (bmi<18.5){
            System.out.println("Underweight");
        }else if (18.5<=bmi || bmi <25){
            System.out.println("Normal");
        } else if (25<=bmi || bmi <30) {
            System.out.println("Overweight");
        } else if (30<=bmi) {
            System.out.println("Obese");
        }
    }

}
