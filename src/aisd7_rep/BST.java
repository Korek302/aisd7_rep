package aisd7_rep;

public class BST implements Tree
{
	Node root;
	
	private Node search(Object value)
	{
		Node node = root;
		int cmp = 0;
		while(node != null && (cmp = ((Vehicle) value).compareTo((Vehicle) node.value)) != 0)
		{
			node = cmp < 0 ? node.left : node.right;
		}
		return node;
	}
	
	public Object find(Object x)
	{
		Node t = search(x);
		return t != null ? t.value : null;
	}
	
	public Node insert(Object x, Node t)
	{
		if(t == null)
		{
			t = new Node((Vehicle) x);
		}
		else
		{
			int cmp = ((Vehicle) x).compareTo((Vehicle)t.value);
			if(cmp < 0)
				t.left = insert(x, t.left);
			else if(cmp > 0)
			{
				t.right = insert(x, t.right);
			}
			else
			{
				t.value = (Vehicle) x; //??????????????????????????????
			}
		}
		return t;
	}
	
	public void insert(Object x)
	{
		root = insert(x, root);
	}
	
	private Node detachMin(Node t, Node del)
	{
		if(t.left != null)
		{
			t.left = detachMin(t.left, del);
		}
		else
		{
			del.value = t.value;
			t = t.right;
		}
		return t;
	}
	
	private Node delete(Object x, Node t)
	{
		if(t == null)
			;
		else
		{
			int cmp = ((Vehicle) x).compareTo((Vehicle) t.value);
			if(cmp < 0)
			{
				t.left = delete(x, t.left);
			}
			else if(cmp > 0)
			{
				t.right = delete(x, t.right);
			}
			else if(t.left != null && t.right != null)
			{
				t.right = detachMin(t.right, t);
			}
			else
			{
				t = (t.left != null) ? t.left : t.right;
			}
		}
		return t;
	}
	
	public void delete(Object x)
	{
		root = delete(x, root);
	}
}
