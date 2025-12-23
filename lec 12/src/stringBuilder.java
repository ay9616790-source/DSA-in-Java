public class stringBuilder {
    public static void main(String[] args) {
        StringBuilder s=new StringBuilder("Abhishek");
        System.out.println(s.length()+" "+s.capacity());
        s.append(" "+"Kumar"); //append means add in last
        System.out.println(s);
    }
}
