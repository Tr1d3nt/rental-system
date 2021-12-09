package tasks;

public class Fee {

    private int amount = 0; // amount for fee
    private int period = 0; // amount for period


    public Fee(int amount, int period){
        this.amount = amount;
        this.period = period;

    }

    public int getAmount() {
        return this.amount;
    }


    public int getPeriod() {
        return this.period;
    }


}
