import java.util.*;
class Rotation {
    public static int[] rotation(int[] A, int K) {
        int[] other;
        for(int i =0; i < K; i++){
             other =A.clone();
            System.out.println(Arrays.toString(A));
            for(int j=0; j < A.length; j++){
                if(j+1 <A.length){
                A[j+1]=other[j];
                }else{
                A[0]=other[j];
                }
            }
        }
        return A;
    }
    public static void main(String[] args){
       
        int[] one = new int[]{1,2,3,4};
        int[] two =rotation(one, 4);
        System.out.println(Arrays.toString(two));

        int[] three = new int[]{7,3,7,8};
        int[] four =rotation(three, 2);
        System.out.println(Arrays.toString(four));
    }
}
