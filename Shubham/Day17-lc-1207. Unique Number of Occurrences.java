class Solution {
    public boolean uniqueOccurrences(int[] arr) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            if (hashMap.containsKey(arr[i])){
                hashMap.put(arr[i], hashMap.get(arr[i]) + 1);
            }
            else{
                hashMap.put(arr[i], 1);
            }
        }
        HashSet<Integer> hashSet = new HashSet<>();
       
        for (Map.Entry<Integer, Integer> mapElement : hashMap.entrySet()){
            if (!hashSet.add(mapElement.getValue())){
                return false;
            }
        }
        return true;



        // Arrays.sort(arr);
        // int[] v= new int[arr.length];
        // int idx=0;

        // for(int i=0;i<arr.length;i++){
        //     int c=1;

        //     while(i+1< arr.length && arr[i]==arr[i+1]){
        //         c++;
        //         i++;
        //     }
        //     v[idx++]=c;
        // }
        // Arrays.sort(v);
        // for(int i=1;i<v.length;i++){
        //     if(v[i]==v[i-1]){
        //         return false;
        //     }
        // }
        // return true;
    }
}