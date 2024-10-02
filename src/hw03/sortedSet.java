package hw03;
/**
 * Author:        Adam Dixon
 * Description: This is the sortedSet class which creates generic set methods. 
 */
public class sortedSet<E extends Comparable<E>> {
    private E[] set; // This is the set of values in the sortedSet
    private int size; // This is the number of current elements in the set
   
    sortedSet(){
        this.set = (E[])(new Comparable[10]);
    }

    private sortedSet(int capacity){
        this.set = (E[])(new Comparable[capacity]);
    }

    private sortedSet(E ... values){
        this.set = (E[])(new Comparable[values.length]);
        for (int i = 0; i < values.length; i++) {
            this.set[i] = values[i];
        }
        add((set)[0]);
    }

    public boolean exists(E value) {
        int low = 0;
        int high = size-1;

        while(low<=high){
            int middle = low + (high-low)/2;
            int compare = set[middle].compareTo(value);
            if (compare<0){
                low = middle+1;
            } else if (compare>0){
                high = middle-1;
            }else{
                return true;
            }
        }
        return false;
    }

    public void add(E value){
        int index = 0;
        try {
            if (exists(value)){
                System.out.println("Error: value already exists");
                return;
            }
            if(size == set.length){
                resize();
            }
            while (index < size && value.compareTo(set[index]) > 0){
                index++;
            }
            for (int i = size-1; i >= index; i--) {
                set[i+1] = set[i];
            }
            set[size] = value;
            size++;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void remove(E value){
        int index = 0;
        try {
            while (index < size && value.compareTo(set[index]) != 0){
                index++;
            }
            for (int i = index; i < size-1; i++){
                set[i] = set[i+1];
            }
            size--;
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public E get(int index){
        return set[index];
    }
    
    public int size(){
        return set.length;
    }

   @Override
    public String toString() {
    StringBuilder sb = new StringBuilder("{");
        for (int i = 0; i < size; i++) {
            sb.append(set[i]);
            if (i < size - 1) {
                sb.append(",");
            }
        }
    sb.append("}");
    return sb.toString();
}
    
    private void resize() {
    E[] newSet = (E[])(new Comparable[set.length*2]);
    System.arraycopy(newSet, 0, newSet, 0, set.length);
    set = newSet;
    }
}