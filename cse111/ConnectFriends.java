public class ConnectFriends{
  String name;
  int cap;
  ConnectFriends[] names ;
  int idx = 0;
  int cc =0;
  public ConnectFriends(String s){
    name = s;
    cap  =2 ;
    System.out.println("Welcome to ConnectFriends, " + name);
    names = new ConnectFriends[cap];
  }
  public ConnectFriends(String s, int n ){
    name = s;
    cap = n;
    System.out.println("Welcome to ConnectFriends, " + name);
    names = new ConnectFriends[cap];
  }
  public void sendFriendRequest(ConnectFriends n){
    if(cc < cap){
      System.out.println(name + " sent a friend request to " + n.name);
      names[cc] = n;
      cc++;
    }
    else{
      System.out.println(name + " has reached the friend request limit! ");
    }
  }
  public void sendFriendRequest(ConnectFriends n, ConnectFriends  n1){
    sendFriendRequest( n);
    sendFriendRequest( n1);
  }
  public void showDetails(){
    System.out.println("User Name: "+ name);
    System.out.println("Maximum number of Sent Friend Request: "+ cap);
    System.out.println("Total Friends Request: " + cc);
    System.out.println("Sent Friends Request: ");
    for(int i = 0; i < cc; i++){
      System.out.print(names[i].name + " ");
    }
    System.out.println();
  }
  public void removeRequest(String s){
    boolean found = false; 
    for (int i = 0; i < cc; i++){
      if((names[i].name.equals(s))){
        found = true;
        idx = i;
        break;
      }
    }
    if( found == true){
      found = false;
      for(int i =0; i< cc; i++){
        if( i == idx && i != (cc - 1)){
          ConnectFriends temp = names[cc-1];
          names[cc-1] = names[idx];
          names[idx] = temp;
          cc--;
        }
        else {
          cc--;}
      }
      System.out.println("Request to add " + s + " is removed for " + name);
    }
    else{
      System.out.println(s + " is not in " + name + "'s sent request list");
    }
  }
  
}