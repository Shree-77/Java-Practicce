package question3;

public class CreditCardAccount implements money{
        double Credit_card_limit;
        int Credit_card_number;

    public CreditCardAccount(double credit_card_limit, int credit_card_number) {
        Credit_card_limit = credit_card_limit;
        Credit_card_number = credit_card_number;
    }

    @Override
    public double withdrawMoney(double money) {

        return (Credit_card_limit-money)+money*0.5;
    }

    @Override
    public double depositMoney(double money) {
        return money+Credit_card_limit;
    }
}
