/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

import Business.Person.Person;

/**
 *
 * @author Alex
 */
public class Patient extends Person {

    private String patientId;
    private static int count = 0;

    public Patient() {
        this.patientId = String.format("%s", ++count);
    }

    public String getPatientId() {
        return patientId;
    }

    @Override
    public String toString() {
        return this.getFullName();
    }

}
