/*
* 1. 输出 2-100内的数
* 2. 对每一个数进行校验
*       是质数 输出
*       否则不输出
*
*
* */

public class ZhiShuTest {
    public static void main(String[] args) {
        for (int i = 2; i <= 100; i++) {
            boolean flag = true;
            for (int j = 2; j <i; j++) {
                if (i%j==0){
                    flag = false;
                    break;
                }
            }
            if (flag==true){
                System.out.println(i + "是质数");
            }
        }

    }
}
