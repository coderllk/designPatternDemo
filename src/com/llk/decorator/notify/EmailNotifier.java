package com.llk.decorator.notify;

public class EmailNotifier extends NotifierDecorator {
    public EmailNotifier(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void notify(String msg) {
        super.notify(msg);//调用 被修饰者的 notify()
        System.out.println("使用邮箱通知消息："+msg);
    }
}
