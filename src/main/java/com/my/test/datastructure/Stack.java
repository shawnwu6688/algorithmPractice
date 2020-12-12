 package com.my.test.datastructure;

/**
 * @author:shawn
 * @date 2020/10/21 17:10
 */
public class Stack<E> {
    /**
    栈存储容器
     */
    private Object[] value =null;
    /**
    栈顶指针
     */
    private int top = -1;
    /**
    容器容量
     */
    private int maxSize = 0;

    /**
     *construction to init stack
     */
    Stack(){
        this.maxSize = 10;
        this.value= new Object[9];
    }
    Stack(int initSize) throws Exception {
        if (initSize<=0){
           throw new Exception("stack size mast bigger than 0");
        }else {
            this.maxSize = initSize;
            this.value = new Object[initSize];
            this.top = -1;
        }
    }
    public boolean push(E e) throws Exception {
        if (maxSize -1 == top){
            throw new Exception("fail to stack in ,stack is full");
        }else {
            value[++top] = e;
        }
        return true;
    }


}
