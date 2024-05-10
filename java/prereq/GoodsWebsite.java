package prereq;

import java.util.ArrayList;

public class GoodsWebsite {

   public static void main(String[] args) {
      
      // Create a database
      GoodsDatabase database = new GoodsDatabase();

      // TODO: Create three listings, setting the properties,
      //       and add to the database
      Listing item1 = new Listing();
      Listing item2 = new Listing();
      Listing item3 = new Listing();

      // TODO: Create three listings, setting the properties
      item1.setTitle("Orange");
      item1.setPrice(4.0);
      item1.setDesc("New Zealand Orange");

      item2.setTitle("Apple");
      item2.setPrice(5.5);
      item2.setDesc("US Gala Apple");

      item3.setTitle("Grape");
      item3.setPrice(7.0);
      item3.setDesc("Vietnam Green Grape");
      database.addListing(item1);
      database.addListing(item2);
      database.addListing(item3);
      
      // Get the number of items in the database
      int count = database.getDatabaseSize();
      System.out.println("Number of listing in the database: " + count);
      System.out.println();

      // TODO: Output all of the items in the database
      System.out.println("All listing in the database:");
      ArrayList<Listing> allItems = database.getAllListings();
      for(Listing listing : allItems) {
         System.out.println(" - " + listing.getTitle());
      }
      System.out.println();


      // TODO: Output all of the items that match a given title
      String title = "Orange";
      System.out.println("All listing in the database that match '" + title + "':");
      allItems = database.getListingsByTitle(title);
      for(Listing listing : allItems) {
         System.out.println(" - " + listing.getTitle());
      }
      System.out.println();
   }
}