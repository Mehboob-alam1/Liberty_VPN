package com.mehboob.securanetvpn.utils;

import android.net.Uri;

import com.mehboob.securanetvpn.R;


public class Utils {
public static int GRAD_COLOR=0xFF310BE8;
    /**
     * Convert drawable image resource to string
     *
     * @param resourceId drawable image resource
     * @return image path
     */
    public static String getImgURL(int resourceId) {

        // Use BuildConfig.APPLICATION_ID instead of R.class.getPackage().getName() if both are not same
        return Uri.parse("android.resource://" + R.class.getPackage().getName() + "/" + resourceId).toString();
    }
}
