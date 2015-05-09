/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Person.Doctor;
import Business.Role.DoctorRole;
import java.util.ArrayList;

/**
 *
 * @author Alex
 */
public class UserAccountDirectory {

    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        this.userAccountList = new ArrayList<UserAccount>();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }

    public UserAccount authenticate(String name, String password) {
        for (UserAccount ua : userAccountList) {
            if (ua.authenticate(name, password)) {
                return ua;
            }
        }
        return null;
    }

    public UserAccount addUserAccount() {
        UserAccount ua = new UserAccount();
        userAccountList.add(ua);
        return ua;
    }

    public ArrayList<Doctor> getDoctorAccount() {
        ArrayList<Doctor> doctorList = new ArrayList<Doctor>();

        for (UserAccount ua : userAccountList) {
            if (ua.getRole() instanceof DoctorRole) {
                doctorList.add((Doctor)ua.getPerson());
            }
        }
        return doctorList;
    }
}
