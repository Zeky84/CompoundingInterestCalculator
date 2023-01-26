import java.util.Scanner;
public class CalculatorData {
    Double getTheNumber (String question,Double minNumber, Double maxNumber) {
        Double myReturn = 0.0;
        boolean condition = true;
        while(condition) {
            Scanner numberInput = new Scanner(System.in);
            System.out.print(question);
            String number = numberInput.next();
            Double convertedNumber = Double.parseDouble(number);
            if (minNumber < convertedNumber && convertedNumber <= maxNumber){
                condition = false;
                myReturn = convertedNumber;
            }
            else{
                System.out.println("Please select a value in the range between:" + minNumber +" - " + maxNumber);
            }
        }
        return myReturn;
    }
    Double yearInitialInvestment(Double amount, Double yearlyInterestRate, Double interestRate){
        return amount*(yearlyInterestRate + interestRate);
    }

}
