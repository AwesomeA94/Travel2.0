//The scene class where the scenes will be displayed onto the text box area 
//after a scene is shown in the text box, the method will also check whether the user
//still has enough money and time to keep playing
import java.util.*;

public class Scen extends Travel2 {
	
	public static void Start(int opt)
	{	
		switch (opt){
		case 1: 
			Scene.setText("You're at home and you get a phone call from the hospital."
					+ "\nYour only cousin is in labor. Your mission, should you choose"
					+ "\nto accept, is to see that childs birth.\n\n");
			break;
		case 2:
			Scene.setText("In the city of Townsville, there is a hurricane heading towards\n"
					+ "the city. You need to make it to the shelter before everything\nyou "
					+ "know ceases to exist.\n\n");
			break;
		case 3:
			Scene.setText("You thought your week was over and partied so hard that you\n passed"
					+ " out.You wake up the next day, traveling back in\n time to realize"
					+ " you're late to work. You have to get to class on time\n"
					+ " because Professor Zhang does not like waiting.\n\n");
		}
	}
	
	public static void Bus()
	{
		double rate = 2.5;
		char[] cases = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};
		int[] prob =   {7,   15,   8,   6,   8,   2,   8,  15,   9,   9,  13};
		char opt = Randomizer.probability(cases, prob);
		
		switch (opt)
		{
			case 'A': 
				setParam(time-20,money-0,dist-0);
				Scene.append("You just missed the bus because you were talking to that cute\ngirl."
						+ " At least you got here number. ;-)\n\n");
				break;
			case 'B':
				setParam(time-20,money-rate,dist-.8);
				Scene.append("While riding the bus, you got stuck in traffic.\n\n");
				break;
			case 'C':
				setParam(time-30,money-rate,dist-.8);
				Scene.append("As you were riding the bus, the bus driver had to pull over"
						+ "\nbecause a pregnant woman gave birth to triplets!\n\n");
				break;
			case 'D':
				setParam(time-10,money-rate,dist-.4);
				Scene.append("While riding the bus, you got into a fight with an old man."
						+ "\nAfter you got beat up, you were also kicked off the bus.\n\n");
				break;
			case 'E':
				setParam(time-20,money-rate-15,dist-.8);
				Scene.append("While riding the bus, an armed assailant swiped cash from\neveryone.\n\n");
				break;
			case 'F': 
				setParam(time-9000,money-9000,dist-9000);
				Scene.append("Your bus was involved in an accident with two semi trucks."
						+ "\nYou've become forever incapacitated.\n\n");
				break;
			case 'G':
				setParam(time-20,money-rate,dist-3);
				Scene.append("The bus you were on had an explosive which would detonate if"
						+ "\nthe bus went below 60 mph. After 20 minutes, SWAT diffused\nthe"
						+ " bomb and everyone got off the bus safely.\n\n");
				break;
			case 'H':
				setParam(time-10,money-rate-10,dist-.5);
				Scene.append("You were hungry so you got off the bus early to get a bite\nto eat.\n\n");
				break;
			case 'I':
				setParam(time-15,money-money,dist-1);
				Scene.append("You forgot your wallet on the bus.\n\n");
				break;
			case 'J':
				setParam(time-15,money+10,dist-.8);
				Scene.append("You found $10 wedged inbetween the seats.\n\n");
				break;
			case 'K':
				setParam(time-20,money-rate,dist-1.5);
				Scene.append("You got off 10 stops away.\n\n");				
		}
		Status.statusCheck();
	}
	
	
	 public static void Walk() {
		 char[] cases = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'};
		 int [] prob=   {10,   8,   9,   13,  7,   10, 10,   9,   6,  13,   5};
	    
		 char opt = Randomizer.probability (cases, prob);
	   	 	
		 switch (opt) {
		 case 'A':
			 Scene.append("Took a brisk walk. \n\n");
			 setParam(time-10,money-0,dist-.5);
			 break;  
		 case 'B':
			 Scene.append("You were walking down the street and suddenly got robbed\nby an "
			 		+ "old lady. \n\n");   	
			 setParam(time-10,money-25,dist-.7);
			 break;
		 case 'C':
			 Scene.append("You got hungry along the way and bought a hot dog for $3. \n\n");
			 setParam(time-10,money-3,dist-.5);
			 break;
		 case 'D':
			 Scene.append("Along the way you gave $10 to a homeless man. \n\n");
			 setParam(time-12,money-10,dist-.8);
			 break;
		 case 'E':
			 Scene.append("You took a short cut through a park and saved some time. \n\n");
	         setParam(time-7,money-0,dist-1);
	         break;
	     case 'F':    	 	 
	    	 Scene.append("Lucky you!!! Along the way you found ten dollars on the floor! \n\n");
	    	 setParam(time-6,money+10,dist-.7);
	    	 break;
	     case 'G':
	    	 Scene.append("Over an argument, you got into a fight with a drunk hobo. \n\n");
	         setParam(time-20,money-0,dist-.5);
	         break;
	     case 'H':
	    	 Scene.append("You took a very long bathroom break. \n\n");
	         setParam(time-15,money-0,dist-.4);
	         break;
	     case 'I':
	    	 Scene.append("You bought an energy drink for $5 and decided to sprint\nfor a bit. \n\n"); 
	    	 setParam(time-5,money-5,dist-1.2);
	    	 break;
	     case 'J':
	    	 Scene.append("You turn a corner and find that a parade blocks your way. \n\n");
	    	 setParam(time-20,money-0,dist-.7);
	    	 break;
	     case 'K':
	    	 Scene.append("By some unfortunate event your leg is broken,\nyour cellphone is "
	    	 		+ "out of battery and no one is\naround to hear or help you. \n\n");
	    	 setParam(time-1000,money-1000,dist-1000);
	    	 break;	
		 }
		 Status.statusCheck();
	 }
	
	 public static void Cab()
		{
		
		 double rate= 14.50;
		
		 char [] cases={'A','B','C','D','E','F','G','H','I','J','K'};
		
		 int [] prob=  {20,  5,  10, 5,  10, 5,  10, 10, 10 ,5, 10};
		
		 
		char opt=Randomizer.probability(cases, prob);
			switch (opt)
			{
			case 'A': 			
				Scene.append("You spent about a good half hour trying to catch a taxi . . . . . . . . \nand failed.\n\n");
				setParam(time-30, money-0, dist-0);
				break;
			case 'B':			
				Scene.append("You're cab hit a pot hole and got a flat tire\n\n");
				setParam(time-5,money-rate-10,dist-.10);
				break;
			case 'C': 			
				Scene.append("The cab driver was distracted wooing at some hot girls and\ncrashed.\n\n");
				setParam(time-30,  money-rate,dist-1);
				break;
			case 'D':
				
				Scene.append("In a rush, you get in a cab that looks like a cab but"
						+ " is actually\na prop for a taxi parade.\n\n");
				setParam(time-30, money-0, dist+.25);
				break;
			case 'E': 		
				
				
				Scene.append("You get on the cab and drive a couple blocks up to get lunch.\n\n");
				setParam(time-20, money-rate-6, dist-.50);
				break;
			case 'F':
				
				Scene.append("You're in the cab and you get stuck in traffic.\n\n");
				setParam(time-40, money-rate, dist- .70);
				break;
			case 'G': 					
				Scene.append("Your cab driver fights with the truck driver who's blocking\nthe way."
						+ " You sneak out without paying.\n\n");
				setParam(time-25, money-0,dist-.30);
				break;
			case 'H':
				
				Scene.append("You approach a cab but someone pushes you out of the way and"
						+ "\ntakes it from you!\n\n");
				setParam(time-10,money-0,dist-0);
				break;
			case 'I':				
				Scene.append("You get on the cab to find out there was $20 squished in\nbetween"
						+ "the seats.\n\n ");
				setParam(time-30, money-rate+20, dist-.9);
				break;
			case 'J':
				
				Scene.append("Your cab driver's pet snake came out of the trunk and bit right\non"
						+ " your neck. Within seconds the venom causes cardiac arrest\nand"
						+ " you don't survive.\n\n");
				setParam(time-10000, money-10000,dist-0);
				break;
			case 'K': 		
							
				Scene.append("The cab driver gets pulled over by the cops for speeding.\n\n");
				setParam(time-30,money-rate,dist-1.3);
				break;
			
			}
			Status.statusCheck();
		}

}
