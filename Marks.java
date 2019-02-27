package mphasis;
import java.util.Scanner;
public class Marks extends Student
{
	int phy,chem,bio,tot;
//	void input()
//	{
//		super.input();
//		Scanner ob=new Scanner(System.in);
//		System.out.println("enter phy,chem,bio marks");
//		phy=ob.nextInt();chem=ob.nextInt();bio=ob.nextInt();
//	}
	Marks(int rollno, String name, String address,int phy, int chem, int bio){
		super (rollno, name, address);
			this.phy=phy;
			this.chem=chem;
			this.bio=bio;
		}
	void display()
	{
		super.display();
		tot=phy+chem+bio;
		System.out.println("phy: "+phy+" chem: "+chem+" bio: "+bio +" tot: "+tot);
	}
	public static void main(String[] args)
	{
	Marks ob=new Marks(101,"Sandip","Bangalore",56,56,65);
	ob.display();
	}
}