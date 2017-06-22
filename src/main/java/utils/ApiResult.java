package utils;

/**
 * Created by Administrator on 2017/6/22.
 */
public class ApiResult {

    private String code;
    private String message;
    private String data;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        if (message == null || ("").equals(message)) {
            message = this.data;
        }
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public boolean isSuccess() {
        return ResultCode.SUCCESS.getCode().equals(this.code);
    }

    public boolean isError() {
        return ResultCode.ERROR.getCode().equals(this.code);
    }
}