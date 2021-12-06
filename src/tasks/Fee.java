package tasks;

import controllers.*;

public class Fee {

    private int amount = 20; // just using as a placeholder until manager is implemented
    private int period = 10; // just using as a placeholder until manager is implemented
    private int manager_id = 1234; // just using as a placeholder until manager is implemented

    public Fee(int amount, int period, int mangerer_id){
        this.amount = amount;
        this.period = period;
        this.manager_id = mangerer_id;
    }



    public int getAmount() {
        return this.amount;
    }

    public int getPeriod() {
        return this.period;
    }

    public int getManager() {
        return this.manager_id;

    }
}
