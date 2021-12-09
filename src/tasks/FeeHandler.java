package tasks;

import java.util.*;

import controllers.*;

public class FeeHandler {


    private FeeController feeController = new FeeController();


    public FeeHandler(){

        feeController.getFees();


    }


    // sets the for inputted Period, sets the fee as the inputted amount
    // goes through the database controller to add fee
    public void setFee(String period, String amount){
        feeController.addFee(Integer.parseInt(period), Integer.parseInt(amount));

    }

    // gets the fee for inputted period
    // uses the ArrayList<Fee> in controller class
    public String getFee(String period){

        int fee = 0;
        int periodI = Integer.parseInt(period);
        for(int i = 0; i < feeController.feeList().size(); i++) {
            if(feeController.feeList().get(i).getPeriod() == periodI){
                fee = feeController.feeList().get(i).getAmount();
            }



        }

        return Integer.toString(fee);
    }


}
