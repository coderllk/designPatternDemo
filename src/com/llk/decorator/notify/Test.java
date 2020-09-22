package com.llk.decorator.notify;

public class Test {
    public static void main(String[] args) {
        /*MessageNotifier messageNotifier = new MessageNotifier();
        PhoneNotifier phoneNotifier = new PhoneNotifier(messageNotifier);
        SmsNotifier smsNotifier = new SmsNotifier(phoneNotifier);
        smsNotifier.notify("抢红包了");*/

        Manager manager = new Manager();

        Option option = new Option();
        option.emailNotifierEnable = true;
        option.pushNotifierEnable = true;
        manager.setOption(option);
        manager.notify("抢红包了");

    }
}
