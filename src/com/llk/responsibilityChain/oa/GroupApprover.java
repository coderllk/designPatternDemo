package com.llk.responsibilityChain.oa;

/**
 * 小组领导
 */
public class GroupApprover extends Approver {

    @Override
    public void handle(OaRequest request) {
        //GroupApprover 判断自己是否可以处理该请求
        if( request.getDay() <= 2 ){//可以处理
            System.out.println("小组领导批准了 "+request.getName()+" "+request.getDay()+" 天假");
        }else{//不可以处理，交给后继处理者 -> 部门领导
            if(this.getNext()!=null){
                this.getNext().handle(request);
            }else{
                System.out.println("请假天数太多，没人可以批准");
            }
        }
    }
}
