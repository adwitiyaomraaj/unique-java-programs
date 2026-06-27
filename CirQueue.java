/*
Q18) A Circular queue is a linear data structure which works on the principle of FIFO, enables the user to enter data from the rear end and remove data from the front end with the rear 
end connected to the front end to form a circular pattern.
Define a class CirQueue with the following details:
Class name Data members / instance variables: cq| | cap front rear
Member functions: CirQueue (int max)
void push(int n)
int pop()
void show()::::::::: CirQueue array to store the integers stores the maximum capacity of the array to point the index of the front end
to point the index of the rear end constructor to initialize the data member cap=max, front=0 and rear=() to add integer in the queue from the rear end
if possible, otherwise display the message "QUEUE IS FULL" removes and returns the integer from the front end of the queue if any, else returns -9999 displays the queue elements
(a) Specify the class CirQueue giving details of the functions void push(int) and int pop(). Assume that the other functions have been defined. The main function and algorithm need NOT be written.
(b) How is a linear queue structure different from a circular queue structure?
 */

class CirQueue {
    int[] cq;
    int cap;
    int front;
    int rear;
    public CirQueue(int max) {
        cap = max;
        front = 0;
        rear = 0;
        cq = new int[cap];
    }
    public void push(int n) {
        if((rear+1)%cap == front){
            System.out.println("QUEUE IS FULL");
        }
        else{
            cq[rear] = n;
            rear = (rear+1)%cap;
        }
    }
    public int pop() {
        if(front == rear){
            return -9999;
        }
        else{
            int val = cq[front];
            front = (front+1)%cap;
            return val;
        }
    }
}