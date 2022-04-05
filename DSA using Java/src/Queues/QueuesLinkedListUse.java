package Queues;

public class QueuesLinkedListUse {

	public static void main(String[] args) throws QueuesEmptyException {
		
	  QueuesUsingLinkedList<Integer> queues = new QueuesUsingLinkedList<>();
	  
	  queues.enqueue(20);
	  queues.enqueue(40);
	  queues.enqueue(60);
	  queues.enqueue(80);
	  queues.enqueue(100);
	  
	  System.out.println(queues.size());
	  System.out.println(queues.front());
	  System.out.println(queues.dequeue());
	  System.out.println(queues.front());
	  System.out.println(queues.size());
	  System.out.println(queues.isEmpty());
	  
	  
	
	}

}
