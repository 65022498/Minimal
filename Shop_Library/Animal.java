package Shop_Library;

public class Animal extends Product {
    private AnimalSize size;

    public Animal(String name) {
    super(name, 0);
    this.size = AnimalSize.MEDIUM;
    
  }

    public Animal(String name, double price) {
    super(name, price);
    this.size = AnimalSize.MEDIUM;
  }

  public Animal(String name, double price, AnimalSize size) {
    super(name, price);
    this.size = size;
  }

  public String GetSize() {
    switch (size) {
      case SMALL:
        return "Small";
      case MEDIUM:
        return "Medium";
      case LARGE:
        return "Large";
      case GIANT:
        return "Giant";
    }

    return "???";
  }

  @Override
  public String GetInfo() {
    return  String.format("Dog's name: %s, Price: $%.2f, Quantity: %d", GetName(), GetPrice());
  }

  public enum AnimalSize {
    SMALL,
    MEDIUM,
    LARGE,
    GIANT
  }
  
}
