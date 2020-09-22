package com.llk.decorator.notify;


public class MessageNotifier implements Notifier{
    @Override
    public void notify(String msg) {
        System.out.println("使用站内消息发送通知消息："+msg);
    }
}
