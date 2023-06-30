import CashPayment.Cash;
public class CashPayment implements Payment{
    Cash cash;

    public CashPayment(Cash cash) {
        this.cash = cash;
    }

    @Override
    public void pay() {
        cash.pay();
    }
}
