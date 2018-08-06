package String操作;

import com.google.common.base.Joiner;
import com.google.common.base.Splitter;
import com.google.common.collect.Maps;

import java.util.HashMap;
import java.util.Map;

public class guavaMap {
    public static void main(String[] args) {
        /**
        　　* @Description: 将集合转换为特定规则的字符串
        　　*/

        Map<String,Integer>map= Maps.newHashMap();
        map.put("xiaoming",12);
        map.put("xiaohong",13);
        String result=Joiner.on(",").withKeyValueSeparator("=").join(map);
        System.out.println(result);

        /**
        　　* @Description: 将String转换为map
        　　*/

        String str="xiaoming=11,xiaohong=12";
        Map<String,String>map1=Splitter.on(",").withKeyValueSeparator("=").split(str);
        System.out.println(map1);

    }
}
