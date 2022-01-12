package com.stackroute.service;

import com.stackroute.InsuranceClaim;

public class PolicyClaimDetails {
    public String claimDetails(InsuranceClaim insuranceClaim){
        InsuranceClaim insuranceClaim1 = new InsuranceClaim();
       String name1 =insuranceClaim1.getCustomerName();
       int policyNumber1 =insuranceClaim1.getPolicyNumber();
        return "The customer details are:" ;
    }


}
