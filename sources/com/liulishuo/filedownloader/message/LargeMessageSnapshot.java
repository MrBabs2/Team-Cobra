package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import com.liulishuo.filedownloader.message.MessageSnapshot;

public abstract class LargeMessageSnapshot extends MessageSnapshot {

    public static class CompletedFlowDirectlySnapshot extends CompletedSnapshot implements C8886a {
        CompletedFlowDirectlySnapshot(int i, boolean z, long j) {
            super(i, z, j);
        }
    }

    public static class PausedSnapshot extends PendingMessageSnapshot {
        PausedSnapshot(int i, long j, long j2) {
            super(i, j, j2);
        }

        /* renamed from: n */
        public byte mo32695n() {
            return -2;
        }
    }

    public static class PendingMessageSnapshot extends LargeMessageSnapshot {

        /* renamed from: h */
        private final long f25229h;

        /* renamed from: i */
        private final long f25230i;

        PendingMessageSnapshot(PendingMessageSnapshot pendingMessageSnapshot) {
            this(pendingMessageSnapshot.mo32709e(), pendingMessageSnapshot.mo32705f(), pendingMessageSnapshot.mo32699g());
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: f */
        public long mo32705f() {
            return this.f25229h;
        }

        /* renamed from: g */
        public long mo32699g() {
            return this.f25230i;
        }

        /* renamed from: n */
        public byte mo32695n() {
            return 1;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.f25229h);
            parcel.writeLong(this.f25230i);
        }

        PendingMessageSnapshot(int i, long j, long j2) {
            super(i);
            this.f25229h = j;
            this.f25230i = j2;
        }

        PendingMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f25229h = parcel.readLong();
            this.f25230i = parcel.readLong();
        }
    }

    public static class WarnFlowDirectlySnapshot extends WarnMessageSnapshot implements C8886a {
        WarnFlowDirectlySnapshot(int i, long j, long j2) {
            super(i, j, j2);
        }
    }

    public static class WarnMessageSnapshot extends PendingMessageSnapshot implements MessageSnapshot.C8885b {
        WarnMessageSnapshot(int i, long j, long j2) {
            super(i, j, j2);
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

    LargeMessageSnapshot(int i) {
        super(i);
        this.f25234g = true;
    }

    /* renamed from: j */
    public int mo32696j() {
        if (mo32705f() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) mo32705f();
    }

    /* renamed from: k */
    public int mo32697k() {
        if (mo32699g() > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) mo32699g();
    }

    public static class ProgressMessageSnapshot extends LargeMessageSnapshot {

        /* renamed from: h */
        private final long f25231h;

        ProgressMessageSnapshot(int i, long j) {
            super(i);
            this.f25231h = j;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: f */
        public long mo32705f() {
            return this.f25231h;
        }

        /* renamed from: n */
        public byte mo32695n() {
            return 3;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.f25231h);
        }

        ProgressMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f25231h = parcel.readLong();
        }
    }

    public static class RetryMessageSnapshot extends ErrorMessageSnapshot {

        /* renamed from: j */
        private final int f25232j;

        RetryMessageSnapshot(int i, long j, Throwable th, int i2) {
            super(i, j, th);
            this.f25232j = i2;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: h */
        public int mo32707h() {
            return this.f25232j;
        }

        /* renamed from: n */
        public byte mo32695n() {
            return 5;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.f25232j);
        }

        RetryMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f25232j = parcel.readInt();
        }
    }

    public static class CompletedSnapshot extends LargeMessageSnapshot {

        /* renamed from: h */
        private final boolean f25221h;

        /* renamed from: i */
        private final long f25222i;

        CompletedSnapshot(int i, boolean z, long j) {
            super(i);
            this.f25221h = z;
            this.f25222i = j;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public long mo32699g() {
            return this.f25222i;
        }

        /* renamed from: n */
        public byte mo32695n() {
            return -3;
        }

        /* renamed from: r */
        public boolean mo32700r() {
            return this.f25221h;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f25221h ? (byte) 1 : 0);
            parcel.writeLong(this.f25222i);
        }

        CompletedSnapshot(Parcel parcel) {
            super(parcel);
            this.f25221h = parcel.readByte() != 0;
            this.f25222i = parcel.readLong();
        }
    }

    public static class ErrorMessageSnapshot extends LargeMessageSnapshot {

        /* renamed from: h */
        private final long f25227h;

        /* renamed from: i */
        private final Throwable f25228i;

        ErrorMessageSnapshot(int i, long j, Throwable th) {
            super(i);
            this.f25227h = j;
            this.f25228i = th;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: f */
        public long mo32705f() {
            return this.f25227h;
        }

        /* renamed from: n */
        public byte mo32695n() {
            return -1;
        }

        /* renamed from: o */
        public Throwable mo32706o() {
            return this.f25228i;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeLong(this.f25227h);
            parcel.writeSerializable(this.f25228i);
        }

        ErrorMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f25227h = parcel.readLong();
            this.f25228i = (Throwable) parcel.readSerializable();
        }
    }

    LargeMessageSnapshot(Parcel parcel) {
        super(parcel);
    }

    public static class ConnectedMessageSnapshot extends LargeMessageSnapshot {

        /* renamed from: h */
        private final boolean f25223h;

        /* renamed from: i */
        private final long f25224i;

        /* renamed from: j */
        private final String f25225j;

        /* renamed from: k */
        private final String f25226k;

        ConnectedMessageSnapshot(int i, boolean z, long j, String str, String str2) {
            super(i);
            this.f25223h = z;
            this.f25224i = j;
            this.f25225j = str;
            this.f25226k = str2;
        }

        /* renamed from: c */
        public String mo32702c() {
            return this.f25225j;
        }

        /* renamed from: d */
        public String mo32703d() {
            return this.f25226k;
        }

        public int describeContents() {
            return 0;
        }

        /* renamed from: g */
        public long mo32699g() {
            return this.f25224i;
        }

        /* renamed from: n */
        public byte mo32695n() {
            return 2;
        }

        /* renamed from: q */
        public boolean mo32704q() {
            return this.f25223h;
        }

        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.f25223h ? (byte) 1 : 0);
            parcel.writeLong(this.f25224i);
            parcel.writeString(this.f25225j);
            parcel.writeString(this.f25226k);
        }

        ConnectedMessageSnapshot(Parcel parcel) {
            super(parcel);
            this.f25223h = parcel.readByte() != 0;
            this.f25224i = parcel.readLong();
            this.f25225j = parcel.readString();
            this.f25226k = parcel.readString();
        }
    }
}
