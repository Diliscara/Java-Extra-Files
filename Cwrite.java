class Cwrite {
	public static void main (String a[]){
		int i,j,n = 0;
		int adjust = 32;
		char c;
		for (i = 0; i<20000 ; i++){
				for(j = 0; j < 80; j++){
					c = (char)(n %43 + 48);
					
					System.out.print(c);
					n++;
				}
				System.out.println();
		}
	}
}
