package day09.Step1;

public class Taxi{
    String taxiNumber;
    int passengerCount;
    int money;

    public Taxi(String  taxiNumber) {
        this.taxiNumber = taxiNumber;
    }
    public void take(int money){
        this.money += money;
        passengerCount++;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "taxiNumber=" + taxiNumber +
                ", passengerCount=" + passengerCount +
                ", money=" + money +
                '}';
    }
}
