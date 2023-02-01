/*
 数组 ：
      存储【相同类型】数据的【有序】【集合】
      有序：下标 顺序
      集合：多个数据聚集到一起

想要使用数组需要完成数组的声明和赋值
    数组的声明：
        数据类型[] 数组名；
        数据类型 数组名[];
    数组的初始化：
        静态初始化：赋值完成后就知道数组内存储的元素是什么
            方式一：数据类型[] 数组名 = {值1，值2，值3}；
            方式二：数据类型[] 数组名 = new 数据类型[]{值1，值2，值3}；
                    声明和赋值可以分开：
                        数据类型[] 数组名；
                        数组名 = new 数据类型[]{值1，值2，值3}
        动态初始化：赋值完成后知道数组可以存储几个元素，但是具体存储什么不清楚,现在存储的是该类型的默认值
            数据类型[] 数组名 = new 数据类型[数字]；

    注意：
        1.默认值问题
            基本数据类型
                byte short int long 0
                float double 0.0
                boolean false
                char 0 用 \u0000存储 表现出来的形式就是个空格
            引用类型数据（不是基本数据类型就是引用数据类型）：
                null
 */

public class ArrayTest3 {
    public static void main(String[] args) {
        int[] arr = new int[3];
        arr[0]=666;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr.length);

        double[] dArr = new double[6];
        System.out.println(dArr[0]);
        System.out.println(dArr[1]);

        String[] strArr = new String[5];

        System.out.println(strArr.length);
        System.out.println("strArr[0] = " + strArr[0]);
        char[] cArr = new char[3];
        System.out.println("cArr[0] = " + cArr[0]);
        byte[] bArr = new byte[3];
        System.out.println("bArr = " + bArr[0]);
        short[] sArr = new short[3];
        System.out.println("sArr = " + sArr[0]);
        float[] fArr = new float[3];
        System.out.println("fArr = " + fArr[0]);
        long[] lArr = new long[3];
        System.out.println("lArr = " + lArr[0]);
        boolean[] boArr = new boolean[2];
        System.out.println("boArr = " + boArr[0]);

    }

}
