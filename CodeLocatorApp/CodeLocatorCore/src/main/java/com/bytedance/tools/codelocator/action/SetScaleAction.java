package com.bytedance.tools.codelocator.action;

import android.view.View;

import androidx.annotation.NonNull;

import com.bytedance.tools.codelocator.model.ResultData;
import com.bytedance.tools.codelocator.utils.CodeLocatorConstants;

/**
 * Created by liujian.android on 2024/4/1
 *
 * @author liujian.android@bytedance.com
 */
public class SetScaleAction extends ViewAction {

    @NonNull
    @Override
    public String getActionType() {
        return CodeLocatorConstants.EditType.SCALE_XY;
    }

    @Override
    public void processViewAction(@NonNull View view, String data, @NonNull ResultData result) {
        String[] split = data.split(",");
        if (split.length != 2) {
            return;
        }
        view.setScaleX(Float.parseFloat(split[0]));
        view.setScaleY(Float.parseFloat(split[1]));
    }

}
