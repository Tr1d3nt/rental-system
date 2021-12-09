package tasks;

public class Fee {

    private int amount = 0;
    private int period = 0;


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
