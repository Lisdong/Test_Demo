package com.wlmq.profit.permission;

import android.Manifest;

/**
 * 可主动申请权限列表
 * Created by 裕杰 on 2016/12/6.
 */

public class Permission {
    //通讯录操作权限
	public static final String WRITE_CONTACTS = Manifest.permission.WRITE_CONTACTS;
    public static final String GET_ACCOUNTS = Manifest.permission.GET_ACCOUNTS;
    public static final String READ_CONTACTS = Manifest.permission.READ_CONTACTS;

    //打电话相关操作权限
    public static final String READ_CALL_LOG = Manifest.permission.READ_CALL_LOG;
    public static final String READ_PHONE_STATE = Manifest.permission.READ_PHONE_STATE;
    public static final String CALL_PHONE = Manifest.permission.CALL_PHONE;
    public static final String WRITE_CALL_LOG = Manifest.permission.WRITE_CALL_LOG;
    public static final String USE_SIP = Manifest.permission.USE_SIP;
    public static final String PROCESS_OUTGOING_CALLS = Manifest.permission.PROCESS_OUTGOING_CALLS;
    public static final String ADD_VOICEMAIL = Manifest.permission.ADD_VOICEMAIL;
    //读写日历操作权限
    public static final String READ_CALENDAR = Manifest.permission.READ_CALENDAR;
    public static final String WRITE_CALENDAR = Manifest.permission.WRITE_CALENDAR;

    //调用相机操作权限
    public static final String CAMERA = Manifest.permission.CAMERA;
    //重力感应权限
    public static final String BODY_SENSORS = Manifest.permission.BODY_SENSORS;
    //定位权限
    public static final String ACCESS_FINE_LOCATION = Manifest.permission.ACCESS_FINE_LOCATION;
    public static final String ACCESS_COARSE_LOCATION = Manifest.permission.ACCESS_COARSE_LOCATION;
    //外部存储读写权限
    public static final String READ_EXTERNAL_STORAGE = Manifest.permission.READ_EXTERNAL_STORAGE;
    public static final String WRITE_EXTERNAL_STORAGE = Manifest.permission.WRITE_EXTERNAL_STORAGE;
    //录音权限
    public static final String RECORD_AUDIO = Manifest.permission.RECORD_AUDIO;
    //短信相关权限
    public static final String READ_SMS = Manifest.permission.READ_SMS;
    public static final String RECEIVE_WAP_PUSH = Manifest.permission.RECEIVE_WAP_PUSH;
    public static final String RECEIVE_MMS = Manifest.permission.RECEIVE_MMS;
    public static final String RECEIVE_SMS = Manifest.permission.RECEIVE_SMS;
    public static final String SEND_SMS = Manifest.permission.SEND_SMS;

}
