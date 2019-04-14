public class Main
{
	public static void main(String[] args) 
	{
		JLinkedList lista = new JLinkedList();
		JLinkedList lista2 = new JLinkedList();
		try 
		{
			lista.InserirPrimeiro(new Node("D"));
			lista.InserirPrimeiro(new Node("A"));
			lista.InserirPrimeiro(new Node("B"));
			lista.InserirUltimo(new Node("S"));
			lista.InserirUltimo(new Node("C"));
			lista.removePrimeiro(); //pode lan�ar UnderflowException
			lista.removeUltimo(); //pode lan�ar UnderflowException
			lista.InserirUltimo(new Node("F"));
			lista.InserirUltimo(new Node("A"));
			lista.InserirUltimo(new Node("T"));
			lista.InserirUltimo(new Node("E"));
			lista.InserirUltimo(new Node("C"));
			lista.InserirPrimeiro(new Node("3�"));
			lista2.InserirPrimeiro(new Node("F"));
			lista2.InserirUltimo(new Node("A"));
			lista2.InserirUltimo(new Node("T"));
			lista2.InserirPrimeiro(new Node("E"));
			lista2.InserirUltimo(new Node("C"));
			lista2.InserirPrimeiro(new Node("S"));
			lista2.InserirUltimo(new Node("D"));
			lista2.InserirPrimeiro(new Node("A"));
			lista2.InserirUltimo(new Node("3�"));
			System.out.println("Endere�o do meio da lista: " + lista.meioLista());
		} 
		catch (UnderflowException e) 
		{
			System.out.println("ERRO: Imposs�vel remover!");
			e.printStackTrace();
		}
		lista.mostra();
		lista.inverteLista();
		lista.mostra();
		lista2.mostra();
		System.out.println(Operacoes.comparaListas(lista, lista2));
	}
}
