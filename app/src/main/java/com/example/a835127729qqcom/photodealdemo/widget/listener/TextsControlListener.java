package com.example.a835127729qqcom.photodealdemo.widget.listener;

import com.example.a835127729qqcom.photodealdemo.dealaction.TextAction;

import java.util.ArrayList;

/**
 * Created by 835127729qq.com on 16/9/12.
 * StickerView通知ActionImageView增加或者删除textAction
 */
public interface TextsControlListener{
    public void onAddText(TextAction textAction);
    public void onDeleteText(TextAction textAction);
}
