package com.facebook.share.internal;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.fragment.app.C0454b;
import androidx.fragment.app.C0456c;
import androidx.fragment.app.C0485m;
import com.facebook.AccessToken;
import com.facebook.C6371i;
import com.facebook.C6492j;
import com.facebook.FacebookRequestError;
import com.facebook.GraphRequest;
import com.facebook.common.C6361b;
import com.facebook.common.C6362c;
import com.facebook.common.C6363d;
import com.facebook.common.C6364e;
import com.facebook.internal.C6481y;
import com.facebook.internal.p168a0.p170f.C6391a;
import com.facebook.p185u.p186a.C6695a;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.ShareOpenGraphContent;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

public class DeviceShareDialogFragment extends C0454b {

    /* renamed from: l */
    private static ScheduledThreadPoolExecutor f12154l;

    /* renamed from: f */
    private ProgressBar f12155f;

    /* renamed from: g */
    private TextView f12156g;
    /* access modifiers changed from: private */

    /* renamed from: h */
    public Dialog f12157h;

    /* renamed from: i */
    private volatile RequestState f12158i;

    /* renamed from: j */
    private volatile ScheduledFuture f12159j;

    /* renamed from: k */
    private ShareContent f12160k;

    private static class RequestState implements Parcelable {
        public static final Parcelable.Creator<RequestState> CREATOR = new C6546a();

        /* renamed from: f */
        private String f12161f;

        /* renamed from: g */
        private long f12162g;

        /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$RequestState$a */
        static class C6546a implements Parcelable.Creator<RequestState> {
            C6546a() {
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
        public void mo21250a(String str) {
            this.f12161f = str;
        }

        /* renamed from: b */
        public String mo21251b() {
            return this.f12161f;
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel parcel, int i) {
            parcel.writeString(this.f12161f);
            parcel.writeLong(this.f12162g);
        }

        protected RequestState(Parcel parcel) {
            this.f12161f = parcel.readString();
            this.f12162g = parcel.readLong();
        }

        /* renamed from: a */
        public long mo21248a() {
            return this.f12162g;
        }

        /* renamed from: a */
        public void mo21249a(long j) {
            this.f12162g = j;
        }
    }

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$a */
    class C6547a implements View.OnClickListener {
        C6547a() {
        }

        public void onClick(View view) {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    DeviceShareDialogFragment.this.f12157h.dismiss();
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$b */
    class C6548b implements GraphRequest.C6344f {
        C6548b() {
        }

        public void onCompleted(C6371i iVar) {
            FacebookRequestError a = iVar.mo20918a();
            if (a != null) {
                DeviceShareDialogFragment.this.m13869a(a);
                return;
            }
            JSONObject b = iVar.mo20919b();
            RequestState requestState = new RequestState();
            try {
                requestState.mo21250a(b.getString("user_code"));
                requestState.mo21249a(b.getLong("expires_in"));
                DeviceShareDialogFragment.this.m13870a(requestState);
            } catch (JSONException unused) {
                DeviceShareDialogFragment.this.m13869a(new FacebookRequestError(0, "", "Malformed server response"));
            }
        }
    }

    /* renamed from: com.facebook.share.internal.DeviceShareDialogFragment$c */
    class C6549c implements Runnable {
        C6549c() {
        }

        public void run() {
            if (!C6391a.m13260a((Object) this)) {
                try {
                    DeviceShareDialogFragment.this.f12157h.dismiss();
                } catch (Throwable th) {
                    C6391a.m13259a(th, this);
                }
            }
        }
    }

    /* renamed from: b */
    private void m13873b() {
        if (isAdded()) {
            C0485m a = getFragmentManager().mo2793a();
            a.mo2691c(this);
            a.mo2675a();
        }
    }

    /* renamed from: c */
    private static synchronized ScheduledThreadPoolExecutor m13874c() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        synchronized (DeviceShareDialogFragment.class) {
            if (f12154l == null) {
                f12154l = new ScheduledThreadPoolExecutor(1);
            }
            scheduledThreadPoolExecutor = f12154l;
        }
        return scheduledThreadPoolExecutor;
    }

    /* renamed from: d */
    private Bundle m13875d() {
        ShareContent shareContent = this.f12160k;
        if (shareContent == null) {
            return null;
        }
        if (shareContent instanceof ShareLinkContent) {
            return C6554c.m13895a((ShareLinkContent) shareContent);
        }
        if (shareContent instanceof ShareOpenGraphContent) {
            return C6554c.m13896a((ShareOpenGraphContent) shareContent);
        }
        return null;
    }

    /* renamed from: e */
    private void m13876e() {
        Bundle d = m13875d();
        if (d == null || d.size() == 0) {
            m13869a(new FacebookRequestError(0, "", "Failed to get share content"));
        }
        d.putString("access_token", C6481y.m13554a() + "|" + C6481y.m13560b());
        d.putString("device_info", C6695a.m14345a());
        new GraphRequest((AccessToken) null, "device/share", d, C6492j.POST, new C6548b()).mo20832b();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        this.f12157h = new Dialog(getActivity(), C6364e.com_facebook_auth_dialog);
        View inflate = getActivity().getLayoutInflater().inflate(C6362c.com_facebook_device_auth_dialog_fragment, (ViewGroup) null);
        this.f12155f = (ProgressBar) inflate.findViewById(C6361b.progress_bar);
        this.f12156g = (TextView) inflate.findViewById(C6361b.confirmation_code);
        ((Button) inflate.findViewById(C6361b.cancel_button)).setOnClickListener(new C6547a());
        ((TextView) inflate.findViewById(C6361b.com_facebook_device_auth_instructions)).setText(Html.fromHtml(getString(C6363d.com_facebook_device_auth_instructions)));
        this.f12157h.setContentView(inflate);
        m13876e();
        return this.f12157h;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        RequestState requestState;
        View onCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        if (!(bundle == null || (requestState = (RequestState) bundle.getParcelable("request_state")) == null)) {
            m13870a(requestState);
        }
        return onCreateView;
    }

    public void onDismiss(DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f12159j != null) {
            this.f12159j.cancel(true);
        }
        m13868a(-1, new Intent());
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        if (this.f12158i != null) {
            bundle.putParcelable("request_state", this.f12158i);
        }
    }

    /* renamed from: a */
    private void m13868a(int i, Intent intent) {
        if (this.f12158i != null) {
            C6695a.m14346a(this.f12158i.mo21251b());
        }
        FacebookRequestError facebookRequestError = (FacebookRequestError) intent.getParcelableExtra("error");
        if (facebookRequestError != null) {
            Toast.makeText(getContext(), facebookRequestError.mo20813b(), 0).show();
        }
        if (isAdded()) {
            C0456c activity = getActivity();
            activity.setResult(i, intent);
            activity.finish();
        }
    }

    /* renamed from: a */
    public void mo21247a(ShareContent shareContent) {
        this.f12160k = shareContent;
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13869a(FacebookRequestError facebookRequestError) {
        m13873b();
        Intent intent = new Intent();
        intent.putExtra("error", facebookRequestError);
        m13868a(-1, intent);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13870a(RequestState requestState) {
        this.f12158i = requestState;
        this.f12156g.setText(requestState.mo21251b());
        this.f12156g.setVisibility(0);
        this.f12155f.setVisibility(8);
        this.f12159j = m13874c().schedule(new C6549c(), requestState.mo21248a(), TimeUnit.SECONDS);
    }
}
