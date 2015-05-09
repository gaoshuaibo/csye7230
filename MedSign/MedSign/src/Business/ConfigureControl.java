/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Appointment.Appointment;
import Business.Person.Doctor;
import Business.Person.Patient;
import Business.Person.Person;
import Business.Role.AdminRole;
import Business.Role.DoctorRole;
import Business.Role.PatientRole;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.Date;

/**
 *
 * @author Done
 */
public class ConfigureControl {

    public static AppointmentControl Initialize() {
        AppointmentControl controller = AppointmentControl.getInstance();

        Patient p = new Patient();
        p.setFirstName("Bugrara");
        p.setLastName("Kal");
        p.setEmail("k.bugrara@neu.edu");
        p.setSsn("111223333");

        UserAccount ua = controller.getUserAccountDirectory().addUserAccount();
        ua.setPerson(p);
        ua.setRole(new PatientRole());
        ua.setAccountName("patient");
        ua.setPassword("patient");
        ua.setIsActive(true);

        Doctor p1 = new Doctor();
        p1.setFirstName("Shuaibo");
        p1.setLastName("Gao");
        p1.setEmail("gao.shua@husky.neu.edu");
        p1.setSsn("111223334");
        p1.setResearchArea("Head");
        p1.setTitle("Chief of Physical Medicine");

        UserAccount ua1 = controller.getUserAccountDirectory().addUserAccount();
        ua1.setPerson(p1);
        ua1.setRole(new DoctorRole());
        ua1.setAccountName("doctor");
        ua1.setPassword("doctor");
        ua1.setIsActive(true);
        
        Person p2 = new Person();
        p2.setFirstName("Kokar");
        p2.setLastName("Mieczyslaw");
        p2.setEmail("m.kokar@neu.edu ");
        p2.setSsn("111223335");

        UserAccount ua2 = controller.getUserAccountDirectory().addUserAccount();
        ua2.setPerson(p2);
        ua2.setRole(new AdminRole());
        ua2.setAccountName("admin");
        ua2.setPassword("admin");
        ua2.setIsActive(true);
        
        return controller;

    }
}
