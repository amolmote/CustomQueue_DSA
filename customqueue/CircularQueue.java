package queue.customqueue;

public class CircularQueue {

    protected int[] data;
    private static  final int DEFAULT_SIZE=10;

    int front=0,end=0,size=0;
    public  CircularQueue(){
        this(DEFAULT_SIZE);
    }
    public  CircularQueue(int size){
        this.data=new int[size];
    }

    public  boolean insert(int item) throws Exception {
        if (isFull()){

            throw new Exception("Queue is full");
        }
        data[end++]=item;
        end=end% data.length;
        size++;
       return true;

    }
    public int remove() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int removed=data[front++];
        front=front%data.length;
        size--;
        return removed;
    }

    public int  front(int item) throws Exception{
        if (isEmpty()){
            throw  new Exception("Queue is empty");
        }
        return data[front];
    }
    public void  display() throws Exception{
        if (isEmpty()){
            throw new Exception("Queue is Empty");
        }
        int temp=front;
        do{
            //do this thing first
            System.out.print(data[temp]+" -> ");
            //increament by 1
            temp++;
            //return to original position because sometime what happen is end and front both
            //are point to the same element but we required to print the element "between" the front and end
            //because of that we start front and move till we reach to the end
            temp=temp%data.length;
        }while (temp!=end);
        System.out.println("end");
    }

    public  boolean isFull(){
        return  size==data.length;
    }
    public  boolean isEmpty(){
        return size==0;
    }



}
