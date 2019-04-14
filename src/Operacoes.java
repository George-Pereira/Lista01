
public class Operacoes 
{
	public static String comparaListas(JLinkedList list, JLinkedList list2) 
	{
		Node currentA = list.cabeca;
		Node currentB = list2.cabeca;
		int CTA = 0;
		boolean vetor = false;
		boolean iguais [] = new boolean[(int) list.tamanho];
		while(currentA != null) 
		{
			while(currentB != null) 
			{
				if(currentB.getElemento() == currentA.getElemento()) 
				{
						iguais[CTA] = true;
						break;
				}
				currentB = currentB.getProximo();
			}
			currentA = currentA.getProximo();
			currentB = list2.cabeca;
			CTA++;
		}
		for(CTA = 0; CTA< iguais.length; CTA++) 
		{
			if(iguais[CTA] == false) 
			{
				vetor = false;
			}
			else 
			{
				vetor = true;
			}
		}
		if(vetor) 
		{
			return "São Iguais!!!";
		}
		else 
		{
			return "Não são iguais!!!";
		}
	}
}
