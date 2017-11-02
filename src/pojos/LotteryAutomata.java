package pojos;

import java.util.*;

public class LotteryAutomata {

    List<Integer> lottoNumbers;

    public LotteryAutomata() {
        this.lottoNumbers = new ArrayList<>();
    }

    public void lotterying()
    {
        Random rand=new Random();
        int min=1;
        int max=90;
        for(int i=1;i<=5;++i) {
            int randNum = rand.nextInt((max - min) + 1) + min;
            this.lottoNumbers.add(randNum);
        }
    }

    public List<Integer> getLottoNumbers() {
        return lottoNumbers;
    }

    public void listing()
    {
        int i=1;
        for(int actual : this.lottoNumbers)
        {
            System.out.println((i++)+"-->"+actual);
        }
    }

    public void removeAllElements()
    {
        this.lottoNumbers.removeAll(this.lottoNumbers);
    }
}
