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