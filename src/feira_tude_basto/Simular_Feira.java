package feira_tude_basto;

public class Simular_Feira {

	public static void main(String[] args) {
		Feira a = new Fruta();
		a.set_fruta(a.comprar);
		a.chama_comprar_fruta();
		
		Feira b = new Verdura();
		b.set_verdura(b.comprar);
		b.chama_comprar_verdura();

	}

}
