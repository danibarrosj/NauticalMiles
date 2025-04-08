import java.util.Scanner;

public class Interactive {
    public static void main (String[] args){
        final double km_PER_nm = 1.852;
        final double mi_PER_nm = 1.150779;

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of nautical miles: ");
        double nauticalMiles = input.nextDouble();

        double kilometers = nauticalMiles * km_PER_nm;
        double miles = nauticalMiles * mi_PER_nm;

        System.out.println(nauticalMiles + " nautical miles is equal to "
                + kilometers + " kilometers and "
                + miles + " miles.");
    }
}