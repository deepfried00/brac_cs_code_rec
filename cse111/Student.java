public class Student{
  public String email = "em" ;
  public String password  ="em";
  public String name;
  public String dep;
  public int id;
  boolean stat;
  int cc = 0;
    String[] course = new String[3];
  
  public Student(String n, int d, String c){
    name = n;
    id = d;
    dep = c;
    System.out.println("Student object is created");
  }
}