
class Solution {
    public void sortColors(int[] num) {
        int c0=0;
        int c1=0;
        int c2=0;

        for(int i =0;i<num.length;i++){
            if(num[i]==0){
                c0++;
            }
            else if (num[i]==1){
                c1++;
            }
            else{
                c2++;
            }
        }
        int i=0;
        while(c0>0){
            num[i]=0;
            i++;
            c0--;
        }
        while(c1>0){
            num[i]=1;
            i++;
            c1--;
        }
        while(c2>0){
            num[i]=2;
            i++;
            c2--;
        }
    }
}
