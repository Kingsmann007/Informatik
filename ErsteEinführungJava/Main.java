import java.util.Scanner;
class Main { public static void main(String[] args){
  	//a1();
	//a2();
	//a3();
	//a4();
	//a5();
	//a6();
	//a7();
	//a8();
	//a9();
	//a10();
	//a11();
	//a12();
	//a13();
	//a14();
	//a15();
	//a16();
	//a17();
	//a18();
	//a19();
	//a20();
	a21();
    }
	//HELLO WORLD
	public static void a1(){
		System.out.println("Hello World"); 
	}
	//Fibonacifolge	
	public static void a2(){
		System.out.println("Fibonacifolge :");
    	int a = 0;
		int b = 1;
		System.out.print(a+",");
		System.out.print(b+",");
		while(b<100){
			int c= a + b;
			a=b;b=c;
			System.out.print(c+",");
		}
		System.out.println();	
	}
	public static void a3(){
		System.out.println("sum");
		System.out.println(sum(13));
	}
	//sum
	public static int sum(int n){
		if(n<0) return 0;
		return n+sum(n-1);
	}
	
	public static void a4(){
		System.out.println("Sum (Schleife)");
		System.out.println(sum1(13));
	}
	//sum (Schleife)
	public static int sum1(int n){
		int a=0;
		for(int b = 0; b<=n;b++){
			a = a + b;
		}
		return a;
	}
	//Fractorial (Schleife)
	public static void a5(){
		System.out.println("Fractorial (schleife)");
		System.out.println(sum2(3));
	}
	public static int sum2(int n){
		int a = 1;
		for(int b = 2; b<=n;b++){
			a = a * b;
		}
		return a;
	}
	//Fractorial
	public static void a6(){
		System.out.println("Fractorial");
		System.out.println(fac1(5));
	}
	public static int fac1(int n){
		if(n<=1) return 1;
		return n*fac1(n-1);
	}
	//Größter gemeinsamer Teiler
	public static void a7(){
		System.out.println("Größter gemeinsamer Teiler");
		System.out.println("bitte zwei Zahlen > 0 eingeben:");
		Scanner eingabewert = new Scanner(System.in);
		int z1 = eingabewert.nextInt();
		Scanner eingabewert1 = new Scanner(System.in);
		int z2 = eingabewert1.nextInt();
		z1=Math.abs(z1);
		z2=Math.abs(z2);
		eingabewert.close();
		eingabewert1.close();
		int b;
		while(z2!=0){
			b=z1%z2;
			z1=z2;
			z2=b;
		}
		System.out.print(z1);
	} 
	public static void a8(){
		System.out.print(gcd1(-20000000,-2));
	}
	public static int gcd1(int a, int b){
		if(b==0) return Math.abs(a);
		return gcd1(b,a%b);
	}
	//kleinste gemeinsame vielvache
	public static void a9(){
		System.out.println();
		System.out.println("Kleinste gemeinsame vielfache");
		System.out.print(kgv(10,5));
	}
	public static int kgv(int z1,int z2){
		int g;
		int k;
		if (z1 > z2){
			g = z1;
			k = z2;
		}else{
			g = z2;
			k = z1;
		}
		for(int a = 1;a <= k;a++){
			int c = 0;
			c = a * g;
			for(int b = 1;b <= g;b++){
				int d = 0;
				d = b * k;
				if(c == d){
					return c;
				}
			}
		}
		System.out.println();
		return 1;
	}
	//is prime?
	public static void a10(){
		System.out.println();
		System.out.println("Primzahlen");
   		//System.out.println(isPrim(7));
	}
	public static boolean isPrim(int n){
		if (n<2) return false;
		for(int a=2;a<n;a++){
			if(n%a==0){
				return false;
			}
		}
		return true;
	}
	//prime test 1
	public static void a11(){
		int b = 0;
		System.out.println("bitte eine Zahl > 0 eingeben:");
		Scanner eingabewert = new Scanner(System.in);
		int a = eingabewert.nextInt();
		eingabewert.close();
		for(int n = 2;n < a;n++){
			if(a%n==0){
				b=b+1;
			}
		}
		if(b==0){
			System.out.print(a+" is prime");
		}
		if(b>0){
		System.out.print(a+" is not prime");
		}
	}
	public static void a12(){
		int a;
		boolean p= true ;
		System.out.println("bitte eine Zahl > 0 eingeben:");
		Scanner eingabewert = new Scanner(System.in);
		a = eingabewert.nextInt();
		eingabewert.close();
		for(int n = 2;n < a;n++){
			if(a%n==0){
				p = false;
				break;
			}
		}
		System.out.print(p);
	}
	public static void a13(){
		System.out.println("Größter gemeinsamer Teiler");
		System.out.println("bitte zwei Zahlen > 0 eingeben:");
		Scanner eingabewert = new Scanner(System.in);
		int z1 = eingabewert.nextInt();
		Scanner eingabewert1 = new Scanner(System.in);
		int z2 = eingabewert1.nextInt();
		eingabewert.close();
		eingabewert1.close();
		for(int a = z1;a >= 1;a--){
			int t1 = 0;
			if(z1%a == 0){
				t1=t1+a;
				for(int b = z2;b>=1;b--){
					int t2 = 0;
					if(z2%b==0){
						t2=t2+b;
						if(t2==t1){
							System.out.print(t1);
							return;
						}
					}
				}
			}	
		}
		System.out.println();
	}
	public static void a14(){
		System.out.println("3x+1");
		Scanner eingabewert = new Scanner(System.in);
		a = eingabewert.nextInt();
		eingabewert.close();
		while(a>=2){
			if(a%2==0){
				a=a/2;
				System.out.print(a+",");
			}else{
				a=a*3+1;
				System.out.print(a+",");	
			}
			if(a==2){
				System.out.print(1);
				break;
			}
		}
	}
	public static int gcd (int a, int b)
	{
		if(b==0) return Math.abs(a);
		return gcd (b,a%b) ;
	}
	public static int gcd3(int a, int b,int c){
		System.out.print(gcd(gcd(c,b),a));
		return 1;
	}
	public static void a15(){
		System.out.print(gcd3(3,18,15));
	}
	public static void a16(){
		int[] a= new int[11];
		for(int b=1;b<=10;b++){
			for(int c=1;c<=10;c++){
				//System.out.println("gcd("+b+","+c+")=");
				int n=gcd(b,c);
				a[n]=a[n]+1;
			}
		}
		for(int i=1;i<=10;i++){
			System.out.println( i+" gibt es "+a[i]+" mal");
		}
	}
	public static void a17(){
		int[] a= new int[8];
		for(int i =0;i<a.length ;i++){
			a[i]=i*5;
			System.out.print(a[i]+",");
		}
	}
	public static void a18(){
		System.out.print("bitte eine Zahl >0 eingeben");
		//scannt eingaben im terminal
		Scanner eingabewert = new Scanner(System.in);
		int z = eingabewert.nextInt();
		eingabewert.close();
		//gibt countPrimes einen Wert
		countPrimes(z);
	}
	public static void countPrimes(int v){
		//erstellt arrays 
		// Math.abs(v)=|v|
		int[] a=new int[Math.abs(v)];
		int j = 0;
		// schleife welche für alle zahlen bis v überprüft ob sie Primzahlen sind
		for(int i=2;i<v;i++){	
			//prüt bei jedem durchgang ob die zahl eine Primzahl ist indem der isPrim code abgerufen wird
			if (isPrim(i)== true){
				//weist die Primzahlen dem array zu
				a[j]=i;
				System.out.print(a[j]+",");
				j++; 
			}		
		}
		int[] b=new int[j+1];
		for(int i=0;i<j;i++){
			b[i]=a[i];
		}
		System.out.println();
		// gibt einen Antwortzatz aus
		System.out.println("In dem Bereich von 0 bis "+v + " gibt es "+j+" primzahlen.");
	}
	public static void a19(){
		
		System.out.print("bitte eine Zahl > 2 eingeben ");
		Scanner eingabewert = new Scanner(System.in);
		int a = eingabewert.nextInt();
		eingabewert.close();
		primDessert(a);
	}
	public static void primDessert(int b){
		int d = 1;
		int e = 0; 
		for(int c = 2;c<=b;c++){
			if(isPrim(c)==false){
				d = d + 1;
			}
			if(isPrim(c)==true){
				if(d>e){
					e=d;
				}
				d=1;
			}
		}
	
		System.out.print("Die größte Primzahlenwüste in dem bereich zwischen 2 und " + b + " ist " + e );
	}
	public static void a20(){
		int a=0;
		int b=0;
		System.out.print("bitte eine Zahl > 0 eingeben ");
		Scanner eingabewert = new Scanner(System.in);
		int y = eingabewert.nextInt();
		System.out.print("bitte eine Zahl > 0 eingeben ");
		Scanner eingabewert2 = new Scanner(System.in);
		int z= eingabewert2.nextInt();
		eingabewert.close();
		eingabewert2.close();
		if(b>a){
			a=z;
			b=y;
		}else{
			a=y;
			b=z;
		}
		primTwins(a,b);
	}
	public static void primTwins(int c, int d){
		int e=0;
		int f=0;
		for(int g = c;g<=d;g++){
			if(isPrim(g)==true){
				if(isPrim(g+2)==true){
					f=g+2;
					e=g;
				}
			}
		}
		System.out.print("das größte zwillingspaar zwischen "+c+" und "+d+" ist "+e+";"+f);
	}
	public static void a21(){
		for(int f=1;f<=4;f++){
			for(int i=f;i<=f+4;i++){
				System.out.print(i+",");
			}
			System.out.println();	
		}
	}
}	