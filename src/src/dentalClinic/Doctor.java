package dentalClinic;

import java.util.ArrayList;

public class Doctor extends Person {
    private static int ID;



    public Doctor(String firstName, String lastName, String socialSecurityNumber, String birthDate, String address, String telNumber, int ID) {
        super(firstName, lastName, socialSecurityNumber, birthDate, address, telNumber);
        this.ID = ID;
    }

}
