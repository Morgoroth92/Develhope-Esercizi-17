import java.util.Arrays;
import java.util.Scanner;

public class House {
    int floorsNumber;
    String address;
    String[] residentsNames;

    public int getFloorsNumber() {
        return floorsNumber;
    }

    public void setFloorsNumber(int floorsNumber) {
        this.floorsNumber = floorsNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String[] getResidentsNames() {
        return residentsNames;
    }

    public void setResidentsNames(String residentsNamesInput) {
        this.residentsNames = residentsNamesInput.split(",");
    }
}
