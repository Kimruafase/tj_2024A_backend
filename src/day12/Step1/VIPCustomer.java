package day12.Step1;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

    public VIPCustomer(){
        //  현재 클래스 내 customerGrade, bonusRatio 변수가 없어서 오류 발생
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
    }

    public int getAgentID(){
        return agentID;
    }
}
