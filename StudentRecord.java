package Student;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Scanner;

class Student
{
	private int SId;
	private String SName;
	private long Contact;
	
	Student(int SId,String SName,long Contact){
		this.SId = SId;
		this.SName = SName;
		this.Contact = Contact;
       
	}
	public int getSId() {
		return SId;
	}
	public String SName() {
		return SName;
	}
	public long getContact() {
		return Contact;
	}
	public String toString() {
		return SId+" "+SName+" "+Contact;
	}
}


public class StudentRecord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Student> c=new ArrayList<Student>();
		Scanner sc=new Scanner(System.in);
		Scanner sc1=new Scanner(System.in);
		int ch;
		do {
			System.out.println("1.INSERT");
			System.out.println("2.DISPLAY");
			System.out.println("3.SEARCH");
			System.out.println("4.DELETE");
			System.out.println("Enter your choice : ");
			ch = sc.nextInt();
			
			switch(ch) {
			case 1:
				System.out.print("Enter SId : ");
				int SId=sc.nextInt();
				System.out.print("Enter SName : ");
				String SName=sc1.nextLine();
				System.out.print("Enter Contact : ");
				long Contact=sc.nextInt();
				
				c.add(new Student(SId,SName,Contact));
				break;
			case 2:
				System.out.println("-----------------------------------");
				Iterator<Student> i=c.iterator();
				while(i.hasNext()) {
					Student s=i.next();
					System.out.println(s);
				}
				System.out.println("----------------------------");
				break;
			case 3:
				boolean found = false;
				System.out.print("Enter SId to Search : ");
				SId=sc.nextInt();
				System.out.println("-----------------------------------");
			    i=c.iterator();
				while(i.hasNext()) {
					Student s=i.next();
					if(s.getSId()==SId) {
						System.out.println(s);
					found=true;
				}
			}
			if(!found) {
				System.out.println("Record Not Found");
			}
				System.out.println("----------------------------");
				break;
		case 4:
			found = false;
			System.out.print("Enter SId to Delete : ");
			SId=sc.nextInt();
			System.out.println("-----------------------------------");
		    i=c.iterator();
			while(i.hasNext()) {
				Student s=i.next();
				if(s.getSId()==SId) {
					i.remove();
				found=true;
			}
		}
		if(!found) {
			System.out.println("Record Not Found");
		}else {
			System.out.println("Record id deleted successfully.......");
		}
			System.out.println("----------------------------");
			break;
	
			}
	}while(ch!=0);

		
	}
}

