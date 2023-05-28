package com.facebook.login;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.C0456c;
import com.facebook.AccessToken;
import com.facebook.C6359c;
import com.facebook.login.LoginClient;
import java.util.Collection;
import java.util.Date;
import java.util.concurrent.ScheduledThreadPoolExecutor;

class DeviceAuthMethodHandler extends LoginMethodHandler {
    public static final Parcelable.Creator<DeviceAuthMethodHandler> CREATOR = new C6504a();

    /* renamed from: h */
    private static ScheduledThreadPoolExecutor f12020h;

    /* renamed from: com.facebook.login.DeviceAuthMethodHandler$a */
    static class C6504a implements Parcelable.Creator {
        C6504a() {
        }

        public DeviceAuthMethodHandler createFromParcel(Parcel parcel) {
            return new DeviceAuthMethodHandler(parcel);
        }

        public DeviceAuthMethodHandler[] newArray(int i) {
            return new DeviceAuthMethodHandler[i];
        }
    }

    DeviceAuthMethodHandler(LoginClient loginClient) {
        super(loginClient);
    }

    /* renamed from: b */
    private void m13656b(LoginClient.Request request) {
        C0456c c = this.f12059g.mo21136c();
        if (c != null && !c.isFinishing()) {
            DeviceAuthDialog d = mo21107d();
            d.show(c.getSupportFragmentManager(), "login_with_facebook");
            d.mo21085a(request);
        }
    }

    /* renamed from: f */
    public static synchronized ScheduledThreadPoolExecutor m13657f() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceAuthMethodHandler.class) {
            if (f12020h == null) {
                f12020h = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f12020h;
        }
        return scheduledThreadPoolExecutor;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public boolean mo21074a(LoginClient.Request request) {
        m13656b(request);
        return true;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public String mo21075b() {
        return "device_auth";
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public DeviceAuthDialog mo21107d() {
        return new DeviceAuthDialog();
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public void mo21109e() {
        this.f12059g.mo21133b(LoginClient.Result.m13720a(this.f12059g.mo21143g(), "User canceled log in."));
    }

    public void writeToParcel(Parcel parcel, int i) {
        super.writeToParcel(parcel, i);
    }

    protected DeviceAuthMethodHandler(Parcel parcel) {
        super(parcel);
    }

    /* renamed from: a */
    public void mo21105a(Exception exc) {
        this.f12059g.mo21133b(LoginClient.Result.m13721a(this.f12059g.mo21143g(), (String) null, exc.getMessage()));
    }

    /* renamed from: a */
    public void mo21106a(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, C6359c cVar, Date date, Date date2, Date date3) {
        this.f12059g.mo21133b(LoginClient.Result.m13719a(this.f12059g.mo21143g(), new AccessToken(str, str2, str3, collection, collection2, collection3, cVar, date, date2, date3)));
    }
}
