

//  Question 35: Calculating Compound Interest


package August_27_Assignments;

public class Question_35 {


    public static void main (String[] args) {




       double principalAmount , annualRate;

       principalAmount = 2000.0;

       annualRate = 4.5;

       int years = 5;

       double Amount = principalAmount * Math.pow((1 + annualRate/100), years);

       System.out.println("The compound interest for Values given is : " + Amount);





    }

}
