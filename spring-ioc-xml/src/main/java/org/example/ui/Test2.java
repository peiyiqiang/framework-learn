package org.example.ui;

/**
 * 测试循环引用初始化流程
 */
public class Test2 {

    private Test1 test1;

    public Test2() {
        System.out.println("constructor22222222");
    }

    public void setTest1(Test1 test1) {
        this.test1 = test1;
        System.out.println("setter222222222");
    }

    public void init() {
        System.out.println("init22222");
    }

    public void destory() {
        System.out.println("destory22222");
    }
}
