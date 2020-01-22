package mageswaran.unit4;

import java.awt.Color;
import hsa_new.Console;

/**
 * Gr11FactsAndCuriouculminatingFinalProject.java
 * This program is a trivia/questionnaire game that allows users to be tested on 
 * various topics and provides user with additional information to learn from
 * January 9, 2020
 * @author Mathen M
 */

public class Gr11FactsAndCuriouculminatingFinalProject {
	static Console c = new Console();
	/**entry point to this program
	 * @param args unused
	 */
	
	public static void main(String[] args) {
/**
 * Greeting and providing user with info
 */
		c.println("Welcome to Facts & Curious, your very own learning world to drift through! What is your name?");
		String name = c.readLine();
		c.println("");
		c.println("Hey " + name + "! You can chose from a variety of fun and topics and questioning methods to quiz yourself and learn from");
		String option = null;
//Put in loop in case user wants to retry a test or try other topics
		c.println("Which of these would you like to try? Press 0) to exit");
		c.println(" 1) Space 2) Biology 3) True or False");
		c.println(" 4) Mathematics 5) Random 6) Tim Hortons");
		c.println(" 7) Final Test");
		 option = c.readLine();
		while (option != "0");{
/**
 * Different pathways depending on which questionnaire the user picks
 */
		if (option == "1") {
			Space();
			c.println("Want to try something else?");
			c.println("Which of these would you like to try? Press 0) to exit");
			c.println(" 1) Space 2) Biology 3) True or False");
			c.println(" 4) Mathematics 5) Random 6) Tim Hortons");
			c.println(" 7) Final Test");
			 option = c.readLine();
		}
		
		else if (option == "2") {
			Biology();
			c.println("Want to try something else?");
			c.println("Which of these would you like to try? Press 0) to exit");
			c.println(" 1) Space 2) Biology 3) True or False");
			c.println(" 4) Mathematics 5) Random 6) Tim Hortons");
			c.println(" 7) Final Test");
			 option = c.readLine();		}
			
		else if (option == "3") {
			Random();
			c.println("Want to try something else?");
			c.println("Which of these would you like to try? Press 0) to exit");
			c.println(" 1) Space 2) Biology 3) True or False");
			c.println(" 4) Mathematics 5) Random 6) Tim Hortons");
			c.println(" 7) Final Test");
			 option = c.readLine();		}
		
		else if (option == "4") {
			TrueOrFalse();
			c.println("Want to try something else?");
			c.println("Which of these would you like to try? Press 0) to exit");
			c.println(" 1) Space 2) Biology 3) True or False");
			c.println(" 4) Mathematics 5) Random 6) Tim Hortons");
			c.println(" 7) Final Test");
			 option = c.readLine();		}
		
		else if (option == "5") {
			TimHortons();
			c.println("Want to try something else?");
			c.println("Which of these would you like to try? Press 0) to exit");
			c.println(" 1) Space 2) Biology 3) True or False");
			c.println(" 4) Mathematics 5) Random 6) Tim Hortons");
			c.println(" 7) Final Test");
			 option = c.readLine();		}
		
		else if (option == "6") {
			FinalTester();
			c.println("Want to try something else?");
			c.println("Which of these would you like to try? Press 0) to exit");
			c.println(" 1) Space 2) Biology 3) True or False");
			c.println(" 4) Mathematics 5) Random 6) Tim Hortons");
			c.println(" 7) Final Test");
			 option = c.readLine();		}

		else if (option == "7") {
			FinalTester();
			c.println("Want to try something else?");
			c.println("Which of these would you like to try? Press 0) to exit");
			c.println(" 1) Space 2) Biology 3) True or False");
			c.println(" 4) Mathematics 5) Random 6) Tim Hortons");
			c.println(" 7) Final Test");
			 option = c.readLine();		}
	}
		
			c.println("Thanks for playing Facts & Furious. Hope you learned something!");
}
	
	
/**
 * This method is used to run a test on Space
 */
	public static void Space() {
 //Array filled with questions
		String [] spaceQues = {"Fill in the blank: \"A lightyear is ______________.\"", 
				"Fill in the blank: \"A black hole’s gravity is so strong that it is able to pull in_______.\"", 
				"In which medium does light travel the fastest?", 
				"What happens to tears in space when you cry?", 
				"What is the Ursa Major constellation also known as?", 
				"Fill in the blanks. \"There are more _______ on Earth than stars in the Milky Way galaxy.\"", 
				"How differently do astronauts grow/shrink once they enter space?", 
				"How does a black hole start to form?", 
				"What percent of our solar system’s mass is our sun?", 
				"If two pieces of the same metal touch in space, what happens to it?"};

//Array filled with options for user to pick from
		String [][] spaceOptions = {{"a time period referring to the passing of asteroids and comets.\"",  
				"b) a term referring to the amount of light produced throughout Earth in 1 year.\"",
				"c) a unit of astronomical distance equivalent to the distance that light travels in one year.\"",
				"d) a constellation near the Helix Nebula.\""}, 
				
				{"a) Sound", 
				"b) Light", 
				"c) Dark matter", 
				"d) All of the above"}, 
				
				{"a) Air", 
				"b) Glass", 
				"c) Water", 
				"d) None (vacuum)"},
				
				{"a) It floats", 
				"b) It dissipates", 
				"c) It sticks to your face", 
				"d) It drops down"},
		
				{"a) Ursa Minor", 
				"b) Mama bear", 
				"c) Corona Borealis", 
				"d) The Big Dipper"},
				
				{"a) Trees", 
				"b) Lakes", 
				"c) Fingers & toes", 
				"d) Sand grains"},
				
				{"a) Shrink 2 inches", 
				"b) Stay the same", 
				"c) Grow 2 inches", 
				"d) Lose 5 pounds of weight"},
				
				{"a) When a giant star explodes as supernova", 
				"b) When a yellow dwarf star dies", 
				"c) When a white hole opens up in a mirror universe", 
				"d) When 2 planets collide"},
				
				{"a) 25%", 
				"b) 50%", 
				"c) 80%", 
				"d) 99%"},
				
				{"a) They will bond and be permanently stuck together", 
				"b) They will repel", 
				"c) They will form a temporary bond until they reach an area with strong", 
				"d) Nothing. They stay the same"},};

//Array filled with right answer that will be used to compare with and check users answer
		String [] spaceRight = {"c", "d", "d", "c", "d", "a", "c", "a", "d", "a"};
//Array filled with explanations for user to learn from
		String [] spaceExplain = {"\"A lightyear is a unit of astronomical distance equivalent to the distance that light travels in one year.\"", 
				"A black hole’s gravity is so powerful that it is able to pull in everything within reach, even light!", 
				"In empty space, the wave does not dissipate (grow smaller) no matter how far it travels, because the wave is not interacting with anything else.", 
				"Tears form a ball and stick to your face due to the lack of gravity.", 
				"In Africa, the seven stars were sometimes seen as a drinking gourd, which is believed to be the origin of the name the Big Dipper.", 
				"With more than three trillion -- yup, trillion, trees on Earth, they outnumber the 100 to 400 billion stars in the Milky Way by quite a big margin.", 
				"When the spine is not exposed to the pull of Earth's gravity, the vertebra can expand and relax, allowing astronauts to actually grow taller.", 
				"Black hole form when massive Red Giants(which is a giant star of low or intermediate mass) dies and collapses in upon itself. The collapse causes a supernova "
				+ "or an exploding star that blasts part of the star into space. The formation process for a black hole then begins", 
				"Our star, the sun, is so dense that it accounts for a whopping 99 percent of the mass of our entire solar system. That's what allows it to dominate all of the planets gravitationally.", 
				"This amazing effect is called cold welding. It happens because the atoms of the individual pieces of metal have no way of knowing that they are different pieces of metal, so the lumps join "
				+ "together. This wouldn't happen on Earth because there is air and water separating the pieces.", };
		int correctCounter = 0;

		c.println("");
		for(int i = 10; i<10; i++) {
			c.println(spaceQues[i]);
			for(int j = 1; j<4; j++) {
			c.println(spaceOptions [i][j]);
			}
			String answer = c.readLine();
//Output if user gets right answer
		if (answer == spaceRight[i]) {
			c.setTextBackgroundColor(Color.GREEN);
			c.clear();
			c.println(spaceQues[i]);
			for(int j = 1; j<4; j++) {
				c.println(spaceOptions [i][j]);
			c.println("That's correct!");
//Try and catch on thread due to data/coding errors during program execution
			try {
			Thread.sleep(2000);
			} catch (InterruptedException e) {
					e.printStackTrace();}
			c.setTextBackgroundColor(Color.WHITE);
			c.clear();
			c.println(spaceExplain[i]);
			correctCounter = + 1;
		}
		}
//Output if user gets wrong answer
		else {
			c.println("Oops sorry that is incorrect. The right answer is " + spaceRight[i] + "!");
			c.println(spaceExplain[i]);
		}
		}
//Output final mark for user to see how they did
		c.println("Good work! Your final mark for this topic is " + Average(correctCounter) + "%");
	}
	
/**
 * This method is used to run a test on Biology
 */
	public static void Biology() {
//Array filled with questions
		String [] bioQues = {"Consider this statement. \"Natural Selection is a random process.\"", 
				"Fill in the blank. \"There are more cells of _______ in your body than there are human cells.\"", 
				"Approximately how many different scents can a human’s nose detect?",
				"How many muscles does it take to smile and frown?", 
				"Fill in the blank. \"You can actually die from a broken heart. It’s a muscle condition called ___________.\"", 
				"Fill in the blanks. \"Fingers prune underwater not because of them absorbing the water or washing away the "
				+ "oil, but because of an evolutionary trait caused by the brain to enhance the _____ of your underwater.\"", 
				"What kingdom to bacteria belong in?", 
				"What does DNA stand for?", 
				"Who was Charles Darwin?", 
				"Fill in the black. \"Structures inside a cell are called _________.\""};
//Array filled with options for user to pick from
		String [][] bioOptions = {{"a) Depends", 
			"b) Natural Selection is not a process", 
			"c) False", 
			"d) True"}, 
			
			{"a) Blood", 
			"b) Bacteria", 
			"c) Brain", 
			"d) Bromide"},
			
			{"a) 1000", 
			"b) 10 thousand", 
			"c) 100 million", 
			"d) 100 trillion"},
	
			{"a) 17 to smile & 43 to frown", 
			"b) 20 to smile & 20 to frown", 
			"c) 43 to smile & 43 to frown", 
			"d) 60 to smile and frown"},
			
			{"a) Sad Phase Syndrome", 
			"b) No Beat End", 
			"c) Low Hit Effect", 
			"d) Broken Heart Syndrome"},
			
			{"a) Grip", 
			"b) Speed", 
			"c) Strength", 
			"d) Sense of feel"},
			
			{"a) Protoctists", 
			"b) Prokaryotes", 
			"c) Fungi", 
			"d) Plantae"},
			
			{"a) Deoxyribonucleic Acid", 
			"b) Deoxynucleic Acid", 
			"c) Denucleated", 
			"d) Do Not Attempt"},
			
			{"a) He taught painting", 
			"b) He was the scientist who uncovered the Theory of Evolution", 
			"c) He was the researcher who founded insulin", 
			"d) He was a famous athlete"},
			
			{"a) Cytoskeletons", 
			"b) Functions", 
			"c) Helixes", 
			"d) Organelles"}};
//Array filled with right answer that will be used to compare with and check users answer

		String [] bioRight = {"c", "b", "d", "a", "d", "a", "a", "a", "b", "d"};
//Array filled with explanations for user to learn from
		String [] bioExplain = {"False! The genetic variation on which natural selection acts may occur randomly, but natural selection itself is not "
				+ "random at all. In case you aren’t completely sure, natural selection is the process by which organisms that are better suited to their "
				+ "environment than others produce more offspring.", 
				"There are more cells of bacteria in your body than there are human cells!", 
				"The human nose can detect one trillion different odours.", 
				"It takes 17 muscles to smile and 43 to frown.", 
				"Broken heart syndrome is a group of symptoms similar to those of a heart attack, occurring in response to a physical or emotional stress.", 
				"\"Fingers prune underwater not because of them absorbing the water or washing away the oil, but because of an evolutionary trait caused by the "
				+ "brain to enhance the grip of your underwater.\"", 
				"Prokaryotes are single-celled organisms without a nucleus.", 
				"DNA, or deoxyribonucleic acid, is the hereditary material in humans and almost all other organisms.", 
				"Charles Robert Darwin was an English naturalist, geologist and biologist, best known for his contributions to the science of evolution. His "
				+ "proposition that all species of life have descended over time from common ancestors is now widely accepted, and considered a foundational concept in science.", 
				"Just as the body has organs, the cell has organelles. Like organs, they are biologically active, not just inert, as the cytoplasm is.", };
		int correctCounter = 0;

		c.println("");
		for(int i = 10; i<10; i++) {
			c.println(bioQues[i]);
			for(int j = 1; j<4; j++) {
			c.println(bioOptions [i][j]);
			}
			String answer = c.readLine();
//Output if user gets right answer
		if (answer == bioRight[i]) {
			c.setTextBackgroundColor(Color.GREEN);
			c.clear();
			c.println(bioQues[i]);
			for(int j = 1; j<4; j++) {
				c.println(bioOptions [i][j]);
			c.println("That's correct!");
//Try and catch on thread due to data/coding errors during program execution
			try {
				Thread.sleep(2000);
				} catch (InterruptedException e) {
						e.printStackTrace();}
			c.setTextBackgroundColor(Color.WHITE);
			c.clear();
			c.println(bioExplain[i]);
			correctCounter = + 1;
		}
		}
//Output if user gets wrong answer
		else {
			c.println("Oops sorry that is incorrect. The right answer is " + bioRight[i] + "!");
			c.println(bioExplain[i]);
		}
		}
//Output final mark for user to see how they did
		c.println("Good work! Your final mark for this topic is " + Average(correctCounter) + "%");
	}

/**
 * This method is used to run a test on Random topics
 */
	public static void Random() {
 //Array filled with questions
		String [] randomQues = {"What rare metal resides within your body?", 
				"What does the AGPAR score stand for?", 
				"What was the big fight about that ended Ross’ and Rachel’s relationship in the famous show Friends?",
				"What was Australia’s former name?", 
				"What was the first name for the hashtag symbol (#)?", 
				"What is the national animal of Scotland?", 
				"Which natural food never spoils?", 
				"What was the name of the other NBA team that also resided in Canada?", 
				"In the Fresh Prince starring Will Smith, which one of these neighborhoods does he live in?", 
				"When was Canada’s independence first declared?"};
//Array filled with options for user to pick from
		String [][] randomOptions = {{"a) Cerium", 
			"b) Terbium", 
			"c) Gold", 
			"d) Scandium"}, 
			
			{"a) All. Growth. Plus. Aren’t. Rated", 
			"b) America’s. Growth. Per. Area. Raked.", 
			"c) Appearance. Grimace. Pulse. Activity. Respiration.", 
			"d) Athletic. Gain. Physical. Active. Reaction."},
			
			{"a) Ross thought they were on “a break”", 
			"b) Ross was clingy", 
			"c) Rachel cheated on Ross with Mark", 
			"d) Rachel was too focused on her job"},
	
			{"a) New Amsterdam", 
			"b) New Holland", 
			"c) Andorra", 
			"d) New England"},
			
			{"a) Pound sign", 
			"b) Zed mark", 
			"c) Number sign", 
			"d) Octothorp"},
			
			{"a) Unicorn", 
			"b) Rabbit", 
			"c) Turtle", 
			"d) Raven"},
			
			{"a) Cotton Candy", 
			"b) Pomegranate", 
			"c) Honey", 
			"d) Ginger"},
			
			{"a) Vancouver Grizzlies", 
			"b) Alberta Bears", 
			"c) Ottawa Otters", 
			"d) Saskatchewan Embers"},
			
			{"a) Northbridge", 
			"b) Bel-Air", 
			"c) Hidden Hills", 
			"d) Hollywood"},
			
			{"a) June 4, 1867", 
			"b) June 18, 1812", 
			"c) July 4, 1776", 
			"d) July 1, 1867"}};
//Array filled with right answer that will be used to compare with and check users answer
		String [] randomRight = {"c", "c", "a", "b", "d", "a", "c", "a", "b", "d"};
//Array filled with explanations for user to learn from
		String [] randomExplain = {"The average person's body weighing 70 kilograms would contain a total mass of 0.2 milligrams of gold", 
				"Invented by Dr. Virginia Apgar in 1952, it's the common way of ranking a newborn's health (by their Appearance, Pulse, Grimace, Activity, and Respiration).", 
				"Ross thought they were on a break when Rachel said she wanted a break. After getting drunk Ross cheated on Rachel with "
				+ "someone else and this cause their relationship to end ...or did it?", 
				"The Dutch first named the land \"New Holland,\" which is what is was called up until the early 19th century.", 
				"Octothorp or spelled ‘Octothorpe’. The symbol has been \"a pound of weight\" or \"hash\" among other meanings, depending on the region.", 
				"Unicorn symbols and folklore are deeply woven into the cultural fabric of the region. In Stirling Castle of Stirling, Scotland, "
				+ "hangs an elaborate tapestry called \"The Unicorn is Found.", 
				"There is very little water and moisture in its makeup, making honey inhospitable where very few bacteria would survive. In order "
				+ "for something to spoil, something must be living in it long enough. But with honey’s environment and acidity, nothing can stay on long enough for it to spoil.", 
				"The Vancouver Grizzlies were a Canadian professional basketball team based in Vancouver, British Columbia. A few years of unsuccessful franchises led to the "
				+ "relocation of the team to the U.S. to what is now known as the Memphis Grizzlies.", 
				"The Fresh Prince took place in the rich neighborhood of Bel-Air.", 
				"The effective date of the Constitution Act was July 1, 1867.", };
		int correctCounter = 0;

		c.println("");
		for(int i = 10; i<10; i++) {
			c.println(randomQues[i]);
			for(int j = 1; j<4; j++) {
			c.println(randomOptions [i][j]);
			}
			String answer = c.readLine();
//Output if user gets right answer
		if (answer == randomRight[i]) {
			c.setTextBackgroundColor(Color.GREEN);
			c.clear();
			c.println(randomQues[i]);
			for(int j = 1; j<4; j++) {
				c.println(randomOptions [i][j]);
			c.println("That's correct!");
//Try and catch on thread due to data/coding errors during program execution
			try {
				Thread.sleep(2000);
				} catch (InterruptedException e) {
						e.printStackTrace();}
			c.setTextBackgroundColor(Color.WHITE);
			c.clear();
			c.println(randomExplain[i]);
			correctCounter = + 1;
		}
		}
//Output if user gets wrong answer
		else {
			c.println("Oops sorry that is incorrect. The right answer is " + randomRight[i] + "!");
			c.println(randomExplain[i]);
		}
		}
//Output final mark for user to see how they did
		c.println("Good work! Your final mark for this topic is " + Average(correctCounter) + "%");
	}
	
/**
 * This method is used to run a True of False based test
 */
	public static void TrueOrFalse() {
//Array filled with questions
		String [] trueOrFalseQues = {"Tomatoes are fruits. True or False?", 
				"Water is wet. True or False?", 
				"The Statue of Liberty was a gift from France to America. True or False?",
				"If you win a doughnut during ROLL UP THE RIM at Tim Hortons, you’re allowed to "
				+ "exchange it for a muffin instead. True or False?", 
				"Lightning never strikes the same place twice. True or False?", 
				"You cannot smell when you are sleeping. True or False?", 
				"Humans can’t breathe and swallow at the same time. True or False?", 
				"Frozen is the most expensive animated movie ever made. True or False?", 
				"Pluto was named by NASA in 1930. True or False?", 
				"Eating carrots improve your eyesight. True or False?"};
//Array filled with right answer that will be used to compare with and check users answer
		String [] trueOrFalseRight = {"true", "false", "true", "true", "false", "true", "true", "false", "false", "false"};
 //Array filled with explanations for user to learn from
		String [] trueOrFalseExplain = {"True! Tomatoes are botanically defined as fruits because they form from a flower and contain seeds.", 
				"False! Water isn’t wet by itself, but it makes other materials when it sticks to their surface. Water is just a liquid with the "
				+ "property of making other things wet.", 
				"True! It was a gift to America on the 100th anniversary of the Declaration of Independence.", 
				"True! You can redeem a winning doughnut tab for items that aren’t doughnuts, like muffins and cookies.", 
				"False! Lightning is able to strike in the same place a lot. The Empire State Building is recorded to have been struck over 100 times a year.", 
				"True! The olfactory sense shuts down while you’re asleep.", 
				"True! It's because our voice box is lower in the throat than other primates(animal type) (who can do both at once.) On the plus side, "
				+ "this means we can use language as a form of communication. I know you tried this to answer the question! ;)", 
				"False! With a budget of $260 million, Tangled is the most expensive animated movie ever made!", 
				"False! Pluto was named by an 11 year-old Venetia Burney of Oxford, England, who suggested to her grandfather that the new world gets its "
				+ "name from the Roman god of the underworld. NASA wasn’t founded until 1958.", 
				"False! This rumor about carrots was created by British pilots in WWII to prevent enemies from discovering their RADAR technology."};
		int correctCounter = 0;

		c.println("");
		for(int i = 10; i<10; i++) {
			c.println(trueOrFalseQues[i]);
			String answer = c.readLine();
//Output if user gets right answer
		if (answer == trueOrFalseRight[i]) {
			c.setTextBackgroundColor(Color.GREEN);
			c.clear();
			c.println(trueOrFalseRight[i]);
			c.println("That's correct!");
//Try and catch on thread due to data/coding errors during program execution
			try {
				Thread.sleep(2000);
				} catch (InterruptedException e) {
						e.printStackTrace();}
			c.setTextBackgroundColor(Color.WHITE);
			c.clear();
			c.println(trueOrFalseExplain[i]);
			correctCounter = + 1;
		}
//Output if user gets wrong answer
		else {
			c.println("Oops sorry that is incorrect. The right answer is " + trueOrFalseRight[i] + "!");
			c.println(trueOrFalseExplain[i]);
		}
		}
//Output final mark for user to see how they did
		c.println("Good work! Your final mark for this topic is " + Average(correctCounter) + "%");
	}
	
/**
 * This method is used to run a test on Tim Hortons
 */
	public static void TimHortons() {
//Array filled with questions
		String [] timHortonsQues = {"What is the classic name of the classic balled bakery item?", 
				"Before doughnuts, what did Tim Hortons sell?", 
				"What is the technical name of the doughnut’s shape?",
				"What’s in a “double double”?", 
				"Which of these is NOT a doughnut sold at Tim Hortons?", 
				"Who was Tim Horton?", 
				"How many separate times do you have to scan your Tim’s Rewards Card in order to "
				+ "receive a free coffee, tea, or baked good?", 
				"What is a belt B.E.L.T?", 
				"Shawn Mendes goes to a local Tim Hortons to buy a medium iced capp and a doughnut if he has extra money. "
				+ "He didn’t bring anything but change for $3. What can he buy with this?", 
				"What was Tim Horton’s real name?"};
//Array filled with options for user to pick from
		String [][] timHortonsOptions = {{"a) Donut holes", 
			"b) Sweet spheres", 
			"c) Timbits", 
			"d) Cake pops"}, 
			
			{"a) Burgers", 
			"b) Hot Dogs", 
			"c) Cakes", 
			"d) Ice Cream"},
			
			{"a) Round", 
			"b) Spherical", 
			"c) Toroid", 
			"d) Cylinder"},
	
			{"a) 2 milk & 2 sugar", 
			"b) 2 coffees & 2 doughnuts combo", 
			"c) 2 sugar & 2 cream", 
			"d) 2 plain bagels toasted with butter and 2 coffees combo"},
			
			{"a) Vanilla Dip", 
			"b) New York Cream", 
			"c) Dutchie", 
			"d) Sour Creme Glazed"},
			
			{"a) An actor", 
			"b) A politician", 
			"c) A hockey player", 
			"d) A farmer"},
			
			{"a) 10", 
			"b) 9", 
			"c) 8", 
			"d) 7"},
			
			{"a) A BLT(bacon, lettuce, tomato) on bread with scrambled eggs", 
			"b) A breakfast wrap with egg, lettuce, and tomato", 
			"c) A bagel breakfast sandwich with egg, lettuce, and tomato", 
			"d) Something you use to hold up your pants"},
			
			{"a) Only a medium iced capp", 
			"b) Only a donut", 
			"c) Both a medium iced capp and a doughnut", 
			"d) Nothing"},
			
			{"a) Thomas William Horton", 
			"b) Myles Gilbert Horton", 
			"c) Donald Horton Lee", 
			"d) David Gordon Horton"}};

//Array filled with right answer that will be used to compare with and check users answer
		String [] timHortonsRight = {"c", "a", "c", "c", "b", "c", "d", "c", "a", "b"};
//Array filled with explanations for user to learn from
		String [] timHortonsExplain = {"Timbits! Timbits were first introduced in 1976 as a fun, bite-sized, fried-dough ball. The "
				+ "name comes from one of the founders’ and defensive player for the Toronto Maple Leafs, Tim Horton.", 
				"The Maple Leafs star was first more interested in selling burgers than doughnuts. Burgers didn’t sell as well as Horton had "
				+ "hoped, so in the spring of 1964, he opened what we know and love as Tim Hortons.", 
				"Toroid is the technical term that refers to a doughnut’s shape.", 
				"When people order for a double double, they usually refer to a coffee with 2 milk/cream and 2 sugars.", 
				"Boston Cream is a famous doughnut at Tim Hortons, but not New York Cream is not.", 
				"Tim Horton was a defensive hockey player who played for the Toronto Maple Leafs, Pittsburgh Penguins, and the Buffalo Sabres.", 
				"You have to scan your card 7 times to receive a free treat.", 
				"It’s a bagel breakfast! Bagel. Egg. Lettuce. Tomato.", 
				"Shawn Mendes can only buy a medium iced capp which costs $2.99!", 
				"It was Myles Gilbert Horton!"};
		int correctCounter = 0;

		c.println("");
		for(int i = 10; i<10; i++) {
			c.println(timHortonsQues[i]);
			for(int j = 1; j<4; j++) {
			c.println(timHortonsOptions [i][j]);
			}
			String answer = c.readLine();
//Output if user gets right answer
		if (answer == timHortonsRight[i]) {
			c.setTextBackgroundColor(Color.GREEN);
			c.clear();
			c.println(timHortonsQues[i]);
			for(int j = 1; j<4; j++) {
				c.println(timHortonsOptions [i][j]);
			c.println("That's correct!");
//Try and catch on thread due to data/coding errors during program execution
			try {
				Thread.sleep(2000);
				} catch (InterruptedException e) {
						e.printStackTrace();}
			c.setTextBackgroundColor(Color.WHITE);
			c.clear();
			c.println(timHortonsExplain[i]);
			correctCounter = + 1;
		}
		}
//Output if user gets wrong answer
		else {
			c.println("Oops sorry that is incorrect. The right answer is " + timHortonsRight[i] + "!");
			c.println(timHortonsExplain[i]);
		}
		}
//Output final mark for user to see how they did
		c.println("Good work! Your final mark for this topic is " + Average(correctCounter) + "%");
	}
	
/**
 * This method is used to run a test on all the topics mentioned above
 */
	public static void FinalTester() {
//Array filled with questions
		String [] finalTesterQues = {"In the equation E=mc^2, what does E, m, and c stand for?", 
				"Fill in the blank. \"Photosynthesis requires light, chlorophyll, carbon dioxide, and _______.\"", 
				"Fill in the blanks. \"Nephophobia is the fear of ________.\"",
				"Nephophobia is the fear of clouds. Nepho is the Greek word for cloud. People who suffer from nephophobia "
				+ "may experience extreme anxiety from clouds or even photos of clouds.", 
				"What is Tim Horton’s current slogan? “Always ______ .”", 
				"Some of the stars we see in the night sky no longer exists. How is this possible?", 
				"How do antibiotics work?", 
				"What do you call plants that grow back each year on their own?", 
				"Which of these is not a side option in a Timmies Minis Kids’ Packs?", 
				"Stars are born from these giant clouds of gas and dust. What are they?", 
				"Where in the cell is the genetic blueprint of the whole organism found?", 
				"What is the unit used to measure the amount of work done by an acting force?", 
				"Q - Which one of these doughnuts do not belong in the Yeast, Cake, or Filled Donuts categories?", 
				"What does space smell like?", 
				"Fill in the blank. \"Something that causes a disease is called a _______.\"", 
				"What allows a cactus to survive the desert heat?", 
				"Which of these stars is an official Tim Hortons celebrity endorser?"};
//Array filled with true or false questions which will be run on different loop since it doesn't have options for user to pick from
		String [] finalTesterQuesTF = {"Humans only have 5 senses. True or False?", 
				"Twinkies have an infinite shelf life. True or False?", 
				"If you could fold a piece of paper 42 times, it would reach to the moon. True or False?", 
				"True! Henry Ford's Model T (1908) was famous as the first car mass-produced with interchangeable "
				+ "parts on an assembly line."};
//Array filled with options for user to pick from
		String [][] finalTesterOptions = {{"a) Energy equals mass times the speed of sound squared.", 
			"b) Elevation equals mass times the speed of light squared.", 
			"c) Energy equals mass times the speed of light squared.", 
			"d) Energy equals weight times the brightness of light squared."}, 
			
			{"a) Glucose", 
			"b) Water", 
			"c) Oxygen", 
			"d) Nitrogen"},
			
			{"a) Heights", 
			"b) Glass", 
			"c) Textbooks", 
			"d) Clouds"},
	
			{"a) Fresh", 
			"b) Ready", 
			"c) Canadian", 
			"d) Natural"},
			
			{"a) They are inside a giant black hole", 
			"b) They are really comets", 
			"c) Light takes time to travel", 
			"d) All of the stars we see exist currently"},
			
			{"a) They slow down or stop the growth of viruses", 
			"b) They maintain a clean circulation and system throughout your body", 
			"c) They divide the bacteria from the ones that resist treatment and kill them off", 
			"d) They slow down or stop the growth of bacteria"},
			
			{"a) Annuals", 
			"b) Perennials", 
			"c) Day pushers", 
			"d) Evergreens"},
			
			{"a) Apple Slice", 
			"b) SunRype Fun BItes", 
			"c) iögo nanö Yogurt Cup", 
			"d) Mini Potato Wedges"},
			
			{"a) Asteroid belts", 
			"b) Supernovas", 
			"c) Event horizons", 
			"d) Nebulas"},
			
			{"a) Lysosomes", 
			"b) Nucleus", 
			"c) Mitochondria", 
			"d) Wall"},
			
			{"a) Joules", 
			"b) Watts", 
			"c) Horsepower", 
			"d) Mach"}, 
				
			{"a) Apple Fritter", 
			"b) Chocolate Glazed", 
			"c) Boston Cream", 
			"d) Honey Cruller"},
				
			{"a) Diesel fumes", 
			"b) Hot metal", 
			"c) Barbeque", 
			"d) All of the above"},
		
			{"a) Trigger", 
			"b) Germ", 
			"c) Pathogen", 
			"d) Viridium"},
				
			{"a) Natural sunscreen", 
			"b) Water storing capabilities", 
			"c) Feeds on the flesh of animals that come too close to its spines", 
			"d) Heat-proof leaves"},
				
			{"a) Drake (Rapper)", 
			"b) Tristan Thompson (Power Forward for the Cleveland Cavaliers)", 
			"c) Justin Bieber (Singer)", 
			"d) Ryan Reynolds (Actor)"}};
//Array filled with right answer that will be used to compare with and check users answer
		String [] finalTesterRight = {"c", "b", "d", "a", "c", "d", "b", "c", "d", "b", "a", "d", "d", "c", "b", "b"};
//Array filled with right answer that will be used to compare with and check users answer (second loop)
		String [] finalTesterRightTF = {"false,", "false", "true", "true"};
//Array filled with explanations for user to learn from
		String [] finalTesterExplain = {"Energy equals mass times the speed of light squared. On the most basic level, the equation "
				+ "says that energy and mass (matter) are interchangeable. They are different forms of the same thing.", 
				"Like any other organism it requires the basic need of water. The reaction produces glucose and oxygen.", 
				"Nephophobia is the fear of clouds. Nepho is the Greek word for cloud. People who suffer from nephophobia may experience "
				+ "extreme anxiety from clouds or even photos of clouds.", 
				"The current slogan for Tim Hortons is \"Always Fresh.\"", 
				"This might be a tough one for some people to wrap their minds around, but many of the stars that we gaze up at no longer exists. "
				+ "This is because light takes time to travel, and the stars are so far away.", 
				"Antibiotics slow down and stop the growth of bacteria. You need antiviral medication to stop viruses. That's why "
				+ "antibiotics don't work on the common cold, which is a virus.", 
				"A perennial is a plant that grows back for a period of time each year; annuals die and have to be replaced yearly. Some flowers can be "
				+ "either annual or perennial, depending on the climate where they're planted.", 
				"The iögo nanö Yogurt Cup is not a side option available at Tim Hortons.", 
				"Nebulas are brilliant clouds of gas and dust that drift around in the sky and act as the birthplace for new stars. They are often very far "
				+ "away from our planet and can only be faintly seen.", 
				"The nucleus is a bit like the \"brain\" or \"command center\" of the cell. There, you'll find a complete set of "
				+ "chromosomes for the entire organism. "
				+ "That's why cloning is possible from just one cell.", 
				"Joule, a unit of work or energy in the International System of Units (SI). It is equal to the work done by a force of one "
				+ "newton acting through one metre.", 
				"The Honey Cruller is not made with yeast, not filled with any fillings, and not categorized as a cake donut.", 
				"The final frontier smells a lot like a Nascar race, a bouquet of hot metal, diesel fumes and barbecue.", 
				"The term \"pathology\" has been borrowed by psychology, where psychologists use it to describe the root and the course of a mental disorder.", 
				"Cacti spread their roots wide and store as much water as they can in their fleshy parts whenever it rains. "
				+ "This supply allows them to weather weeks of dry heat.", 
				"Tristain Thompson is a Canadian basketball player from Brampton. He got drafted into the NBA as the #4 overall pick in 2011 "
				+ "and has played in Cleveland ever since."};
//Array filled with explanations for user to learn from (second loop)
		String [] finalTesterExplainTF = { "False! Scientists say we have up to 21, including balance, pain, and temperature.", 
				"False! The official shelf life of a Twinkie is 45 days. But everyone wishes for it to last longer….", 
				"True! Due to to exponential increase(1 fold = 1mm, 2 fold = 2mm, 3 fold = 4mm, 4 fold = 8mm), it is mathematically possible that 42 "
				+ "folds of a paper can reach the moon. Good luck trying to fold a piece of paper in half more than 7 or 8 time though!", 
				"True! Henry Ford's Model T (1908) was famous as the first car mass-produced with interchangeable parts on an assembly line."};
		int Counter = 0;

		c.println("");
		for(int i = 10; i<10; i++) {
			c.println(finalTesterQues[i]);
			for(int j = 1; j<4; j++) {
			c.println(finalTesterOptions [i][j]);
			}
			String answer = c.readLine();
//Output if user gets right answer
		if (answer == finalTesterRight[i]) {
			c.setTextBackgroundColor(Color.GREEN);
			c.clear();
			c.println(finalTesterQues[i]);
			for(int j = 1; j<4; j++) {
				c.println(finalTesterOptions [i][j]);
			c.println("That's correct!");
			//Try and catch on thread due to data/coding errors during program execution
			try {
				Thread.sleep(2000);
				} catch (InterruptedException e) {
						e.printStackTrace();}
			c.setTextBackgroundColor(Color.WHITE);
			c.clear();
			c.println(finalTesterExplain[i]);
			Counter = + 1;
		}
		}
//Output if user gets wrong answer
		else {
			c.println("Oops sorry that is incorrect. The right answer is " + finalTesterRight[i] + "!");
			c.println(finalTesterExplain[i]);
		}
		}

		int correctCounter = Counter + 0;

		c.println("");
		for(int i = 10; i<10; i++) {
			c.println(finalTesterQuesTF[i]);
			String answer = c.readLine();
//Output if user gets right answer
		if (answer == finalTesterRightTF[i]) {
			c.setTextBackgroundColor(Color.GREEN);
			c.clear();
			c.println(finalTesterQuesTF[i]);
			c.println("That's correct!");
//Try and catch on thread due to data/coding errors during program execution
			try {
				Thread.sleep(2000);
				} catch (InterruptedException e) {
						e.printStackTrace();}
			c.setTextBackgroundColor(Color.WHITE);
			c.clear();
			c.println(finalTesterExplainTF[i]);
			correctCounter = + 1;
		}
//Output if user gets wrong answer
		else{
			c.println("Oops sorry that is incorrect. The right answer is " + finalTesterRightTF[i] + "!");
			c.println(finalTesterExplainTF[i]);
		}
		}
//Output final mark for user to see how they did
		c.println("Good work! Your mark for the final is " + AverageTest2(correctCounter) + "%");
	}
	
	
	/**
	 * This method is used to calculate the user's mark/average for any completed topic that the user has completed
	 * @param correctCounter - counted number of correct answer
	 * @return average of user's answer for the method/topic it was called for
	 */
	public static double Average (int correctCounter) {
		double mark = correctCounter / 10;
		double percent = mark * 100;
		return percent;
	}

	/**
	 * This method is used to calculate the user's mark/average for the test
	 * @param correctCounter - counted number of correct answers
	 * @return average of user's answer for the final test it was called for
	 */
	public static double AverageTest2 (int correctCounter) {
		double mark = correctCounter / 10;
		double percent = mark * 100;
		return percent;
	}
	

}
