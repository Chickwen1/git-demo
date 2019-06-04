package RoShamBo;

public class Scissors extends Choice
{
	public Scissors() 
	{
		displayName = "Scissors";
	}

	@Override
	public int didWin(Choice c) throws IllegalArgumentException 
	{
		if(c instanceof Lizard) 
		{
			return 1;
		}
		else if(c instanceof Rock)
		{
			return -1;
		}
		else if(c instanceof Spock)
		{
			return -1;
		}
		else if(c instanceof Paper)
		{
			return 1;
		}
		else if(c instanceof Scissors)
		{
			return 0;
		}
			
		throw new IllegalArgumentException();
					
	}
}
