package com.google.android.gms.common.internal;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.base.C7154R;
import com.google.android.gms.common.C7158R;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.wrappers.Wrappers;
import p050l.p066e.C4881g;

public final class ConnectionErrorMessages {

    /* renamed from: a */
    private static final C4881g<String, String> f14103a = new C4881g<>();

    private ConnectionErrorMessages() {
    }

    /* renamed from: a */
    public static String m15982a(Context context, int i) {
        Resources resources = context.getResources();
        if (i == 1) {
            return resources.getString(C7154R.string.common_google_play_services_install_button);
        }
        if (i == 2) {
            return resources.getString(C7154R.string.common_google_play_services_update_button);
        }
        if (i != 3) {
            return resources.getString(17039370);
        }
        return resources.getString(C7154R.string.common_google_play_services_enable_button);
    }

    /* renamed from: b */
    public static String m15986b(Context context, int i) {
        Resources resources = context.getResources();
        String a = m15981a(context);
        if (i == 1) {
            return resources.getString(C7154R.string.common_google_play_services_install_text, new Object[]{a});
        } else if (i != 2) {
            if (i == 3) {
                return resources.getString(C7154R.string.common_google_play_services_enable_text, new Object[]{a});
            } else if (i == 5) {
                return m15984a(context, "common_google_play_services_invalid_account_text", a);
            } else {
                if (i == 7) {
                    return m15984a(context, "common_google_play_services_network_error_text", a);
                }
                if (i == 9) {
                    return resources.getString(C7154R.string.common_google_play_services_unsupported_text, new Object[]{a});
                } else if (i == 20) {
                    return m15984a(context, "common_google_play_services_restricted_profile_text", a);
                } else {
                    switch (i) {
                        case 16:
                            return m15984a(context, "common_google_play_services_api_unavailable_text", a);
                        case 17:
                            return m15984a(context, "common_google_play_services_sign_in_failed_text", a);
                        case 18:
                            return resources.getString(C7154R.string.common_google_play_services_updating_text, new Object[]{a});
                        default:
                            return resources.getString(C7158R.string.common_google_play_services_unknown_issue, new Object[]{a});
                    }
                }
            }
        } else if (DeviceProperties.m16273d(context)) {
            return resources.getString(C7154R.string.common_google_play_services_wear_update_text);
        } else {
            return resources.getString(C7154R.string.common_google_play_services_update_text, new Object[]{a});
        }
    }

    /* renamed from: c */
    public static String m15987c(Context context, int i) {
        if (i == 6) {
            return m15984a(context, "common_google_play_services_resolution_required_text", m15981a(context));
        }
        return m15986b(context, i);
    }

    /* renamed from: d */
    public static String m15988d(Context context, int i) {
        String str;
        if (i == 6) {
            str = m15983a(context, "common_google_play_services_resolution_required_title");
        } else {
            str = m15989e(context, i);
        }
        return str == null ? context.getResources().getString(C7154R.string.common_google_play_services_notification_ticker) : str;
    }

    /* renamed from: e */
    public static String m15989e(Context context, int i) {
        Resources resources = context.getResources();
        switch (i) {
            case 1:
                return resources.getString(C7154R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(C7154R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(C7154R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return m15983a(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return m15983a(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return m15983a(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return m15983a(context, "common_google_play_services_restricted_profile_title");
            default:
                StringBuilder sb = new StringBuilder(33);
                sb.append("Unexpected error code ");
                sb.append(i);
                Log.e("GoogleApiAvailability", sb.toString());
                return null;
        }
    }

    /* renamed from: a */
    public static String m15981a(Context context) {
        String packageName = context.getPackageName();
        try {
            return Wrappers.m16317a(context).mo25511b(packageName).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            return TextUtils.isEmpty(str) ? packageName : str;
        }
    }

    /* renamed from: a */
    private static String m15984a(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String a = m15983a(context, str);
        if (a == null) {
            a = resources.getString(C7158R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, a, new Object[]{str2});
    }

    /* renamed from: a */
    private static String m15983a(Context context, String str) {
        synchronized (f14103a) {
            String str2 = f14103a.get(str);
            if (str2 != null) {
                return str2;
            }
            Resources remoteResource = GooglePlayServicesUtil.getRemoteResource(context);
            if (remoteResource == null) {
                return null;
            }
            int identifier = remoteResource.getIdentifier(str, "string", "com.google.android.gms");
            if (identifier == 0) {
                String valueOf = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf.length() != 0 ? "Missing resource: ".concat(valueOf) : new String("Missing resource: "));
                return null;
            }
            String string = remoteResource.getString(identifier);
            if (TextUtils.isEmpty(string)) {
                String valueOf2 = String.valueOf(str);
                Log.w("GoogleApiAvailability", valueOf2.length() != 0 ? "Got empty resource: ".concat(valueOf2) : new String("Got empty resource: "));
                return null;
            }
            f14103a.put(str, string);
            return string;
        }
    }

    /* renamed from: b */
    public static String m15985b(Context context) {
        return context.getResources().getString(C7154R.string.common_google_play_services_notification_channel_name);
    }
}
