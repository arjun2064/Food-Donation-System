/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.Ecosystem;

/**
 *
 * @author aawad
 */
public abstract class Role {
    
    public enum RoleType{
        Admin("Admin"),
        Supervisor("Supervisor"),
        Manager("Manager"),
        Pickup("Pickup"),
        Delivery("Delivery");
        
        private String value;
        private RoleType(String value){
            this.value = value;
        }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value;
        }
    }
    
    public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            Ecosystem business);

    @Override
    public String toString() {
        String Name= this.getClass().getName();
        return Name.substring(14);
    }
    
}
