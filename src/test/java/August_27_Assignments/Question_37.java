

//  Question 37: Monthly Payment Calculation


package August_27_Assignments;

public class Question_37 {




    public static void main (String[] args) {


       double loanAmount , annualInterestRate;

       loanAmount = 15000.0;
       annualInterestRate = 3.5;

       int loanTermYears = 5;

      double  monthlyPayment = ( (loanAmount * (annualInterestRate/100) ) / 12);

      System.out.println(monthlyPayment);












    }




}
