package com.app.tomore.beans;

import android.annotation.TargetApi;
import android.os.Build;
import android.os.Environment;

public class SystemUtils {
	
	/** �?��SD卡状�?**/
    public static boolean isSdCardAvailable() {
        String externalStorageState = Environment.getExternalStorageState();
        if (externalStorageState != null) {
            return externalStorageState.equals(Environment.MEDIA_MOUNTED);
        }

        return false;
    }
	
	//�?��SD卡是否是可插拔的�?    @TargetApi(9)
    public static boolean isExternalStorageRemovable() {
        
        return true;
    }
    
    public static boolean hasGingerbread() {
        return false;
     }
	
	public static boolean hasFroyo() {
	    return Build.VERSION.SDK_INT >= Build.VERSION_CODES.FROYO;
     }
	
}
