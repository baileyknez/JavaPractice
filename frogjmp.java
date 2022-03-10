public class frogjmp {
    public static int frogJump(int X, int Y, int D){
        return (Y - X) / D + ((Y - X) % D == 0 ? 0 : 1);
     }
    public static void main(String[] args){
        System.out.println(frogJump(10,85,30));
    }
}
