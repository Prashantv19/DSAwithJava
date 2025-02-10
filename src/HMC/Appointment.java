package HMC;

public class Appointment {
    private Patient patient;
    private Doctor doctor;
    private String date;

    public Appointment(Patient patient, Doctor doctor, String date) {
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    @Override
    public String toString() {
        return "hmc.Appointment: [hmc.Patient: " + patient + ", hmc.Doctor: " + doctor + ", Date: " + date + "]";
    }
}