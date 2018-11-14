package com.zgg.hochat.http.model;


import com.zgg.hochat.api.ApiFactory;
import com.zgg.hochat.api.TokenApiFactory;
import com.zgg.hochat.bean.LoginInput;
import com.zgg.hochat.common.MyCallBack;
import com.zgg.hochat.base.BaseModel;

import java.util.Map;

/**
 * 类描述：地区
 * 创建人：liufei
 * 创建时间：2018/2/23 11:36
 * 修改人：
 * 修改时间：
 * 修改备注：
 */
public class LoginModel extends BaseModel {

    private static LoginModel model;

    private LoginModel() {
    }

    public synchronized static LoginModel newInstance() {
        if (model == null) {
            model = new LoginModel();
        }
        return model;
    }


    /**
     * 获token
     */
    public void getToken(Map<String, Object> params, MyCallBack callBack) {
        TokenApiFactory.getService().getToken(params).enqueue(callBack);
    }

    /**
     * 登录
     */
    public void login(LoginInput params, MyCallBack callBack) {
        ApiFactory.getService().login(params).enqueue(callBack);
    }
}
