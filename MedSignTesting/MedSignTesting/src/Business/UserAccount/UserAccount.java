/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;

import Business.Person.Person;
import Business.Role.Role;

/**
 *
 * @author Alex
 */
public class UserAccount {

    private int id;
    private static int count = 0;
    private Person person;
    private String accountName;
    private String password;
    private Role role;
    private boolean isActive = false;

    public UserAccount() {
        id = ++count;
    }

    public Person getPerson() {
        return person;
    }

    public boolean isIsActive() {
        return isActive;
    }

    public void setIsActive(boolean isActive) {
        this.isActive = isActive;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public boolean authenticate(String name, String password) {
        if (this.accountName.equals(name) && (this.password.equals(password))) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.valueOf(id);
    }
}
