import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Match {
	static Student students [] = new Student [100];

	public static void main(String[] args) {
		Scanner get = new Scanner(System.in);
		System.out.print("Enter file name: ");
		String filename = get.next();
		try {
			Scanner input = new Scanner ( new File(filename) );
			int i = 0;
			while(input.hasNextLine()){
				Scanner in = new Scanner(input.nextLine());
				in.useDelimiter("\t");
				String name = in.next();
				char gender = in.next().charAt(0);
				Date date = parseDate(in.next());
				Preference pref = new Preference(in.nextInt(), in.nextInt(), 
												 in.nextInt(), in.nextInt());
				students[i]  = new Student (name, gender, pref, date);
				i++;
				
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		}

	}
	public static Date parseDate(String str){
		Scanner input = new Scanner (str);
		input.useDelimiter("-");
		int month = input.nextInt();
		int day = input.nextInt();
		int year = input.nextInt();
		input.close();
		return new Date(year, month, day) ;
	}
	public void match(){

	}

}
