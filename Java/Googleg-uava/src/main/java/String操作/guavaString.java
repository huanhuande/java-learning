package String操作;

import com.google.common.base.Splitter;

import java.util.ArrayList;
import java.util.List;

public class guavaString {
    public static void main(String[] args) {
        /**
        　　* @Description: 将String转换为特定的集合
        　　*/

        //use java
        List<String> list=new ArrayList<String>();
        String a="1-2-3-4-5-6";
        String [] strs=a.split("-");
        for (int i = 0; i <strs.length ; i++) {
            list.add(strs[i]);
        }

        System.out.println(list);

        //use guava

        String str="1-2-3-4-5-6";
        List<String> list1=Splitter.on("-").splitToList(str);
        System.out.println(list1);

        /**
        　　* @Description: omitEmptyStrings().trimResults() 去除空串与空格
        　　*/

        String str1="1-2-3-4- 5- 6";
        List<String> list2=Splitter.on("-").omitEmptyStrings().trimResults().splitToList(str1);
        System.out.println(list2);
    }
}
