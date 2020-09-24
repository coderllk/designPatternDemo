package com.llk.responsibilityChain.oa;

/**
 * 老板
 */
public class BossApprover extends Approver {
    @Override
    public void handle(OaRequest request) {
        if( request.getDay() <= 20 ){
            System.out.println("老板批准了 "+request.getName()+" "+request.getDay()+" 天假");
        }else{
            if(this.getNext()!=null){
                this.getNext().handle(request);
            }else{
                System.out.println("请假天数太多，没人可以批准");
            }
        }
    }
}
