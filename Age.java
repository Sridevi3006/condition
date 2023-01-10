package condition;

public class Age {
	
		public static void main(String[]args) {
			int age = 24;
			if(age>0 && age<=12) {
				System.out.println("child");
			}
			else if(age>12 && age<=18) {
				System.out.println("teen");
			}
			else if(age>18 && age<=35) {
				System.out.println("adult");

			}
			else if(age>35 && age<=60) {
				System.out.println("senio");

			}
			else {
				System.out.println("invalid");

			}
			
		}
	}
			
			
		

		

		




