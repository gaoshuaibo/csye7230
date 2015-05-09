/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Appointment;

import Business.Person.Doctor;
import Business.Person.Patient;
import java.util.Date;
import javax.swing.SpinnerDateModel;

/**
 *
 * @author Alex
 */
public class Appointment {

    private int id;
    private static int count = 0;
    private IllnessType illnessType = IllnessType.Unknow;
    private String description;
    private Date dateTime;
    private StatusType status = StatusType.Valid;
    private Doctor doctor;
    private Patient patient;

    public Appointment() {
        this.id = ++count;
    }

    public int getId() {
        return id;
    }

    public IllnessType getIllnessType() {
        return illnessType;
    }

    public void setIllnessType(IllnessType illnessType) {
        this.illnessType = illnessType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public StatusType getStatus() {
        return status;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public void action() {
        if (status.equals(StatusType.Valid)) {
            status = StatusType.InProgress;
        } else if (status.equals(StatusType.InProgress)) {
            status = StatusType.Closed;
        }
    }

    public void cancel() {
        status = StatusType.Cancelled;
    }

    public void initiate() {
        status = StatusType.Valid;
    }

    public enum StatusType {

        Valid("Valid"),
        InProgress("InProgress"),
        Invalid("Invalid"),
        Closed("Closed"),
        Cancelled("Cancelled");

        private String value;

        private StatusType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    public enum IllnessType {

        Unknow("Unknow"),
        Headache("Headache"),
        Stomachache("Stomachache");

        private String value;

        private IllnessType(String value) {
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
