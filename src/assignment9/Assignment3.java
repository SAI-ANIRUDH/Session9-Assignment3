package assignment9; //package declaraion is compulsory.
/*
 * Program to describe the HDTV class
 */
import java.util.*; // Importing the Java Util class.
import java.util.Iterator; // Importing the Java iterator class.
public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HDTV h = new HDTV("DELL",175);  // Initializing the values of the HDTV class.
		HDTV h1= new HDTV("SONY",200);
		HDTV h2= new HDTV("Onida",150);
		

		ArrayList <HDTV> ar = new ArrayList<HDTV>(); // Creating the array list class and takng the HDTV objects inside it.
		ar.add(h);
		ar.add(h1);
		ar.add(h2);
		
		Iterator itr = ar.iterator(); // Using the iterator class.
		while(itr.hasNext()) {
			HDTV hd= (HDTV)itr.next();
			System.out.println(hd.Brandname + "  " + hd.size + "   ");
		}
		
	}

}
class HDTV // Creating the HDTV class as per the assignment requirements.
{
	String Brandname;
	int size;
	HDTV(String Brandname, int size){
		this.Brandname= Brandname;
		this.size=size;
		
	}
}
