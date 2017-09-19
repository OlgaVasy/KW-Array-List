/**
 * KWArrayListTest.java
 */
public class KWArrayListTest {

   public static void main(String[] args) {

     KWArrayList<String> list1 = new KWArrayList<>();
     KWArrayList<Integer> list2 = new KWArrayList<>();
     KWArrayList<String> list3 = new KWArrayList<>();

     list1.add("Yellow");
     System.out.print("The first list: ");
     for (int i = 0; i<list1.getSize(); i++){
         System.out.println(list1.get(i));
      }

     list2.add(1);
     list2.add(2);
     System.out.print("The second list: ");
     for (int i = 0; i<list2.getSize(); i++){
          System.out.printf("%s ",list2.get(i));
      }
     System.out.println("");

     list3.add("One");
     list3.add("Two");
     list3.add("Three");
     list3.add("Four");
     list3.add("Five");
     System.out.print("The third list: ");
     for (int i = 0; i<list3.getSize(); i++){
         System.out.printf("%s " ,list3.get(i));
      }

      list1.moving();
      list2.moving();
      list3.moving();

      System.out.println("");
      System.out.println("");
      System.out.println("After moving an element from the end of the list to the list's beginning");
      System.out.print("The first list: ");
      for (int i = 0; i<list1.getSize(); i++){
         System.out.println(list1.get(i));
      }
      System.out.print("The second list: ");
      for (int i = 0; i<list2.getSize(); i++){
         System.out.printf("%s ",list2.get(i));
      }
      System.out.println("");
      System.out.print("The third list: ");
      for (int i = 0; i<list3.getSize(); i++){
         System.out.printf("%s " ,list3.get(i));
      }
}}
