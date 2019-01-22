/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;



import Business.Employee.EmployeeDirectory;
import Business.Role.Role;
import Business.UserAccount.UserAccountDirectory;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author aawad
 */
public abstract class Organization {
    
    private String name;
    private WorkQueue workQueue;
    private EmployeeDirectory employeeDirectory;
    private String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkQueue getWorkQueue() {
        return workQueue;
    }

    public void setWorkQueue(WorkQueue workQueue) {
        this.workQueue = workQueue;
    }

  
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }

    public void setUserAccountDirectory(UserAccountDirectory userAccountDirectory) {
        this.userAccountDirectory = userAccountDirectory;
    }

    public int getOrganizationID() {
        return organizationID;
    }

   public EmployeeDirectory getEmployeeDirectory() {
        return employeeDirectory;
    }

    public void setEmployeeDirectory(EmployeeDirectory employeeDirectory) {
        this.employeeDirectory = employeeDirectory;
    }

    public abstract ArrayList<Role> getSupportedRole();
   
   
    private UserAccountDirectory userAccountDirectory;
    private int organizationID;
    private static int counter=0;
    
//    public enum Type{
//        Admin("Admin Organization"), pManager("Manager Organization"), nSupervisor("Supervisor Organization"),
//        Delivery("Delivery Organization"), Pickup("Pickup Organization");
//        private String value;
//        private Type(String value) {
//            this.value = value;
//        }
//        public String getValue() {
//            return value;
//        }
//    }
    public enum PType{
        Admin("Admin Organization"), pManager("Manager Organization"), 
        Delivery("Delivery Organization");
        
        private String value;
        private PType(String value) {
            this.value = value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        public String getValue() {

            return value;
        }

        @Override
        public String toString() {
            return  value;
        }
    }
    public enum NType{
        Admin("Admin Organization"), nSupervisor("Supervisor Organization"),
    Pickup("Pickup Organization");
        
        private String value;
        private NType(String value) {
            this.value = value;
        }

        public void setValue(String value) {
            this.value = value;
        }
        public String getValue() {
//            if(enterpeise.getEnterpriseType().getValue().equalsIgnoreCase("Proviser")){
//                return String.valueOf(Type.pManager);
//            }
            return value;
        }

        @Override
        public String toString() {
            return  value;
        }
    }
        
        public Organization(String name)
        {
        this.name = name;
        workQueue = new WorkQueue();
        employeeDirectory = new EmployeeDirectory();
        userAccountDirectory = new UserAccountDirectory();
        organizationID = counter;
     
        ++counter;
        }
        
    @Override
    public String toString()
    {
        return name;
    }

}
