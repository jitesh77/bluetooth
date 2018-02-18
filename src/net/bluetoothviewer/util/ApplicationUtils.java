package net.bluetoothviewer.util;

import net.bluetoothviewer.application.BluetoothViewerApplication;
import android.app.Application;

public class ApplicationUtils {
    private ApplicationUtils() {
        // utility class, forbidden constructor
    }

    public static boolean isLiteVersion(Application application) {
        return ((BluetoothViewerApplication) application).isLiteVersion();
    }
}
