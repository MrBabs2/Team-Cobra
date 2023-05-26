package com.liulishuo.filedownloader.exception;

import android.annotation.TargetApi;
import java.io.IOException;
import p112n.p312h.p313a.p318f0.C10771f;

public class FileDownloadOutOfSpaceException extends IOException {
    @TargetApi(9)
    public FileDownloadOutOfSpaceException(long j, long j2, long j3, Throwable th) {
        super(C10771f.m36504a("The file is too large to store, breakpoint in bytes:  %d, required space in bytes: %d, but free space in bytes: %d", Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(j)), th);
        m29068a(j, j2, j3);
    }

    /* renamed from: a */
    private void m29068a(long j, long j2, long j3) {
    }

    public FileDownloadOutOfSpaceException(long j, long j2, long j3) {
        super(C10771f.m36504a("The file is too large to store, breakpoint in bytes:  %d, required space in bytes: %d, but free space in bytes: %d", Long.valueOf(j3), Long.valueOf(j2), Long.valueOf(j)));
        m29068a(j, j2, j3);
    }
}
