package predictingfuturetuition;

/**
 *
 * @author adil ahmadzai
 */
public class PredictingFutureTuition {

    public static void main(String[] args) {
        double tuition = 10000;
        double target = 20000;
        int years = 0;

        while (tuition < target) {
            tuition = tuition * 1.07;
            years++;
        }

        System.out.printf("The tuition will be doubled after: %d\n", years);
    }
    
}
