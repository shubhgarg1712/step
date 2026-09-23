public class Problem2 {
    public static void main(String[] args) {
        Doctor d1 = new Doctor(101, "Dr. Sharma", "Cardiologist", 1000);
        Doctor d2 = new Doctor(102, "Dr. Mehta", "Dermatologist", 800);

        Patient p1 = new Patient(201, "Aman", "Heart Disease", 45);
        Patient p2 = new Patient(202, "Priya", "Skin Allergy", 28);
        Patient p3 = new Patient(203, "Rohan", "Heart Disease", 52);

        Patient[] patients = {p1, p2, p3};
        Doctor[] assignedDoctors = {d1, d2, d1};

        int d1Patients = 0;
        int d2Patients = 0;

        for (int i = 0; i < patients.length; i++) {
            System.out.println("\n-----------------------------");
            patients[i].displayPatient();
            System.out.println("\nDoctor Treating Patient:");
            assignedDoctors[i].displayDoctor();

            if (assignedDoctors[i] == d1) {
                d1Patients++;
            } else {
                d2Patients++;
            }
        }

        double totalD1Fee = d1Patients * d1.getConsultationFee();
        double totalD2Fee = d2Patients * d2.getConsultationFee();

        System.out.println("\n=============================");
        System.out.println("TOTAL CONSULTATION FEE");
        System.out.println("Dr. " + d1.getName() + ": Rs. " + totalD1Fee);
        System.out.println("Dr. " + d2.getName() + ": Rs. " + totalD2Fee);
    }
}

class Doctor {
    private int doctorId;
    private String name;
    private String specialization;
    private double consultationFee;

    public Doctor(int doctorId, String name, String specialization, double consultationFee) {
        this.doctorId = doctorId;
        this.name = name;
        this.specialization = specialization;
        this.consultationFee = consultationFee;
    }

    public String getName() {
        return name;
    }

    public double getConsultationFee() {
        return consultationFee;
    }

    public void displayDoctor() {
        System.out.println("Doctor ID: " + doctorId);
        System.out.println("Doctor Name: " + name);
        System.out.println("Specialization: " + specialization);
        System.out.println("Consultation Fee: Rs. " + consultationFee);
    }
}

class Patient {
    private int patientId;
    private String name;
    private String disease;
    private int age;

    public Patient(int patientId, String name, String disease, int age) {
        this.patientId = patientId;
        this.name = name;
        this.disease = disease;
        this.age = age;
    }

    public void displayPatient() {
        System.out.println("Patient ID: " + patientId);
        System.out.println("Patient Name: " + name);
        System.out.println("Disease: " + disease);
        System.out.println("Age: " + age);
    }
}
