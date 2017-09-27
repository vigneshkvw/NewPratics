package GenericsExampple;

import java.util.ArrayList;

public class Demo {
public static void main(String[] args){
	Demo1<String> A=new Demo1 <String>("viki");
	A.show();
	ArrayList<String> Q=new ArrayList<String>();
	Q.add("viki11");
	Q.add("waran");
	System.out.println(Q);
}
}
