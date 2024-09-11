import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Double> temps = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        double averageTemp = 0;
        int daysAboveAverage = 0;

        System.out.println("Please enter the first temperature: ");
        double temp1 = input.nextInt();
        temps.add(temp1);

        System.out.println("Please enter the second temperature: ");
        double temp2 = input.nextInt();
        temps.add(temp2);

        System.out.println("Please enter the third temperature: ");
        double temp3 = input.nextInt();
        temps.add(temp3);

        System.out.println("Please enter the fourth temperature: ");
        double temp4 = input.nextInt();
        temps.add(temp4);

        System.out.println("Please enter the fifth temperature: ");
        double temp5 = input.nextInt();
        temps.add(temp5);


        for(double temp : temps) {
            averageTemp += temp;
        }

        averageTemp = averageTemp / 5;

        for(double temp : temps) {
            if(temp > averageTemp) {
                daysAboveAverage += 1;
            }
        }

        System.out.println("Average Temperature: " + averageTemp);
        System.out.println("Days above average: " + daysAboveAverage);
        }
    }
