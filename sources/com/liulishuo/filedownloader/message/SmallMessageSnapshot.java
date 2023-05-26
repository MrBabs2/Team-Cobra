package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import com.liulishuo.filedownloader.message.MessageSnapshot;

public abstract class SmallMessageSnapshot extends MessageSnapshot {

    public static class CompletedFlowDirectlySnapshot extends CompletedSnapshot implements C8886a {
        CompletedFlowDirectlySnapshot(int i, boolean z, int i2) {
            super(i, z, i2);
        }
    }

    public static class PausedSnapshot extends PendingMessageSnapshot {
        PausedSnapshot(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        /* renamed from: n */
        public byte mo32695n() {
            return -2;
        }
    }

    public static class PendingMessageSnapshot extends SmallMessageSnapshot {

        /* renamed from: h */
        private final int f25243h;

        /* renamed from: i */
        private final int f25244i;

        PendingMessageSnapshot(PendingMessageSnapshot pendingMessageSnapshot) {
            this(pendingMessageSnapshot.mo32709e(), pendingMessageSnapshot.mo32696j(), pendingMessageSnapshot.mo32697k());
        }

        /* renamed from: j */
        public int mo32696j() {
            return this.f25243h;
        }

        /* renamed from: k */
        public int mo32697k() {
            return this.f25244i;
        }

        /* renamed from: n */
        public byte mo32695n() {
            return 1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f25243h);
            parcel.writeInt(this.f25244i);
        }

        PendingMessageSnapshot(int i, int i2, int i3) {
            super(i);
            this.f25243h = i2;
            this.f25244i = i3;
        }

        PendingMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f25243h = parcel.readInt();
            this.f25244i = parcel.readInt();
        }
    }

    public static class WarnFlowDirectlySnapshot extends WarnMessageSnapshot implements C8886a {
        WarnFlowDirectlySnapshot(int i, int i2, int i3) {
            super(i, i2, i3);
        }
    }

    public static class WarnMessageSnapshot extends PendingMessageSnapshot implements MessageSnapshot.C8885b {
        WarnMessageSnapshot(int i, int i2, int i3) {
            super(i, i2, i3);
        }

        /* renamed from: a */
        public MessageSnapshot mo32708a() {
            return new PendingMessageSnapshot((PendingMessageSnapshot) this);
        }

        /* renamed from: n */
        public byte mo32695n() {
            return -4;
        }

        WarnMessageSnapshot(Parcel parcel) {
            super(parcel);
        }
    }

    SmallMessageSnapshot(int i) {
        super(i);
        this.f25234g = false;
    }

    /* renamed from: f */
    public long mo32705f() {
        return (long) mo32696j();
    }

    /* renamed from: g */
    public long mo32699g() {
        return (long) mo32697k();
    }

    public static class ProgressMessageSnapshot extends SmallMessageSnapshot {

        /* renamed from: h */
        private final int f25245h;

        ProgressMessageSnapshot(int i, int i2) {
            super(i);
            this.f25245h = i2;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: j */
        public int mo32696j() {
            return this.f25245h;
        }

        /* renamed from: n */
        public byte mo32695n() {
            return 3;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f25245h);
        }

        ProgressMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f25245h = parcel.readInt();
        }
    }

    public static class RetryMessageSnapshot extends ErrorMessageSnapshot {

        /* renamed from: j */
        private final int f25246j;

        RetryMessageSnapshot(int i, int i2, Throwable th, int i3) {
            super(i, i2, th);
            this.f25246j = i3;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: h */
        public int mo32707h() {
            return this.f25246j;
        }

        /* renamed from: n */
        public byte mo32695n() {
            return 5;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f25246j);
        }

        RetryMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f25246j = parcel.readInt();
        }
    }

    public static class CompletedSnapshot extends SmallMessageSnapshot {

        /* renamed from: h */
        private final boolean f25235h;

        /* renamed from: i */
        private final int f25236i;

        CompletedSnapshot(int i, boolean z, int i2) {
            super(i);
            this.f25235h = z;
            this.f25236i = i2;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: k */
        public int mo32697k() {
            return this.f25236i;
        }

        /* renamed from: n */
        public byte mo32695n() {
            return -3;
        }

        /* renamed from: r */
        public boolean mo32700r() {
            return this.f25235h;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f25235h ? (byte) 1 : 0);
            parcel.writeInt(this.f25236i);
        }

        CompletedSnapshot(Parcel parcel) {
            super(parcel);
            this.f25235h = parcel.readByte() != 0;
            this.f25236i = parcel.readInt();
        }
    }

    public static class ErrorMessageSnapshot extends SmallMessageSnapshot {

        /* renamed from: h */
        private final int f25241h;

        /* renamed from: i */
        private final Throwable f25242i;

        ErrorMessageSnapshot(int i, int i2, Throwable th) {
            super(i);
            this.f25241h = i2;
            this.f25242i = th;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: j */
        public int mo32696j() {
            return this.f25241h;
        }

        /* renamed from: n */
        public byte mo32695n() {
            return -1;
        }

        /* renamed from: o */
        public Throwable mo32706o() {
            return this.f25242i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f25241h);
            parcel.writeSerializable(this.f25242i);
        }

        ErrorMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f25241h = parcel.readInt();
            this.f25242i = (Throwable) parcel.readSerializable();
        }
    }

    SmallMessageSnapshot(Parcel parcel) {
        super(parcel);
    }

    public static class ConnectedMessageSnapshot extends SmallMessageSnapshot {

        /* renamed from: h */
        private final boolean f25237h;

        /* renamed from: i */
        private final int f25238i;

        /* renamed from: j */
        private final String f25239j;

        /* renamed from: k */
        private final String f25240k;

        ConnectedMessageSnapshot(int i, boolean z, int i2, String str, String str2) {
            super(i);
            this.f25237h = z;
            this.f25238i = i2;
            this.f25239j = str;
            this.f25240k = str2;
        }

        /* renamed from: c */
        public String mo32702c() {
            return this.f25239j;
        }

        /* renamed from: d */
        public String mo32703d() {
            return this.f25240k;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: k */
        public int mo32697k() {
            return this.f25238i;
        }

        /* renamed from: n */
        public byte mo32695n() {
            return 2;
        }

        /* renamed from: q */
        public boolean mo32704q() {
            return this.f25237h;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f25237h ? (byte) 1 : 0);
            parcel.writeInt(this.f25238i);
            parcel.writeString(this.f25239j);
            parcel.writeString(this.f25240k);
        }

        ConnectedMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f25237h = parcel.readByte() != 0;
            this.f25238i = parcel.readInt();
            this.f25239j = parcel.readString();
            this.f25240k = parcel.readString();
        }
    }
}
