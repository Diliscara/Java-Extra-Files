//challenge 1 - add 5 inputs
class Input {
	public static void main (String a[]){
		String input1, input2, input3, input4, input5;
		int ai, bi, ci, di, ei, fi, gi, hi, ji;
		int sum, diff, pro, div;
		ai = Integer.parseInt(a[0]);
		bi = Integer.parseInt(a[1]);
		ci = Integer.parseInt(a[2]);
		di = Integer.parseInt(a[3]);
		ei = Integer.parseInt(a[4]);
		fi = Integer.parseInt(a[5]);
		gi = Integer.parseInt(a[6]);
		hi = Integer.parseInt(a[7]);
		ji = Integer.parseInt(a[8]);
		
		System.out.print(ai+" ");
		System.out.print(bi+" ");
		System.out.print(ci+" ");
		System.out.print(di+" ");
		System.out.print(ei+" ");
		System.out.print(fi+" ");
		System.out.print(gi+" ");
		System.out.print(hi+" ");
		System.out.print(ji+" ");
		System.out.print(ai+bi+ci+di+ei+fi+gi+hi+ji+"\n");
		sum = ai + bi + ci + di + ei + fi + gi + hi + ji;
		diff = - (ai) - bi - ci - di - ei - fi - gi - hi - ji;
		pro = ai * bi * ci * di * ei * fi * gi * hi * ji;
		div = ai / bi / ci / di / ei / fi / gi / hi / ji;
		
		System.out.println("sum= "+sum);
		System.out.println("diff= "+diff);
		System.out.println("pro= "+pro);
		System.out.println("div= "+div);
		System.out.println("\n");
	}
}
