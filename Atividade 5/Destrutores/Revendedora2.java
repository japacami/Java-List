public class Revendedora2 {
	
	public static void main (String args[])
	
	{
		Automovel_2 C = new Automovel_2(2000, "Ford", 5000.00);
		
		C.mostracaroo();
		
		//método finalizador
		C = null;
		System.gc();
		C.mostracaroo();
	}
}