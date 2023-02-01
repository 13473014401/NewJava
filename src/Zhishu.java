class Zhishu{
	public static void main(String [] args){
		java.util.Scanner in = new java.util.Scanner(System.in);

		System.out.println("请输入数字：");
		int num = in.nextInt();
		boolean flag=true;
		for (int i = 2;i<num;i++){
			if(num%i==0){
				flag=false;
			}

		}
		if(flag==true){
			System.out.println("是质数");
		}else{
			System.out.println("不是质数");
		}

	}

}