public class ASCII1 {

public class Patterns {

public void main(String[] args) {
		        //To DO
System.out.println(first());
System.out.println(second());
System.out.println(first());
System.out.println(third());
System.out.println(first());
}

private String first()  {
String s1 = "+---------+";
return s1;
		    }

private String second() {
String s2 = "|    *    |\n" +
		        "|   /*\\   |\n" +
		        "|  //*\\\\  |\n" +
		        "| ///*\\\\\\ |\n" +
		        "| \\\\\\*/// |\n" +
		         "|  \\\\*//  |\n" +
		          "|   \\*/   |\n" +
		            "|    *    |";
		        return s2;
		    }

private String third() {
	 String s3 = "| \\\\\\*/// |\n" +
   "|  \\\\*//  |\n" +
	"|   \\*/   |\n" +
		                "|    *    |\n" +
		                "|    *    |\n" +
		                "|   /*\\   |\n" +
		                "|  //*\\\\  |\n" +
		                "| ///*\\\\\\ |";
		        return s3;

    }
}