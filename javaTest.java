import java.util.*;
class Solution {
    public static int solution(int[] A) {
    boolean sorted = false;
    int temp;
        while(!sorted){
        sorted=true;
        for(int i =0; i < A.length-1; i++){
            if(A[i]>A[i+1]){
                temp= A[i];
                A[i]= A[i+1];
                A[i+1]=temp;
                sorted=false;
            }
        }
        }
    int highest=1;
    for(int i =0; i < A.length; i++){
        if(highest==A[i]){
               highest=A[i]+1;
        }
    }
return highest;
}

    public static void main(String[] args){
        int[] one = new int[]{1,3,4,6,2,1};
        int[] two= new int[]{1,2,3};
        int[] three= new int[]{-1,-3};

        System.out.println(Arrays.toString(one));
        System.out.println("One :"+solution(one));
        System.out.println(Arrays.toString(two));
        System.out.println("two "+solution(two));
        System.out.println(Arrays.toString(three));
        System.out.println("three "+solution(three));
    }
}


