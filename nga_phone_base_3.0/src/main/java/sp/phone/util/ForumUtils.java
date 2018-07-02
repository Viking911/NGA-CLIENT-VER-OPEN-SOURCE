package sp.phone.util;

import android.content.Context;
import android.content.SharedPreferences;

import gov.anzong.androidnga.R;
import sp.phone.common.ApplicationContextHolder;
import sp.phone.common.PreferenceKey;

/**
 * Created by Justwen on 2018/7/2.
 */
public class ForumUtils {

    public static String getAvailableDomain() {
        Context context = ApplicationContextHolder.getContext();
        SharedPreferences sp = context.getSharedPreferences(PreferenceKey.PERFERENCE, Context.MODE_PRIVATE);
        int index = Integer.parseInt(sp.getString(PreferenceKey.KEY_NGA_DOMAIN, "0"));
        return context.getResources().getStringArray(R.array.nga_domain)[index];
    }
}
