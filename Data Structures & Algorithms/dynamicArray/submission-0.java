class DynamicArray {
    public int[] arr = new int[9999];
    public int elt = -1;
    public int cap = -1;
    public DynamicArray(int capacity) {
        cap = capacity;
    }

    public int get(int i) {
        return arr[i];
    }

    public void set(int i, int n) {
        arr[i] = n;
    }

    public void pushback(int n) {
        if(elt == cap - 1) {
            resize();
        }
        elt++;
        arr[elt] = n;
    }

    public int popback() {
        elt--;
        return arr[elt+1];
    }   

    private void resize() {
        cap *= 2;
    }

    public int getSize() {
        return elt+1;
    }

    public int getCapacity() {
        return cap;
    }
}
