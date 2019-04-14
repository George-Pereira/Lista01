public class JLinkedList 
{
	protected Node cabeca;
	protected long tamanho;
	public JLinkedList() 
	{
		cabeca = null;
		tamanho = 0;
	}
	public boolean isEmpty() 
	{
		return cabeca == null;
	}
	public Node getFirst() throws UnderflowException
	{
		if(isEmpty()) 
		{
			throw new UnderflowException();
		}
		return cabeca;
	}
	public Node getLast() throws UnderflowException 
	{
		if(isEmpty()) 
		{
			throw new UnderflowException();
		}
		Node current = cabeca;
		while(current.getProximo() != null) 
		{
			current = current.getProximo();
		}
		return current;
	}
	public void InserirPrimeiro(Node Novonode) 
	{
		Novonode.setProximo(cabeca);
		cabeca = Novonode;
		tamanho++;
	}
	public void InserirUltimo(Node Novonode) 
	{
		if(isEmpty()) 
		{
			InserirPrimeiro(Novonode);
		}
		Node current = cabeca;
		while(current.getProximo() != null) 
		{
			current = current.getProximo();
		}
		current.setProximo(Novonode);
		tamanho++;
	}
	public Node removePrimeiro() throws UnderflowException
	{
		Node Noderemovido = cabeca;
		if(isEmpty()) 
		{
			throw new UnderflowException();
		}
		if(tamanho == 1) 
		{
			cabeca = null;
		}
		else 
		{
			cabeca = cabeca.getProximo();
		}
		tamanho--;
		return Noderemovido;
	}
	public Node removeUltimo() throws UnderflowException
	{
		if(isEmpty()) 
		{
			throw new UnderflowException();
		}
		Node removedNode = cabeca;
		if(tamanho == 1) 
		{
			cabeca = null;
		}
		else 
		{
			int CTA = 0;
			Node current = cabeca;
			while(current.getProximo().getProximo() != null) 
			{
				current = current.getProximo();
				CTA++;
			}
			removedNode = current.getProximo();
			current.setProximo(null);
		}
		tamanho--;
		return removedNode;
	}
	public void mostra() 
	{
		if(isEmpty()) 
		{
			System.out.println("Não há itens na lista!!!");
		}
		else
		{
			System.out.println("A lista é:");
			Node current = cabeca;
			while(current != null) 
			{
				System.out.println("\n" + current.getElemento());
				current = current.getProximo();
			}
		}
	}
	public void inverteLista () 
	{
		Node alterado = cabeca;
		try 
		{
			Node base = getLast();
			Node Primeiro = base;
			while(base != alterado) 
			{
				while(alterado.getProximo() != base) 
				{
					alterado = alterado.getProximo();
				}
				base.setProximo(alterado);
				base = base.getProximo();
				base.setProximo(null);
				alterado = cabeca;
			}
			cabeca = Primeiro;
		}
		catch (UnderflowException e) 
		{
			e.printStackTrace();
		}
	}
	public int meioLista() 
	{
		int meio = (int) (tamanho/2);
		Node current = cabeca;
		while(meio > 0) 
		{
			current = current.getProximo();
			meio--;
		}
		System.out.println("Nó do meio = " + current.getElemento());
		return meio = (int)tamanho/2;
	}
}
