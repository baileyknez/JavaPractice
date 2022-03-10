import java.util.*;
class  PermMissingElem{
    public static int permMissingElem(int[] A) {
       Arrays.sort(A);
        int count=0;
       if(A[0] !=1){
           return (1);
       }
       for(int i=0; i< A.length;i++ ){
           if(A[i]<A.length){
               if(A[i]+1 != A[i+1]) return A[i]+1;
           }
           else{
               count = A[i]+1;
           }
       }
       return count;
    }
    public static void main(String[] args){
        int[] one = new int[]{2,3,1,5};
        System.out.println(permMissingElem(one));
    }
}