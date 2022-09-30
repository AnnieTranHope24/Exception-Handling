package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoClass {

	public static void main(String[] args) throws  InvalidInputException, FileNotFoundException  {
		// TODO Auto-generated method stub
		try {
			readInput();
		}


		catch(FileNotFoundException e) {
			System.out.println(e.getMessage());
		}
		catch(IOException e) {
			System.out.println(e.getMessage());
		}

		Scanner scan = new Scanner(System.in);
		int option = -1;
		System.out.println("Input a number in the range [1, 3]");
		
		try {
			option = scan.nextInt();
			System.out.println("You selected " + option);
			if(option < 1 || option > 3) {
				throw new InvalidInputException();
			}
		}
		catch (InputMismatchException e){
			System.out.println("This is not a valid number.");
		}
		catch(InvalidInputException e) {
			System.out.println("This is not a valid number. Range is [1, 3]");
		}
		


	}
	
	public static void readInput() throws FileNotFoundException {
		
		File file = new File("input.txt");
		Scanner scan = new Scanner(file);
		int fileData = scan.nextInt();
	}

}
