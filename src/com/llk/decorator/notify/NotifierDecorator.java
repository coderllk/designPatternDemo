package com.llk.decorator.notify;

public class NotifierDecorator implements Notifier {

    private Notifier notifier;
    public NotifierDecorator(Notifier notifier){
        this.notifier = notifier;
    }

    @Override
    public void notify(String msg) {
        notifier.notify(msg);//调用 被修饰者的 notify()
    }

}
