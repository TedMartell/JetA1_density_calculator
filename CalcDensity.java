import java.sql.SQLOutput;
import java.util.Scanner;

public class CalcDensity {
    public static void calcBatchDensity() {
        final double ALPHA = 0.0006;
        final byte refTemp = 15;
        float currentBatchTemp = 0;
        float currentBatchDensity = 0;

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Current Batch Temperature: ");
            currentBatchTemp = scanner.nextFloat();
            if (currentBatchTemp >= 0 && currentBatchTemp <= 50)
                break;
            System.out.println("Enter a value between 0 and 50");
    }
        while (true) {
            System.out.print("Current Batch Density ");
            currentBatchDensity = scanner.nextFloat();
            if (currentBatchDensity >= 775 && currentBatchDensity <= 840)
                break;
            System.out.println(" Enter a value between 775 and 840");
        }

        double densityCurrentTemp = currentBatchDensity * (1-ALPHA * (currentBatchTemp - refTemp));
        System.out.print("Density is: " + densityCurrentTemp +" kg/m3");

    }
}
