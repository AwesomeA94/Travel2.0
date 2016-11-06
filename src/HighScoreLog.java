
public class HighScoreLog extends Travel2{
	//displays the users winning details
	
		
		public static void userStats() {
			String nameText = Name.getText();
			if(Name.getText().contentEquals("Type Your Name")) 
				nameText = "Winner";
			
			String moneyText = Money.getText();
			String timeText = Time.getText();
			String distText = Distance.getText();
			System.out.println(nameText + "\t" + timeText + "\t"
					+ moneyText + "\t" + distText);
		}
			
		public static void main(String[] args) {
			// TODO Auto-generated method stub
		}

	}




