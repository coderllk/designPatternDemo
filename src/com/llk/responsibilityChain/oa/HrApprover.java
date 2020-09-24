package com.llk.responsibilityChain.oa;

/**
 * 人事主管
 */
public class HrApprover extends Approver {
    @Override
    public void handle(OaRequest request) {
        if( request.getDay() <= 5 ){
            System.out.println("人事主管批准了 "+request.getName()+" "+request.getDay()+" 天假");
        }else{
            if(this.getNext()!=null){
                this.getNext().handle(request);
            }else{
                System.out.println("请假天数太多，没人可以批准");
            }
        }
    }
}
