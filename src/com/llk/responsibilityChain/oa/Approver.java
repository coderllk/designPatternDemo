package com.llk.responsibilityChain.oa;

public abstract class Approver {

    private Approver next;//下一个处理者

    //处理者处理请假请求的方法
    public abstract void handle(OaRequest request);

    public Approver getNext() {
        return next;
    }

    public void setNext(Approver next) {
        this.next = next;
    }
}
