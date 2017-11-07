import java.util.Scanner;

public class ConversionApp {

	public static void main(String[] args) {
		
        System.out.println("Welcome to the Letter Grade Converter");
        System.out.println();
		Scanner sc = new Scanner(System.in);
        String choice = "y";
        while (choice.equalsIgnoreCase("y")) {
        	Converter convertr = new Converter(Console.getInt("Enter numerical grade: ", 0, 100));
        	System.out.println("Letter grade: "+convertr.getLetterGrade());  
            System.out.print("Continue? (y/n): ");
            choice = sc.nextLine();
            System.out.println();
        }
        sc.close();
	}

}
