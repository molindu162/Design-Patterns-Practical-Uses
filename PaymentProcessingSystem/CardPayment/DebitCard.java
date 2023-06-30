package CardPayment;

public class DebitCard implements BankCard{
    private int cardNumber;

    public DebitCard(int cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public void pay() {
        if (cardNumber == 5678)
            System.out.println("Payed Successfully");
    }

    @Override
    public void enterCarNumber(int number){
        cardNumber = number;
    }
}
