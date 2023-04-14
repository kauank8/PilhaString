package br.com.KauanPaulino.pilhaString;

public class Pilha {
	No topo;
	
	public Pilha() {
		topo=null;
	}
	
	public boolean isEmpty() {
		if(topo==null) {
			return true;		
		}
		else {
			return false;
		}
	}
	
	public void push(String e) {
		No elemento = new No();
		elemento.dado=e;
		if(isEmpty()){
			topo=elemento;
		}
		else {
			elemento.proximo=topo;
			topo=elemento;
		}
	}
	
	public String pop() throws Exception {
		if(isEmpty()) {
			throw new Exception("Não há valores para desempilhar");
		}
		String valor = topo.dado;
		topo=topo.proximo;
		return valor;
	}
	
	public String top() throws Exception {
		if(isEmpty()) {
			throw new Exception("Não há valores para desempilhar");
		}
		String valor = topo.dado;
		return valor;
	}
	
	public int size(){
		int ctd=0;
		if(!isEmpty()) {
			No aux = topo;
			ctd=1;
			while(aux.proximo !=null) {
				ctd +=1;
				aux=aux.proximo;
			}
		}
		return ctd;		
	}
	
	

}
