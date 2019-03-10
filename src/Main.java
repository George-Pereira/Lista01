public class Main
{
	public static void main(String[] args) 
	{
	JLinkedList lista = new JLinkedList();
	try 
	{
	lista.InserirPrimeiro(new Node("D"));
	lista.InserirPrimeiro(new Node("A"));
	lista.InserirPrimeiro(new Node("B"));
	lista.InserirUltimo(new Node("S"));
	lista.InserirUltimo(new Node("C"));
	lista.removePrimeiro(); //pode lan�ar UnderflowException
	lista.removeUltimo(); //pode lan�ar UnderflowException
	} 
	catch (UnderflowException e) 
	{
	System.out.println("ERRO: Imposs�vel remover!");
	e.printStackTrace();
	}
	lista.mostra();
	}
}
