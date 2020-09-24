package com.llk.responsibilityChain.oa;

public class Test {

    public static void main(String[] args) {
        OaRequest request = new OaRequest("张三",5);
        GroupApprover groupApprover = new GroupApprover();
        DepartmentApprover departmentApprover = new DepartmentApprover();
        HrApprover hrApprover = new HrApprover();
        ManagerApprover managerApprover = new ManagerApprover();

        //构造审批链
        groupApprover.setNext(departmentApprover);
        departmentApprover.setNext(hrApprover);
        hrApprover.setNext(managerApprover);

        //从链头开始进行审批
        groupApprover.handle(request);
    }

}
