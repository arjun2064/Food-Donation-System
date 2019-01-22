/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Organization.Organization;
import Business.Organization.OrganizationDirectory;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author aawad
 */
public class Enterprise extends Organization{
    private String enterpriseName;
    private EnterpriseType enterpriseType;
        private OrganizationDirectory organizationDirectory;
 
    private String enterpriseAddress;

    public String getEnterpriseAddress() {
        return enterpriseAddress;
    }

    public void setEnterpriseAddress(String enterpriseAddress) {
        this.enterpriseAddress = enterpriseAddress;
    }
    public Enterprise(String enterpriseName, EnterpriseType enterpriseType, String address){
       super(enterpriseName);
        this.enterpriseType = enterpriseType;
        this.enterpriseAddress = address;
        this.enterpriseName= enterpriseName;
        organizationDirectory=new OrganizationDirectory();
    }

    @Override
    public ArrayList<Role> getSupportedRole() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
    
    public enum EnterpriseType{
        Provider("Provider"),In_Need("In_Need");
        
        private final String value;
        
        private EnterpriseType(String value){
        this.value=value;
    }

        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return value ;
        }
        
    }

    public OrganizationDirectory getOrganizationDirectory() {
        return organizationDirectory;
    }

    

    public String getEnterpriseName() {
        return enterpriseName;
    }

    public void setEnterpriseName(String enterpriseName) {
        this.enterpriseName = enterpriseName;
    }

    public EnterpriseType getEnterpriseType() {
        return enterpriseType;
    }

    public void setEnterpriseType(EnterpriseType enterpriseType) {
        this.enterpriseType = enterpriseType;
    }

}
