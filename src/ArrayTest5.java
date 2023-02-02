/*
方法区（元空间）: 当前类的信息 方法 属性

虚拟机栈：方法执行时 会在虚拟机栈开辟空间 方法运行时信息 局部变量

本地方法栈：某些功能需要借助于其他语言实现 C/C++ 其他语言执行时产生的内存信息
          存储到本地方法栈
堆: 存储 对象信息 数组..

程序计数器： 记录下一条指令的位置


 */

public class ArrayTest5 {
    public static void main(String[] args) {
        String[] sArr={"李白","杜甫","王安石","李商隐"};
        for (int i = 0; i < sArr.length; i++) {
            System.out.println("sArr = " + sArr);
        }
        for (String s : sArr) {
            System.out.println(s);
        }
    }
}
