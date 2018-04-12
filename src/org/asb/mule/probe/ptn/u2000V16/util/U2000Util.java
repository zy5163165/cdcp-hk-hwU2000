package org.asb.mule.probe.ptn.u2000V16.util;

import globaldefs.NameAndStringValue_T;

/**
 * Author: Ronnie.Chen
 * Date: 13-7-29
 * Time: 下午4:41
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class U2000Util {
    public static  String toString(NameAndStringValue_T[] nvs) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < nvs.length; i++) {
            NameAndStringValue_T nv = nvs[i];
            sb.append(nv.name+"="+nv.value).append(";");
        }
        return sb.toString();
    }
}
