package condition;

public class GreaterThan {
	
		public static void main(String[]args) {
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			int d=Integer.parseInt(args[3]);
			if(a>b && a>c && a>d) {
				System.out.println("a");

			}
			else if(b>a && b>c && b>d) {
				System.out.println("b");

			}
			else if(c>a && c>a && c>d ) {
				System.out.println("c");
				}
			else {
				System.out.println("d");

			}



		}

	}



