import java.util.*;

// this is the main class
public class NetPay {
	// Initialize and declare tax percantages
  private static final double FEDERAL_TAX_PERCENT = 10.0;
	private static final double STATE_TAX_PERCENT = 4.50;
	private static final double SS_PERCENT = 6.20;
	private static final double MEDICARE_PERCENT = 1.45;
	private static final double PAY_PER_HOUR = 7.25;
  private static final double make_double = 100.0 / 100.0;

    public static void main(String[] args) {

    	// Initialize and decalre needed values
    	int numberOfHours = 0;
      int input = 0;

      // A while loop that will continuously ask the user to input the
      // number of hours they orked this week. This loop checks the user's
      // input and will reask them the same question if their answer is either
      // not an integer or their input is less than 0.
      while (true) {
        try {
          System.out.println("How many hours did you work this week?");
          Scanner scanner = new Scanner (System.in);
          input = scanner.nextInt();
          if (input > 0) {
            if (input >= 168) {
              System.out.println("Your input exceeds the maximum number of hours in a week.");
              continue;
            }
            break;
          } else {
            System.out.println("Invalid input. Please try again.");
            continue;
          }
        } catch (InputMismatchException e) {
          System.out.println("Invalid input. Please try again.");
          continue;
        }
      }
      // After the user's input has been checked, this method continues by
      // calling the netPay method with the user's input as the arguement
      double netPayValue = netPay(input);
    }


    // This method rounds an value to 2 decimal places.
    public static double mathRound(double val) {
      return Math.round(val*100.0)/100.0;
    }


    // This method first converts all of the taxed percantages into decimals in order
    // to make the math easier when determining the final values.
    // The second part of this method simply outputs all of those values neatly
    // to the user's screen
    public static double netPay(int numberOfHours) {
      double gross = (numberOfHours * PAY_PER_HOUR) * make_double;
      double federal = (gross * (FEDERAL_TAX_PERCENT / 100.0)) * make_double;
      double state = (gross * (STATE_TAX_PERCENT / 100.0));
      double social = (gross * (SS_PERCENT / 100.0)) * make_double;
      double medicare = (gross * (MEDICARE_PERCENT / 100.0)) * make_double;
      double net_pay = (gross - federal - state - social - medicare);

      System.out.println("Hours per Week:  " + numberOfHours +
      "\nGross Pay:\t " + mathRound(gross) +
      "\n\nDeductions " +
      "\nFederal:\t " + mathRound(federal) +
      "\nState:\t\t " + mathRound(state) +
      "\nSocial Security: " + mathRound(social) +
      "\nMedicare:\t " + mathRound(medicare) +
      "\n\nNet Pay:\t " + mathRound(net_pay) +
      "\n-----------------------------------------\n\n");
      return net_pay;
    }
}
