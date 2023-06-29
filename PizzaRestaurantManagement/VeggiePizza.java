public class VeggiePizza implements Pizza{

    @Override
    public void addSource() {
        System.out.println("Source added");
    }

    @Override
    public void makeTheRoti() {
        System.out.println("Made the Roti");
    }

    @Override
    public String toString(){
        return "Veggie Pizza";
    }

    public void addVegetables(){
        System.out.println("Vegetables added");
    }
}
