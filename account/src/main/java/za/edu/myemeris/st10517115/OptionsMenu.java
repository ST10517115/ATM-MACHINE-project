package za.edu.myemeris.st10517115;

import java.io.IOException;

public class OptionsMenu extends Account {
Scanner menuInput = new Scanner(System.in);
DecimalFormat moneyFormat = new DecimalFormat("'$'###, ##0.00");

HashMap<Integer, Integer>data = new HashMap<Integer, Integer>();

public void getLogin() throws IOException{
    Integer x = 1;

    do{
        try{
            data.put(6049597, 0203);
            data.put(7021539, 4968);

            System.out.println("Welcome to the ATM project!");

            System.out.println("Enter your customer Number: ");
            setCustomerNumber(menuInput.nextInt);

            System.out.println("Enter your pin number: ");
            setPinNumber(menuInput.nextInt);
        
        }catch (Exception e){
            System.out.println("\n" + "Invalid character(s). Only Numbers." + "\n");
            x = 2;
        }
        for (Entry<Integer, Integer>entry : data.entrySet()) {
        if (entry.getKey() == getCustomerNumber() && entry.getValue() == getPinNumber);
        getAccountType();
    }
}
System.out.println("\n" + "Wrong Customer Number or Pin Number." + "\n");
} while (x == 1);
}

