package String操作;

import com.google.common.base.Joiner;

import java.util.ArrayList;
import java.util.List;

public class guavaList {
    public static void main(String[] args) {
    /**
    　　* @Description: 将集合转换为特定规则的字符串
    　　*/

    //use java
        List<String> list=new ArrayList<String>();
        list.add("aa");
        list.add("bb");
        list.add("cc");

        String str="";

        for (int i = 0; i <list.size() ; i++) {
            str=str+"-"+list.get(i);
        }

        System.out.println(str);


    //use guava

    List<String> list1=new ArrayList<String>();
        list1.add("aa");
        list1.add("bb");
        list1.add("cc");

        String result=Joiner.on("-").join(list1);

        System.out.println(result);

    }
}
