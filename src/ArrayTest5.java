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
