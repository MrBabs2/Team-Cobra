package com.facebook.login;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.fragment.app.C0454b;
import com.facebook.AccessToken;
import com.facebook.C4716f;
import com.facebook.C6359c;
import com.facebook.C6367g;
import com.facebook.C6371i;
import com.facebook.C6492j;
import com.facebook.FacebookActivity;
import com.facebook.FacebookException;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.common.C6361b;
import com.facebook.common.C6362c;
import com.facebook.common.C6363d;
import com.facebook.common.C6364e;
import com.facebook.internal.C6448n;
import com.facebook.internal.C6475w;
import com.facebook.internal.C6476x;
import com.facebook.internal.C6481y;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.login.LoginClient;
import com.facebook.p032t.C6596m;
import com.facebook.p185u.p186a.C6695a;
import java.util.Collection;
import java.util.Date;
import java.util.Locale;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;
import p015cm.aptoide.p016pt.DeepLinkIntentReceiver;

public class DeviceAuthDialog extends C0454b {

    /* renamed from: f */
    private View f11988f;

    /* renamed from: g */
    private TextView f11989g;

    /* renamed from: h */
    private TextView f11990h;

    /* renamed from: i */
    private DeviceAuthMethodHandler f11991i;
    /* access modifiers changed from: private */

    /* renamed from: j */
    public AtomicBoolean f11992j = new AtomicBoolean();

    /* renamed from: k */
    private volatile C6367g f11993k;

    /* renamed from: l */
    private volatile ScheduledFuture f11994l;
    /* access modifiers changed from: private */

    /* renamed from: m */
    public volatile RequestState f11995m;
    /* access modifiers changed from: private */

    /* renamed from: n */
    public Dialog f11996n;
    /* access modifiers changed from: private */

    /* renamed from: o */
    public boolean f11997o = false;
    /* access modifiers changed from: private */

    /* renamed from: p */
    public boolean f11998p = false;
    /* access modifiers changed from: private */

    /* renamed from: q */
    public LoginClient.Request f11999q = null;

    private static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new C6496a();

        /* renamed from: f */
        private String f12000f;

        /* renamed from: g */
        private String f12001g;

        /* renamed from: h */
        private String f12002h;

        /* renamed from: i */
        private long f12003i;

        /* renamed from: j */
        private long f12004j;

        /* renamed from: com.facebook.login.DeviceAuthDialog$RequestState$a */
        static class C6496a implements Parcelable.Creator<RequestState> {
            C6496a() {
            }

            public RequestState createFromParcel(Parcel parcel) {
                return new RequestState(parcel);
            }

            public RequestState[] newArray(int i) {
                return new RequestState[i];
            }
        }

        RequestState() {
        }

        /* renamed from: a */
        public String mo21088a() {
            return this.f12000f;
        }

        /* renamed from: b */
        public void mo21093b(String str) {
            this.f12001g = str;
            this.f12000f = String.format(Locale.ENGLISH, "https://facebook.com/device?user_code=%1$s&qr=1", new Object[]{str});
        }

        /* renamed from: c */
        public String mo21094c() {
            return this.f12002h;
        }

        /* renamed from: d */
        public String mo21095d() {
            return this.f12001g;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: e */
        public boolean mo21097e() {
            if (this.f12004j != 0 && (new Date().getTime() - this.f12004j) - (this.f12003i * 1000) < 0) {
                return true;
            }
            return false;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f12000f);
            parcel.writeString(this.f12001g);
            parcel.writeString(this.f12002h);
            parcel.writeLong(this.f12003i);
            parcel.writeLong(this.f12004j);
        }

        protected RequestState(Parcel parcel) {
            this.f12000f = parcel.readString();
            this.f12001g = parcel.readString();
            this.f12002h = parcel.readString();
            this.f12003i = parcel.readLong();
            this.f12004j = parcel.readLong();
        }

        /* renamed from: a */
        public void mo21090a(String str) {
            this.f12002h = str;
        }

        /* renamed from: a */
        public void mo21089a(long j) {
            this.f12003i = j;
        }

        /* renamed from: b */
        public long mo21091b() {
            return this.f12003i;
        }

        /* renamed from: b */
        public void mo21092b(long j) {
            this.f12004j = j;
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$a */
    class C6497a implements GraphRequest.C6344f {
        C6497a() {
        }

        public void onCompleted(C6371i iVar) {
            if (!DeviceAuthDialog.this.f11997o) {
                if (iVar.mo20918a() != null) {
                    DeviceAuthDialog.this.mo21084a(iVar.mo20918a().mo20815d());
                    return;
                }
                JSONObject b = iVar.mo20919b();
                RequestState requestState = new RequestState();
                try {
                    requestState.mo21093b(b.getString("user_code"));
                    requestState.mo21090a(b.getString("code"));
                    requestState.mo21089a(b.getLong("interval"));
                    DeviceAuthDialog.this.m13622a(requestState);
                } catch (JSONException e) {
                    DeviceAuthDialog.this.mo21084a(new FacebookException((Throwable) e));
                }
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$b */
    class C6498b implements View.OnClickListener {
        C6498b() {
        }

        public void onClick(View view) {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    DeviceAuthDialog.this.mo21087b();
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$c */
    class C6499c implements Runnable {
        C6499c() {
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    DeviceAuthDialog.this.m13636d();
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$d */
    class C6500d implements GraphRequest.C6344f {
        C6500d() {
        }

        public void onCompleted(C6371i iVar) {
            if (!DeviceAuthDialog.this.f11992j.get()) {
                FacebookRequestError a = iVar.mo20918a();
                if (a != null) {
                    int f = a.mo20818f();
                    if (f != 1349152) {
                        switch (f) {
                            case 1349172:
                            case 1349174:
                                DeviceAuthDialog.this.m13637e();
                                return;
                            case 1349173:
                                DeviceAuthDialog.this.mo21087b();
                                return;
                            default:
                                DeviceAuthDialog.this.mo21084a(iVar.mo20918a().mo20815d());
                                return;
                        }
                    } else {
                        if (DeviceAuthDialog.this.f11995m != null) {
                            C6695a.m14346a(DeviceAuthDialog.this.f11995m.mo21095d());
                        }
                        if (DeviceAuthDialog.this.f11999q != null) {
                            DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
                            deviceAuthDialog.mo21085a(deviceAuthDialog.f11999q);
                            return;
                        }
                        DeviceAuthDialog.this.mo21087b();
                    }
                } else {
                    try {
                        JSONObject b = iVar.mo20919b();
                        DeviceAuthDialog.this.m13629a(b.getString("access_token"), Long.valueOf(b.getLong("expires_in")), Long.valueOf(b.optLong("data_access_expiration_time")));
                    } catch (JSONException e) {
                        DeviceAuthDialog.this.mo21084a(new FacebookException((Throwable) e));
                    }
                }
            }
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$e */
    class C6501e implements DialogInterface.OnClickListener {
        C6501e() {
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            DeviceAuthDialog.this.f11996n.setContentView(DeviceAuthDialog.this.mo21086b(false));
            DeviceAuthDialog deviceAuthDialog = DeviceAuthDialog.this;
            deviceAuthDialog.mo21085a(deviceAuthDialog.f11999q);
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$f */
    class C6502f implements DialogInterface.OnClickListener {

        /* renamed from: f */
        final /* synthetic */ String f12010f;

        /* renamed from: g */
        final /* synthetic */ C6476x.C6480d f12011g;

        /* renamed from: h */
        final /* synthetic */ String f12012h;

        /* renamed from: i */
        final /* synthetic */ Date f12013i;

        /* renamed from: j */
        final /* synthetic */ Date f12014j;

        C6502f(String str, C6476x.C6480d dVar, String str2, Date date, Date date2) {
            this.f12010f = str;
            this.f12011g = dVar;
            this.f12012h = str2;
            this.f12013i = date;
            this.f12014j = date2;
        }

        public void onClick(DialogInterface dialogInterface, int i) {
            DeviceAuthDialog.this.m13628a(this.f12010f, this.f12011g, this.f12012h, this.f12013i, this.f12014j);
        }
    }

    /* renamed from: com.facebook.login.DeviceAuthDialog$g */
    class C6503g implements GraphRequest.C6344f {

        /* renamed from: a */
        final /* synthetic */ String f12016a;

        /* renamed from: b */
        final /* synthetic */ Date f12017b;

        /* renamed from: c */
        final /* synthetic */ Date f12018c;

        C6503g(String str, Date date, Date date2) {
            this.f12016a = str;
            this.f12017b = date;
            this.f12018c = date2;
        }

        public void onCompleted(C6371i iVar) {
            if (!DeviceAuthDialog.this.f11992j.get()) {
                if (iVar.mo20918a() != null) {
                    DeviceAuthDialog.this.mo21084a(iVar.mo20918a().mo20815d());
                    return;
                }
                try {
                    JSONObject b = iVar.mo20919b();
                    String string = b.getString(DeepLinkIntentReceiver.DeepLinksKeys.f3452ID);
                    C6476x.C6480d b2 = C6476x.m13517b(b);
                    String string2 = b.getString("name");
                    C6695a.m14346a(DeviceAuthDialog.this.f11995m.mo21095d());
                    if (!C6448n.m13386c(C4716f.m7697f()).mo20998k().contains(C6475w.RequireConfirm) || DeviceAuthDialog.this.f11998p) {
                        DeviceAuthDialog.this.m13628a(string, b2, this.f12016a, this.f12017b, this.f12018c);
                        return;
                    }
                    boolean unused = DeviceAuthDialog.this.f11998p = true;
                    DeviceAuthDialog.this.m13627a(string, b2, this.f12016a, string2, this.f12017b, this.f12018c);
                } catch (JSONException e) {
                    DeviceAuthDialog.this.mo21084a(new FacebookException((Throwable) e));
                }
            }
        }
    }

    public Dialog onCreateDialog(Bundle bundle) {
        this.f11996n = new Dialog(getActivity(), C6364e.com_facebook_auth_dialog);
        this.f11996n.setContentView(mo21086b(C6695a.m14348b() && !this.f11998p));
        return this.f11996n;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        this.f11991i = (DeviceAuthMethodHandler) ((C6523e) ((FacebookActivity) getActivity()).mo20807a()).mo21202d().mo21139d();
        if (!(bundle == null || (requestState = (RequestState) bundle.getParcelable("request_state")) == null)) {
            m13622a(requestState);
        }
        return onCreateView;
    }

    public void onDestroy() {
        this.f11997o = true;
        this.f11992j.set(true);
        super.onDestroy();
        if (this.f11993k != null) {
            this.f11993k.cancel(true);
        }
        if (this.f11994l != null) {
            this.f11994l.cancel(true);
        }
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (!this.f11997o) {
            mo21087b();
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f11995m != null) {
            bundle.putParcelable("request_state", this.f11995m);
        }
    }

    /* renamed from: c */
    private GraphRequest m13633c() {
        Bundle bundle = new Bundle();
        bundle.putString("code", this.f11995m.mo21094c());
        return new GraphRequest((AccessToken) null, "device/login_status", bundle, C6492j.POST, new C6500d());
    }

    /* access modifiers changed from: private */
    /* renamed from: d */
    public void m13636d() {
        this.f11995m.mo21092b(new Date().getTime());
        this.f11993k = m13633c().mo20832b();
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public void m13637e() {
        this.f11994l = DeviceAuthMethodHandler.m13657f().schedule(new C6499c(), this.f11995m.mo21091b(), TimeUnit.SECONDS);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public View mo21086b(boolean z) {
        View inflate = getActivity().getLayoutInflater().inflate(mo21083a(z), (ViewGroup) null);
        this.f11988f = inflate.findViewById(C6361b.progress_bar);
        this.f11989g = (TextView) inflate.findViewById(C6361b.confirmation_code);
        ((Button) inflate.findViewById(C6361b.cancel_button)).setOnClickListener(new C6498b());
        TextView textView = (TextView) inflate.findViewById(C6361b.com_facebook_device_auth_instructions);
        this.f11990h = textView;
        textView.setText(Html.fromHtml(getString(C6363d.com_facebook_device_auth_instructions)));
        return inflate;
    }

    /* renamed from: a */
    public void mo21085a(LoginClient.Request request) {
        this.f11999q = request;
        Bundle bundle = new Bundle();
        bundle.putString("scope", TextUtils.join(",", request.mo21159h()));
        String f = request.mo21157f();
        if (f != null) {
            bundle.putString("redirect_uri", f);
        }
        String e = request.mo21156e();
        if (e != null) {
            bundle.putString("target_user_id", e);
        }
        bundle.putString("access_token", C6481y.m13554a() + "|" + C6481y.m13560b());
        bundle.putString("device_info", C6695a.m14345a());
        new GraphRequest((AccessToken) null, "device/login", bundle, C6492j.POST, new C6497a()).mo20832b();
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo21087b() {
        if (this.f11992j.compareAndSet(false, true)) {
            if (this.f11995m != null) {
                C6695a.m14346a(this.f11995m.mo21095d());
            }
            DeviceAuthMethodHandler deviceAuthMethodHandler = this.f11991i;
            if (deviceAuthMethodHandler != null) {
                deviceAuthMethodHandler.mo21109e();
            }
            this.f11996n.dismiss();
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13622a(RequestState requestState) {
        this.f11995m = requestState;
        this.f11989g.setText(requestState.mo21095d());
        this.f11990h.setCompoundDrawablesWithIntrinsicBounds((Drawable) null, new BitmapDrawable(getResources(), C6695a.m14349c(requestState.mo21088a())), (Drawable) null, (Drawable) null);
        this.f11989g.setVisibility(0);
        this.f11988f.setVisibility(8);
        if (!this.f11998p && C6695a.m14350d(requestState.mo21095d())) {
            new C6596m(getContext()).mo21335a("fb_smart_login_service");
        }
        if (requestState.mo21097e()) {
            m13637e();
        } else {
            m13636d();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public int mo21083a(boolean z) {
        return z ? C6362c.com_facebook_smart_device_dialog_fragment : C6362c.com_facebook_device_auth_dialog_fragment;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13627a(String str, C6476x.C6480d dVar, String str2, String str3, Date date, Date date2) {
        String string = getResources().getString(C6363d.com_facebook_smart_login_confirmation_title);
        String string2 = getResources().getString(C6363d.com_facebook_smart_login_confirmation_continue_as);
        String string3 = getResources().getString(C6363d.com_facebook_smart_login_confirmation_cancel);
        String format = String.format(string2, new Object[]{str3});
        AlertDialog.Builder builder = new AlertDialog.Builder(getContext());
        builder.setMessage(string).setCancelable(true).setNegativeButton(format, new C6502f(str, dVar, str2, date, date2)).setPositiveButton(string3, new C6501e());
        builder.create().show();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13629a(String str, Long l, Long l2) {
        Bundle bundle = new Bundle();
        bundle.putString("fields", "id,permissions,name");
        Date date = null;
        Date date2 = l.longValue() != 0 ? new Date(new Date().getTime() + (l.longValue() * 1000)) : null;
        if (!(l2.longValue() == 0 || l2 == null)) {
            date = new Date(l2.longValue() * 1000);
        }
        new GraphRequest(new AccessToken(str, C4716f.m7697f(), "0", (Collection<String>) null, (Collection<String>) null, (Collection<String>) null, (C6359c) null, date2, (Date) null, date), "me", bundle, C6492j.GET, new C6503g(str, date2, date)).mo20832b();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13628a(String str, C6476x.C6480d dVar, String str2, Date date, Date date2) {
        this.f11991i.mo21106a(str2, C4716f.m7697f(), str, dVar.mo21033c(), dVar.mo21031a(), dVar.mo21032b(), C6359c.DEVICE_AUTH, date, (Date) null, date2);
        this.f11996n.dismiss();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo21084a(FacebookException facebookException) {
        if (this.f11992j.compareAndSet(false, true)) {
            if (this.f11995m != null) {
                C6695a.m14346a(this.f11995m.mo21095d());
            }
            this.f11991i.mo21105a((Exception) facebookException);
            this.f11996n.dismiss();
        }
    }
}
