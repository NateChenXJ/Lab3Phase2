
public class LinkedList {

	/**
	 *  variable
	 */
	public ListElement firstLink;
	public ListElement lastLink;
	public ListElement tail;
	
	/**
	 *  function
	 */
	
	//isEmpty
	public boolean isEmpty(){
		return(firstLink == null);
	}//end isEmpty
	
	//addElement
	public void addElement(ListElement le){
		if(firstLink == null){
			le.setNext(firstLink);
			lastLink = le;
			firstLink = le;
		}else{
			le.setNext(firstLink);
			firstLink.setPrevious(le);
			firstLink = le;
		}//end if
	}//end addElement
	
	//getElement
		public ListElement getElement(int index){
			ListElement theNode = firstLink;
			boolean x = true;
			while(theNode != null){
				if(theNode.getData() == index){
					x = true;
					break;
				}else{
					x = false;
					theNode = theNode.getNext();
				}//end if
			}//end while
			
			if(x == true){
				System.out.println("Found number");
			}else{
				System.out.println("no number");
			}//end if
			
			return theNode;
		}//end getElement
		
		//deleteELement
		public ListElement deleteElement(int index){
			ListElement currentNode = firstLink;
			ListElement previousNode = firstLink;
			while(currentNode.getData() != index){
				if(currentNode.getNext() == null){
					return null;
				}else{
					previousNode = currentNode;
					currentNode = currentNode.getNext();
					
				}//end if
			}//end while
			if(currentNode == firstLink){
				firstLink = firstLink.getNext();
				currentNode = firstLink;
				currentNode.setPrevious(null);
			}else{
				System.out.println("found a match");
				previousNode.setNext(currentNode.getNext());
				ListElement currentNode1 = currentNode.getNext();
				currentNode1.setPrevious(previousNode);
			}
			return currentNode;
		}//end deleteElement
		
		//printLinkedListHead
		public void printLinkedListHead(){
			ListElement theLink = firstLink;
			while(theLink != null){
				theLink.display();
				theLink = theLink.getNext();
			}//end while
		}//end printLinkedListhead
		
		//printLinkedListTail
		public void printLinkedListTail(){
			ListElement current = lastLink;
			while(current != null){
				System.out.println(current.getData());
				current = current.getPrevious();
			}//end while
		}//end printLinkedListTail
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList myList = new LinkedList();
		ListElement le = new ListElement(5);
		ListElement le0 = new ListElement(6);
		ListElement le1 = new ListElement(7);
		ListElement le2 = new ListElement(8);
		myList.addElement(le);
		myList.addElement(le0);
		myList.addElement(le1);
		myList.addElement(le2);
		//print head
		myList.printLinkedListHead();
		System.out.println("\n");
		//print tail
		myList.printLinkedListTail();
		System.out.println("\n");
		
		myList.getElement(6);
		
		System.out.println("\n");
		
		myList.deleteElement(7);
		
		System.out.println("\n");
		
		myList.getElement(6);
		
		System.out.println("\n");
		
		//print head
		myList.printLinkedListHead();
		System.out.println("\n");
		//print tail
		myList.printLinkedListTail();
		
	}//end main

}
