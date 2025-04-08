public class Main {
    public static void main(String[] args) {
        final double KILOMETERS_PER_NAUTICAL_MILE = 1.852;
        final double MILES_PER_NAUTICAL_MILE = 1.150779;

        double nauticalMiles = 10.0; // example value

        double kilometers = nauticalMiles * KILOMETERS_PER_NAUTICAL_MILE;
        double miles = nauticalMiles * MILES_PER_NAUTICAL_MILE;

        System.out.println(nauticalMiles + " nautical miles is equal to "
                + kilometers + " kilometers and "
                + miles + " miles.");
    }
}