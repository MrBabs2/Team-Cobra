package com.google.android.gms.common.data;

import android.database.CursorIndexOutOfBoundsException;
import android.database.CursorWindow;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.HashMap;

@KeepName
@KeepForSdk
@SafeParcelable.Class
public final class DataHolder extends AbstractSafeParcelable implements Closeable {
    @KeepForSdk
    public static final Parcelable.Creator<DataHolder> CREATOR = new zac();
    @SafeParcelable.VersionField

    /* renamed from: f */
    private final int f14036f;
    @SafeParcelable.Field

    /* renamed from: g */
    private final String[] f14037g;

    /* renamed from: h */
    private Bundle f14038h;
    @SafeParcelable.Field

    /* renamed from: i */
    private final CursorWindow[] f14039i;
    @SafeParcelable.Field

    /* renamed from: j */
    private final int f14040j;
    @SafeParcelable.Field

    /* renamed from: k */
    private final Bundle f14041k;

    /* renamed from: l */
    private int[] f14042l;

    /* renamed from: m */
    private int f14043m;

    /* renamed from: n */
    private boolean f14044n = false;

    /* renamed from: o */
    private boolean f14045o = true;

    public static class zaa extends RuntimeException {
    }

    static {
        new C7221a(new String[0], (String) null);
    }

    @SafeParcelable.Constructor
    DataHolder(@SafeParcelable.Param(id = 1000) int i, @SafeParcelable.Param(id = 1) String[] strArr, @SafeParcelable.Param(id = 2) CursorWindow[] cursorWindowArr, @SafeParcelable.Param(id = 3) int i2, @SafeParcelable.Param(id = 4) Bundle bundle) {
        this.f14036f = i;
        this.f14037g = strArr;
        this.f14039i = cursorWindowArr;
        this.f14040j = i2;
        this.f14041k = bundle;
    }

    /* renamed from: a */
    private final void m15919a(String str, int i) {
        Bundle bundle = this.f14038h;
        if (bundle == null || !bundle.containsKey(str)) {
            String valueOf = String.valueOf(str);
            throw new IllegalArgumentException(valueOf.length() != 0 ? "No such column: ".concat(valueOf) : new String("No such column: "));
        } else if (isClosed()) {
            throw new IllegalArgumentException("Buffer is closed.");
        } else if (i < 0 || i >= this.f14043m) {
            throw new CursorIndexOutOfBoundsException(i, this.f14043m);
        }
    }

    @KeepForSdk
    /* renamed from: b */
    public final byte[] mo25228b(String str, int i, int i2) {
        m15919a(str, i);
        return this.f14039i[i2].getBlob(i, this.f14038h.getInt(str));
    }

    @KeepForSdk
    /* renamed from: c */
    public final String mo25229c(String str, int i, int i2) {
        m15919a(str, i);
        return this.f14039i[i2].getString(i, this.f14038h.getInt(str));
    }

    @KeepForSdk
    public final void close() {
        synchronized (this) {
            if (!this.f14044n) {
                this.f14044n = true;
                for (CursorWindow close : this.f14039i) {
                    close.close();
                }
            }
        }
    }

    @KeepForSdk
    /* renamed from: d */
    public final Bundle mo25231d() {
        return this.f14041k;
    }

    /* access modifiers changed from: protected */
    public final void finalize() throws Throwable {
        try {
            if (this.f14045o && this.f14039i.length > 0 && !isClosed()) {
                close();
                String obj = toString();
                StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 178);
                sb.append("Internal data leak within a DataBuffer object detected!  Be sure to explicitly call release() on all DataBuffer extending objects when you are done with them. (internal object: ");
                sb.append(obj);
                sb.append(")");
                Log.e("DataBuffer", sb.toString());
            }
        } finally {
            super.finalize();
        }
    }

    @KeepForSdk
    public final int getCount() {
        return this.f14043m;
    }

    @KeepForSdk
    public final boolean isClosed() {
        boolean z;
        synchronized (this) {
            z = this.f14044n;
        }
        return z;
    }

    @KeepForSdk
    /* renamed from: o */
    public final int mo25235o() {
        return this.f14040j;
    }

    /* renamed from: p */
    public final void mo25236p() {
        this.f14038h = new Bundle();
        int i = 0;
        int i2 = 0;
        while (true) {
            String[] strArr = this.f14037g;
            if (i2 >= strArr.length) {
                break;
            }
            this.f14038h.putInt(strArr[i2], i2);
            i2++;
        }
        this.f14042l = new int[this.f14039i.length];
        int i3 = 0;
        while (true) {
            CursorWindow[] cursorWindowArr = this.f14039i;
            if (i < cursorWindowArr.length) {
                this.f14042l[i] = i3;
                i3 += this.f14039i[i].getNumRows() - (i3 - cursorWindowArr[i].getStartPosition());
                i++;
            } else {
                this.f14043m = i3;
                return;
            }
        }
    }

    public final void writeToParcel(Parcel parcel, int i) {
        int a = SafeParcelWriter.m16131a(parcel);
        SafeParcelWriter.m16149a(parcel, 1, this.f14037g, false);
        SafeParcelWriter.m16148a(parcel, 2, (T[]) this.f14039i, i, false);
        SafeParcelWriter.m16135a(parcel, 3, mo25235o());
        SafeParcelWriter.m16137a(parcel, 4, mo25231d(), false);
        SafeParcelWriter.m16135a(parcel, 1000, this.f14036f);
        SafeParcelWriter.m16132a(parcel, a);
        if ((i & 1) != 0) {
            close();
        }
    }

    @KeepForSdk
    public static class Builder {
        private Builder(String[] strArr, String str) {
            Preconditions.m16037a(strArr);
            String[] strArr2 = strArr;
            new ArrayList();
            new HashMap();
        }

        /* synthetic */ Builder(String[] strArr, String str, C7221a aVar) {
            this(strArr, (String) null);
        }
    }

    @KeepForSdk
    /* renamed from: a */
    public final int mo25227a(int i) {
        int i2 = 0;
        Preconditions.m16047b(i >= 0 && i < this.f14043m);
        while (true) {
            int[] iArr = this.f14042l;
            if (i2 >= iArr.length) {
                break;
            } else if (i < iArr[i2]) {
                i2--;
                break;
            } else {
                i2++;
            }
        }
        return i2 == this.f14042l.length ? i2 - 1 : i2;
    }
}
