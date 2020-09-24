package com.llk.responsibilityChain.oa;

/**
 * 部门领导
 */
public class DepartmentApprover extends Approver {

    @Override
    public void handle(OaRequest request) {
        if( request.getDay() <= 3 ){
            System.out.println("部门领导批准了 "+request.getName()+" "+request.getDay()+" 天假");
        }else{
            if(this.getNext()!=null){
                this.getNext().handle(request);
            }else{
                System.out.println("请假天数太多，没人可以批准");
            }
        }
    }

}
