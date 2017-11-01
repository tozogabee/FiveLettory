package pojos;

import exceptions.NoNumberException;
import exceptions.NumberOutOfRangeException;
import exceptions.SameNumberException;

import java.util.*;

public class NumberInput {
	
	 Set<Integer> numbers;
	private static Scanner scanner=new Scanner(System.in);

	public NumberInput(){
		this.numbers=new HashSet<>();
	}
	

	private int readInt(String msg)
	{
		int num=0;
		boolean invalid=true;
		do {
			System.out.println(msg);
			try
			{
				num=scanner.nextInt();
				try
				{
					if(correctNumber(num))
						invalid=false;
				}
				catch (NumberOutOfRangeException e)
				{
					System.out.println(e);
				}
			}
			catch (InputMismatchException e) {
				System.out.println("This not a number,try again\n");
			}
		}while(invalid);
		return num;
	}

	public void readNums()
	{
		int num=0;
		String msg="Please give me the ";
		boolean contained=false;
		for(int i=1;i<=5;++i)
		{
			do {
				try {
					if (i == 1)
						num = this.readInt(msg + i+"st number: ");
					else if (i == 2)
						num = this.readInt(msg + i+"nd number: ");
					else if (i == 3)
						num = this.readInt(msg + i+"rd number: ");
					else
						num = this.readInt(msg + i+"th number: ");
					if(isContained(num))
						contained=true;
					else
					{
						this.numbers.add(num);
						contained=false;
					}
				}
				catch (SameNumberException e)
				{
					System.out.println(e.getMessage());
				}
			}while(contained);

		}
		//return this.numbers;
	}

	public Set<Integer> getNumbers() {
		return numbers;
	}

	private boolean correctNumber(int number) throws NumberOutOfRangeException {
		if((number>0) && (91>number))
			return true;
		else {
			throw new NumberOutOfRangeException("The number is not in [1,90] range - " + number);
		}
	}

	private boolean isContained(int number) throws SameNumberException {
		if(this.getNumbers().contains(number))
		{
			return true;
		}
		else
		{
			throw new SameNumberException("The is number is repeated alrready - "+number);
		}
	}

	public void listingNumbers()
	{
		int i=1;
		for(int actual : this.getNumbers())
		{
			System.out.println(i+" --> "+actual);
		}
	}



	public void close()
	{
		this.scanner.close();
	}
}
