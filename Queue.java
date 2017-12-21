public class Queue {

    public int[] data;
    private int head;
    private int rear;
    private int size;

    public Queue(int size){
        data = new int[size];
        head = 0;
        rear = 0;
    }

    public boolean isEmpty(){
        if(rear == head){
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull(){
        if(head == data.length){
            return true;
        } else {
            return false;
        }
    }

    public void push(int input){
        if(this.isFull()){
            System.out.println("The queue is full");
        } else {
            data[head] = input;
            head++;
        }
    }

    public int pop(){
        if(this.isEmpty()){
            System.out.println("The queue is empty");
            return -1;
        } else {
            int temp = data[rear];
            rear++;
            return temp;
        }
    }

    public void printQueue(){
        for(int i = rear; i < head; i++){
            System.out.print(data[i] + ", ");
        }
        System.out.println();
    }

}
