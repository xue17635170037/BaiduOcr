package com.bbcj.benbenclient;

import android.app.Application;

import com.baidu.ocr.sdk.OCR;
import com.baidu.ocr.sdk.OnResultListener;
import com.baidu.ocr.sdk.exception.OCRError;
import com.baidu.ocr.sdk.model.AccessToken;
import com.baidu.ocr.sdk.utils.LogUtil;

/**
 * Created by Administrator on 2019/09/24.
 */

public class App extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
       OCR.getInstance(this).initAccessToken(new OnResultListener<AccessToken>() {
           @Override
           public void onResult(AccessToken accessToken) {
               LogUtil.i("TAG",accessToken.getAccessToken());
           }

           @Override
           public void onError(OCRError ocrError) {
                LogUtil.i("TAG",ocrError.toString());
           }
       },this);

    }
}
