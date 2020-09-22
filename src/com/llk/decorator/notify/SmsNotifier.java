package com.llk.decorator.notify;

public class SmsNotifier extends NotifierDecorator {
    public SmsNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(String msg) {
        super.notify(msg);//调用 被修饰者的 notify()
        System.out.println("使用短信发送消息："+msg);
    }
}
