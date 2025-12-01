package Stack;

class Stack{
    int arr[];
    int top;
    int capacity;

    Stack(int size){
        arr=new int[size];
        capacity=size;
        top=-1;
    }
    //push
    void push(int x){
        if (top==capacity-1){
            System.out.println ("stack is overflow" );
        }
        top=top+1;
        arr[top]=x;
    }
    //pop
    int pop(){
        if (top==-1){
            System.out.println ("stack is overflow" );
            return -1;
        }
        return arr[top--];


    }
    //peek
    int peek(){
        if (top==-1){
            System.out.println ("stack is empty" );
            return -1;
        }
        return arr[top];
    }
    //print
    void print(){
        for (int i=0; i<=top; i++){
            System.out.println (arr[i]+" " );
        }
    }


}
public class Stackarray {
    public static void main(String[] args) {
        Stack stack=new Stack (5);
        stack.push (10);
        stack.push (12);
        stack.push (16);
        stack.push (18);
        stack.push (17);
        stack.print ();
        System.out.println ("peek of the element"+  stack.peek () );

        System.out.println ("pop element"+   stack.pop () );
        stack.print ();




    }
}
