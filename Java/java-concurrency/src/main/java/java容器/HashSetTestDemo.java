package java容器;

import java.util.*;

public class HashSetTestDemo {
    //nameList中可以存在重复元素，且顺序跟插入顺序相同
    public static void main(String[] args) {
        List<String> nameList=new ArrayList<String>();
        nameList.add("Alice");
        nameList.add("Frank");
        nameList.add("Charles");
        nameList.add("Emma");
        nameList.add("Jessie");
        nameList.add("Frank");
        System.out.println(nameList);

        //将列表里的元素插入到Set后，可以去除重复元素，但是没有顺序
        System.out.println("=====add====");
        Set<String> nameSet=new HashSet<String>();
        for (String name:nameList) {
            nameSet.add(name);
        }

        System.out.println(nameSet);

        System.out.println("===contains===");
        System.out.println(nameSet.contains("Frank"));
        System.out.println(nameSet.contains("Bob"));

        System.out.println(nameSet.containsAll(nameList));

        System.out.println("====remove====");
        nameSet.remove("Frank");
        System.out.println(nameSet);


        nameSet.forEach(System.out::println);

        System.out.println("====Iterator====");
        Iterator iterator=nameSet.iterator();

        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
