public class Interfaces {

    // Interfaces == 1-In the interfacs it start interface keyword
                 //  2- it use implement keyword to inherite
                 
    public static void main(String[] args) {
        Queen Q = new Queen();
        Q.moves();
    }
    
}

interface ChessPlayer{
    void moves();
}

class Queen implements ChessPlayer{
    public void moves(){
        System.out.println(" up, down, right, left, diagonal");
    }
}
class Rook implements ChessPlayer{
    public void moves(){
        System.out.println(" up, down, right, left ");
    }
}
class King implements ChessPlayer{
    public void moves(){
        System.out.println(" up, down, right, left, diagonal -by one steps");
    }
}
