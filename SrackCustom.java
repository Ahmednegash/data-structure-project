package com.company;

public class SrackCustom {

        int size;
        int arr[];
        int top;

        SrackCustom(int size) {
            this.size = size;
            this.arr = new int[size];
            this.top = -1;
        }

        public void push(int pushedElement) {
            if (!isFull()) {
                top++;
                arr[top] = pushedElement;
                System.out.println("Pushed element:" + pushedElement);
            } else {
                System.out.println("Stack is full !");
            }
        }

        public int pop() {
            if (!isEmpty()) {
                int returnedTop = top;
                top--;
                System.out.println("Popped element :" + arr[returnedTop]);
                return arr[returnedTop];

            } else {
                System.out.println("Stack is empty !");
                return -1;
            }
        }

        public int peek() {
            if(!this.isEmpty())
                return arr[top];
            else
            {
                System.out.println("Stack is Empty");
                return -1;
            }
        }

        public boolean isEmpty() {
            return (top == -1);
        }

        public boolean isFull() {
            return (size - 1 == top);
        }

        public static void main(String[] args) {
            SrackCustom StackCustom = new SrackCustom(10);
            StackCustom.pop();
            StackCustom.push(1);
            StackCustom.push(3);
            StackCustom.push(5);
            StackCustom.push(4);

            StackCustom.pop();
            StackCustom.pop();
            StackCustom.pop();

}
    }
