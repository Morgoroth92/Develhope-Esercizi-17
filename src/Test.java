import java.util.Scanner;
import java.util.Arrays;

public class Test {

    public static void main(String[] args) {

        House house = new House();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter how many floors: ");

        int floorsNumber = scanner.nextInt();
        scanner.nextLine();
        house.setFloorsNumber(floorsNumber);

        System.out.print("Enter the address: ");

        String address = scanner.nextLine();
        house.setAddress(address);

        System.out.print("Enter the residents names separated by commas: ");

        String residentsNamesInput = scanner.nextLine();
        house.setResidentsNames(residentsNamesInput);

        scanner.close();

        System.out.println("House Details:");
        System.out.println("Floors Number: " + house.getFloorsNumber());
        System.out.println("Address: " + house.getAddress());
        System.out.println("Residents' Names: " + Arrays.toString(house.getResidentsNames()));
    }
}
