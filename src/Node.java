
public class Node 
{
	private String elemento;
	private Node proximo;
	public Node(String s, Node n) 
	{
		elemento = s;
		proximo = n;
	}
	public Node(String elemento) 
	{
		this(elemento, null);
	}
	public void setElemento(String element) 
	{
		elemento = element;
	}
	public void setProximo(Node prox) 
	{
		proximo = prox;
	}
	public String getElemento() 
	{
		return elemento;
	}
	public Node getProximo() 
	{
		return proximo;
	}
}
