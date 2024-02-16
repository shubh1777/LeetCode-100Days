class Solution {
    public int findLeastNumOfUniqueInts(int[] arr, int k) {
        Map<Integer,Integer> mp=new HashMap<>();
        ArrayList<Integer> lst=new ArrayList<>();
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(!mp.containsKey(arr[i])){
                mp.put(arr[i],1);
            }
            else{
                mp.put(arr[i],mp.get(arr[i])+1);
            }
        }
        for(int i: mp.values()){
           lst.add(i);
        }
        Collections.sort(lst);
        for(int i=0;i<lst.size();i++){
            if(k>lst.get(i)){
                k-=lst.get(i);
                lst.set(i,0);
            }
            else{
                lst.set(i,lst.get(i)-k);
                k=0;
            }
            if(lst.get(i)!=0){
                ans++;
            }
        }
        return ans;
    }
}
