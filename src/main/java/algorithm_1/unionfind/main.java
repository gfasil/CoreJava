package algorithm_1.unionfind;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class main {

    static Exception p(int i){

        throw new RuntimeException();
    }

    public static void main(String[] args) throws ClassNotFoundException {
        List<? extends Union> union= Arrays.asList(new QuickFind(12));

        Union x=union.get(0);
        List<? super QuickFind> qf=new ArrayList<>();

        qf.add(new QuickFind(12));
       // Union q=qf.get(0);
        System.out.println(Math.class.getClassLoader());
        System.out.println(main.class.getClassLoader());

    /*    System.out.println("Classloader of Logging:"
                + Logging.class.getClassLoader());*/
        Class type=Class.forName("algorithm_1.unionfind.WeightedQuickUnionFind");

   //     System.out.println(type.getCount());
     //   Object u= type.getClassLoader().loadClass("algorithm_1.unionfind.WeightedQuickUnionFind");
       // Arrays.stream(type.getDeclaredFields()).forEach(name-> System.out.println(name));
p(1);
    }
}
