/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Person;

/**
 *
 * @author Alex
 */
public class Staff extends Person {

    private String employeeId;
    private static int count = 0;

    public Staff() {
        this.employeeId = String.format("%s", ++count);
    }

    public String getEmployeeId() {
        return employeeId;
    }

}
