package ss10_DSA_stack_queue.bai_tap;

public class queue {

    class Node{
        int data;
        Node next;
        public Node( int data){
            this.data = data;
            this.next = null;
        }
    }
    class Queue{
        Node front, rear;
        public Queue(){
            this.front = this.rear = null;
        }
        public void enQueue(int data){
            Node newNode = new Node(data);
            if ( this.front == null){
                this.front= this.rear = newNode;
            }else{
                this.rear.next = newNode;
                this.rear = newNode;
            }
            this.rear.next = this.front;
        }
        public int deQueue(){
            if ( this.front == null){
                return -1;
            }
            int value = this.front.data;
            if (this.front==this.rear ){
                this.front = this.rear = null;
            }else {
                this.front = this.front.next;
                this.rear.next = this.front;
            }
            return value;
        }
    }
}
