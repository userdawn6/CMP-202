public class stack {


    int size, top;
    int[] array;

    stack(int capacity){
        top = -1;
        size = capacity;
        array = new int[size];
    }

    boolean isFull(){
        return (top == size - 1);
    }

    boolean isEmpty() {
        return (top == -1);
    }

    void push(int item) {
        if (isFull()) {
            System.out.println("stack overflow");
        } else {
            array[top + 1] = item;
            top++;
        }
    }
    int pop(){
        int previsionTop = top;
        if (isEmpty()) {
            System.out.println("is empty");
        } else {
            top--;
        }
        return array[previsionTop];
    }
    void printA(){
        if (isEmpty()) {
            System.out.println("stack is empty");
        }else{
            System.out.println("elements of array(stack): ");
            for (int i = 0; i <= top; i++){
                System.out.println(array[i] + " ");
        }
        }
    }
}
