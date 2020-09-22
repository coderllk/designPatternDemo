package com.llk.decorator.notify;

public class Manager {

    private Notifier messageNotifier;
    private Notifier wrapper;
    private Option option;

    public Manager(){
        this.messageNotifier = new MessageNotifier();
        this.wrapper = this.messageNotifier;
    }


    public void setOption(Option option){

        this.option = option;

        //这里可以理解在车间里对被装饰的物品进行装饰
        //被装饰的物品就是 wrapper，即 messageNotifier
        if(this.option.emailNotifierEnable ){
            wrapper = new EmailNotifier(wrapper);
        }
        if(this.option.phoneNotifierEnable ){
            wrapper = new PhoneNotifier(wrapper);
        }
        if(this.option.pushNotifierEnable ){
            wrapper = new PushNotifier(wrapper);
        }
        if(this.option.smsNotifierEnable ){
            wrapper = new SmsNotifier(wrapper);
        }

    }

    public void notify(String msg){
        this.wrapper.notify(msg);
    }

}
class Option{
    boolean emailNotifierEnable;
    boolean phoneNotifierEnable;
    boolean pushNotifierEnable;
    boolean smsNotifierEnable;
}