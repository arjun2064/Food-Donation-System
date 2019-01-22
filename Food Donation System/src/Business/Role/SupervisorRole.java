/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
//import userinterface.NeedRoleInterface.deliveryRoleWorkArea;
import userinterface.NeedRoleInterface.SupervisorRoleWorkArea;

/**
 *
 * @author aawad
 */
public class SupervisorRole extends Role{

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new SupervisorRoleWorkArea(userProcessContainer,  account, organization, business,enterprise); //To change body of generated methods, choose Tools | Templates.
    }
    
}
