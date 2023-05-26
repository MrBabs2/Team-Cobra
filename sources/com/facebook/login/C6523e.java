package com.facebook.login;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.C0456c;
import androidx.fragment.app.Fragment;
import com.facebook.common.C6361b;
import com.facebook.common.C6362c;
import com.facebook.login.LoginClient;

/* renamed from: com.facebook.login.e */
/* compiled from: LoginFragment */
public class C6523e extends Fragment {

    /* renamed from: f */
    private String f12091f;

    /* renamed from: g */
    private LoginClient f12092g;

    /* renamed from: h */
    private LoginClient.Request f12093h;

    /* renamed from: com.facebook.login.e$a */
    /* compiled from: LoginFragment */
    class C6524a implements LoginClient.C6515c {
        C6524a() {
        }

        /* renamed from: a */
        public void mo21174a(LoginClient.Result result) {
            C6523e.this.m13779a(result);
        }
    }

    /* renamed from: com.facebook.login.e$b */
    /* compiled from: LoginFragment */
    class C6525b implements LoginClient.C6514b {

        /* renamed from: a */
        final /* synthetic */ View f12095a;

        C6525b(C6523e eVar, View view) {
            this.f12095a = view;
        }

        /* renamed from: a */
        public void mo21172a() {
            this.f12095a.setVisibility(0);
        }

        /* renamed from: b */
        public void mo21173b() {
            this.f12095a.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public LoginClient mo21200b() {
        return new LoginClient((Fragment) this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public int mo21201c() {
        return C6362c.com_facebook_login_fragment;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public LoginClient mo21202d() {
        return this.f12092g;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.f12092g.mo21132a(i, i2, intent);
    }

    public void onCreate(Bundle bundle) {
        Bundle bundleExtra;
        super.onCreate(bundle);
        if (bundle != null) {
            LoginClient loginClient = (LoginClient) bundle.getParcelable("loginClient");
            this.f12092g = loginClient;
            loginClient.mo21127a((Fragment) this);
        } else {
            this.f12092g = mo21200b();
        }
        this.f12092g.mo21131a((LoginClient.C6515c) new C6524a());
        C0456c activity = getActivity();
        if (activity != null) {
            m13778a((Activity) activity);
            Intent intent = activity.getIntent();
            if (intent != null && (bundleExtra = intent.getBundleExtra("com.facebook.LoginFragment:Request")) != null) {
                this.f12093h = (LoginClient.Request) bundleExtra.getParcelable("request");
            }
        }
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(mo21201c(), viewGroup, false);
        this.f12092g.mo21130a((LoginClient.C6514b) new C6525b(this, inflate.findViewById(C6361b.com_facebook_login_fragment_progress_bar)));
        return inflate;
    }

    public void onDestroy() {
        this.f12092g.mo21126a();
        super.onDestroy();
    }

    public void onPause() {
        View view;
        super.onPause();
        if (getView() == null) {
            view = null;
        } else {
            view = getView().findViewById(C6361b.com_facebook_login_fragment_progress_bar);
        }
        if (view != null) {
            view.setVisibility(8);
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f12091f == null) {
            Log.e("LoginFragment", "Cannot call LoginFragment with a null calling package. This can occur if the launchMode of the caller is singleInstance.");
            getActivity().finish();
            return;
        }
        this.f12092g.mo21137c(this.f12093h);
    }

    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("loginClient", this.f12092g);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void m13779a(LoginClient.Result result) {
        this.f12093h = null;
        int i = result.f12046f == LoginClient.Result.C6512b.CANCEL ? 0 : -1;
        Bundle bundle = new Bundle();
        bundle.putParcelable("com.facebook.LoginFragment:Result", result);
        Intent intent = new Intent();
        intent.putExtras(bundle);
        if (isAdded()) {
            getActivity().setResult(i, intent);
            getActivity().finish();
        }
    }

    /* renamed from: a */
    private void m13778a(Activity activity) {
        ComponentName callingActivity = activity.getCallingActivity();
        if (callingActivity != null) {
            this.f12091f = callingActivity.getPackageName();
        }
    }
}
