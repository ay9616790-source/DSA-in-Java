public class ReverseCahr {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder("Abhishek");
        for(int i=0;i<sb.length()/2;i++){
            int front =i;
            int back=sb.length()-1-i; //8-1-0=>7
            char frontChar=sb.charAt(front);
            char backChar=sb.charAt(back);
            sb.setCharAt(front,backChar);
            sb.setCharAt(back,frontChar);

        }
        System.out.println(sb);
    }
}
