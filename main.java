/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package topic_4_queue;

/**
 *
 * @author ITLAB2-PC05-STUDENT
 */
public class main {
    public static void main(String[] args) {
		
		 Queue customerQueue = new Queue();
		 
		 // Adding customers to the queue
	     customerQueue.enqueue(new Customer("Cliff"));
	     customerQueue.enqueue(new Customer("Janoi"));
	     customerQueue.enqueue(new Customer("Redd"));
	     
	     System.out.println();
	     customerQueue.displayQueue();
	     
	     // Serve 
	     customerQueue.dequeue();
	     
	     System.out.println();
	     customerQueue.displayQueue();


	}


}
