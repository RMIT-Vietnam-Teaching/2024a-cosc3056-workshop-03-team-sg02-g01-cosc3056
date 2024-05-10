package prereq;

public class Listing {
   // These are examples properties
   private String title;
   private double price;
   private String description;

   // TODO: Add more properties

   // TODO: Add your setter/getter here
   public String getTitle() {
      return title;
   }

   public double getPrice() {
      return price;
   }

   public String getDesc() {
      return description;
   }

   public void setTitle(String title) {
      this.title = title;
   }

   public void setPrice(double price) {
      this.price = price;
   }
   
   public void setDesc(String description) {
      this.description = description;
   }
   public void printInfo() {
      // TODO: Complete this to print out the information of the Listing
      System.out.println("Item: " + title);
      System.out.println("\tPrice: " + price);
      System.out.println("\tDescription: " + description);
   }
}