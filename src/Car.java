public class Car {
   private String name;
   private int maxSpeed;
   private float price;
   private int model;

  public void setName(String newName) {
        name = newName;
    }

    public String getName() {
        return name;
    }

    public  void setModel(int m) {
        if (m >= 2015)
             model = m;
        else 
            System.out.println("Sorry, we do not accept this model");
    }

    public int getModel() {
        return model;
    }
}



