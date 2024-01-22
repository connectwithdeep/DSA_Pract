import java.util.*;
public class collection {
    public static void lists(){
        List<Integer> ls= new ArrayList<>();
        ls.add(1);
        ls.add(4);
        ls.add(9);
        ls.add(7);
        System.out.println(ls);
        ls.add(4,120);
        System.out.println(ls);
        ls.add(2,12);
        System.out.println(ls);
        
        //passing complete list to another list
        List<Integer> newls=new ArrayList<>();
        newls.addAll(ls);
        System.out.println(newls);
        //for getting a particular elemnt from list
        System.out.println(ls.get(0));
        //for removing from list
        ls.remove(3);
        ls.remove(Integer.valueOf(4));
        System.out.println(ls);
        //for updating/changing
        ls.set(1,100);
        //for checking value present or not
        System.out.println(ls.contains(7));
        for(Integer i:ls){
            System.out.println(i);
        }

    }
    public static void stacks(){
         Stack<String> st=new Stack<>();
         st.push("A");
         st.push("B");
         st.push("C");
         st.push("D");
         st.push("E");
         System.out.println(st.peek());
         st.pop();
         System.out.println(st);
         st.remove(3);
    }
    public static void queues(){
        Queue<Integer> q=new LinkedList<>();
        q.offer(43);
        q.offer(3);
        q.offer(4);
        q.offer(9);
        System.out.println(q.peek());
        q.poll(); //for removing
        System.out.println(q.peek());
//remove(),add(),element() also work but throws exception if list is empty
    }
    public static void priorq(){ 
        //min-heap
        PriorityQueue<Integer> pq=new PriorityQueue<>();
        //all queue method can be changed
        pq.offer(43);
        pq.offer(3);
        pq.offer(4);
        pq.offer(9);
        System.out.println(pq);
        pq.poll(); //for removing
        System.out.println(pq);
        //max-heap
        PriorityQueue<Integer> pq2=new PriorityQueue<>(Comparator.reverseOrder());
        //all queue method can be changed
        pq2.offer(43);
        pq2.offer(3);
        pq2.offer(4);
        pq2.offer(9);
        System.out.println(pq2);
        pq2.poll(); //for removing
        System.out.println(pq2);
    }

    public static void arraydq(){
        ArrayDeque<Integer> adq=new ArrayDeque<>();
        adq.offer(23);
        adq.offerFirst(4); 
        adq.offerLast(89);
        System.out.println(adq);
        // same for peekFirst() peek(Last)
        //pollFirst() pollLast()
    }
    public static void hashsets(){
        //no duplicate elements are sotored
        //order is also note deifned it acts like a bag in hasset
        HashSet<Integer> hs=new HashSet<>();
        hs.add(6);
        hs.add(19);
        hs.add(9);
        hs.add(6);
        hs.add(6);
        System.out.println(hs);
        hs.remove(6);
        System.out.println(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains(5));
        hs.clear();
        System.out.println(hs);  
    }
    public static void lhsets(){
        //order is maintained in linkedhashset
        LinkedHashSet<Integer> hs=new LinkedHashSet<>();
        hs.add(6);
        hs.add(19);
        hs.add(9);
        hs.add(6);
        hs.add(6);
        System.out.println(hs);
        hs.remove(6);
        System.out.println(hs);
        System.out.println(hs.isEmpty());
        System.out.println(hs.contains(5));
        hs.clear();
        System.out.println(hs);  
    }
    public static void Treesets(){
        // store in sorted form
        //binary search tree (logn)
       Set<Integer> s=new TreeSet<>();
        s.add(6);
        s.add(19);
        s.add(9);
        s.add(89);
        s.add(6);
        System.out.println(s);
        s.remove(6);
        System.out.println(s);
        System.out.println(s.isEmpty());
        System.out.println(s.contains(5));
        s.clear();
        System.out.println(s);  
    }
    public static void hashmap(){
        Map<String, Integer> hm = new HashMap<>();
        hm.put("One", 1);
        hm.put("Two", 2);
        hm.put("Three", 3);
        // if(!hm.containsKey("Two")){
        //     hm.put("Two",213);
        // }
        hm.putIfAbsent("Three", 9);
        System.out.println(hm);
        for(Map.Entry<String,Integer> a: hm.entrySet()){
            System.out.println(a.getKey());
            System.out.println(a.getValue());
        }
        for(String s:hm.keySet()){
            System.out.println(s);
        }
        for(Integer s:hm.values()){
            System.out.println(s);
        }
        //same for treemap but it sorts the key
    }
    public static void main(String[]args){
            hashmap(); 
    }

}
