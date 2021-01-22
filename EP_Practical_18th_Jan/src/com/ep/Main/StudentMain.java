package com.ep.Main;

import java.sql.SQLException;
import java.util.Scanner;

import com.ep.Bean.StudentBean;
import com.ep.Deletion.StudentDeletion;
import com.ep.Display.StudentDisplay;
import com.ep.Insertion.StudentInsertion;
import com.ep.Updation.StudentUpdation;

public class StudentMain 
{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]) throws ClassNotFoundException, SQLException
	{
		StudentBean sb = new StudentBean();
		StudentInsertion si = new StudentInsertion();
		StudentDeletion sd = new StudentDeletion();
		StudentUpdation su = new StudentUpdation();
		StudentDisplay ss = new StudentDisplay();

		while(true)
		{
			int n;
			System.out.println("Enter Your Choice : ");
			System.out.println("1. Insert A Student's Data");
			System.out.println("2. Delete A Student's Data");
			System.out.println("3. Display All The Student Details");
			System.out.println("4. Update A Student's Data");
			
			n = sc.nextInt();
			
			switch(n)
			{
			case 1 : 
				long IDNum;
				String name,email,location;
				System.out.println("Enter Student's ID Number : ");
				IDNum = sc.nextLong();
				System.out.println("Enter Student's Name : ");
				name = sc.next();
				System.out.println("Enter Student's Email : ");
				email = sc.next();
				System.out.println("Enter Student's Location : ");
				location = sc.next();
				sb.setId(IDNum);
				sb.setName(name);
				sb.setEmail(email);
				sb.setLocation(location);
				
				int i = si.StudentInsert(sb);
				
				if(i > 0)
				{
					System.out.println("Insertion Successful!");
				}
				else
				{
					System.out.println("Please Try Again!");
				}
				break;
			
			case 2 :
				
				System.out.println("Enter Student's ID Number Whose Data Has To Be Deleted : ");
				IDNum = sc.nextLong();
				sb.setId(IDNum);
				int j = sd.StudentDelete(sb);
				if(j > 0)
				{
					System.out.println("Deletion Successful!");
				}
				else
				{
					System.out.println("Please Try Again!");
				}
				break;
				
			case 3 :
				ss.StudentDisplay(sb);
				break;
				
			case 4 :
				long UIDNum;
				System.out.println("Enter The To Be Updated Student's ID Number : ");
				UIDNum = sc.nextLong();
				String uname,uemail,ulocation;
				System.out.println("Enter Updated Student's Name : ");
				uname = sc.next();
				System.out.println("Enter Updated Student's Email : ");
				uemail = sc.next();
				System.out.println("Enter Updated Student's Location : ");
				ulocation = sc.next();
				
				sb.setId(UIDNum);
				sb.setName(uname);
				sb.setEmail(uemail);
				sb.setLocation(ulocation);
				int l = su.StudentUpdate(sb);
				if(l > 0)
				{
					System.out.println("Updation Successful!");
				}
				else
				{
					System.out.println("Please Try Again!");
				}
				break;
			}		
	
		}
	}
}
