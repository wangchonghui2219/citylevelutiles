package com.dlwx.cityseleteutile;

import android.app.Activity;
import android.content.Context;

import com.google.gson.Gson;

import org.json.JSONObject;
import java.io.InputStream;
import java.util.List;

/**
 * Created by Administrator on 2017/5/13/013.
 */

public class CityJsonUtile {

    /**
     * 从assert文件夹中获取json数据
     */
    public static List<SanJiLianDBean.CityList> initJsonData(Context ctx) {
        try {
            StringBuffer sb = new StringBuffer();
            InputStream is = ((Activity)ctx).getAssets().open("city.json");//打开json数据
            byte[] by = new byte[is.available()];//转字节
            int len = -1;
            while ((len = is.read(by)) != -1) {
                sb.append(new String(by, 0, len, "gb2312"));//根据字节长度设置编码
            }
            is.close();//关闭流
            //为json赋值
            JSONObject jsonObject = new JSONObject(sb.toString());
            Gson gson = new Gson();

            SanJiLianDBean sanJiLianDBean = gson.fromJson(jsonObject.toString(), SanJiLianDBean.class);
            List<SanJiLianDBean.CityList> citylist = sanJiLianDBean.getCitylist();
            return citylist;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
