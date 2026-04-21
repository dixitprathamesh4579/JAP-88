class Solution {
    public void pattern3(int n) {
     int i,j;
     for(i=1;i<=n;i++)
     {
        for(j=1;j<=i;j++)
        {
           System.out.print(j);
        }
        System.out.println(" ");
     }
    }
    public static void main(String[]args){
        Solution s= new Solution();
        s.pattern3(5);
    }
}