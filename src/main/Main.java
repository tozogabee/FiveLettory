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
        //addTheLotteryNumbers(input);
        creatingLottery(lotteryAutomata,input);
        //Set<Integer> lotteryNums=input.readNums();
        //input.readNums();
        //input.listingNumbers();
        //addTheLotteryNumbers(input);
        //input.listingNumbers();
        //lotteryAutomata.lotterying();
        //lotteryAutomata.listing();

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
            do {
                ++howManyiteration;
                addTheLotteryNumbers(numberInput);
                lotteryAutomata.lotterying();
                lotteryAutomata.listing();
                int hit=getHit(lotteryAutomata,numberInput);
                howManyHits=howManyHits(lotteryAutomata,numberInput);
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
                        System.out.println("1 hit - "+howManyHits);
                    }
                    else if(hit==2)
                    {
                        System.out.println("2 hits - "+howManyHits);
                    }
                    else if(hit==3)
                    {
                        System.out.println("3 hits - "+howManyHits);
                    }
                    else if(hit==4)
                    {
                        System.out.println("4 hits - "+howManyHits);
                    }
                }
                lotteryAutomata.removeAllElements();
                numberInput.removeAllElements();
            }while(!won);
    }

    public static int getHit(LotteryAutomata lotteryAutomata,NumberInput numberInput)
    {
        int hitNumber=0;
        List<Integer> lotteried = lotteryAutomata.getLottoNumbers();
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

    public static int howManyHits(LotteryAutomata lotteryAutomata,NumberInput numberInput)
    {
        int hit=getHit(lotteryAutomata,numberInput);
        int numberOfOneHits=0;
        int numberOfTwoHits=0;
        int numberOfThreeHits=0;
        int numberOfFourHits=0;
        int numberOfFiveHits=0;

        if(hit==1)
        {
            ++numberOfOneHits;
            return numberOfOneHits;
        }
        else if(hit==2)
        {
            ++numberOfTwoHits;
            return numberOfTwoHits;
        }
        else if(hit==3)
        {
            ++numberOfThreeHits;
            return numberOfThreeHits;
        }
        else if(hit==4)
        {
            ++numberOfFourHits;
            return numberOfFourHits;
        }
        else if(hit==5)
        {
            ++numberOfFiveHits;
            return numberOfFiveHits;
        }
        else
        {
            return 0;
        }
    }


}
