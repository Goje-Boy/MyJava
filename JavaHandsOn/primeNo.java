//Program to check prime number

public class primeNo {
	int num;
	
	void checkPrime(int number) {
		this.num=number;
		int flag=0;
	
		if(num==1)
			System.out.println("1 is neighter a prime nor a composite number.");
		else {
			for(int i=2;i<=this.num;i++) {
				if(this.num%i==0)
					flag++;
			}
			if(flag==1)
				System.out.println(number+" is Prime");
			else
				System.out.println(number+" is not Prime");
		}
		
	}
	
	public static void main(String[] args) {
		primeNo n1 = new primeNo();
		n1.checkPrime(8);
	}

}
