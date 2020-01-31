package leetCodePblms;

public class ReverseInteger {
	int rev,no;
	public int reverse(int x) {
		/*int i_x =Integer.parseInt(x); 
        int j = i_x<0?i_x*(-1):i_x;*/
		//String j="";
        /*if(x.contains("-")) {
        	x = x.substring(1, x.length());
        	return (Integer.parseInt(new StringBuilder(x).reverse().toString()))*-1;
        }
        return Integer.parseInt(new StringBuilder(x).reverse().toString());*/
		while(x!=0){
            rev=(rev*10)+(x%10);
            if(rev>Integer.MAX_VALUE||rev<Integer.MIN_VALUE) {
            	return 0;
            }
            x/=10;
        }
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
        return rev;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int no = "9646324351";
		int no = -123;
		int revInt = new ReverseInteger().reverse(no);
		System.out.println("Reverse is "+revInt);
	}

}
