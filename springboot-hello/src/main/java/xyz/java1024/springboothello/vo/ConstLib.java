package xyz.java1024.springboothello.vo;

import java.util.HashMap;
import java.util.Map;

/**
 * @author xiongsihang
 */
public interface ConstLib {
    /**公共*/
    String DEFAULT_ENCODING = "UTF-8";
    String RESP_JSON_TYPE = "application/json;charset=UTF-8";
    String RESP_TEXT_TYPE = "text/plain;charset=UTF-8";
    Map<String ,String> HEADER = new HashMap<String, String>() {
        private static final long serialVersionUID = 1L;
        {
            put("Content-Type", "application/json");
        }};

    String HEADER_STR = "content-type=application/json";

    String APP_NAME = "wiiauth";

    String V2_URI_PREFIX = "/wiiauth/v2";
    String V2_URI_PREFIX_NOENC = "/wiiauth/v2/noenc";

    // 大白内部通用密钥和偏移
    /** GeneralKEY@3f9d2 */
    String GENERAL_KEY = "R2VuZXJhbEtFWUAzZjlkMg==";
    /** GeneralIV@2f0b8c */
    String GENERAL_IV = "R2VuZXJhbElWQDJmMGI4Yw==";

    // 二级平台加解密通用密钥和偏移
    /** AuthKEY@29d1727b */
    String AUTH_KEY = "QXV0aEtFWUAyOWQxNzI3Yg==";
    /** AuthIV@7da4c2fa0 */
    String AUTH_IV = "QXV0aElWQDdkYTRjMmZhMA==";

    /**Jpush推送服务相关*/
    interface JpushConsts {
        /** 微证 */
        String APP_KEY = "6a5d5f7c233648a9d6723fca";
        String MASTER_SECRET = "84753bdd2fa33e25296cf1d4";

		interface PushType {
			/** 登录态 */
			int LOGIN_STATE = 1;
			/** 面对面认证结果 */
			int FACE2_FACE_AUTH = 3;
			/** 第三方请求认证推送到APP */
			int TP_AUTH_REQ2_APP = 6;
			/** 第三方认证结果推送到APP */
			int TP_AUTH_RESP2_APP = 7;
			/** 旅业系统推送认证请求到APP */
			int HOTEL_AUTH_REQ2_APP = 8;
			 /** 分享认证推送认证结果到app */
			int SHARE_AUTH = 9;
			/** 出示二维码核查记录推送到APP */
			int PERSONAL_QR_CODE_EXAMINE = 10;
		}
	}

    interface TpConsts {
        /**获取certtoken时的操作类型*/
        interface AuthOperation {
            /**第三方通过access token获取cert token*/
            String TP = "tp";
            /**app通过client_id/client_secret获取cert token*/
            String F2F = "f2f";
            /**网证小程序通过client_id/client_secret获取cert token*/
            String FAMA = "fama";
            /**云网证小程序获取二维码*/
            String CTIDAPP = "ctidapp";
            /**南沙政务通过access token 获取cert token及二维码*/
            String NSZW = "nszw";
            /**分享认证获取二维码*/
            String SHARE_AUTH = "shareauth";
        }
    }

    /**微警徽章key*/
    interface BadgeConsts {
        String ID_CARD = "idcard";
        String WX = "wx";
        String YCT = "yct";
        String ALIPAY = "alipay";
    }

    /**短信*/
    interface SmsConsts {
        String MSG_CLIENT_ID = "b06z49";
        String MSG_CLIENT_SECRET = "a56f7aa0ca4b40770578cff080488ac1";
        String MSG_TYPE = "4";
        String MSG_CONTENT = "【微警认证】您的验证码为{identify_code}，请于5分钟内正确输入。";
        String MSG_SEND_URL = "https://Request.ucpaas.com/sms-partner/access/{clientid}/sendsms";
    }

	/** 核查通 */
	interface Hct {
		String REQUEST_TYPE = "requestType";
		String YZT = "YZT";
	}

    /**
     * 数据对账
     */
	interface DataVerify {
        String DATA_VERIFY_KEY = "YmNhZjA4NjRlNjA1Y2UyZQ==";
        String DATA_VERIFY_IV = "YTQ2ZDFiOGRlZjc3ZjY5Mw==";
        String DATA_VERIFY_ENCODING = "utf-8";
        String DATE_PATTERN = "yyyy-MM-dd HH:mm:ss";
        double PERMITS_PERSECOND = 66.6d;
    }
}
