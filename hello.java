class student{
    String name;
    int age;
    char grade;
    
   public  student(String name,int age,char grade){
        this.name=name;
        this.age=age;
        this.grade=grade;
    }
}
public class hello{
    public static void main(String[] args){
        student s1=new student("sridhar",18,'s');
        System.out.println("Name of the student "+s1.name+" And age is "+s1.age+" And grade "+s1.grade);

    }
}