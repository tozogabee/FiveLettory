package main;

import pojos.LotteryAutomata;
import pojos.NumberInput;

import java.util.List;
import java.util.Set;

public class Main {

    public static void main(String[] args)
    {
        NumberInput input=new NumberInput();
        LotteryAutomata lotteryAutomata=new LotteryAutomata();
        creatingLottery(lotteryAutomata,input);
    }

    public static void addTheLotteryNumbers(NumberInput input)
    {
        input.readNums();
        System.out.println("---------Your Numnbers--------");
        input.listingNumbers();
        System.out.println("------------------------------");
    }

    public static void creatingLottery(LotteryAutomata lotteryAutomata,NumberInput numberInput)
    {
            boolean won=false;
            int howManyHits=0;
            int howManyiteration=0;
            int oneHit = 0 ,twoHit = 0,threeHit = 0,fourHit =0;
            do {
                ++howManyiteration;
                addTheLotteryNumbers(numberInput);
                lotteryAutomata.lotterying();
                lotteryAutomata.listing();
                int hit=getHit(lotteryAutomata,numberInput);
                //howManyHits=howManyHits(oneHit,twoHit,threeHit,fourHit,lotteryAutomata,numberInput);
                if(hit==5)
                {
                    System.out.println("direct hit");
                    System.out.println("Iteration number is "+howManyiteration);
                    won=true;
                }
                else
                {
                    if(hit==0)
                    {
                        System.out.println("The person had got 0 hit");
                    }
                    if(hit==1)
                    {
                        oneHit=howManyHits(oneHit,twoHit,threeHit,fourHit,lotteryAutomata,numberInput);
                        System.out.println("1 hit - "+oneHit);
                    }
                    else if(hit==2)
                    {
                        twoHit=howManyHits(oneHit,twoHit,threeHit,fourHit,lotteryAutomata,numberInput);
                        System.out.println("2 hits - "+twoHit);
                    }
                    else if(hit==3)
                    {
                        threeHit=howManyHits(oneHit,twoHit,threeHit,fourHit,lotteryAutomata,numberInput);
                        System.out.println("3 hits - "+threeHit);
                    }
                    else if(hit==4)
                    {
                        fourHit=howManyHits(oneHit,twoHit,threeHit,fourHit,lotteryAutomata,numberInput);
                        System.out.println("4 hits - "+fourHit);
                    }
                }
                lotteryAutomata.removeAllElements();
                numberInput.removeAllElements();
            }while(!won);
    }

    public static int getHit(LotteryAutomata lotteryAutomata,NumberInput numberInput)
    {
        int hitNumber=0;
        Set<Integer> lotteried = lotteryAutomata.getLottoNumbers();
        List<Integer> owns = numberInput.getNumbers();
        //System.out.println(lotteried.size());
        for(int actualLotteried : lotteried)
        {
            for(int actualOwn : owns)
            {
                if(actualLotteried==actualOwn)
                {
                    ++hitNumber;
                }
            }
        }
        return hitNumber;
    }

    public static int howManyHits(int oneHit,int twoHot,int threeHit,int fourHit,LotteryAutomata lotteryAutomata,NumberInput numberInput)
    {
        int hit=getHit(lotteryAutomata,numberInput);

        if(hit==1)
        {
            ++oneHit;
            return oneHit;
        }
        else if(hit==2)
        {
            ++twoHot;
            return twoHot;
        }
        else if(hit==3)
        {
            ++threeHit;
            return threeHit;
        }
        else if(hit==4)
        {
            ++fourHit;
            return fourHit;
        }
        else if(hit==5)
        {
            return 1;
        }
        else
        {
            return 0;
        }
    }


}
