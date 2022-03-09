import java.util.*;
class BinaryGap{
    public static int binarygap(int N) {
        if(N==0 || N ==1){
            return 0;
        }
        String s = Integer.toBinaryString(N);
        char[] binary = s.toCharArray();
        boolean gapStart=false;
        int tempGap=0;
        int gap=0;
        char previous='1';
        char next=binary[1];
       System.out.println(Arrays.toString(binary));
        for(int i =0; i < binary.length; i++){
            if(binary[i]=='1' && previous=='0' && gapStart){
                gapStart=false;
               
                if(gap<tempGap){
                    gap=tempGap;
                   
                }
                tempGap=0;
            }else if(binary[i]=='1' && next =='0'){
                gapStart=true;
                tempGap=0;
             
            } 
            if( binary[i]=='0'){
                tempGap++;
               
            }
            previous=binary[i];
            if(i+2 < binary.length){
                next = binary[i+2];
            }
        }
        return gap;
    }
    public static void main(String[] args){
       

        System.out.println(binarygap(15));
        System.out.println(binarygap(1041));
        System.out.println(binarygap(32));
        System.out.println(binarygap(356845));
        System.out.println(binarygap(67784));
        System.out.println(binarygap(79896));
        System.out.println(binarygap(123));
    }
}
