package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.SparseIntArray;
import java.lang.reflect.Method;
import p050l.p066e.C4868a;

/* renamed from: androidx.versionedparcelable.a */
/* compiled from: VersionedParcelParcel */
class C0792a extends VersionedParcel {

    /* renamed from: d */
    private final SparseIntArray f2890d;

    /* renamed from: e */
    private final Parcel f2891e;

    /* renamed from: f */
    private final int f2892f;

    /* renamed from: g */
    private final int f2893g;

    /* renamed from: h */
    private final String f2894h;

    /* renamed from: i */
    private int f2895i;

    /* renamed from: j */
    private int f2896j;

    /* renamed from: k */
    private int f2897k;

    C0792a(Parcel parcel) {
        this(parcel, parcel.dataPosition(), parcel.dataSize(), "", new C4868a(), new C4868a(), new C4868a());
    }

    /* renamed from: a */
    public boolean mo4499a(int i) {
        while (this.f2896j < this.f2893g) {
            int i2 = this.f2897k;
            if (i2 == i) {
                return true;
            }
            if (String.valueOf(i2).compareTo(String.valueOf(i)) > 0) {
                return false;
            }
            this.f2891e.setDataPosition(this.f2896j);
            int readInt = this.f2891e.readInt();
            this.f2897k = this.f2891e.readInt();
            this.f2896j += readInt;
        }
        if (this.f2897k == i) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public void mo4503b(int i) {
        mo4490a();
        this.f2895i = i;
        this.f2890d.put(i, this.f2891e.dataPosition());
        mo4511c(0);
        mo4511c(i);
    }

    /* renamed from: c */
    public void mo4511c(int i) {
        this.f2891e.writeInt(i);
    }

    /* renamed from: d */
    public boolean mo4513d() {
        return this.f2891e.readInt() != 0;
    }

    /* renamed from: e */
    public byte[] mo4514e() {
        int readInt = this.f2891e.readInt();
        if (readInt < 0) {
            return null;
        }
        byte[] bArr = new byte[readInt];
        this.f2891e.readByteArray(bArr);
        return bArr;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public CharSequence mo4515f() {
        return (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(this.f2891e);
    }

    /* renamed from: g */
    public int mo4516g() {
        return this.f2891e.readInt();
    }

    /* renamed from: h */
    public <T extends Parcelable> T mo4517h() {
        return this.f2891e.readParcelable(C0792a.class.getClassLoader());
    }

    /* renamed from: i */
    public String mo4518i() {
        return this.f2891e.readString();
    }

    private C0792a(Parcel parcel, int i, int i2, String str, C4868a<String, Method> aVar, C4868a<String, Method> aVar2, C4868a<String, Class> aVar3) {
        super(aVar, aVar2, aVar3);
        this.f2890d = new SparseIntArray();
        this.f2895i = -1;
        this.f2896j = 0;
        this.f2897k = -1;
        this.f2891e = parcel;
        this.f2892f = i;
        this.f2893g = i2;
        this.f2896j = i;
        this.f2894h = str;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public VersionedParcel mo4502b() {
        Parcel parcel = this.f2891e;
        int dataPosition = parcel.dataPosition();
        int i = this.f2896j;
        if (i == this.f2892f) {
            i = this.f2893g;
        }
        int i2 = i;
        return new C0792a(parcel, dataPosition, i2, this.f2894h + "  ", this.f2887a, this.f2888b, this.f2889c);
    }

    /* renamed from: a */
    public void mo4490a() {
        int i = this.f2895i;
        if (i >= 0) {
            int i2 = this.f2890d.get(i);
            int dataPosition = this.f2891e.dataPosition();
            this.f2891e.setDataPosition(i2);
            this.f2891e.writeInt(dataPosition - i2);
            this.f2891e.setDataPosition(dataPosition);
        }
    }

    /* renamed from: a */
    public void mo4498a(byte[] bArr) {
        if (bArr != null) {
            this.f2891e.writeInt(bArr.length);
            this.f2891e.writeByteArray(bArr);
            return;
        }
        this.f2891e.writeInt(-1);
    }

    /* renamed from: a */
    public void mo4495a(String str) {
        this.f2891e.writeString(str);
    }

    /* renamed from: a */
    public void mo4491a(Parcelable parcelable) {
        this.f2891e.writeParcelable(parcelable, 0);
    }

    /* renamed from: a */
    public void mo4496a(boolean z) {
        this.f2891e.writeInt(z ? 1 : 0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo4494a(CharSequence charSequence) {
        TextUtils.writeToParcel(charSequence, this.f2891e, 0);
    }
}
