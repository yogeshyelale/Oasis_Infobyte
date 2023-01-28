package Task4;

import java.util.*;
class OnlineExam
{
	Scanner sc = new Scanner(System.in);
	HashMap<String,Integer> info = new HashMap<String,Integer>();
	public void login()
	{
		info.put("1",1111);
		info.put("2",2222);
		info.put("3",3333);
		info.put("4",4444);
		info.put("5",5555);
		String id;
		int pwd;
		System.out.println("Login to your account!");
		System.out.println("Enter your user ID:");
		id = sc.next();
		System.out.println("Enter your password:");
		pwd = sc.nextInt();
		if(info.containsKey(id) && info.get(id)==pwd)
		{
			System.out.println("\nLogin successful!");
			menu();
		}
		else
		{
			System.out.println("\nIncorrest user ID or password!\nTry again!\n");
			login();
		}
	}
	public void menu()
	{
		int ch;
		System.out.println("\nEnter your choice:");
		System.out.println("1.Update profile \n2.Start exam \n3.Logout");
		ch = sc.nextInt();
		switch(ch)
		{
			case 1:
				info = update();
				menu();
				break;
			case 2:
				startExam();
				menu();
				break;
			case 3:
				System.exit(0);
				break;
			default:
				System.out.println("Choose a valid operation!");
		}
	}
	public HashMap<String,Integer> update()
	{
		String update_id;
		int update_pwd;
		System.out.println("Enter your username:");
		update_id = sc.next();
		System.out.println("Enter your old password:");
		update_pwd = sc.nextInt();
		if(info.containsKey(update_id) && info.get(update_id)==update_pwd)
		{
			System.out.println("Enter new password:");
			update_pwd = sc.nextInt();
			info.replace(update_id,update_pwd);
			System.out.println("Password reset successfully!");
		}
		else
		{
			System.out.println("User record not found!\n");
		}
		return info;
	}
	public void startExam()
	{
		long startTime = System.currentTimeMillis();
		long endTime = startTime + 30;
		int score = 0,ans;
		
		System.out.println("Instructions:");
		System.out.println("1. There are 5 questions in this exam");
		System.out.println("2. All questions are compulsory");
		System.out.println("3. For each correct answer you will get 5 marks");
		System.out.println("4. For each wrong answer 1 mark will be reduced from your obtained marks");
		System.out.println("5. Time limit to complete the exam is 5 minutes");
		System.out.println("\n All The Best!\n");
		System.out.println("*********************Exam has started*********************");
		while(System.currentTimeMillis()<endTime)
		{
			System.out.println("------------------------------------------------------------------------------------------------");
			System.out.println("Q1.Who invented Java Programming?");
			System.out.println("1.Guido van Rossum \t2.James Gosling \t3.Dennis Ritchie\t4.Bjarne Stroustrup");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 2)
				score+=5;
			else
				score--;
			
			System.out.println("--------------------------------------------------------------------------------------------------");
			System.out.println("Q2.Which statement is true about Java?");
			System.out.println("1.Java is a sequence-dependent programming language\t2.Java is a code dependent programming language\t3.Java is a platform-dependent programming language\t4.Java is a platform-independent programming language");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 4)
				score+=5;
			else
				score--;
			
			System.out.println("--------------------------------------------------------------------------------------------------");
			System.out.println("Q3.Which one of the following is not a Java feature?");
			System.out.println("1.Object-oriented\t2.Use of pointers\t3.Portable\t4.Dynamic and Extensible");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 2)
				score+=5;
			else
				score--;
			
			System.out.println("--------------------------------------------------------------------------------------------------");
			System.out.println("Q4.What is the extension of java code files?");
			System.out.println("1..js\t2..txt\t3..class\t4..java");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 4)
				score+=5;
			else
				score--;
			
			System.out.println("-------------------------------------------------------------------------------------------------");
			System.out.println("Q5. What will be the output of the following code? \r\n"
					+ "class increment {\r\n"
					+ "        public static void main(String args[]) \r\n"
					+ "        {        \r\n"
					+ "             int g = 3;\r\n"
					+ "             System.out.print(++g * 8);\r\n"
					+ "        } \r\n"
					+ "    }");
			System.out.println("1.32\t2.33\t3.24\t4.25");
			System.out.print("Answer:");
			ans = sc.nextInt();
			if(ans == 1)
				score+=5;
			else
				score--;
			System.out.println("------------------------------------------------------------------------------------------");
			break;
		}
		System.out.println("Your exam has ended.");
		System.out.println();
		System.out.println("Your score is: 25 / "+score);
		if(score>10)
			System.out.println("Congratulations!");
		else
			System.out.println("Better Luck Next Time!");
	}
	public static void main(String args[])
	{
		OnlineExam obj = new OnlineExam();
		obj.login();
	}
}