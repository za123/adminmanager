package entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ResultEntity {

    private static final String SUCCESS = "SUCCESS";
    private static final String FAIl = "FAIl";

    private String status;  //业务请求状态码

    private Object data;    //响应数据

    private String desc;    //业务描述详情

    /**
     * 请求成功响应
     *
     * @param data 响应数据包
     * @param desc 业务详情描述
     * @return 请求数据包体
     */
    public static ResultEntity success(Object data, String desc) {
        return new ResultEntity(SUCCESS, data, desc);
    }

    /**
     * 请求失败响应
     *
     * @param data 响应数据包
     * @param desc 业务详情描述
     * @return 请求数据包体
     */
    public static ResultEntity fail(Object data, String desc) {
        return new ResultEntity(FAIl, data, desc);
    }
}

