public class kdprog7 {
    public static void main(String[]args){
		int a=4, b=5;
		float c=6.f, d=7.f;
		char e='8';
		double f=3.14;
		String g="75",h="55", i="100";
		/*menggunakan parse untuk mengkonversi tipe data karakter ke bilangan */
		a=Integer.parseInt(g); /*String ke int*/
		f=Double.parseDouble(h);/*String ke double*/
		c=Float.parseFloat(i); /*String ke float*/
		System.out.println("a="+a+"\nf="+f+"\nc="+c);

		/* menggunakan valueOf untuk konversi tipe data integer ke String*/
		g=String.valueOf(a); /*int ke String*/
		h=String.valueOf(e); /*karakter ke String*/
		i=String.valueOf(d); /*float ke String*/
		System.out.println("g="+a+"\nh="+h+"\ni="+i);

		/*untuk konversi bulat ke tipe data float dan double*/
		f=Double.valueOf(b).intValue(); /*int ke double*/

        Double j= Integer.valueOf(b).doubleValue();

		System.out.println("f="+f+"\nj="+j+"\ni="+i);
	}

    
}
