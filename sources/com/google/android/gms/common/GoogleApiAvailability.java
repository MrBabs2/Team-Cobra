package com.google.android.gms.common;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.widget.ProgressBar;
import androidx.core.app.C0373i;
import androidx.fragment.app.C0456c;
import com.google.android.gms.base.C7154R;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiActivity;
import com.google.android.gms.common.api.internal.LifecycleFragment;
import com.google.android.gms.common.api.internal.zabq;
import com.google.android.gms.common.api.internal.zabr;
import com.google.android.gms.common.internal.ConnectionErrorMessages;
import com.google.android.gms.common.internal.DialogRedirect;
import com.google.android.gms.common.internal.HideFirstParty;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.internal.base.zap;
import p015cm.aptoide.p016pt.downloadmanager.Constants;
import p015cm.aptoide.p016pt.notification.sync.LocalNotificationSyncManager;

public class GoogleApiAvailability extends GoogleApiAvailabilityLight {

    /* renamed from: d */
    private static final Object f13618d = new Object();

    /* renamed from: e */
    private static final GoogleApiAvailability f13619e = new GoogleApiAvailability();

    /* renamed from: c */
    private String f13620c;

    @SuppressLint({"HandlerLeak"})
    /* renamed from: com.google.android.gms.common.GoogleApiAvailability$a */
    private class C7157a extends zap {

        /* renamed from: a */
        private final Context f13621a;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C7157a(Context context) {
            super(Looper.myLooper() == null ? Looper.getMainLooper() : Looper.myLooper());
            this.f13621a = context.getApplicationContext();
        }

        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                StringBuilder sb = new StringBuilder(50);
                sb.append("Don't know how to handle this message: ");
                sb.append(i);
                Log.w("GoogleApiAvailability", sb.toString());
                return;
            }
            int c = GoogleApiAvailability.this.mo24869c(this.f13621a);
            if (GoogleApiAvailability.this.mo24871c(c)) {
                GoogleApiAvailability.this.mo24870c(this.f13621a, c);
            }
        }
    }

    /* renamed from: a */
    public static GoogleApiAvailability m15256a() {
        return f13619e;
    }

    /* renamed from: b */
    public boolean mo24868b(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a = mo24860a(activity, i, i2, onCancelListener);
        if (a == null) {
            return false;
        }
        m15257a(activity, a, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* renamed from: c */
    public void mo24870c(Context context, int i) {
        m15258a(context, i, (String) null, mo24874a(context, i, 0, "n"));
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo24872d(Context context) {
        new C7157a(context).sendEmptyMessageDelayed(1, LocalNotificationSyncManager.TWO_MINUTES);
    }

    /* renamed from: a */
    public Dialog mo24859a(Activity activity, int i, int i2) {
        return mo24860a(activity, i, i2, (DialogInterface.OnCancelListener) null);
    }

    /* renamed from: b */
    private final String m15259b() {
        String str;
        synchronized (f13618d) {
            str = this.f13620c;
        }
        return str;
    }

    /* renamed from: a */
    public Dialog mo24860a(Activity activity, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        return m15255a((Context) activity, i, DialogRedirect.m15990a(activity, mo24863a((Context) activity, i, "d"), i2), onCancelListener);
    }

    @HideFirstParty
    /* renamed from: c */
    public int mo24869c(Context context) {
        return super.mo24869c(context);
    }

    /* renamed from: c */
    public final boolean mo24871c(int i) {
        return super.mo24871c(i);
    }

    /* renamed from: a */
    public final boolean mo24865a(Activity activity, LifecycleFragment lifecycleFragment, int i, int i2, DialogInterface.OnCancelListener onCancelListener) {
        Dialog a = m15255a((Context) activity, i, DialogRedirect.m15992a(lifecycleFragment, mo24863a((Context) activity, i, "d"), 2), onCancelListener);
        if (a == null) {
            return false;
        }
        m15257a(activity, a, GooglePlayServicesUtil.GMS_ERROR_DIALOG, onCancelListener);
        return true;
    }

    /* renamed from: b */
    public final String mo24867b(int i) {
        return super.mo24867b(i);
    }

    /* renamed from: a */
    public final boolean mo24866a(Context context, ConnectionResult connectionResult, int i) {
        PendingIntent a = mo24862a(context, connectionResult);
        if (a == null) {
            return false;
        }
        m15258a(context, connectionResult.mo24840d(), (String) null, GoogleApiActivity.m15326a(context, a, i));
        return true;
    }

    /* renamed from: a */
    public static Dialog m15254a(Activity activity, DialogInterface.OnCancelListener onCancelListener) {
        ProgressBar progressBar = new ProgressBar(activity, (AttributeSet) null, 16842874);
        progressBar.setIndeterminate(true);
        progressBar.setVisibility(0);
        AlertDialog.Builder builder = new AlertDialog.Builder(activity);
        builder.setView(progressBar);
        builder.setMessage(ConnectionErrorMessages.m15986b(activity, 18));
        builder.setPositiveButton("", (DialogInterface.OnClickListener) null);
        AlertDialog create = builder.create();
        m15257a(activity, (Dialog) create, "GooglePlayServicesUpdatingDialog", onCancelListener);
        return create;
    }

    /* renamed from: a */
    public final zabq mo24864a(Context context, zabr zabr) {
        IntentFilter intentFilter = new IntentFilter("android.intent.action.PACKAGE_ADDED");
        intentFilter.addDataScheme(Constants.PACKAGE);
        zabq zabq = new zabq(zabr);
        context.registerReceiver(zabq, intentFilter);
        zabq.mo25174a(context);
        if (mo24877a(context, "com.google.android.gms")) {
            return zabq;
        }
        zabr.mo25118a();
        zabq.mo25173a();
        return null;
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: a */
    public int mo24858a(Context context, int i) {
        return super.mo24858a(context, i);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: a */
    public Intent mo24863a(Context context, int i, String str) {
        return super.mo24863a(context, i, str);
    }

    /* renamed from: a */
    public PendingIntent mo24861a(Context context, int i, int i2) {
        return super.mo24861a(context, i, i2);
    }

    /* renamed from: a */
    public PendingIntent mo24862a(Context context, ConnectionResult connectionResult) {
        if (connectionResult.mo24845q()) {
            return connectionResult.mo24844p();
        }
        return mo24861a(context, connectionResult.mo24840d(), 0);
    }

    /* renamed from: a */
    static Dialog m15255a(Context context, int i, DialogRedirect dialogRedirect, DialogInterface.OnCancelListener onCancelListener) {
        AlertDialog.Builder builder = null;
        if (i == 0) {
            return null;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(16843529, typedValue, true);
        if ("Theme.Dialog.Alert".equals(context.getResources().getResourceEntryName(typedValue.resourceId))) {
            builder = new AlertDialog.Builder(context, 5);
        }
        if (builder == null) {
            builder = new AlertDialog.Builder(context);
        }
        builder.setMessage(ConnectionErrorMessages.m15986b(context, i));
        if (onCancelListener != null) {
            builder.setOnCancelListener(onCancelListener);
        }
        String a = ConnectionErrorMessages.m15982a(context, i);
        if (a != null) {
            builder.setPositiveButton(a, dialogRedirect);
        }
        String e = ConnectionErrorMessages.m15989e(context, i);
        if (e != null) {
            builder.setTitle(e);
        }
        return builder.create();
    }

    /* renamed from: a */
    static void m15257a(Activity activity, Dialog dialog, String str, DialogInterface.OnCancelListener onCancelListener) {
        if (activity instanceof C0456c) {
            SupportErrorDialogFragment.m15294a(dialog, onCancelListener).show(((C0456c) activity).getSupportFragmentManager(), str);
            return;
        }
        ErrorDialogFragment.m15251a(dialog, onCancelListener).show(activity.getFragmentManager(), str);
    }

    @TargetApi(20)
    /* renamed from: a */
    private final void m15258a(Context context, int i, String str, PendingIntent pendingIntent) {
        int i2;
        if (i == 18) {
            mo24872d(context);
        } else if (pendingIntent != null) {
            String d = ConnectionErrorMessages.m15988d(context, i);
            String c = ConnectionErrorMessages.m15987c(context, i);
            Resources resources = context.getResources();
            NotificationManager notificationManager = (NotificationManager) context.getSystemService("notification");
            C0373i.C0377d dVar = new C0373i.C0377d(context);
            dVar.mo2253b(true);
            dVar.mo2248a(true);
            dVar.mo2252b((CharSequence) d);
            C0373i.C0375b bVar = new C0373i.C0375b();
            bVar.mo2234a((CharSequence) c);
            dVar.mo2245a((C0373i.C0378e) bVar);
            if (DeviceProperties.m16272c(context)) {
                Preconditions.m16047b(PlatformVersion.m16291g());
                dVar.mo2254c(context.getApplicationInfo().icon);
                dVar.mo2250b(2);
                if (DeviceProperties.m16273d(context)) {
                    dVar.mo2240a(C7154R.C7155drawable.common_full_open_on_phone, (CharSequence) resources.getString(C7154R.string.common_open_on_phone), pendingIntent);
                } else {
                    dVar.mo2242a(pendingIntent);
                }
            } else {
                dVar.mo2254c(17301642);
                dVar.mo2255c((CharSequence) resources.getString(C7154R.string.common_google_play_services_notification_ticker));
                dVar.mo2241a(System.currentTimeMillis());
                dVar.mo2242a(pendingIntent);
                dVar.mo2246a((CharSequence) c);
            }
            if (PlatformVersion.m16295k()) {
                Preconditions.m16047b(PlatformVersion.m16295k());
                String b = m15259b();
                if (b == null) {
                    b = "com.google.android.gms.availability";
                    NotificationChannel notificationChannel = notificationManager.getNotificationChannel(b);
                    String b2 = ConnectionErrorMessages.m15985b(context);
                    if (notificationChannel == null) {
                        notificationManager.createNotificationChannel(new NotificationChannel(b, b2, 4));
                    } else if (!b2.contentEquals(notificationChannel.getName())) {
                        notificationChannel.setName(b2);
                        notificationManager.createNotificationChannel(notificationChannel);
                    }
                }
                dVar.mo2247a(b);
            }
            Notification a = dVar.mo2237a();
            if (i == 1 || i == 2 || i == 3) {
                i2 = 10436;
                GooglePlayServicesUtilLight.sCanceledAvailabilityNotification.set(false);
            } else {
                i2 = 39789;
            }
            notificationManager.notify(i2, a);
        } else if (i == 6) {
            Log.w("GoogleApiAvailability", "Missing resolution for ConnectionResult.RESOLUTION_REQUIRED. Call GoogleApiAvailability#showErrorNotification(Context, ConnectionResult) instead.");
        }
    }
}
