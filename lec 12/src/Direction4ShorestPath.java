public class Direction4ShorestPath {
    public static float getShorestPath(String path){
        int x=0,y=0;

        for(int i=0;i<path.length();i++){
            int dir=path.charAt(i);
            if(dir=='S'){
                y--;
            }else if(dir=='E'){
                x++;
            }else if(dir=='N'){
                y++;
            }else if(dir=='W'){
                x--;
            }
        }
       int  xSquare=x*x;
        int ySquare=y*y;
        return (float)Math.sqrt(xSquare+ySquare);

    }
    public static void main(String[] args) {
        String path="WENEENNWSNSEENNN";
        System.out.println(getShorestPath(path));
    }


}
