import CardPayment.*;

public class CardPayment implements Payment{
    CreditCard creditCard;
    DebitCard debitCard;

    public CardPayment(CreditCard creditCard, DebitCard debitCard) {
        this.creditCard = creditCard;
        this.debitCard = debitCard;
    }

    public CardPayment(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public CardPayment(DebitCard debitCard) {
        this.debitCard = debitCard;
    }

    @Override
    public void pay() {
        if (creditCard != null)
            creditCard.pay();

        else if (debitCard != null) {
            debitCard.pay();
        }
    }
}
