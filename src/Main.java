public class Main {
    public static void main(String[] args) {
        final double km_PER_nm = 1.852;
        final double mi_PER_nm = 1.150779;

        double nauticalMiles = 10.0; // example value

        double kilometers = nauticalMiles * km_PER_nm;
        double miles = nauticalMiles * mi_PER_nm;

        System.out.println(nauticalMiles + " nautical miles is equal to "
                + kilometers + " kilometers and "
                + miles + " miles.");
    }
}