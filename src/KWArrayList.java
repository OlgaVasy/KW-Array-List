import java.util.Arrays;
/**
 * Task 1: KWArrayList.java
 */

public class KWArrayList<E> {

   private static final int INITIAL_CAPACITY = 10;
   private E[] theData;
   private int size = 0;
   private int capacity = 0;

   public KWArrayList(){
      capacity = INITIAL_CAPACITY;
      theData = (E[]) new Object[capacity];
   }
   public void reallocate(){
      capacity = 2*capacity;
      theData = Arrays.copyOf(theData,capacity);
   }
   public boolean add(E anEntry){
      if (size == capacity){
         reallocate();}
         theData[size] = anEntry;
      size++;
      return true;}

   public E get(int index){
      if (index <0 || index >= size){
         throw new ArrayIndexOutOfBoundsException(index);}
         return theData[index];
      }
   //removes an element from the end of the list and inserts it at the list’s beginning
   public void moving(){

      for (int i = size; i>0 ;i--){
         theData[i]= theData[i-1];
      }
      theData[0]=theData[size];
   }
   public int getSize() {
      return size;
   }
}
