public abstract class Restaurant {
    protected Pizza pizza;

    public Restaurant(Pizza pizza) {
        this.pizza = pizza;
    }

    public abstract void prepareMeal();
    public abstract void deliver();
}
