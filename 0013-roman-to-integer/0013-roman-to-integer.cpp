class Solution {
public:
int returnNumber(char a){
    if(a=='I')return 1;
    if(a=='V')return 5;
    if(a=='X')return 10;
    if(a=='L')return 50;
    if(a=='C')return 100;
    if(a=='D')return 500;
    if(a=='M')return 1000;
    return 0;
}
    int romanToInt(string s) {
        int curr=0;
        int next=0;
        int sum=0;
        int n=s.size();
        for(int i=0; i<n; i++){
            curr=returnNumber(s[i]);
            if(i<n-1){
            next=returnNumber(s[i+1]);
            }
            if(curr>=next){
                sum+=curr;
            }
            if(curr<next){
                sum-=curr;
            }
        }
        return sum;

    }
};