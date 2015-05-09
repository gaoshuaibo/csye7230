/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.Appointment.AppointmentHistory;
import Business.UserAccount.UserAccountDirectory;
import DataManagement.DatabaseFactory;

/**
 *
 * @author Alex
 */
public class AppointmentControl {

    private static AppointmentControl appointmentController;
    private UserAccountDirectory userAccountDirectory;
    private AppointmentHistory appointmentHistory;
    private DatabaseFactory databaseFactory;
    private static boolean isFirstTimeRunning = true;

    public AppointmentHistory getAppointmentHistory() {
        return appointmentHistory;
    }

    public static void setAppointmentController(AppointmentControl appointmentController) {
        AppointmentControl.appointmentController = appointmentController;
    }

    public static boolean isIsFirstTimeRunning() {
        return isFirstTimeRunning;
    }

    public static void setIsFirstTimeRunning(boolean isFirstTimeRunning) {
        AppointmentControl.isFirstTimeRunning = isFirstTimeRunning;
    }

    
    public static AppointmentControl getInstance() {
        if (appointmentController == null) {
            appointmentController = new AppointmentControl();
        }
        return appointmentController;
    }

    public AppointmentControl() {
        userAccountDirectory = new UserAccountDirectory();
        appointmentHistory = new AppointmentHistory();
    }

    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
}
