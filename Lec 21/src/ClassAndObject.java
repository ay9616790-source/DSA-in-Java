public class ClassAndObject {
    public static void main(String[]args) {
        Student set = new Student();
        set.setName("Abhishek");
        System.out.println( "Name="+set.name);
        set.setAge(21);
        System.out.println("Age="+set.Age);
        set.setSection(45);
        set.Section=40;
        System.out.println("Section="+set.Section);
        set.Section=40;
        System.out.println(" Change Section="+set.Section);


    }

}
class Student{
    public int Age;
    String name;
    int Section;


    void setName(String setName){
        name=setName;
    }
    void setAge(int newAge){
        Age=newAge;}
    void setSection(int  AlloSection){
        Section=AlloSection;
    }

}
