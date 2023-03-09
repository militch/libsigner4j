package com.github.militch.libsigner4j;

import org.apache.commons.codec.binary.Hex;

public class Signer {
    static {
        System.loadLibrary("signer");
    }

    /**
     * 生成签名
     * @param msg 内容
     * @return 签名字节码
     */
    public static native byte[] sign(String msg);
    public static String signToHex(String msg) {
        byte[] buf = sign(msg);
        return Hex.encodeHexString(buf);
    }
}
