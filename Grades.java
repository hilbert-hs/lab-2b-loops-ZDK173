import java.util.Scanner;
public class Grades {
public static void main(String[] args) {
    int sum = 0;
    Scanner scan = new Scanner(System.in);
    System.out.println("How many grades are you going to enter?");
    int numGrade = scan.nextInt();
    
  for(int i = 1; i <= numGrade; i ++){
    System.out.println("What is your grade?");
    int grade = scan.nextInt();
    sum += grade;
    
  }
  System.out.println( sum / numGrade);

  scan.close();
  
}    
    
  
}

// write any helper methods here
