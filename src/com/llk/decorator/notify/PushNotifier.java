package com.llk.decorator.notify;

public class PushNotifier extends NotifierDecorator {
    public PushNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(String msg) {
        super.notify(msg);//调用 被修饰者的 notify()
        System.out.println("使用手机推送方式通知消息："+msg);
    }
}
