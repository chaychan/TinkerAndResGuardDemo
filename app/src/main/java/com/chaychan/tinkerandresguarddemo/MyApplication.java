package com.chaychan.tinkerandresguarddemo;

import com.tencent.tinker.loader.app.TinkerApplication;
import com.tencent.tinker.loader.shareutil.ShareConstants;

/**
 * @author ChayChan
 * @description: TODO
 * @date 2017/11/17  21:36
 */

public class MyApplication extends TinkerApplication {

    public MyApplication() {
        super(ShareConstants.TINKER_ENABLE_ALL, MyApplicationLike.class.getCanonicalName(),
                "com.tencent.tinker.loader.TinkerLoader", false);
    }
}
