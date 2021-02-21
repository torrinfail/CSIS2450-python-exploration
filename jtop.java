import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
public class jtop
{
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		ArrayList<String> names = new ArrayList<>();
		String currentName;
		while (true)
		{
			System.out.println("Type a name to add to the list, or type 'exit' to quit");
			currentName = input.nextLine();
			if (currentName.equals("exit"))
				break;
			names.add(currentName);
		}
		writeOut(names);
	}
	static void writeOut(ArrayList<String> names)
	{
		try
		{
			FileWriter myWriter = new FileWriter("names.txt", true);
			for (String name : names)
    			myWriter.write(name + '\n');
	      	myWriter.close();

		} catch (IOException e){}
	}
}
