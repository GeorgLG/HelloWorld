
public class HelloWorld {
static int counter =0;
	public static void main(String[] args) {
		
		while(counter<100) {
			counter++;
			if(counter%3==0 && counter%5==0) {
				System.out.println("FizzBuzz");}
				else {
					if(counter%3==0 ) {
						System.out.println("Fizz");}
						else {
							if(counter%5==0) {
								System.out.println("Buzz");
							}
								else{System.out.println(counter);}
							}
			}
		}
	}
}
	


