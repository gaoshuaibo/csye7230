/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

/**
 *
 * @author Alex
 */
public class PatientRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount userAccount, javax.swing.JFrame parent) {
        //return new PatientWorkAreaJPanel(userProcessContainer, userAccount, parent);
        return null;
    }
}
