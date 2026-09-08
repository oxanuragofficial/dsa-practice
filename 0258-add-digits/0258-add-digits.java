class Solution {
    public int addDigits(int num) {
       
        int sum=num;
        while(sum/10!=0){
            int temp=sum;
            sum=0;
        while(temp!=0){
            int digit=temp%10;
            sum+=digit;
            temp/=10;
        }

        }

        return sum;

    }
}