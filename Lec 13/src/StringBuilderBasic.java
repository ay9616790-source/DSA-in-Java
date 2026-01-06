public class StringBuilderBasic {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Abhishek");
        System.out.println(sb);

        //char at index
        System.out.println(sb.charAt(0));

        //set char in index
        sb.setCharAt(1,'p');
        System.out.println(sb);

        //Insert char at index
        sb.insert(3,'H');
        System.out.println(sb);

        //Delete the char
        sb.delete(3,4);
        System.out.println(sb);
    }
}
