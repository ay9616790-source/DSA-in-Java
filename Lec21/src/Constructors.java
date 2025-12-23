public class Constructors {
    public static void main(String[]args) {
        Student set = new Student();  //default Constructors
        set.setName("Abhishek");
        System.out.println( "Name="+set.name);
        set.setAge(21);
        System.out.println("Age="+set.Age);
        set.setSection(45);
        set.Section=40;
        System.out.println("Section="+set.Section);
        set.Section=40;
        System.out.println(" Change Section="+set.Section);


        //User Constructors
        teacher sb=new teacher("Radha Mam");
        System.out.println(sb.teacherName);


    }

}
class teacher{
    String teacherName;
    teacher(String teacherName){
         this.teacherName=teacherName;
    }
}
class Student1{
    public int Age;
    String name;
    int Section;


    void setName(String setName){
        name=setName;
    }
    void setAge(int newAge){
        Age=newAge;
    }
    void setSection(int  AlloSection){
        Section=AlloSection;
    }

}

