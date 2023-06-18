public class Main1 {
    public static void main (String[] args){
        FeatureRequestHandler featureRequestHandler = new FeatureRequestHandler(null);
        BillingHandler billingHandler = new BillingHandler(featureRequestHandler);
        TechnicalSupportHandler technicalSupportHandler = new TechnicalSupportHandler(billingHandler);
        ValidityChecker checker = new ValidityChecker(technicalSupportHandler);
        checker.handle(new Ticket("1234", true, true));
    }
}