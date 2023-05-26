package com.google.android.gms.common.util;

import com.google.android.gms.common.annotation.KeepForSdk;
import java.util.regex.Pattern;

@KeepForSdk
@VisibleForTesting
public class Strings {
    static {
        Pattern.compile("\\$\\{(.*?)\\}");
    }

    private Strings() {
    }
}
