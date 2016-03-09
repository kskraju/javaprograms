package com.gym.javap.singleton;

public class Singleton {
	private static Singleton singleton = null;
	private Singleton(){	}
	public static Singleton getInstance(){
		if(singleton == null){
			synchronized (Singleton.class) {
				if(singleton == null)
					singleton = new Singleton();
			}
		}
		return singleton;
	}
	public Object clone() throws CloneNotSupportedException {
		throw new CloneNotSupportedException();
	}
	public void getSomeThing(){
        // do something here
        System.out.println("I am here....");
    }
     
    public static void main(String a[]){
    	Singleton st = Singleton.getInstance();
    	Singleton st1 = Singleton.getInstance();
    	st.getSomeThing();
        st1.getSomeThing();
    }
}