// At a lemonade stand, each lemonade costs $5. 
// Customers are standing in a queue to buy from you, and order one at a time (in the order specified by bills).
// Each customer will only buy one lemonade and pay with either a $5, $10, or $20 bill.  You must provide the correct change to each customer, so that the net transaction is that the customer pays $5.
// Note that you don't have any change in hand at first.
// Return true if and only if you can provide every customer with correct change.

public class Lemonade {
    public boolean lemonadeChange(int[] bills) {
        int abe = 0;
        int ham = 0;
        int jack = 0;
        for (int i = 0; i < bills.length; i++){
            if (bills[i] == 5){
                abe++;
            }
            else if (bills[i] == 10){
                ham++;
                if (abe >= 1){
                    abe--;
                }
                else{
                    return false;
                }
            }
            else if (bills[i] == 20){
                jack++;
                if (abe >= 1 && ham >= 1){
                    abe--;
                    ham--;
                }
                else if (abe >= 3){
                    abe -= 3;
                }
                else{
                    return false;
                }
            }
        }
        return true;
    }
}
