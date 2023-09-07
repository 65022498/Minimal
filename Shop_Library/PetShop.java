package Shop_Library;

// Concrete subclass PetShop
class PetShop extends Shop {
    private int numberOfPets;

    public PetShop(String shopName, int numberOfPets) {
        super(shopName);
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