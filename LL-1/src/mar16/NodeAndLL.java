package mar16;



public class NodeAndLL {
	private class Node{
		public int data;
		public Node next;
	}
	 Node head;
	 Node tail;
	 int size;
	
	public NodeAndLL() {  //this constructor not needed in java as these values are 
		head=tail=null;   //default values here but this step is needed in c++
		size=0;
	}
	private  void whensizeisequalto0(int data){
		//allocation
		Node nn=new Node();
		nn.data=data;
		nn.next=null;
		
		//head value and next
		head=tail=nn;
		size++;
	}
	public void addend(int data ){
	
	if(head==null){
		whensizeisequalto0(data);
	}
	
	else{
		//allocation
				Node nn=new Node();
				
				
				//head value and next
				nn.data=data;
				nn.next=null;
				
				
				//connection
				tail.next=nn;
				
				
				//Summary
				tail=nn;
				size++;
	}
	}
	
	public void display(){
		Node temp=head;
		for(int i=0;i<size;i++){
			System.out.println(temp.data);
			temp=temp.next;
		}
		System.out.println();
	}
	public int getsize(){
		return size ;
	}
	public boolean isEmpty(){
		if(head==null){
			return true;
		}
		else{
			return false;
		}
	}
	public void addfirst(int data){
		if(size==0){
			whensizeisequalto0(data);
		}
		else{
			//allocation
			Node nn=new Node();
			nn.data=data;
			nn.next=null;
			//connection
			nn.next=head;
			//summary
			head=nn;
			size++;
		}
	}
	
	public int getFirst(){
		if(size==0){
			return -1;
		}
		else{
			return head.data;
		}
	}
	public int getLast(){
		if(size==0){
			return -1;
		}
		else{
			return tail.data;
		}
	}
	private int handleRemoveWhenSizeIs1() {
		int temp = head.data;

		head = tail = null;
		size = 0;

		return temp;
	}
	public int removeFirst() {
		if (size == 0) {
			return -1;
		} else if (size == 1) {
			return handleRemoveWhenSizeIs1();
		} else {
			Node oh = head;

			head = head.next;
			size--;

			int temp = oh.data;
			return temp;
		}
	}
	private Node getNodeAt(int idx) {
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}
	public int getAt(int idx){
		if(idx<0 || idx>=size){
			System.out.println("Wrong input");
			return -1;
		}
		else{
			Node temp=getNodeAt(idx);
			return temp.data;
		}
	}
	public int removeAt(int idx) {
		if (idx < 0 || idx >= size) {
			return -1;
		} else if (idx == 0) {
			return removeFirst();
		} else if (idx == size - 1) {
			return removeLast();
		} else {
			Node nm1 = getNodeAt(idx - 1);
			Node n = nm1.next;
			Node np1 = n.next;

			nm1.next = np1;
			size--;

			int temp = n.data;
			return temp;
		}
	}
	 public void addAt(int data, int idx)
	    {
	        if (idx < 0 || idx > size)
	        {
	            return;
	        }
	        else if (idx == 0)
	        {
	            addfirst(data);
	        }
	        else if (idx == size)
	        {
	            addend(data);
	        }
	        else
	        {
	            Node nm1 = getNodeAt(idx - 1);
	            Node np1 = nm1.next;

	            Node n = new Node();
	            n.data = data;

	            nm1.next = n;
	            n.next = np1;
	            size++;
	        }
	    }
	// on
	public int removeLast() {
		if (size == 1) {
			return handleRemoveWhenSizeIs1();
		} else {
			Node sl = getNodeAt(size - 2);
			sl.next = null;

			int temp = tail.data;

			tail = sl;
			size--;

			return temp;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l = new LinkedList();
		l.addLast(10);
		l.addLast(20);
		l.addLast(30);
		l.display(); // 10 20 30
		l.addFirst(40);
		l.addFirst(50);
		l.display(); // 50 40 10 20 30
		l.addAt(100, 3);
		l.display(); // 50 40 10 100 20 30
		l.removeFirst();
		l.removeFirst();
		l.display(); // 10 100 20 30
		l.removeLast();
		l.display(); // 10 100 20
		l.addLast(200);
		l.display(); // 10 100 20 200
		l.removeAt(2);
		l.display(); // 10 100 200
		l.addAt(23,2);
		l.display();
	}

}
