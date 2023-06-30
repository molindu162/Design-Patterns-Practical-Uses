import CardPayment.*;
public class Main7 {
    public static void main (String[] args){
        CreditCard creditCard = new CreditCard(1234);
        DebitCard debitCard = new DebitCard(5678);
        debitCard.pay();
    }
}
