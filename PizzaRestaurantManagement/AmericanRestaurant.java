public class AmericanRestaurant extends Restaurant{
    
    public AmericanRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    public void prepareMeal() {
        pizza.makeTheRoti();
        pizza.addSource();
    }

    @Override
    public void deliver() {
        prepareMeal();
        System.out.println(pizza.toString() + " Delivered");
    }
}
