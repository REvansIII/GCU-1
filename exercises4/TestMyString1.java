package exercises4;

public class TestMyString1 {

	public static void main(String[] args) {
	    MyString1 s = new MyString1(new char[] {'x', 'y', 'z'});
	    System.out.println(s.length());
	    System.out.println(s.charAt(1));
	    System.out.println(s.equals(new MyString1(new char[] {'z', 'y', 'x'})));

	    char[] chars = MyString1.valueOf(123).toChars();
	    for (int i = 0; i < chars.length; i++) {
	      System.out.print(chars[i]);
	    }
	  }
	}
