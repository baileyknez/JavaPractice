import java.util.*;
public class OddOccurrencesInArray {
    public static int oddOccurrencesInArray(int[] A){
        int count=0;
        Arrays.sort(A);
        int current=A[0];
        System.out.println(Arrays.toString(A));
        for(int i =0; i< A.length; i++){
            System.out.println(current);
            if(current != A[i]){
                System.out.println("Change");
                if(count % 2 !=0){
                    System.out.println(count);
                    break;
                }
                count=0;
                current=A[i];
            }
            count++;
            System.out.println(count);
        }
        return current;
    }

    public static void main(String[] args){
        int[] one = new int[]{1,5,5,1,7,8,7,9,9};
        System.out.println(oddOccurrencesInArray(one)); 
    }
}
