package Bean_Life_cycle;

public class dummy {
	public static int add(int x,int y) {
		return x+y;
	}
public static void main(String[] args) {
	
	
}
@PostConstruct
public void postConstruct() {
	System.out.println(add(2,3));
}

@PreDestroy
public void preDestroy() {
	System.out.println(add(3,3));
}
}
