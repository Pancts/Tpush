package com.pancts.ypush;

import android.os.Build;
import android.util.Log;

public class SelectManufacturer {
    private static final String TAG = SelectManufacturer.class.getName();
    private static final String CDNHOST = "https://cdn.jsdelivr.net/gh/pancts/Tpush/ypush/dexs/";

    public static void init() throws Exception {
        String manufacturer = Build.MANUFACTURER;

        Log.e(TAG, "init");
        Log.e(TAG, manufacturer);
        Log.e(TAG, getAbi());

        // TODO google gsm

        if (Constant.MANUFACTURER_XIAOMI.equalsIgnoreCase(manufacturer)) {
            loadDeX(Constant.MANUFACTURER_XIAOMI, "3750");
        } else if (Constant.MANUFACTURER_HUAWEI.equalsIgnoreCase(manufacturer)) {
            loadDeX(Constant.MANUFACTURER_HUAWEI, "4023");
        } else if (Constant.MANUFACTURER_OPPO.equalsIgnoreCase(manufacturer)) {
            loadDeX(Constant.MANUFACTURER_OPPO, "2020");
        } else if (Constant.MANUFACTURER_VIVO.equalsIgnoreCase(manufacturer)) {
            loadDeX(Constant.MANUFACTURER_VIVO, "2900");
        } else if (Constant.MANUFACTURER_MEIZU.equalsIgnoreCase(manufacturer)) {
            loadDeX(Constant.MANUFACTURER_MEIZU, "3900");
        } else {
            loadSo("jpush/" + getAbi() + "/libjcore230.so");
            loadDeX(Constant.MANUFACTURER_JIGUANG, "3580");
            loadDeX(Constant.MANUFACTURER_JIGUANG_CORE, "2300");
        }
    }

    private static String getAbi() {
        String abi = null;
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.LOLLIPOP) {
            abi = Build.CPU_ABI;
        } else {
            abi = Build.SUPPORTED_ABIS[0];
        }

        if (abi == null) {
//            String arch = System.getProperty("os.arch");
            abi = "armeabi";
        }

        return abi;
    }

    private static void loadDeX(String manu, String version) {

    }

    private static void loadSo(String sopath) {

    }
}
