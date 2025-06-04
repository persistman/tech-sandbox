package com.huhh.code.optimized.algo.core.stack;

import com.huhh.code.optimized.algo.entity.node.SimpleNode;

// 栈为最为简单的数据结构之一， 数据会后进先出。
public class SimpleArrayStack {

    private static final int CAPACITTY = 10;

    private int capacity;

    private int pos;

    private SimpleNode<Integer>[] datas ;

    public SimpleArrayStack(int capacity) {
         this.capacity = capacity < 1 ? CAPACITTY : capacity;
         this.datas = new SimpleNode[this.capacity];
    }

    public SimpleArrayStack() {
        this(CAPACITTY);
    }


    /**
     *  存放元素
     * @param node 待放元素
     */
    public void put(SimpleNode<Integer> node) {
        if(pos == capacity) {
            System.out.println("Stack is full");
            throw new IndexOutOfBoundsException();
        }

        this.datas[pos++] = node;
    }

    /**
     * 取出栈顶元素
     * @return 栈顶元素
     */
    public SimpleNode<Integer> take() {
        if(pos == 0) {
            System.out.println("Stack is empty");
            throw new IndexOutOfBoundsException();
        }
        return this.datas[pos--];
    }


    /**
     *  查看栈顶元素
     * @return 栈顶元素
     */
    public SimpleNode<Integer> peek() {
        if(pos == 0) {
            System.out.println("Stack is empty");
            throw new IndexOutOfBoundsException();
        }
        return this.datas[pos - 1];
    }

}
