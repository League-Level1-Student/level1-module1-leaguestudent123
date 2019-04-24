
public class vault {
public static void main(String[] args) {
	vault dad=new vault();
	boolean mom=dad.trycode(9);
	System.out.println(mom);
}
	int code=10;

boolean trycode(int c) {
	if(code == c) {
		return true;
		
	}
	else {
		 return false;
	}
}
}
