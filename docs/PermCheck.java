public class PermCheck {
    public static int check(int[] A){
        int steps = A.length;
        boolean[] bitMap = new boolean[steps+1];
        for(int i=0; i<A.length;i++){
            if(A[i]>bitMap.length-1) return 0;
            else if(!bitMap[A[i]]){
                bitMap[A[i]]=true;
                steps--;
                if(steps ==0)return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args){
        int[] one = new int[]{4,1,3,2};
        int[] two = new int[]{4,1,3};
        System.out.println(check(one));
        System.out.println(check(two));
    }
    
}
