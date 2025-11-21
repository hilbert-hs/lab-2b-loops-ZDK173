import java.util.Scanner;
public class Tickets{
public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  String ticket = "";
  double totalTik = 0;
  double totalPrice = 0;
  int bTik = 0;
  int pTik = 0;
  int lTik = 0;
  int bTot = 0;
  int pTot = 0;
  int lTot = 0;
  while(!ticket.toLowerCase().equals("q")){
    System.out.println("What ticket would you like?");
    ticket = scan.nextLine();
    if (ticket.toLowerCase().equals("b")){
        totalTik ++;
        totalPrice += 75;
        bTik += 75;
        bTot += 1;
    }
    else if(ticket.toLowerCase().equals("p")){
        totalTik ++;
        totalPrice += 30;
        pTik += 30;
        pTot += 1;
    }
    else if(ticket.toLowerCase().equals("l")){
        totalTik ++;
        totalPrice +=21;
        lTik += 21;
        lTot += 1;
    }
    else{
      System.out.println("That is not a valid ticket type.");
    } 
  }
  totalTik *= 1.50;
  totalPrice += totalTik;
  System.out.println(bTot + "  Box Tickets     $" + bTik);
  System.out.println(pTot + "  Pavillion Tickets     $" + pTik);
  System.out.println(lTot + "  Lawn Tickets    $" + lTik);
  System.out.println("Convenience Fee $" + totalTik);
  System.out.println("Total     $" + totalPrice);
}
}