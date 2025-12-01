
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        ArrayList<Integer> points = new ArrayList<>();
        System.out.println("Enter point totals, -1 stops: ");
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("-1")) {
                break;
            }
            int number = Integer.valueOf(input);

            if (number >= 0 && number <= 100) {
                points.add(number);
            }
        }
        System.out.println("Point average (all): " + Main.pointAverage(points));
        System.out.println("Point average (passing): " + Main.pointAveragePassing(points));
        System.out.println("Pass percentage: " + Main.pointPassPercentage(points));
        System.out.println("Grade distribution:");
        Main.printGradeDistribution(points);
    }

    public static double pointAverage(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            return -1;
        }

        int sum = 0;
        for (Integer number : numbers) {
            if (number >= 0 && number <= 100) {
                sum += number;
            }
        }

        return 1.0 * sum / numbers.size();
    }

    public static double pointAveragePassing(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            return -1;
        }

        int passed = 0;
        int passedCount = 0;
        for (Integer number : numbers) {
            if (number >= 50 && number <= 100) {
                passed += number;
                passedCount += 1;
            }
        }
        return 1.0 * passed / passedCount;
    }

    public static double pointPassPercentage(ArrayList<Integer> numbers) {
        if (numbers.isEmpty()) {
            return -1;
        }

        int passedCount = 0;
        for (Integer number : numbers) {
            if (number >= 50 && number <= 100) {
                passedCount += 1;
            }
        }
        return 100.0 * passedCount / numbers.size();
    }

    public static void printStars(int stars) {
        while (stars > 0) {
            System.out.print("*");
            stars--;
        }
    }

    public static int pointsToGrade(int points) {
        int grade = 0;
        if (points < 50) {
            grade = 0;
        } else if (points < 60) {
            grade = 1;
        } else if (points < 70) {
            grade = 2;
        } else if (points < 80) {
            grade = 3;
        } else if (points < 90) {
            grade = 4;
        } else if (points >= 90 && points <= 100) {
            grade = 5;
        }
        return grade;
    }

    public static void printGradeDistribution(ArrayList<Integer> numbers) {
        int grade = 5;
        while (grade >= 0) {
            int stars = 0;
            for (Integer number : numbers) {
                if (pointsToGrade(number) == grade) {
                    stars++;
                }
            }
            System.out.print(grade + ": ");
            Main.printStars(stars);
            System.out.println("");

            grade = grade - 1;
        }
    }
}
