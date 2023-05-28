package com.google.android.gms.internal.ads;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Handler;
import android.os.HandlerThread;
import android.view.Display;
import android.view.WindowManager;

@zzard
/* renamed from: com.google.android.gms.internal.ads.c8 */
final class C7350c8 implements SensorEventListener {

    /* renamed from: a */
    private final SensorManager f14719a;

    /* renamed from: b */
    private final Object f14720b = new Object();

    /* renamed from: c */
    private final Display f14721c;

    /* renamed from: d */
    private final float[] f14722d = new float[9];

    /* renamed from: e */
    private final float[] f14723e = new float[9];

    /* renamed from: f */
    private float[] f14724f;

    /* renamed from: g */
    private Handler f14725g;

    /* renamed from: h */
    private C7424e8 f14726h;

    C7350c8(Context context) {
        this.f14719a = (SensorManager) context.getSystemService("sensor");
        this.f14721c = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25769a() {
        if (this.f14725g == null) {
            Sensor defaultSensor = this.f14719a.getDefaultSensor(11);
            if (defaultSensor == null) {
                zzbad.m20519b("No Sensor of TYPE_ROTATION_VECTOR");
                return;
            }
            HandlerThread handlerThread = new HandlerThread("OrientationMonitor");
            handlerThread.start();
            zzdbh zzdbh = new zzdbh(handlerThread.getLooper());
            this.f14725g = zzdbh;
            if (!this.f14719a.registerListener(this, defaultSensor, 0, zzdbh)) {
                zzbad.m20519b("SensorManager.registerListener failed.");
                mo25772b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public final void mo25772b() {
        if (this.f14725g != null) {
            this.f14719a.unregisterListener(this);
            this.f14725g.post(new C7387d8(this));
            this.f14725g = null;
        }
    }

    public final void onAccuracyChanged(Sensor sensor, int i) {
    }

    public final void onSensorChanged(SensorEvent sensorEvent) {
        float[] fArr = sensorEvent.values;
        if (fArr[0] != 0.0f || fArr[1] != 0.0f || fArr[2] != 0.0f) {
            synchronized (this.f14720b) {
                if (this.f14724f == null) {
                    this.f14724f = new float[9];
                }
            }
            SensorManager.getRotationMatrixFromVector(this.f14722d, fArr);
            int rotation = this.f14721c.getRotation();
            if (rotation == 1) {
                SensorManager.remapCoordinateSystem(this.f14722d, 2, 129, this.f14723e);
            } else if (rotation == 2) {
                SensorManager.remapCoordinateSystem(this.f14722d, 129, 130, this.f14723e);
            } else if (rotation != 3) {
                System.arraycopy(this.f14722d, 0, this.f14723e, 0, 9);
            } else {
                SensorManager.remapCoordinateSystem(this.f14722d, 130, 1, this.f14723e);
            }
            m16715a(1, 3);
            m16715a(2, 6);
            m16715a(5, 7);
            synchronized (this.f14720b) {
                System.arraycopy(this.f14723e, 0, this.f14724f, 0, 9);
            }
            C7424e8 e8Var = this.f14726h;
            if (e8Var != null) {
                e8Var.mo25863a();
            }
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final void mo25770a(C7424e8 e8Var) {
        this.f14726h = e8Var;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: a */
    public final boolean mo25771a(float[] fArr) {
        synchronized (this.f14720b) {
            if (this.f14724f == null) {
                return false;
            }
            System.arraycopy(this.f14724f, 0, fArr, 0, this.f14724f.length);
            return true;
        }
    }

    /* renamed from: a */
    private final void m16715a(int i, int i2) {
        float[] fArr = this.f14723e;
        float f = fArr[i];
        fArr[i] = fArr[i2];
        fArr[i2] = f;
    }
}
