class Solution {
    private final int mod=1000000007;
    public int sumSubarrayMins(int[] arr) {
      int n=arr.length;
      Stack<Integer> s1=new Stack<>();
      Stack<Integer> s2=new Stack<>();  
      long[] l=new long[n];
      long[] r=new long[n];

      for(int i=0;i<n;i++){
          while(!s1.isEmpty() && arr[s1.peek()]> arr[i]){
              s1.pop();
          }
          l[i]=s1.isEmpty() ? i+1:i-s1.peek();
          s1.push(i);
      }

      for(int i=n-1;i>=0;--i){
          while(!s2.isEmpty() && arr[s2.peek()]>=arr[i]){
              s2.pop();
          }
          r[i]=s2.isEmpty() ? n-i :s2.peek()-i;
          s2.push(i);
      }
      long res=0;
      for(int i=0;i<n;i++){
          res=(res + arr[i] * l[i] * r[i])%mod;
      }
      return (int) res;
    }
}