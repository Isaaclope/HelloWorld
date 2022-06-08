public class {
	public static void main(String[] args)
	
}


byte numeroByte = 5;
short numeroShort = 128;
int numeroInt = 40000;
long numeroLong = 2222222222L;
float numeroFloat = 2.3f;
double numeroDouble = 2.5;
boolean variableBooleana = false;

//133
System.out.println(numeroByte + numeroShort);
//2222262222
System.out.println(numeroInt + numeroLong);
//7.3
System.out.println(numeroByte + numeroFloat);
//40002.3
System.out.println(numeroInt + numeroFloat);
//4.799999952316284
System.out.println(numeroFloat + numeroDouble);
// error porque no se puede sumar un variable numérica con una variable booleana
//System.out.println(numeroByte + variableBooleana);


