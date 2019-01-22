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
import Business.WorkQueue.WorkRequest;
import javax.swing.JPanel;
import userinterface.NeedRoleInterface.PickupRoleWorkArea;

/**
 *
 * @author aawad
 */
public class PickupRole extends Role {

    private WorkRequest request;
    private UserAccount userAccount;
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem business) {
        return new PickupRoleWorkArea(request, userAccount); //To change body of generated methods, choose Tools | Templates.
    }
    
}
