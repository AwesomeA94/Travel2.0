//Class checks the status of the player
public class Status extends Travel2{

	public static  void statusCheck() {
		//checks if you lose if time or money is less than 0
		if(time < 0 || money < 0) {
			youLose();
		}

		//checks if you win if the distance is less than or equal to 0
		else if (dist <= 0) {
			HighScoreLog.userStats();
			youWin();
		}
        
		//checks if user can afford the bus option and disables it
		else if (money < 2.50) {
			Bus.setEnabled(false);
			Cab.setEnabled(false);
		}

		else if (money < 14.50) {
			Cab.setEnabled(false);
		}
	}

	public static void youLose() {
		Scene.append("\n\n-----------------------OH NO YOU LOST!---------------------\n");
		Bus.setEnabled(false);
		Cab.setEnabled(false);
		Walk.setEnabled(false);
		Start.setEnabled(true);
       // Name.setText("Type Your Name");
        Name.setEditable(true);
		Scene.append("\n\nIf you want to play again, press 'Start'\nor close the window to exit.");

	}

	//displays winning option and disables other options
	public static void youWin() {
		Scene.append("\n\n********** YOU WIN! CLAIM YOUR $1 **********");
		Scene.append("\n\nIf you want to play again, press 'Start'.");

		Bus.setEnabled(false);
		Cab.setEnabled(false);
		Walk.setEnabled(false);
		Start.setEnabled(true);
		
		Name.setVisible(true);
		Name.setEditable(true);
		//Name.setText("Type Your Name");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

