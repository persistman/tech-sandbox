package com.huhh.code.optimized.algo.entity.node;

public class SimpleNode<T> {

    private T data;

    private SimpleNode<T> next;

    private SimpleNode<T> pre;


    public SimpleNode() {

    }

    public SimpleNode(T data, SimpleNode<T> next, SimpleNode<T> pre) {
        this.data = data;
        this.next = next;
        this.pre = pre;
    }

    public SimpleNode(T data) {
        this.data = data;
    }


    public void setData(T data) {
        this.data = data;
    }

    public T getData() {
        return this.data;
    }

    public void setNext(SimpleNode<T> next) {
        this.next = next;
    }


    public SimpleNode<T> getNext() {
        return this.next;
    }

    public void setPre(SimpleNode<T> pre) {
        this.pre = pre;
    }

    public SimpleNode<T> getPre() {
        return this.pre;
    }




}
