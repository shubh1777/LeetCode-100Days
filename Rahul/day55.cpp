int arr[26]={0};
        for(auto i:s){
            arr[i-'a']++;
        }
        int ans = 0;
        for(auto i: t){
            if(arr[i-'a']<=0){
                ans++;
            }
            arr[i-'a']--;
        }
       return ans;