package utils;

/**
 * Created by Administrator on 2017/6/22.
 */
public enum  ResultCode {

        SUCCESS("200", "success"), // 正确请求
        ERROR("500", "failure"); // 请求错误

        /** 主键 */
        private final String code;

        /** 描述 */
        private final String desc;

        ResultCode(final String code, final String desc) {
            this.code = code;
            this.desc = desc;
        }

        public String getCode() {
            return this.code;
        }

        public String getDesc() {
            return this.desc;
        }

}
