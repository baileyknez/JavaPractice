public class TapeEquilibrium {
    public static int tapeEquilibrium(int[] A){
            long right = 0;
            long left = 0;
            long ans;
            
            for (int i =1;i<A.length;i++)
            right += A[i];
            
            left = A[0];
            ans =Math.abs(right+left);
            
            for (int P=1; P<A.length; P++){
                if (Math.abs(left - right)<ans)
                    ans = Math.abs(left - right);
                    left += A[P];
                    right -=A[P];
                }
            return (int) ans;  
    }   
    public static void main(String[] args){
        int[] one =new int[]{3,1,2,4,3};
        System.out.println(tapeEquilibrium(one));
    }
}
