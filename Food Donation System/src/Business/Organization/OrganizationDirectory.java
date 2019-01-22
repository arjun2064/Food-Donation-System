/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import java.util.ArrayList;

/**
 *
 * @author aawad
 */
public class OrganizationDirectory {
    
    private ArrayList<Organization> organizationList;

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public OrganizationDirectory()
    {
        organizationList = new ArrayList();
        
    }
    
  public Organization createOrganization(Organization.NType type, Organization.PType ptype){
        Organization organization = null;
              if(type == null)
                {
                      if (ptype.getValue().equals(Organization.PType.Delivery.getValue())){
                      organization = new DeliveryOrganization();          
                       organizationList.add(organization);
                }
        else if (ptype.getValue().equals(Organization.PType.pManager.getValue())){
            organization = new ManagerOrganization();
            organizationList.add(organization);
        }
                }
      
        if(ptype == null)
        {
                 if (type.getValue().equals(Organization.NType.Pickup.getValue())){
            organization = new PickupOrganization();
            organizationList.add(organization);
        }
           else if (type.getValue().equals(Organization.NType.nSupervisor.getValue())){
            organization = new SupervisorOrganization();
            organizationList.add(organization);
        }
        }
       
        return organization;
    }
}
