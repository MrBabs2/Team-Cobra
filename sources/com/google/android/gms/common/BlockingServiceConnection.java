package com.google.android.gms.common;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

@KeepForSdk
public class BlockingServiceConnection implements ServiceConnection {

    /* renamed from: f */
    private boolean f13606f = false;

    /* renamed from: g */
    private final BlockingQueue<IBinder> f13607g = new LinkedBlockingQueue();

    @KeepForSdk
    /* renamed from: a */
    public IBinder mo24836a(long j, TimeUnit timeUnit) throws InterruptedException, TimeoutException {
        Preconditions.m16050c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
        if (!this.f13606f) {
            this.f13606f = true;
            IBinder poll = this.f13607g.poll(j, timeUnit);
            if (poll != null) {
                return poll;
            }
            throw new TimeoutException("Timed out waiting for the service connection");
        }
        throw new IllegalStateException("Cannot call get on this connection more than once");
    }

    public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        this.f13607g.add(iBinder);
    }

    public void onServiceDisconnected(ComponentName componentName) {
    }
}
