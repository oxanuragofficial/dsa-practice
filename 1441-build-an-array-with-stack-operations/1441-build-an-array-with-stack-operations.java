class Solution {

    public boolean contains(int [] a, int n){
        for(int i=0; i<a.length; i++){
            if(a[i]==n){
                return true;
            }
        }
        return false;
    }

    public List<String> buildArray(int[] target, int n) {
        List<String> ans=new ArrayList<>();
        int max=0;
        for(int i=0; i<target.length; i++){
            max=Math.max(target[i],max);
        }

        for(int i=1; i<=max; i++){
            if(contains(target,i)){
                ans.add("Push");
                
            }
            else{
                ans.add("Push");
                ans.add("Pop");
            }
        }

        return ans;
    }
}