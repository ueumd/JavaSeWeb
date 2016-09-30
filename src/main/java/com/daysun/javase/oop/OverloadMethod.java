package com.daysun.javase.oop;

public class OverloadMethod {
	
	//方法重载须 参数类型或参数个数不一致

    /**
     * 　所谓的参数不一样，主要有两点：第一是参数的个数不一样，第二是参数的类型不一样。只要这两方面有其中的一方面不一样就可以构成方法的重载了。
     */
	public int change(int a){
		a++;
		System.out.println(a);
		return a;
	}

	public int change(int a,int c){
		a++;
		System.out.println(a+c);
		return a;
	}
	
	public boolean change(boolean a,boolean b){
		System.out.println(a);
		System.out.println(b);
		if(a){
			return true;
		}else{
			return false;
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadMethod m=new OverloadMethod();
		m.change(1);
		m.change(true,false);

        m.change(1,100);

	}

}
