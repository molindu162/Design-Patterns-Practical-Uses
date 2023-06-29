public class ChickenPizza implements Pizza{
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
        return "Chicken Pizza";
    }
    public void addChicken(){
        System.out.println("Chicken Added");
    }
}
