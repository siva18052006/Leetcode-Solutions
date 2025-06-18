class MyHashMap {
        private HashMap<Integer,Integer> obj;
        public MyHashMap(){
            obj=new HashMap<>();
        }
    
    public void put(int key, int value) {
        obj.put(key,value);
    }
    
    public int get(int key) {
        if(obj.containsKey(key)){
            return obj.get(key);
        }
        return -1;
    }
    
    public void remove(int key) {
        obj.remove(key);
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */