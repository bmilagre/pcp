package ch.hslu.pcp;

public class Stack {
    private Element head;
    private int size;

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    public void push(Element e){
        e.setNext(this.head);
        this.head = e;
        this.size++;
    }

    public Element top(){
        return this.head;
    }

    public boolean pop(){
        if(this.head == null){
            return false;
        }

        this.head = this.head.getNext();
        this.size--;

        return true;
    }

    public void print(){
        if(this.head == null){
            System.out.println("print - Stack is empty");
        } else {
            System.out.print("print - Stack contains: ");

            for (Element e = head; e != null; e = e.getNext()) {
                System.out.print(e.getValue() + ", ");
            }

            System.out.println("top Element = " + this.head.getValue());
        }
    }

    public boolean isEmpty(){
        return this.head == null;
    }

    public int size(){
        return this.size;
    }
}

/*
 * Operation clear() needed because
 * - Modifiable Object (Object has condition), clear can reset it without creating new instance
 * - Values stored as reference, so GC can free space in heap
 */