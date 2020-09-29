package week13c;


public class addition {
	
	
	
	int add(int a,int b) {
		return(a+b);
	}
	
	
	int add(int a,int b,int c) {
		return(a+b+c);
	}
	
	static void add(double a,double b) {
		double p,m,c;
		p=a;
		m=b;
		c=p+m;
		System.out.println("no call add method with two int parameter "+c);
	}
	
	
	
	public static void main(String[]args) {
		
		addition o1 = new addition();
		System.out.println("call add method with two int parameter "+o1.add(10, 100));
		System.out.println("call add method with two int parameter "+o1.add(10, 100-44));
		add(5.1,20.7);
	}
}
