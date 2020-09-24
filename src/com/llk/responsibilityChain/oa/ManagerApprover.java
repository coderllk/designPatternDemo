package com.llk.responsibilityChain.oa;

/**
 * 老板经理
 */
public class ManagerApprover extends Approver {
    @Override
    public void handle(OaRequest request) {
        if( request.getDay() <= 10 ){
            System.out.println("老板经理批准了 "+request.getName()+" "+request.getDay()+" 天假");
        }else{
            if(this.getNext()!=null){
                this.getNext().handle(request);
            }else{
                System.out.println("请假天数太多，没人可以批准");
            }
        }
    }
}
