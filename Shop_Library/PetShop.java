package Shop_Library;

// Concrete subclass PetShop
public class PetShop extends Shop {
    private int numberOfPets;

    public PetShop(String name, int numberOfPets) {
        super(name);
        this.numberOfPets = numberOfPets;
    }

    public int getNumberOfPets() {
        return numberOfPets;
    }

    @Override
    public void displayShopInfo() {
        System.out.println("Shop Name: " + getShopName());
        System.out.println("Type: Pet Shop");
        System.out.println("Number of Pets: " + numberOfPets);
    }

    @Override
    public String GetCategory(){
      return "Pet Shop";
    }

}