package collection;

import com.google.common.collect.Lists;
import org.apache.commons.collections4.iterators.ReverseListIterator;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ListExample  {


    public List<Integer> toIntegerList(String input){


        return Stream.of(input.split(","))
                .map(String::trim).map(Integer::parseInt).collect(Collectors.toList());
    }
    public List<String> toStringList(String input){


        return Stream.of(input.split(",",-1))
                .collect(Collectors.toList());
    }
    public static void main(String[] args) {
        List<String> names= new ArrayList<>();
        LinkedList<String> namequeue=new LinkedList<>();
        Set<String> set=new TreeSet<>();
        namequeue.add("fasil");
        namequeue.add("zola");
        namequeue.add("alex");
        namequeue.add("hareg");
        System.out.println(namequeue);
        Iterator<String> queue=names.iterator();
        while(queue.hasNext()) {
            System.out.println("hello");
            String temp = queue.next();
        //    if(queue.hasPrevious()) System.out.println(queue.previous());
        //    int index = queue.previousIndex();

            System.out.printf("hello %d ==> %s \n", 2, temp);
            //    if(temp.equalsIgnoreCase("fasil")) names.remove(temp);
            //         System.out.println(names);
        }


        names.add("fasil");
        names.add("zola");
        names.add("alex");
        names.add("hareg");

        System.out.println(names.contains("zola"));
       System.out.println(names.set(1,"zolalem"));
        names.add(2,"jerry");
       System.out.println(names.get(4));
        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if(o1.compareTo(o2)>=1)
                return -1;
                else if(o1.compareTo(o2)<=-1) return 1;
                else return 0;
            }
        });
        Collections.reverse(names);
        System.out.println(names.toString());

        // traverse in reverse order using listIterator and giving the  list.size()
        ListIterator<String> listIterator=names.listIterator(names.size());
        System.out.println("=========using list iterator to reverse==========");
        while(listIterator.hasPrevious()){
            String temp=listIterator.previous();
            int index=listIterator.nextIndex();

            System.out.printf("  %d ==> %s \n",index,temp  );
        //    if(temp.equalsIgnoreCase("fasil")) names.remove(temp);
   //         System.out.println(names);
        }
        System.out.println("=========using apache reverse==========");
        ReverseListIterator<String> reverseListIterator=new ReverseListIterator<>(namequeue);
        while(reverseListIterator.hasNext()){
            String temp=reverseListIterator.next();
            int index=listIterator.nextIndex();

            System.out.printf(" %d ==> %s \n",index,temp  );
            //    if(temp.equalsIgnoreCase("fasil")) names.remove(temp);
            //         System.out.println(names);
        }

        System.out.println("=========using guava reverse==========");
        Lists.reverse(names).forEach(System.out::println);
    }
}
