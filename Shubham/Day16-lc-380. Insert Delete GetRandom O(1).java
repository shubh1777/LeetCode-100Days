class RandomizedSet {
    public ArrayList<Integer> A;
    public Map<Integer,Integer> mp;

    public RandomizedSet() {
        A=new ArrayList<>();
        mp=new HashMap<>();
        
    }
    public boolean check(int val){
        return mp.containsKey(val);

    }
    
    public boolean insert(int val) {
        if(check(val)){
            return false;
        }
        A.add(val);
        mp.put(val,A.size()-1);
        return true;
    }
    
    public boolean remove(int val) {
        if(!check(val)){
            return false;
        }
        int i=mp.get(val);
        A.set(i,A.get(A.size()-1));
        mp.put(A.get(i),i);
        A.remove(A.size()-1);
        mp.remove(val);
        return true;
        
    }
    
    public int getRandom() {
     Random n=new Random();
     return A.get(n.nextInt(A.size()));   
    }
}

/**
 * Your RandomizedSet object will be instantiated and called as such:
 * RandomizedSet obj = new RandomizedSet();
 * boolean param_1 = obj.insert(val);
 * boolean param_2 = obj.remove(val);
 * int param_3 = obj.getRandom();
 */