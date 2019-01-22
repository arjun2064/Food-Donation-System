/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import Business.Enterprise.Enterprise.EnterpriseType;
import java.util.ArrayList;

/**
 *
 * @author arjun
 */
public class EnterpriseDirectory {
    private ArrayList<Enterprise> enterpriseList;
    
    public EnterpriseDirectory(){
        enterpriseList=new ArrayList<Enterprise>();
    }

    public ArrayList<Enterprise> getEnterpriseList() {
        return enterpriseList;
    }

    public void setEnterpriseList(ArrayList<Enterprise> enterpriseList) {
        this.enterpriseList = enterpriseList;
    }
    
    public Enterprise createEnterprise(String name, Enterprise.EnterpriseType enterpriseType, String address){
        Enterprise enterprise= null;
        if(enterpriseType==EnterpriseType.In_Need ){
            enterprise= new NeedEnterprise(name, enterpriseType, address);
            
            enterpriseList.add(enterprise);
            
        }else if(enterpriseType==EnterpriseType.Provider){
        enterprise=new ProvideEnterprise(name, enterpriseType, address);
        enterpriseList.add(enterprise);
        }
    return enterprise;
    }
   
    
        }
