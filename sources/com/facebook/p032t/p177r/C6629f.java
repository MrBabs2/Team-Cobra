package com.facebook.p032t.p177r;

import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import com.facebook.internal.p168a0.p170f.C6391a;

/* renamed from: com.facebook.t.r.f */
/* compiled from: ViewIndexingTrigger */
class C6629f implements SensorEventListener {

    /* renamed from: a */
    private C6630a f12333a;

    /* renamed from: com.facebook.t.r.f$a */
    /* compiled from: ViewIndexingTrigger */
    public interface C6630a {
        /* renamed from: a */
        void mo21364a();
    }

    C6629f() {
    }

    /* renamed from: a */
    public void mo21385a(C6630a aVar) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                this.f12333a = aVar;
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }

    public void onAccuracyChanged(Sensor sensor, int i) {
        if (C6391a.m13260a((Object) this)) {
        }
    }

    public void onSensorChanged(SensorEvent sensorEvent) {
        if (!C6391a.m13260a((Object) this)) {
            try {
                if (this.f12333a != null) {
                    float f = sensorEvent.values[0];
                    double d = (double) (f / 9.80665f);
                    double d2 = (double) (sensorEvent.values[1] / 9.80665f);
                    double d3 = (double) (sensorEvent.values[2] / 9.80665f);
                    Double.isNaN(d);
                    Double.isNaN(d);
                    Double.isNaN(d2);
                    Double.isNaN(d2);
                    Double.isNaN(d3);
                    Double.isNaN(d3);
                    if (Math.sqrt((d * d) + (d2 * d2) + (d3 * d3)) > 2.299999952316284d) {
                        this.f12333a.mo21364a();
                    }
                }
            } catch (Throwable th) {
                C6391a.m13259a(th, this);
            }
        }
    }
}
