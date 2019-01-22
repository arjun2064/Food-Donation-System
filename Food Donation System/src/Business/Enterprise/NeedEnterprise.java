/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

/**
 *
 * @author arjun
 */
public class NeedEnterprise extends Enterprise{
    
    public NeedEnterprise(String name, EnterpriseType enterpriseType, String address) {
        super(name, enterpriseType.In_Need, address);
    }
    
}
