import java.util.*;

//1.Activity of guesser

class Guesser
{
	//has part
	
	int guessNum;
	
	//does part
	
	int guessNum()
	{
	
		//asking guesser to guess number
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Guesser kindly guess the number");
		
		//Storing guessed number in variable
		
		guessNum=scan.nextInt();
		 return guessNum;
	}
	
	
}

//2.Activity of player

class Player
{
	// has part
	
	int guessNum;
	
	//does part
	
	int guessNum()
	{
		//Asking player to guess number and store in variable
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Player kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}

//3.Activity of umpire

class Umpire
{
	//has part
	
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	//does part
	
	void collectNumFromGuesser ()
	{
		//invoking values from guesser class by creating objects
		
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	//invoking values from player class
	
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	
	//Umpire compares guesser value with player values
	
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser== numFromPlayer3)
			{
				System.out.println("All Players won the game ");
			}
			else if(numFromGuesser==numFromPlayer2)
			{
				System.out.println("Player 1 & 2 won the game");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & 3 won the game");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & 3 won the game");
			}
			else
		{
			System.out.println("Player 2 won the game");
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again !");
		}
	}
}

public class Guessergame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Umpire u=new Umpire();
		
		//calling methods by umpire
		
		u.collectNumFromGuesser();
		u.collectNumFromPlayers();
		u.compare();
		
		
		
		

	}

}
