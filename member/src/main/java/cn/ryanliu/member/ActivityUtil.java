package cn.ryanliu.member;

import cn.ryanliu.arouter.ARouter;
import cn.ryanliu.arouter.IRouter;

public class ActivityUtil implements IRouter {
    @Override
    public void putActivity() {
        //将当前模块所有的Activity.class加进去
        ARouter.getInstance().addActivity("member/member",MemberActivity.class);
    }
}
