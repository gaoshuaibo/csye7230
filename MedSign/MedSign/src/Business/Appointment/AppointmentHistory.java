/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointment;

import Business.Person.Doctor;
import Business.Person.Patient;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class AppointmentHistory {

    private ArrayList<Appointment> appointmentList;

    public AppointmentHistory() {
        appointmentList = new ArrayList<Appointment>();
    }

    public ArrayList<Appointment> getAppointmentList() {
        return appointmentList;
    }

    public ArrayList<Appointment> getDoctorAppointmentList(Doctor doctor) {
        ArrayList<Appointment> doctorAppointmentList = new ArrayList<Appointment>();
        for (Appointment a : appointmentList) {
            if (a.getDoctor().equals(doctor)) {
                doctorAppointmentList.add(a);
            }
        }
        return doctorAppointmentList;
    }

    public ArrayList<Appointment> getPatientAppointmentList(Patient patient) {
        ArrayList<Appointment> patientAppointmentList = new ArrayList<Appointment>();
        for (Appointment a : appointmentList) {
            if (a.getPatient().equals(patient)) {
                patientAppointmentList.add(a);
            }
        }
        return patientAppointmentList;
    }

    public Appointment makeAppointment() {
        Appointment appointment = new Appointment();
        appointmentList.add(appointment);
        return appointment;
    }
}
