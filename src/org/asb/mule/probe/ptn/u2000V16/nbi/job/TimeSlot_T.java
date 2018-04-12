package org.asb.mule.probe.ptn.u2000V16.nbi.job;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

/**
 * Author: Ronnie.Chen
 * Date: 14-7-24
 * Time: 下午8:43
 * rongrong.chen@alcatel-sbell.com.cn
 */
public class TimeSlot_T {
    public java.lang.String k;
    public java.lang.String l;
    public java.lang.String m;
    public java.lang.String n;
    public java.lang.String vWaveLengthNo;
    public java.lang.String channelNumber;

    public TimeSlot_T(String k, String l, String m, String n, String vWaveLengthNo, String channelNumber) {
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.vWaveLengthNo = vWaveLengthNo;
        this.channelNumber = channelNumber;
    }
}
