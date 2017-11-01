package main;

import pojos.NumberInput;

import java.util.Set;

public class Main {

    public static void main(String[] args)
    {
        NumberInput input=new NumberInput();
        //Set<Integer> lotteryNums=input.readNums();
        input.readNums();
        input.listingNumbers();


    }
}
