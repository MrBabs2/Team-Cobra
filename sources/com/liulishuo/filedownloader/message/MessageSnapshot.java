package com.liulishuo.filedownloader.message;

import android.os.Parcel;
import android.os.Parcelable;
import p112n.p312h.p313a.p318f0.C10771f;

public abstract class MessageSnapshot implements Parcelable {
    public static final Parcelable.Creator<MessageSnapshot> CREATOR = new C8884a();

    /* renamed from: f */
    private final int f25233f;

    /* renamed from: g */
    protected boolean f25234g;

    public static class NoFieldException extends IllegalStateException {
        NoFieldException(String str, MessageSnapshot messageSnapshot) {
            super(C10771f.m36504a("There isn't a field for '%s' in this message %d %d %s", str, Integer.valueOf(messageSnapshot.mo32709e()), Byte.valueOf(messageSnapshot.mo32695n()), messageSnapshot.getClass().getName()));
        }
    }

    public static class StartedMessageSnapshot extends MessageSnapshot {
        StartedMessageSnapshot(int i) {
            super(i);
        }

        /* renamed from: n */
        public byte mo32695n() {
            return 6;
        }

        StartedMessageSnapshot(Parcel parcel) {
            super(parcel);
        }
    }

    /* renamed from: com.liulishuo.filedownloader.message.MessageSnapshot$a */
    static class C8884a implements Parcelable.Creator<MessageSnapshot> {
        C8884a() {
        }

        /* JADX WARNING: Removed duplicated region for block: B:44:0x0094  */
        /* JADX WARNING: Removed duplicated region for block: B:46:0x0097  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.liulishuo.filedownloader.message.MessageSnapshot createFromParcel(android.os.Parcel r5) {
            /*
                r4 = this;
                byte r0 = r5.readByte()
                r1 = 1
                if (r0 != r1) goto L_0x0009
                r0 = 1
                goto L_0x000a
            L_0x0009:
                r0 = 0
            L_0x000a:
                byte r2 = r5.readByte()
                r3 = -4
                if (r2 == r3) goto L_0x0084
                r3 = -3
                if (r2 == r3) goto L_0x0076
                r3 = -1
                if (r2 == r3) goto L_0x0068
                if (r2 == r1) goto L_0x005a
                r1 = 2
                if (r2 == r1) goto L_0x004c
                r1 = 3
                if (r2 == r1) goto L_0x003e
                r1 = 5
                if (r2 == r1) goto L_0x0030
                r1 = 6
                if (r2 == r1) goto L_0x0028
                r5 = 0
                goto L_0x0092
            L_0x0028:
                com.liulishuo.filedownloader.message.MessageSnapshot$StartedMessageSnapshot r1 = new com.liulishuo.filedownloader.message.MessageSnapshot$StartedMessageSnapshot
                r1.<init>((android.os.Parcel) r5)
            L_0x002d:
                r5 = r1
                goto L_0x0092
            L_0x0030:
                if (r0 == 0) goto L_0x0038
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$RetryMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$RetryMessageSnapshot
                r1.<init>(r5)
                goto L_0x002d
            L_0x0038:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$RetryMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$RetryMessageSnapshot
                r1.<init>(r5)
                goto L_0x002d
            L_0x003e:
                if (r0 == 0) goto L_0x0046
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$ProgressMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$ProgressMessageSnapshot
                r1.<init>(r5)
                goto L_0x002d
            L_0x0046:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$ProgressMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$ProgressMessageSnapshot
                r1.<init>(r5)
                goto L_0x002d
            L_0x004c:
                if (r0 == 0) goto L_0x0054
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$ConnectedMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$ConnectedMessageSnapshot
                r1.<init>(r5)
                goto L_0x002d
            L_0x0054:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$ConnectedMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$ConnectedMessageSnapshot
                r1.<init>(r5)
                goto L_0x002d
            L_0x005a:
                if (r0 == 0) goto L_0x0062
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$PendingMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$PendingMessageSnapshot
                r1.<init>((android.os.Parcel) r5)
                goto L_0x002d
            L_0x0062:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$PendingMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$PendingMessageSnapshot
                r1.<init>((android.os.Parcel) r5)
                goto L_0x002d
            L_0x0068:
                if (r0 == 0) goto L_0x0070
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$ErrorMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$ErrorMessageSnapshot
                r1.<init>(r5)
                goto L_0x002d
            L_0x0070:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$ErrorMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$ErrorMessageSnapshot
                r1.<init>(r5)
                goto L_0x002d
            L_0x0076:
                if (r0 == 0) goto L_0x007e
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$CompletedSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$CompletedSnapshot
                r1.<init>(r5)
                goto L_0x002d
            L_0x007e:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$CompletedSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$CompletedSnapshot
                r1.<init>(r5)
                goto L_0x002d
            L_0x0084:
                if (r0 == 0) goto L_0x008c
                com.liulishuo.filedownloader.message.LargeMessageSnapshot$WarnMessageSnapshot r1 = new com.liulishuo.filedownloader.message.LargeMessageSnapshot$WarnMessageSnapshot
                r1.<init>(r5)
                goto L_0x002d
            L_0x008c:
                com.liulishuo.filedownloader.message.SmallMessageSnapshot$WarnMessageSnapshot r1 = new com.liulishuo.filedownloader.message.SmallMessageSnapshot$WarnMessageSnapshot
                r1.<init>(r5)
                goto L_0x002d
            L_0x0092:
                if (r5 == 0) goto L_0x0097
                r5.f25234g = r0
                return r5
            L_0x0097:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                java.lang.String r1 = "Can't restore the snapshot because unknow status: "
                r0.append(r1)
                r0.append(r2)
                java.lang.String r0 = r0.toString()
                r5.<init>(r0)
                goto L_0x00af
            L_0x00ae:
                throw r5
            L_0x00af:
                goto L_0x00ae
            */
            throw new UnsupportedOperationException("Method not decompiled: com.liulishuo.filedownloader.message.MessageSnapshot.C8884a.createFromParcel(android.os.Parcel):com.liulishuo.filedownloader.message.MessageSnapshot");
        }

        public MessageSnapshot[] newArray(int i) {
            return new MessageSnapshot[i];
        }
    }

    /* renamed from: com.liulishuo.filedownloader.message.MessageSnapshot$b */
    public interface C8885b {
        /* renamed from: a */
        MessageSnapshot mo32708a();
    }

    MessageSnapshot(int i) {
        this.f25233f = i;
    }

    /* renamed from: c */
    public String mo32702c() {
        throw new NoFieldException("getEtag", this);
    }

    /* renamed from: d */
    public String mo32703d() {
        throw new NoFieldException("getFileName", this);
    }

    public int describeContents() {
        return 0;
    }

    /* renamed from: e */
    public int mo32709e() {
        return this.f25233f;
    }

    /* renamed from: f */
    public long mo32705f() {
        throw new NoFieldException("getLargeSofarBytes", this);
    }

    /* renamed from: g */
    public long mo32699g() {
        throw new NoFieldException("getLargeTotalBytes", this);
    }

    /* renamed from: h */
    public int mo32707h() {
        throw new NoFieldException("getRetryingTimes", this);
    }

    /* renamed from: j */
    public int mo32696j() {
        throw new NoFieldException("getSmallSofarBytes", this);
    }

    /* renamed from: k */
    public int mo32697k() {
        throw new NoFieldException("getSmallTotalBytes", this);
    }

    /* renamed from: n */
    public abstract /* synthetic */ byte mo32695n();

    /* renamed from: o */
    public Throwable mo32706o() {
        throw new NoFieldException("getThrowable", this);
    }

    /* renamed from: p */
    public boolean mo32710p() {
        return this.f25234g;
    }

    /* renamed from: q */
    public boolean mo32704q() {
        throw new NoFieldException("isResuming", this);
    }

    /* renamed from: r */
    public boolean mo32700r() {
        throw new NoFieldException("isReusedDownloadedFile", this);
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.f25234g ? (byte) 1 : 0);
        parcel.writeByte(mo32695n());
        parcel.writeInt(this.f25233f);
    }

    MessageSnapshot(Parcel parcel) {
        this.f25233f = parcel.readInt();
    }
}
