/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.ManagerOrganization;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userinterface.ManagerRole.ManagerWorkAreaJPanel;

/**
 *
 * @author aawad
 */
public class ManagerRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new ManagerWorkAreaJPanel(userProcessContainer, account, (ManagerOrganization)organization, enterprise,organization); //To change body of generated methods, choose Tools | Templates.
    }
    
}
