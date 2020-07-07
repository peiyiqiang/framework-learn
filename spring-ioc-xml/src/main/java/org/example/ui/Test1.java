package org.example.ui;

/**
 * 测试循环引用初始化流程
 */
public class Test1 {

    private Test2 test2;

    public Test1() {
        System.out.println("constructor11111111");
    }

    public void setTest2(Test2 test2) {
        this.test2 = test2;
        System.out.println("setter1111111");
    }

    public void init() {
        System.out.println("init1111");
    }

    public void destory() {
        System.out.println("destory11111");
    }

}
