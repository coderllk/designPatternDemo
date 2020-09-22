package com.llk.decorator.notify;

public class PhoneNotifier extends NotifierDecorator {
    public PhoneNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(String msg) {
        super.notify(msg);//调用 被修饰者的 notify()
        System.out.println("使用打电话的方式通知消息："+msg);
    }
}
