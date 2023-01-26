public class Calculator {
    public static void main(String[] args){
        CalculatorData values = new CalculatorData();

        Double amount = values.getTheNumber("What is the initial investment: ",0.0,1000000.0);
        Double interest = values.getTheNumber("What is interest yearly rate: ",0.0,1.0);
        Double interestRate = 1.0;

        for (int y=1; y<31; y++){
            Double total1year = values.yearInitialInvestment(amount,interest,interestRate);
            amount = total1year;
            if (y==1 | y % 5 ==0){
                System.out.println("Calculate " + y +"st year of compounding interest = " + Math.round(total1year));
            }
        }
    }
}