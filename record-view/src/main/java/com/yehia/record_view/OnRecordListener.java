package com.yehia.record_view;

/**
 * Edit by Yehia Reda on 05/01/2022.
 */
public interface OnRecordListener {
    void onStart();

    void onCancel();

    void onFinish(long recordTime, boolean limitReached, String file);

    void onLessThanSecond();
}
