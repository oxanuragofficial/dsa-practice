class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        int n=arr.length;
        HashSet<Integer> set = new HashSet<>();
        for (int num : arr) {
            set.add(num);
        }

        ArrayList<Integer> freq = new ArrayList<>(set);
        int [] ar=new int[freq.size()];
        for(int i=0; i<freq.size(); i++){
            int count=0;
            for(int j=0; j<n; j++){
                
                if (freq.get(i) == arr[j]) {
                    count++;
                }
            }
            ar[i]=count;
        }

        for(int i=0; i<ar.length; i++){
            for(int j=0; j<ar.length; j++){
                if(i==j){
                    continue;
                  }
                    if(ar[i]==ar[j]){
                    return false;
                      }
                    }
                }
        return true;
    }
}