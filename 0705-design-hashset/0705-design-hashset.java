import java.util.*;
class MyHashSet {
        
        Vector<Integer> vector;
        int size;

    public MyHashSet() {
        
            size = 1000001;
            vector = new Vector<Integer>(size);
            
            for(int i=0;i<size;i++){
                    vector.add(0);
            }
    }
    
    public void add(int key) {
        
            vector.set(key , 1);
        
    }
    
    public void remove(int key) {
          vector.set(key , 0);
        
    }
    
    public boolean contains(int key) {
        return vector.get(key)==1;
    }
}

/**
 * Your MyHashSet object will be instantiated and called as such:
 * MyHashSet obj = new MyHashSet();
 * obj.add(key);
 * obj.remove(key);
 * boolean param_3 = obj.contains(key);
 */