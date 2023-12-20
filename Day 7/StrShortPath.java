public class StrShortPath {
    public static float Str_ShortPath(String path){
        int x=0;
        int y=0;
        int n=path.length();
        for(int i=0 ; i<n ; i++){
            char dir= path.charAt(i);
            if (dir == 'W') {
                x--;
            }
            else if (dir == 'E') {
                x++;
            }
            else if(dir == 'S'){
                y--;
            }
            else{
                y++;
            }
        }
        int X1= x*x;
        int X2= y*y;
        return (float)Math.sqrt(X1+X2);
    }
    public static void main(String[] args) {
        String path =" WWEESSNESS";
        System.out.println(Str_ShortPath(path));
    }
    
}
