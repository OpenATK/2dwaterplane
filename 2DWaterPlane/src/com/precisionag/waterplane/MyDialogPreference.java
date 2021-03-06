package com.precisionag.waterplane;

import android.content.Context;
import android.content.SharedPreferences;
import android.preference.DialogPreference;
import android.preference.Preference;
import android.preference.PreferenceManager;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;

/**
 * Created by steve on 6/27/13.
 */
public class MyDialogPreference extends DialogPreference {

    public MyDialogPreference(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onDialogClosed(boolean positiveResult) {
        if (positiveResult) {
            MainActivity.defaultSlider();
        }
    }
}