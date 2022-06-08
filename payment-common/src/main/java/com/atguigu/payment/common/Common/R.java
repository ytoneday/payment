package com.atguigu.payment.common.Common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

/**
 * @Author:YT
 * @Date:2022/6/8 - 06 - 08 - 15:39
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class R implements Serializable {

    private Integer code;
    private String message;
    private Map<String, Object> data = new HashMap<>();

    public static R ok(){
        R r = new R();
        r.setCode(0);
        r.setMessage("成功");
        return r;
    }

    public static R error(){
        R r = new R();
        r.setCode(-1);
        r.setMessage("失败");
        return r;
    }

    public R data(String key, Object value){
        this.data.put(key, value);
        return this;
    }
}
