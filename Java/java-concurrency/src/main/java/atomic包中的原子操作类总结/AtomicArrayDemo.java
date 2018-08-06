package atomic包中的原子操作类总结;


import java.util.concurrent.atomic.AtomicIntegerArray;

//原子更新数组类型
public class AtomicArrayDemo {
    private static int[] value=new int[]{1,2,3};
    private static AtomicIntegerArray integerArray=new AtomicIntegerArray(value);

    public static void main(String[] args) {
        int result=integerArray.getAndAdd(1,5);
        System.out.println(integerArray.get(1));
        System.out.println(result);
    }
}
