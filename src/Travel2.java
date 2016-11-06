//Where the GUI comes from
import java.awt.*;
import java.awt.event.*;
import java.text.DecimalFormat;

import javax.swing.*;
import javax.swing.border.*;


public class Travel2 extends JFrame {
	
	public static int time;       //creates variables to hold values
	public static double money;  // for time, money and distance
	public static double dist;
	
	public static JTextArea Scene; //creates text box area to show scenarios
	private JPanel Options;
	public static JTextField Time;  //to show the values of time, money and distance
	public static JTextField Money;
	public static JTextField Distance;
	public static JTextField Name;   //Text Box where User will input their name 
	
	
	public static JButton Bus; //creates four buttons
	public static JButton Walk;
	public static JButton Cab;
	public static JButton Start;
	
	
	Scen scenario;
	
	public Travel2()  //method that calls the method to create the GUI
	{
		createGame();
	}
	//updates values for time, money, and distance
	public static void setParam(int t, double m, double d) {  //sets how the Text will be displayed in the Text Fields
		time = t;
		money = m;
		dist = d;
	
		Time.setText("Time: "+Integer.toString(time)+ " min");
		Money.setText("Money: $"+String.format("%.2f",money));
		Distance.setText("Distance: "+ String.format("%.2f",dist)+" miles");
	}
	
	//sets the defaults for the JFrame
	private void createGame()
	{
		
		Container ScreenContents=getContentPane();
		ScreenContents.setLayout( null );
		
		//Option Panel which will hold the buttons and the Time, Money and Distance and Name
	    Options=new JPanel();
	    Options.setBounds(20,20,600,300);
	    Options.setBorder(null);
	    Options.setLayout(null);
	    ScreenContents.add(Options);
		
		//create a text box area in the Window
		Scene=new JTextArea(10,11);
		Scene.setForeground(Color.BLUE);
		Scene.setEditable(false);
		Scene.setFont(new Font("Comic Sans MS",Font.ITALIC, 13));
		Scene.setCaretColor(Color.BLUE);
		Scene.setBorder(new LineBorder(Color.BLUE));
	    ScreenContents.add(Scene);
	  
	
	    
	    //sets Time TextField
	    Time=new JTextField();
	    Time.setBounds(440,10,135,42);
	    Time.setText("Time");
	    Time.setHorizontalAlignment( JTextField.CENTER );
	    Time.setEditable(false);
	    Time.setBorder(new LineBorder(Color.CYAN));
	    Font font= new Font("Verdana", Font.BOLD,14);
	    Time.setFont(font);
	    Options.add(Time);
	    
	    //sets Name Text Field
	    Name=new JTextField();
	    Name.setBounds(440,250,125,20);
	    Name.setVisible(true);
		Name.setEditable(true);
		Name.setBorder(new LineBorder(Color.RED));
	    Name.setHorizontalAlignment(JTextField.CENTER );
	    Name.setText("Type Your Name");
	    Options.add(Name);
	   
	    //Sets Money Text Field
	    Money=new JTextField();
	    Money.setBounds(440,60,135,42);
	    Money.setText("Money");
	    Money.setHorizontalAlignment(JTextField.CENTER);
	    Money.setEditable(false);
	    Money.setBorder(new LineBorder(Color.GREEN));
	    font= new Font("Comic Sans MS", Font.BOLD,14);
	    Money.setFont(font);
	    Options.add(Money);
	    
	    //Sets Distance Text field
	    Distance=new JTextField();
	    Distance.setBounds(440,110,135,42);
	    Distance.setText("Distance");
	    Distance.setHorizontalAlignment(JTextField.CENTER);
	    Distance.setEditable(false);
	    Distance.setBorder(new LineBorder(Color.MAGENTA));
	    font= new Font("Comic Sans MS", Font.BOLD,12);
	    Distance.setFont(font);
	    Options.add(Distance);
	    
	    
	    
	    
	    //sets up Buttons with Bus, Cab, Walk, and Start
	    Bus=new JButton();
	    Bus.setBounds(0,250,95,24);
	    Bus.setText("Take Bus");
	    font=new Font("Comic Sans MS", Font.BOLD,12);
	    Bus.setEnabled(false);
	    Bus.setFont(font);
	    Options.add(Bus);
	    Bus.addActionListener( //each button calls an Action Listener which describes what the button will do
	    		new ActionListener()
	    		{
	    			public void actionPerformed( ActionEvent pressed )
	                {
	                	BusAction( pressed );
	                }
	    		});
	   
	    
	   Walk=new JButton();
	   Walk.setBounds(130,250,95,24);
	   Walk.setEnabled(false);
	   Walk.setText("Walk it");
	   Options.add(Walk);
	   Walk.addActionListener(
	    		new ActionListener()
	    		{
	    			public void actionPerformed( ActionEvent pressed )
	                {
	                	WalkAction( pressed );
	                }
	    		});
	 
	   
	   Cab=new JButton();
	   Cab.setBounds(260,250,130,24);
	   Cab.setText("Take the cab");
	   Cab.setEnabled(false);
	   Options.add(Cab);
	   Cab.addActionListener(
	    		new ActionListener()
	    		{
	    			public void actionPerformed( ActionEvent pressed )
	                {
	                	CabAction( pressed );
	                }
	    		});
	   Start=new JButton();
	   Start.setBounds(440, 190,130,24);
	   Start.setText("Start!");
	   Options.add(Start);
	   Start.addActionListener(
	    		new ActionListener()
	    		{
	    			public void actionPerformed( ActionEvent pressed )
	                {
	                	StartAction( pressed );
	                }
	    		});
	   
	  //scroll bar created to scroll through the scenarios outputted on the text box area
       JScrollPane scrollBar = new JScrollPane(Scene,
           JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
           JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
       JFrame frame = new JFrame("AddScrollBarToJFrame");
       frame.add(scrollBar);
       frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(450, 250);
       frame.setVisible(true);
       frame.hide();
       
       setTitle( "Travel Game!" ); // set title bar string
	   setSize( 650, 370 );     // set window size
	   setVisible( true );      // display window
	   Scene.append("Travel Game! The point of this game is to go from Point A to Point B, "
	   		+ "\nof course we'll rename the Points in the Game, Type in your name &\nPress Start to Begin!");
       ScreenContents.add(scrollBar);
	   scrollBar.setVerticalScrollBarPolicy ( ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS );
	   scrollBar.setHorizontalScrollBarPolicy ( ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER );	 
	}
	
	 private void BusAction( ActionEvent event ) //once Bus button is pushed, 
	   {                                        //we call a scenario to be shown on the text box area via
		 scenario.Bus();                                 // our other class (Scen)		 
	   } 
	 private void WalkAction( ActionEvent event )
	   {		                          
	      scenario.Walk();
	   } 
	 private void CabAction( ActionEvent event )
	   {
		  
	      scenario.Cab();
	   } 
	 private void StartAction( ActionEvent event )
	   {
		 int randT = Randomizer.randInt(90,120); // Once start button is pressed
		 int randM = Randomizer.randInt(40,70); //we enable the other buttons and disable the start button
		 int randD = Randomizer.randInt(5,7); //as well as giving user random values of time, distance and money

		 setParam(randT, randM, randD);
		 Scene.setText("");    //clears the Text box area
		 
		 scenario.Start(Randomizer.randInt(1,3)); //picks a random Start scenario
		 
		Start.setEnabled(false);
		Bus.setEnabled(true);
		Cab.setEnabled(true);
		Walk.setEnabled(true);
		Scene.setFont(new Font("Comic Sans MS",Font.ITALIC, 14));
		Name.setEditable(false);
	   } 
	
	
}

