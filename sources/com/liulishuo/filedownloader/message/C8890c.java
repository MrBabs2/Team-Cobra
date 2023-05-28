package com.liulishuo.filedownloader.message;

import com.liulishuo.filedownloader.message.BlockCompleteMessage;
import com.liulishuo.filedownloader.message.LargeMessageSnapshot;
import com.liulishuo.filedownloader.message.MessageSnapshot;
import com.liulishuo.filedownloader.message.SmallMessageSnapshot;
import com.liulishuo.filedownloader.model.C8895a;
import com.liulishuo.filedownloader.services.C8907i;
import java.io.File;
import p112n.p312h.p313a.C10722a;
import p112n.p312h.p313a.p318f0.C10767d;
import p112n.p312h.p313a.p318f0.C10771f;

/* renamed from: com.liulishuo.filedownloader.message.c */
/* compiled from: MessageSnapshotTaker */
public class C8890c {
    /* renamed from: a */
    public static MessageSnapshot m29140a(int i, File file, boolean z) {
        long length = file.length();
        if (length > 2147483647L) {
            if (z) {
                return new LargeMessageSnapshot.CompletedFlowDirectlySnapshot(i, true, length);
            }
            return new LargeMessageSnapshot.CompletedSnapshot(i, true, length);
        } else if (z) {
            return new SmallMessageSnapshot.CompletedFlowDirectlySnapshot(i, true, (int) length);
        } else {
            return new SmallMessageSnapshot.CompletedSnapshot(i, true, (int) length);
        }
    }

    /* renamed from: b */
    public static MessageSnapshot m29143b(C10722a aVar) {
        if (aVar.mo36398d()) {
            return new LargeMessageSnapshot.PausedSnapshot(aVar.getId(), aVar.mo36407i(), aVar.mo36414q());
        }
        return new SmallMessageSnapshot.PausedSnapshot(aVar.getId(), aVar.mo36412o(), aVar.mo36399e());
    }

    /* renamed from: a */
    public static MessageSnapshot m29139a(int i, long j, long j2, boolean z) {
        if (j2 > 2147483647L) {
            if (z) {
                return new LargeMessageSnapshot.WarnFlowDirectlySnapshot(i, j, j2);
            }
            return new LargeMessageSnapshot.WarnMessageSnapshot(i, j, j2);
        } else if (z) {
            return new SmallMessageSnapshot.WarnFlowDirectlySnapshot(i, (int) j, (int) j2);
        } else {
            return new SmallMessageSnapshot.WarnMessageSnapshot(i, (int) j, (int) j2);
        }
    }

    /* renamed from: a */
    public static MessageSnapshot m29142a(C10722a aVar) {
        if (aVar.mo36398d()) {
            return new LargeMessageSnapshot.ErrorMessageSnapshot(aVar.getId(), aVar.mo36407i(), aVar.mo36395c());
        }
        return new SmallMessageSnapshot.ErrorMessageSnapshot(aVar.getId(), aVar.mo36412o(), aVar.mo36395c());
    }

    /* renamed from: a */
    public static MessageSnapshot m29141a(MessageSnapshot messageSnapshot) {
        if (messageSnapshot.mo32695n() == -3) {
            return new BlockCompleteMessage.BlockCompleteMessageImpl(messageSnapshot);
        }
        throw new IllegalStateException(C10771f.m36504a("take block completed snapshot, must has already be completed. %d %d", Integer.valueOf(messageSnapshot.mo32709e()), Byte.valueOf(messageSnapshot.mo32695n())));
    }

    /* renamed from: a */
    public static MessageSnapshot m29138a(byte b, C8895a aVar, C8907i iVar) {
        IllegalStateException illegalStateException;
        int d = aVar.mo32738d();
        if (b == -4) {
            throw new IllegalStateException(C10771f.m36504a("please use #catchWarn instead %d", Integer.valueOf(d)));
        } else if (b != -3) {
            if (b != -1) {
                if (b != 1) {
                    if (b == 2) {
                        String c = aVar.mo32748m() ? aVar.mo32736c() : null;
                        if (aVar.mo32747l()) {
                            return new LargeMessageSnapshot.ConnectedMessageSnapshot(d, iVar.mo32822f(), aVar.mo32745j(), aVar.mo32727a(), c);
                        }
                        return new SmallMessageSnapshot.ConnectedMessageSnapshot(d, iVar.mo32822f(), (int) aVar.mo32745j(), aVar.mo32727a(), c);
                    } else if (b != 3) {
                        if (b != 5) {
                            if (b == 6) {
                                return new MessageSnapshot.StartedMessageSnapshot(d);
                            }
                            String a = C10771f.m36504a("it can't takes a snapshot for the task(%s) when its status is %d,", aVar, Byte.valueOf(b));
                            C10767d.m36495e(C8890c.class, a, new Object[0]);
                            if (iVar.mo32820d() != null) {
                                illegalStateException = new IllegalStateException(a, iVar.mo32820d());
                            } else {
                                illegalStateException = new IllegalStateException(a);
                            }
                            if (aVar.mo32747l()) {
                                return new LargeMessageSnapshot.ErrorMessageSnapshot(d, aVar.mo32741f(), illegalStateException);
                            }
                            return new SmallMessageSnapshot.ErrorMessageSnapshot(d, (int) aVar.mo32741f(), illegalStateException);
                        } else if (aVar.mo32747l()) {
                            return new LargeMessageSnapshot.RetryMessageSnapshot(d, aVar.mo32741f(), iVar.mo32820d(), iVar.mo32819c());
                        } else {
                            return new SmallMessageSnapshot.RetryMessageSnapshot(d, (int) aVar.mo32741f(), iVar.mo32820d(), iVar.mo32819c());
                        }
                    } else if (aVar.mo32747l()) {
                        return new LargeMessageSnapshot.ProgressMessageSnapshot(d, aVar.mo32741f());
                    } else {
                        return new SmallMessageSnapshot.ProgressMessageSnapshot(d, (int) aVar.mo32741f());
                    }
                } else if (aVar.mo32747l()) {
                    return new LargeMessageSnapshot.PendingMessageSnapshot(d, aVar.mo32741f(), aVar.mo32745j());
                } else {
                    return new SmallMessageSnapshot.PendingMessageSnapshot(d, (int) aVar.mo32741f(), (int) aVar.mo32745j());
                }
            } else if (aVar.mo32747l()) {
                return new LargeMessageSnapshot.ErrorMessageSnapshot(d, aVar.mo32741f(), iVar.mo32820d());
            } else {
                return new SmallMessageSnapshot.ErrorMessageSnapshot(d, (int) aVar.mo32741f(), iVar.mo32820d());
            }
        } else if (aVar.mo32747l()) {
            return new LargeMessageSnapshot.CompletedSnapshot(d, false, aVar.mo32745j());
        } else {
            return new SmallMessageSnapshot.CompletedSnapshot(d, false, (int) aVar.mo32745j());
        }
    }
}
