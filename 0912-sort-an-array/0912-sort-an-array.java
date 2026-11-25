class Solution {
    public int[] sortArray(int[] num) {
        if(num.length <= 1){
            return num;
        }
        int m=num.length/2;

        int[] l=new int[m];
        int[] r=new int[num.length-m];

        for(int i=0;i<m;i++){
            l[i]=num[i];
        }

        for(int i =m; i<num.length;i++){
            r[i-m]=num[i];
        }

        sortArray(l);
        sortArray(r);

        merge(num,l,r);

        return num;
       }

        public void merge(int[] num, int[] l, int[] r) {

        int i = 0, j = 0, k = 0;

        while(i < l.length && j < r.length) {
            if(l[i] < r[j]) {
                num[k] = l[i];
                i++;
            } else {
                num[k] = r[j];
                j++;
            }
            k++;
        }

        while(i < l.length) {
            num[k] = l[i];
            i++;
            k++;
        }

        while(j < r.length) {
            num[k] = r[j];
            j++;
            k++;
        }
        
    }
}