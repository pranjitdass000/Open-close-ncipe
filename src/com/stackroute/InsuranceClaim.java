package com.stackroute;

public class InsuranceClaim extends InsuranceStatus {
    private String customerName;
    private int policyNumber;
    private String managerName;
    private String surveyorName;

    public InsuranceClaim() {
    }

    public InsuranceClaim(String customerName, int policyNumber, String managerName, String surveyorName) {
        this.customerName = customerName;
        this.policyNumber = policyNumber;
        this.managerName = managerName;
        this.surveyorName = surveyorName;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int policyNumber) {
        this.policyNumber = policyNumber;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    public String getSurveyorName() {
        return surveyorName;
    }

    public void setSurveyorName(String surveyorName) {
        this.surveyorName = surveyorName;
    }

    @Override
    public String toString() {
        return "InsuranceClaim{" +
                "customerName='" + customerName + '\'' +
                ", policyNumber=" + policyNumber +
                ", managerName='" + managerName + '\'' +
                ", surveyorName='" + surveyorName + '\'' +
                '}';
    }

    @Override
    public boolean status() {
        return true||false;
    }
}
