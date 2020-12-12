package collection;

import java.util.*;

public class main {
    public static void main(String[] args) {
        int [] array = new int[15];

        List collection = new ArrayList();
        collection.add("0");                                   //add in list
        collection.add("1");
        collection.add("2");
        collection.add("3");
        collection.add("1");
        collection.set(4,"4");
        for (int i = 0; i < collection.size() ; i++) {
            System.out.println(collection.get(i));
        }
        System.out.println("set element: "+collection.size());

        Queue collection0 = new PriorityQueue();
        collection0.offer("0");                              //offer in Queue
        collection0.offer("1");
        collection0.offer("2");
        collection0.offer("3");
        collection0.offer("4");
        Iterator iterator = collection0.iterator();
        while (iterator.hasNext()){
            System.out.println(collection0.poll());
           // System.out.println(iterator.next());
        }
        System.out.println("element in collection: "+collection0.size());

        Set collection1 =new  HashSet();
        collection1.add("0");                                    //add in Set
        collection1.add("0");
        collection1.add("1");
        collection1.add("1");
        collection1.add("2");
        collection1.add("2");
        collection1.add("3");
        collection1.add("3");
        Iterator iterator1 =collection1.iterator();
         for (Object o:collection1 ){
            System.out.println(o);

        }
        System.out.println("set element: "+collection1.size());

         Map collection2 = new HashMap();
        collection2.put("0","crimson sails");                     //put in Map
        collection2.put("1","Black council");
        collection2.put("2","Polianna.");
        //System.out.println(collection2.get("0"));
        Set set = collection2.keySet();

        for (Object o1:set) {
            System.out.println(o1);
        }
        System.out.println("set element: "+collection2.size());

        Collection collection3 =new  LinkedHashSet();                            //LinkedHashSet cat work in given sequence
        collection3.add("545151");
        collection3.add("4482");
        collection3.add("47498451348");
        collection3.add("123168641");
        for (Object o:collection3) {
            System.out.println(o);
        }

        System.out.println("set element: "+collection3.size());

        Collection collection4 =new TreeSet();                            //TreeSet organizes the sequence
        collection3.add("545151");
        collection3.add("4482");
        collection3.add("47498451348");
        collection3.add("123168641");
        for (Object o:collection4) {
            System.out.println(o);
        }

        System.out.println("set element: "+collection4.size());




    }

}
