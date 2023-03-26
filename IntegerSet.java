public class IntegerSet {
    private boolean present[];
    
    public IntegerSet() {
        present = new boolean[101];
    }

    public void addElement(int x) {
        if(x >= 0 && x <= 100) {
            present[x] = true;
        }
    }
    public void removeElement(int x) {
        if(x >= 0 && x <= 100) {
            present[x] = false;
        }
    }
    public boolean isPresent(int x) {
        if(x >= 0 && x <= 100) {
            return present[x];
        } else {
            return false;
        }
    }
    public String toString() {
        String s = "";
        for(int i=0; i<=100; i++) {
            if(isPresent(i)) {
                s += i + " ";
            }
        }
        return s.trim();
    }
}

    static IntegerSet union(IntegerSet a, IntegerSet b) {
        IntegerSet result = new IntegerSet();
        
        for(int i=0; i<=100; i++) {
            if(a.isPresent(i) || b.isPresent(i)) {
                result.addElement(i);
            }
        }
        
        return result;
    }
    
    static IntegerSet intersection(IntegerSet a, IntegerSet b) {
        IntegerSet result = new IntegerSet();
        
        for(int i=0; i<=100; i++) {
            if(a.isPresent(i) && b.isPresent(i)) {
                result.addElement(i);
            }
        }
        
        return result;
    }