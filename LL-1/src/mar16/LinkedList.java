package mar16;

import java.security.GeneralSecurityException;

public class LinkedList {
	private class Node {
		public int data;
		public Node next;
	}
	private Node rdrleft;
	private Node head;
	private Node tail;
	private int size;

	// o1
	public LinkedList() {
		head = tail = null;
		size = 0;
	}

	// on
	public void display() {
//		Node temp = head;
//		for (int i = 0; i < size; i++) {
//			System.out.print(temp.data + " ");
//			temp = temp.next;
//		}
//		System.out.println();
		for(Node temp=head; temp!=null;temp=temp.next){
			System.out.print(temp.data+" ");
		}
		System.out.println();
	}

	// o1
	private void handleAddWhenSizeIs0(int data) {
		Node nn = new Node();

		nn.data = data;
		nn.next = null;

		head = tail = nn;
		size = 1;
	}

	// o1
	public void addLast(int data) {
		if (size == 0) {
			handleAddWhenSizeIs0(data);
		} else {
			Node nn = new Node();

			nn.data = data;
			nn.next = null;

			tail.next = nn;

			tail = nn;
			size++;
		}
	}

	// o1
	public boolean isEmpty() {
		return size == 0;
	}

	// o1
	public int getSize() {
		return size;
	}

	// o1
	public int getFirst() {
		if (size == 0) {
			return -1;
		} else {
			return head.data;
		}
	}

	// o1
	public int getLast() {
		if (size == 0) {
			return -1;
		} else {
			return tail.data;
		}
	}
	private Node MidNode(Node sp,Node ep){
		Node start=sp;             //start is slow 
		Node end=sp;				//end is fast
		while(end.next!=ep && end!=ep){
			start=start.next;
			end=end.next.next;
		}
		return start;
	}
	// on
	private Node getNodeAt(int idx) {
		Node temp = head;
		for (int i = 0; i < idx; i++) {
			temp = temp.next;
		}
		return temp;
	}

	// o1
	private int handleRemoveWhenSizeIs1() {
		int temp = head.data;

		head = tail = null;
		size = 0;

		return temp;
	}

	// on
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

	// o1
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
	
    public void addFirst(int data)
    {
        if(size == 0)
        {
            handleAddWhenSizeIs0(data);
        }
        else 
        {
            // space
            Node nn = new Node();

            // dandn
            nn.data = data;
            nn.next = null;

            // connect
            nn.next = head;

            //summaries
            head = nn;
            size++;
        }
    }

    // on
    public void addAt(int data, int idx)
    {
        if (idx < 0 || idx > size)
        {
            return;
        }
        else if (idx == 0)
        {
            addFirst(data);
        }
        else if (idx == size)
        {
            addLast(data);
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
    
    //on*n    //reverse data iteration
    
    public void rdi(){
    	int li=0;
    	int ri=size-1;
    	while(li<=ri){
    		Node left=getNodeAt(li);
    		Node right=getNodeAt(ri);
    		int temp=left.data;
    		left.data=right.data;
    		right.data=temp;
    		li++;
    		ri--;
    		
    	}
    }
    
    //on    //reverse pointer iteration
    public void rpi(){
    	Node prev=null;
    	Node curr=head;
    	Node next=head.next;
    	while(curr!=null){
    		curr.next=prev;
    		prev=curr;
    		curr=next;
    		if(next!=null){
    			next=next.next;
    		}
    	}
    	Node temp=head;
    	head=tail;
    	tail=temp;
    }
    //on
    private void displayReverse(Node node){
    	if(node==null){
    		return;
    	}
    	displayReverse(node.next);
    	System.out.print(node.data+" ");
    }
    public void displayReverse(){
    	displayReverse(head);
    	System.out.println();
    }
    
    //on
    private void rpr(Node node){
    	if(node==tail){
    		return;
    	}
    	rpr(node.next);
    	node.next.next=node;
    }
    public void rpr(){
    	rpr(head);
    	Node temp=head;
    	head=tail;
    	tail=temp;
    	tail.next=null;
    }
	
    
    //on  recursive data reverse
    private void rdr(Node right,int floor){
    	if(right==null){
    		return;
    	}
    	rdr(right.next,floor +1);
    	if(floor>=size/2){
    		
    		int  temp=right.data;
    		right.data=rdrleft.data;
    		rdrleft.data=temp;
    		
    		rdrleft=rdrleft.next;
    	}
    }
    
    public void rdr(){
    	rdrleft=head;
    	Node right=head;
    	rdr(right,0);
    }
    //on
    private boolean IsPallindrome(Node right){
    	if(right==null){
    		return true;
    	}
    	boolean br=IsPallindrome(right.next);
    	
    	if(br==true){
    	if(right.data!=rdrleft.data){
    		br=false;
    	}
    	rdrleft=rdrleft.next;
    	}
    	//boolean  mr=br==true && rdrleft.data==right.data; if mr and br is false the 
    	//condition in right will not be used saving time
    	return br;
    }
    public void IsPallindrome(){
    	rdrleft=head;
    	Node right=head;
    	boolean br=IsPallindrome(right);
    	if(br==true)
    		System.out.println("Pallindrome");
    	else
    		System.out.println("Not pallindrome");
    }
    
    //on
    private void fold(Node right,int floor){
    	if(right==null){
    		return;
    	}
    	fold(right.next,floor+1);
    	if(floor>size/2){
    		Node temp=rdrleft.next;
    		rdrleft.next=right;
    		right.next=temp;
    	}
    	if(floor==size/2){   //applied both for even and o
    	tail=right;
    	tail.next=null;
    	}
    	rdrleft=right.next;
    	
    }
    public void fold(){
    	rdrleft=head;
    	Node right=head;
    	fold(right,0);
    }
    
    //on
    private void unfold(Node left){
    	if(left.next==null){
    		head=tail=left;
    		return;
    	}
    	if(left.next.next==null){
    		head=left;
    		tail=left.next;
    		return;
    	}
    	
    	Node right=left.next;    //variable store
    	unfold(left.next.next);   //parameter
    	left.next=head;
    	tail.next=right;
    	head=left;
    	tail=right;
    	tail.next=null;
    }
    public void unfold(){
    	unfold(head);
    }
    
    public void Kreverse(int k){
    	
    	LinkedList prev=null;
    	while(this.size!=0){
    		LinkedList curr=new LinkedList();
    		for(int i=0;i<k &&  this.size>0;i++){
    			curr.addFirstnode(this.removeFirstnode());
    		}
    		if(prev==null){
    			prev=curr;
    		}
    		else{
    			prev.tail.next=curr.head;
    			prev.tail=curr.tail;
    			prev.size+=curr.size;
    		}
    	}
    	this.size=prev.size;
    	this.head=prev.head;
    	this.tail=prev.tail;
    }
    private void addFirstnode(Node node){
    	if(size==0){
    		head=tail=node;
    		size=1;
    	
    	}
    	else{
    		node.next=head;
    		head=node;
    		size++;
    	}
    }
    private Node removeFirstnode(){
    	if(size==0){
    		return null;
    	}
    	else  if(size==1){
    		Node temp=head;
    		head=tail=null;
    		size=0;
    		return temp;
    	}
    	else{
    		Node oh=head;
    		head=head.next;
    		size--;
    		oh.next=null;
    		return oh;
    	}
    	
    }
    private void addLastnode(Node nn){
    	if(size==0){
    		head=tail=nn;
    		size=1;
    	}
    	else{
    		tail.next=nn;
    		tail=nn;
    		size++;
    	}
    }
    public void RemoveDuplicate(){
    	LinkedList nl=new LinkedList();
    	while(this.size>0){
    		Node temp=removeFirstnode();
    		if(nl.size==0 || nl.tail.data!=temp.data){
    			nl.addLastnode(temp);
    		}
    	}
    	
    	this.size=nl.size;
    	this.head=nl.head;
    	this.tail=nl.tail;
    }
    
    public void OddEven(){
    	LinkedList ol=new LinkedList();
    	LinkedList el=new LinkedList();
    	while(this.size>0){
    		Node temp=this.removeFirstnode();
    		if(temp.data%2==0){
    			el.addLastnode(temp);
    		}
    		else{
    			ol.addLastnode(temp);
    		}
    		
    			
    	}
    	if(ol.size==0){
			this.head=el.head;
			this.tail=el.tail;
			this.size=el.size;
		}
		else if(el.size==0){
			this.head=ol.head;
			this.tail=ol.tail;
			this.size=ol.size;
		}
		else{
			ol.tail.next=el.head;
			this.head=ol.head;
			this.tail=el.tail;
			this.size=ol.size+el.size;
		}
    }
                                           
    public  int MidElement(int sp,int ep){
    Node sp1=getNodeAt(sp);
    Node ep1=getNodeAt(ep);
    Node mid=MidNode(sp1, ep1);
    		
    		return mid.data;
    }
    public int KthFromLast(int k){
    	Node fast=head;
    	Node slow=head;
    	for(int i=0;i<k;i++){
    		fast=fast.next;
    	}
    	while(fast!=null){
    		slow=slow.next;
    		fast=fast.next;
    	}
    	return slow.data;
    }
    public void Merge(LinkedList L1,LinkedList L2){
    	Node h1=L1.head;
    	Node h2=L2.head;
    	while(h1!=null && h2!=null){
    		if(h1.data<h2.data){
    			this.addLast(h1.data);
    			h1=h1.next;
    		}
    		else{
    			this.addLast(h2.data);
    			h2=h2.next;
    		}
    	}
    	while(h1!=null){
    			this.addLast(h1.data);
    			h1=h1.next;
    		
    	}
    	while(h2!=null){
    			this.addLast(h2.data);
    			h2=h2.next;
    		
    	}
    	
    	
    }
    private LinkedList MergeSort(Node start,Node end){
    	
    	if(MidNode(start, end).next==null){
    		LinkedList temp=new LinkedList();
    		temp.addLast(start.data);
    		return temp;
    	}
    	Node mid=MidNode(start, end);
    	Node temp=mid.next;
    	mid.next=null;
    	LinkedList l1=MergeSort(start, mid);
    	LinkedList l2=MergeSort(temp, end);
    	LinkedList Slist=new LinkedList();
    	Slist.Merge(l1, l2);
    			
    			return Slist;
    }
    public LinkedList MergeSort(){
    	LinkedList sl=MergeSort(this.head,this.tail);
    	return sl;
    }
    private int addLinkedList(Node t1,Node t2, int s1, int s2, LinkedList result){
    	if(s1==0 && s2==0){
    		return 0;
    	}
    	while(s1!=s2){
    		if(s1>s2){
    			t1=t1.next;
    			s1--;
    		}
    		else{
    			t2=t2.next;
    			s2--;
    		}
    	}
    	int sum=addLinkedList(t1.next, t2.next, s1-1, s2-1, result);
    	int sum1=t1.data+t2.data+sum;
    	result.addFirst(sum1%10);
    	
    	return sum1/10;
    }
    public void addLinkedList(Node t1,Node t2){
    	LinkedList result=new LinkedList();
    	int add=addLinkedList(t1, t2,,, result);
    }
    public static void main(String[] args) {
		LinkedList l = new LinkedList();
		l.addLast(1);
//		l.addLast(1);
//		l.addLast(1);
		l.addLast(2);
//		l.addLast(2);
//		l.addLast(2);
		l.addLast(3);
		l.addLast(4);
		l.addLast(5);
		l.addLast(6);
		l.addLast(7);
		l.addLast(8);
		l.addLast(9);
//		l.addLast(100);
		l.display(); // 10 20 30
//		l.addFirst(0);
//		l.addFirst(5);
//		l.display(); // 50 40 10 20 30
//		l.addAt(100, 3);
//		l.display(); // 50 40 10 100 20 30
//		l.removeFirst();
//		l.removeFirst();
//		l.display(); // 10 100 20 30
//		l.removeLast();
//		l.display(); // 10 100 20
//		l.addLast(200);
//		l.display(); // 10 100 20 200
//		l.removeAt(2);
//		l.display(); // 10 100 200
//		l.rdi();
//		l.display();
//		l.rpi();
//		l.display();
//		l.displayReverse();
//		l.rpr();
//		l.display();
//		l.rdi();
//		l.display();
//		l.rdr();
//		l.display();
//		l.IsPallindrome();
//		l.fold();
//		l.display();
//		l.addLast(25);
//		l.display();
//		l.fold();
//		l.display();
//		l.unfold();
//		l.display();
//		l.addLast(90);
//		l.display();
//		l.fold();
//		l.display();
//		l.unfold();
//		l.display();
//		l.Kreverse(3);
//		l.display();
//		l.OddEven();
//		l.display();
//		l.addFirst(23);
//		l.display();
//		l.RemoveDuplicate();
//		l.display();
//		l.addFirst(1);
//		l.display();
//		l.RemoveDuplicate();
//		l.display();
		System.out.println(l.MidElement(0, 6));
		System.out.println(l.KthFromLast(3));
		LinkedList Ll1=new LinkedList(),Ll2=new LinkedList(),L3=new LinkedList();
		Ll1.addLast(31);
		Ll1.addLast(42);
		Ll1.addLast(53);
		Ll1.addLast(64);
		Ll1.addLast(75);
		Ll1.addLast(86);
		Ll1.addLast(97);
		Ll2.addLast(23);
		Ll2.addLast(34);
		Ll2.addLast(45);
		Ll2.addLast(56);
		Ll2.addLast(57);
		Ll2.addLast(78);
		L3.Merge(Ll1,Ll2);
		L3.display();
		L3.fold();
		L3.display();
	
		LinkedList L4=new LinkedList();
		L4=L3.MergeSort();
		L4.display();
//		L4.addLast(26);
//		L4.display();
//		L4=L4.MergeSort();
//		L4.display();
		
		L4.addLinkedList(Ll1.head, Ll2.head);
		L4.display();
	}
}
