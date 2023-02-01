/*
   数字遍历：
    遍历：将数组元素一个个的显示出来
     如果不需要下表可以采用增强for
     for(数组元素数据类型 变量名:数组名){
        变量名：每循环一次代表获取一个元素
     }
 */
public class ArrayTest4 {
    public static void main(String[] args) {

            String[] sArr={"李白","杜甫","王安石","李商隐"};
        for (int i = 0; i < sArr.length; i++) {
            System.out.println("sArr["+i+"] = " + sArr[i]);
        }

        System.out.println("---------- 增强for ----------");
        double dArr []={3.14,6.28,9.26};
        for(double ele:dArr){
            System.out.println("ele = " + ele);
        }


        String[] sArr1 = {"安其拉","米莱迪","王昭君","孙尚香"};
        for(String s:sArr1){
            System.out.println("s = " + s);
        }
    }
}
