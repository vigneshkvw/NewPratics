package GenericsExampple;

public class Demo1<T> {
T ar;
Demo1(T ar){
	this.ar=ar;
	
}
public void show(){
	System.out.println(ar);
}
}
