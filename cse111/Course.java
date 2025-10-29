// template 
public class Course {
  public String courseCode;
  public String courseName;
  public int courseCredit;
  public void updateDetails(String n, String c, int d){
    this.courseCode = c;
    this.courseName = n;
    this.courseCredit = d;
  }
  public void displayCourse() {
    System.out.println("Course Name: " +courseName);
    System.out.println("Course Code: " + courseCode);
    System.out.println("Course Credit: " +courseCredit);
    
}
}
  
  