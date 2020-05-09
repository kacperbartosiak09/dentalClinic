package dentalClinic;

import java.util.ArrayList;

public class Patient extends Person {
    private static int ID;
    ArrayList<Appointment> Appointments;


    public Patient(String firstName, String lastName, String socialSecurityNumber, String birthDate, String address, String telNumber, int ID) {
        super(firstName, lastName, socialSecurityNumber, birthDate, address, telNumber);

    }


}
