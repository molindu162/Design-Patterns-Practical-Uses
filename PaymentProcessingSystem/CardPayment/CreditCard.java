package CardPayment;

public class CreditCard implements BankCard{
    private int cardNumber;

    public CreditCard(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay() {
        if (cardNumber == 1234)
            System.out.println("Payed Successfully");
    }

    @Override
    public void enterCarNumber(int number){
        cardNumber = number;
    }
}
