import java.util.*;
public class Project_1 {
  public static void main(String[] args) {
    Scanner user_input = new Scanner(System.in);
    System.out.println("\n\nRock, Paper, Scissors Guide\n\n");
    System.out.println("Ask me about the game of rock, paper, scissors.\n\n");
    String raw_value = user_input.nextLine();
    System.out.println("\n\n");
    if (raw_value.equals("What beats rock?")) {System.out.println("paper\n\n");}
    if (raw_value.equals("What beats paper?")) {System.out.println("scissors\n\n");}
    if (raw_value.equals("What beats scissors?")) {System.out.println("rock\n\n");}
    System.out.println("Ask another question.\n\n");
    String raw_value2 = user_input.nextLine();
    System.out.println("\n\n");
    if (raw_value2.equals("What beats rock?")) {System.out.println("paper\n\n");}
    if (raw_value2.equals("What beats paper?")) {System.out.println("scissors\n\n");}
    if (raw_value2.equals("What beats scissors?")) {System.out.println("rock\n\n");}
    System.out.println("Ask one more.\n\n");
    String raw_value3 = user_input.nextLine();
    System.out.println("\n\n");
    if (raw_value3.equals("What beats rock?")) {System.out.println("paper\n\n");}
    if (raw_value3.equals("What beats paper?")) {System.out.println("scissors\n\n");}
    if (raw_value3.equals("What beats scissors?")) {System.out.println("rock\n\n");}
    System.out.println("Now it's time for the quiz\n\n\n\nWhat beats rock?\n\n");
    String raw_value4 = user_input.nextLine();
    System.out.println("\n\n");
    if (raw_value4.equals("paper")) {System.out.println("correct\n\n");}
    else {System.out.println("incorrect\n\n");}
    System.out.println("What beats paper?\n\n");
    String raw_value5 = user_input.nextLine();
    System.out.println("\n\n");
    if (raw_value5.equals("scissors")) {System.out.println("correct\n\n");}
    else {System.out.println("incorrect\n\n");}
    System.out.println("What beats scissors?\n\n");
    String raw_value6 = user_input.nextLine();
    System.out.println("\n\n");
    if (raw_value6.equals("rock")) {System.out.println("correct\n\n");}
    else {System.out.println("incorrect\n\n");}
  }
}