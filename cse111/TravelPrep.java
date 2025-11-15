public class TravelPrep{
  public int price;
  public String t_name = "Unknown";
  int total =0;
  int count = 0;
  TravelPrep[] place = new TravelPrep[3];
  
  public TravelPrep(){
    price = 1250;
    System.out.println(t_name + " package would cost at most 1250 yen");
  }
  public TravelPrep(String s, int n){
    t_name = s;
    price =n;
    System.out.println(t_name + " package would cost at most " + price + " yen" );
  }
  public TravelPrep(String n, String t){
    t_name = n  +" " + t;
    price = 300;
    System.out.println(t_name + " costs " + price + " yen");
  }
                      public TravelPrep(String n, String t, int x){
    t_name = t + " " + n;
    price = x;
    System.out.println(t_name + " costs " + price + " yen");
  }
                      public void add_to_itinerary(TravelPrep n){
                        if( n.price + total <= price){
                          if ( count < 3){
                            total += n.price;
                            place[count] = n;
                            count++;
                          }
                        }
                        else {
                          System.out.println("Budget going overboard");
                        }
                      }
                      public void add_to_itinerary(TravelPrep n, TravelPrep n2){
                         add_to_itinerary( n);
                          add_to_itinerary( n2);
                      }
                      public void show_itinerary(){
                        System.out.println("Itinerary for " + t_name);{
                          int cc = 1;
                          for(int i = 0; i< count; i++){
                            System.out.println(cc++ + ". " + place[i].t_name + " - " + place[i].price + " yen");
                          }
                          System.out.println("Total cost of " + count + " destinations: " + total + " yen" );
                        }
                      }
                      public String updateCost(int n ){
                      
                        price += n;
                        return  "Cost of " + t_name + " updated to " + price ;
                        
                      }
}