package RoShamBo;

public class Lizard extends Choice
{
	public Lizard() 
	{
		displayName = "Lizard";
	}

	@Override
	public int didWin(Choice c) throws IllegalArgumentException 
	{
		if(c instanceof Lizard) 
		{
			return 0;
		}
		else if(c instanceof Rock)
		{
			return -1;
		}
		else if(c instanceof Spock)
		{
			return 1;
		}
		else if(c instanceof Paper)
		{
			return 1;
		}
		else if(c instanceof Scissors)
		{
			return -1;
		}
		throw new IllegalArgumentException();
					
	}

}
