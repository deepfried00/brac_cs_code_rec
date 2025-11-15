public class Connect{
  int totalAdvice = 0; int count = 0; 
  Student[] std = new Student[5];
  public Connect(){
    System.out.println("Connect is ready to use!");
  }
  public void login(Student s){
    if(s.email.equals("em") || s.password.equals("em")){
      System.out.println("Email and password need to be set.");
    }
    else {
      System.out.println("Login successful");
      s.stat = true;
      std[count] = s;
      count++;
    }
  }
  public void advising(Student r){
    if(r.stat == false){
      System.out.println("Please login to advise courses!");
    }
    else {
      if(r.cc == 0){
        System.out.println("You haven't selected any courses.");
      }
    }
  }
  public void advising(Student s, String s1, String s2, String s3, String s4){
    System.out.println("You need special approval to take more than 3 courses.");
 }
  public void advising(Student s, String s1, String s2, String s3){
    if(s.cc <3){
      s.course[s.cc++] = s1;
      s.course[s.cc++] = s2;
      s.course[s.cc++] = s3;
    }
    System.out.println("Advising successful!");
    totalAdvice++;
  }
  
  public void allAdviseeInfo(){
    System.out.println("Total Advisee: "+  totalAdvice);
    for(int i = 0 ; i < totalAdvice; i++){
    System.out.println("Name: "+ std[i].name + " ID: " + std[i].id + " Department: "+ std[i].dep);
    System.out.println("Advised Courses: ");
    for(int j = 0; j< std[i].cc; j++){
      System.out.print(std[i].course[j] + " ");
    }
System.out.println();
System.out.println("==============");
                       
  }
}
}