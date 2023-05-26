package android.support.p001v4.p002os;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.os.Handler;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.p001v4.p002os.C0045a;

@SuppressLint({"BanParcelableUsage"})
/* renamed from: android.support.v4.os.ResultReceiver */
public class ResultReceiver implements Parcelable {
    public static final Parcelable.Creator<ResultReceiver> CREATOR = new C0042a();

    /* renamed from: f */
    final Handler f75f = null;

    /* renamed from: g */
    C0045a f76g;

    /* renamed from: android.support.v4.os.ResultReceiver$a */
    class C0042a implements Parcelable.Creator<ResultReceiver> {
        C0042a() {
        }

        public ResultReceiver createFromParcel(Parcel parcel) {
            return new ResultReceiver(parcel);
        }

        public ResultReceiver[] newArray(int i) {
            return new ResultReceiver[i];
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$b */
    class C0043b extends C0045a.C0046a {
        C0043b() {
        }

        /* renamed from: c */
        public void mo121c(int i, Bundle bundle) {
            ResultReceiver resultReceiver = ResultReceiver.this;
            Handler handler = resultReceiver.f75f;
            if (handler != null) {
                handler.post(new C0044c(i, bundle));
            } else {
                resultReceiver.mo3a(i, bundle);
            }
        }
    }

    /* renamed from: android.support.v4.os.ResultReceiver$c */
    class C0044c implements Runnable {

        /* renamed from: f */
        final int f78f;

        /* renamed from: g */
        final Bundle f79g;

        C0044c(int i, Bundle bundle) {
            this.f78f = i;
            this.f79g = bundle;
        }

        public void run() {
            ResultReceiver.this.mo3a(this.f78f, this.f79g);
        }
    }

    ResultReceiver(Parcel parcel) {
        this.f76g = C0045a.C0046a.m141a(parcel.readStrongBinder());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo3a(int i, Bundle bundle) {
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        synchronized (this) {
            if (this.f76g == null) {
                this.f76g = new C0043b();
            }
            parcel.writeStrongBinder(this.f76g.asBinder());
        }
    }
}
