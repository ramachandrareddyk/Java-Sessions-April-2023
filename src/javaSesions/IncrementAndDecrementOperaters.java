package javaSesions;

public class IncrementAndDecrementOperaters {

	public static void main(String[] args) {
		
		
		//1. Post Increment
		//2. Pre incremet
		//3. Post Decrement
		//4. pre decrement
		
		//1. Post Increment
		int a=1;//2
		
		int b=a++;//1
		
		System.out.println(a);
		System.out.println(b);
		
		int c=-99;//-98
		int d=c++;//-99

		System.out.println(c);
		System.out.println(d);
		
		int e=999;//1000
		int f=e++;//999

		System.out.println(e);
		System.out.println(f);
		
		int g=10;//11
		
		int h=g++;//10
		
		//2. Pre incremet
		
		int i=100;//101
		
		int j=++i;//101
		System.out.println(i);
		System.out.println(j);
		
		int k=-99;//-98
		int l=++k;//-98
		System.out.println(k);
		System.out.println(l);
		
		int m=0;
		int n=++m;
		System.out.println(m);
		System.out.println(n);
		
		//3. Post Decrement
		int x=2;
		int y=x--;
		
		System.out.println(x);//1
		System.out.println(y);//2
		
		int p=-9;
		int q=p--;
		
		System.out.println(p);//-10
		System.out.println(q);//-9
		
		//4. pre decrement
		
		int t=2;
		int u=--t;
		System.out.println(t);//1
		System.out.println(u);//1
		
		int w=-99;
		int v=--w;
		
		System.out.println(w);//-100
		System.out.println(v);//-100
		
		int total=100;
		
		System.out.println(total++);//101   100
		System.out.println(total);//100   101
		
		int bal=999;
		System.out.println(++bal);//1000
		System.out.println(bal);//1000
	}

}
