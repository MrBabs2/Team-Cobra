package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.util.Log;
import com.google.android.gms.common.util.VisibleForTesting;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.concurrent.CountDownLatch;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;

@TargetApi(14)
@zzard
public final class zzbdd extends Thread implements SurfaceTexture.OnFrameAvailableListener, C7424e8 {

    /* renamed from: G */
    private static final float[] f18799G = {-1.0f, -1.0f, -1.0f, 1.0f, -1.0f, -1.0f, -1.0f, 1.0f, -1.0f, 1.0f, 1.0f, -1.0f};

    /* renamed from: A */
    private EGL10 f18800A;

    /* renamed from: B */
    private EGLDisplay f18801B;

    /* renamed from: C */
    private EGLContext f18802C;

    /* renamed from: D */
    private EGLSurface f18803D;

    /* renamed from: E */
    private volatile boolean f18804E;

    /* renamed from: F */
    private volatile boolean f18805F;

    /* renamed from: f */
    private final C7350c8 f18806f;

    /* renamed from: g */
    private final float[] f18807g = new float[9];

    /* renamed from: h */
    private final float[] f18808h = new float[9];

    /* renamed from: i */
    private final float[] f18809i = new float[9];

    /* renamed from: j */
    private final float[] f18810j = new float[9];

    /* renamed from: k */
    private final float[] f18811k = new float[9];

    /* renamed from: l */
    private final float[] f18812l = new float[9];

    /* renamed from: m */
    private final float[] f18813m = new float[9];

    /* renamed from: n */
    private float f18814n = Float.NaN;

    /* renamed from: o */
    private float f18815o;

    /* renamed from: p */
    private float f18816p;

    /* renamed from: q */
    private int f18817q;

    /* renamed from: r */
    private int f18818r;

    /* renamed from: s */
    private SurfaceTexture f18819s;

    /* renamed from: t */
    private SurfaceTexture f18820t;

    /* renamed from: u */
    private int f18821u;

    /* renamed from: v */
    private int f18822v;

    /* renamed from: w */
    private int f18823w;

    /* renamed from: x */
    private FloatBuffer f18824x;

    /* renamed from: y */
    private final CountDownLatch f18825y;

    /* renamed from: z */
    private final Object f18826z;

    public zzbdd(Context context) {
        super("SphericalVideoProcessor");
        FloatBuffer asFloatBuffer = ByteBuffer.allocateDirect(f18799G.length << 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        this.f18824x = asFloatBuffer;
        asFloatBuffer.put(f18799G).position(0);
        C7350c8 c8Var = new C7350c8(context);
        this.f18806f = c8Var;
        c8Var.mo25770a((C7424e8) this);
        this.f18825y = new CountDownLatch(1);
        this.f18826z = new Object();
    }

    @VisibleForTesting
    /* renamed from: d */
    private final boolean m20657d() {
        EGLSurface eGLSurface;
        EGLSurface eGLSurface2 = this.f18803D;
        boolean z = false;
        if (!(eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE))) {
            z = this.f18800A.eglDestroySurface(this.f18801B, this.f18803D) | this.f18800A.eglMakeCurrent(this.f18801B, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT) | false;
            this.f18803D = null;
        }
        EGLContext eGLContext = this.f18802C;
        if (eGLContext != null) {
            z |= this.f18800A.eglDestroyContext(this.f18801B, eGLContext);
            this.f18802C = null;
        }
        EGLDisplay eGLDisplay = this.f18801B;
        if (eGLDisplay == null) {
            return z;
        }
        boolean eglTerminate = z | this.f18800A.eglTerminate(eGLDisplay);
        this.f18801B = null;
        return eglTerminate;
    }

    /* renamed from: a */
    public final void mo27972a(SurfaceTexture surfaceTexture, int i, int i2) {
        this.f18818r = i;
        this.f18817q = i2;
        this.f18820t = surfaceTexture;
    }

    /* renamed from: b */
    public final void mo27973b() {
        synchronized (this.f18826z) {
            this.f18805F = true;
            this.f18820t = null;
            this.f18826z.notifyAll();
        }
    }

    /* renamed from: c */
    public final SurfaceTexture mo27974c() {
        if (this.f18820t == null) {
            return null;
        }
        try {
            this.f18825y.await();
        } catch (InterruptedException unused) {
        }
        return this.f18819s;
    }

    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        this.f18823w++;
        synchronized (this.f18826z) {
            this.f18826z.notifyAll();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x03a2  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x03a7  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x00ab  */
    /* JADX WARNING: Removed duplicated region for block: B:30:0x00b6  */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x00c1  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x01ca  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x01cc  */
    /* JADX WARNING: Removed duplicated region for block: B:51:0x01cf A[ADDED_TO_REGION] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r14 = this;
            android.graphics.SurfaceTexture r0 = r14.f18820t
            if (r0 != 0) goto L_0x000f
            java.lang.String r0 = "SphericalVideoProcessor started with no output texture."
            com.google.android.gms.internal.ads.zzbad.m20519b(r0)
            java.util.concurrent.CountDownLatch r0 = r14.f18825y
            r0.countDown()
            return
        L_0x000f:
            javax.microedition.khronos.egl.EGL r0 = javax.microedition.khronos.egl.EGLContext.getEGL()
            javax.microedition.khronos.egl.EGL10 r0 = (javax.microedition.khronos.egl.EGL10) r0
            r14.f18800A = r0
            java.lang.Object r1 = javax.microedition.khronos.egl.EGL10.EGL_DEFAULT_DISPLAY
            javax.microedition.khronos.egl.EGLDisplay r0 = r0.eglGetDisplay(r1)
            r14.f18801B = r0
            javax.microedition.khronos.egl.EGLDisplay r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_DISPLAY
            r2 = 3
            r3 = 2
            r4 = 0
            r5 = 1
            r6 = 0
            if (r0 != r1) goto L_0x002b
        L_0x0028:
            r0 = 0
            goto L_0x0092
        L_0x002b:
            int[] r1 = new int[r3]
            javax.microedition.khronos.egl.EGL10 r7 = r14.f18800A
            boolean r0 = r7.eglInitialize(r0, r1)
            if (r0 != 0) goto L_0x0036
            goto L_0x0028
        L_0x0036:
            int[] r0 = new int[r5]
            javax.microedition.khronos.egl.EGLConfig[] r1 = new javax.microedition.khronos.egl.EGLConfig[r5]
            r7 = 11
            int[] r9 = new int[r7]
            r9 = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12325, 16, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r14.f18800A
            javax.microedition.khronos.egl.EGLDisplay r8 = r14.f18801B
            r11 = 1
            r10 = r1
            r12 = r0
            boolean r7 = r7.eglChooseConfig(r8, r9, r10, r11, r12)
            if (r7 == 0) goto L_0x0055
            r0 = r0[r6]
            if (r0 <= 0) goto L_0x0055
            r0 = r1[r6]
            goto L_0x0056
        L_0x0055:
            r0 = r4
        L_0x0056:
            if (r0 != 0) goto L_0x0059
            goto L_0x0028
        L_0x0059:
            int[] r1 = new int[r2]
            r1 = {12440, 2, 12344} // fill-array
            javax.microedition.khronos.egl.EGL10 r7 = r14.f18800A
            javax.microedition.khronos.egl.EGLDisplay r8 = r14.f18801B
            javax.microedition.khronos.egl.EGLContext r9 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            javax.microedition.khronos.egl.EGLContext r1 = r7.eglCreateContext(r8, r0, r9, r1)
            r14.f18802C = r1
            if (r1 == 0) goto L_0x0028
            javax.microedition.khronos.egl.EGLContext r7 = javax.microedition.khronos.egl.EGL10.EGL_NO_CONTEXT
            if (r1 != r7) goto L_0x0071
            goto L_0x0028
        L_0x0071:
            javax.microedition.khronos.egl.EGL10 r1 = r14.f18800A
            javax.microedition.khronos.egl.EGLDisplay r7 = r14.f18801B
            android.graphics.SurfaceTexture r8 = r14.f18820t
            javax.microedition.khronos.egl.EGLSurface r0 = r1.eglCreateWindowSurface(r7, r0, r8, r4)
            r14.f18803D = r0
            if (r0 == 0) goto L_0x0028
            javax.microedition.khronos.egl.EGLSurface r1 = javax.microedition.khronos.egl.EGL10.EGL_NO_SURFACE
            if (r0 != r1) goto L_0x0084
            goto L_0x0028
        L_0x0084:
            javax.microedition.khronos.egl.EGL10 r1 = r14.f18800A
            javax.microedition.khronos.egl.EGLDisplay r7 = r14.f18801B
            javax.microedition.khronos.egl.EGLContext r8 = r14.f18802C
            boolean r0 = r1.eglMakeCurrent(r7, r0, r0, r8)
            if (r0 != 0) goto L_0x0091
            goto L_0x0028
        L_0x0091:
            r0 = 1
        L_0x0092:
            r1 = 35633(0x8b31, float:4.9932E-41)
            com.google.android.gms.internal.ads.zzacj<java.lang.String> r7 = com.google.android.gms.internal.ads.zzacu.f17842R0
            com.google.android.gms.internal.ads.zzacr r8 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r8 = r8.mo27163a(r7)
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r9 = r7.mo27156c()
            boolean r8 = r8.equals(r9)
            if (r8 != 0) goto L_0x00b6
            com.google.android.gms.internal.ads.zzacr r8 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r7 = r8.mo27163a(r7)
            java.lang.String r7 = (java.lang.String) r7
            goto L_0x00b8
        L_0x00b6:
            java.lang.String r7 = "attribute highp vec3 aPosition;varying vec3 pos;void main() {  gl_Position = vec4(aPosition, 1.0);  pos = aPosition;}"
        L_0x00b8:
            int r1 = m20652a((int) r1, (java.lang.String) r7)
            if (r1 != 0) goto L_0x00c1
        L_0x00be:
            r8 = 0
            goto L_0x0143
        L_0x00c1:
            r7 = 35632(0x8b30, float:4.9931E-41)
            com.google.android.gms.internal.ads.zzacj<java.lang.String> r8 = com.google.android.gms.internal.ads.zzacu.f17846S0
            com.google.android.gms.internal.ads.zzacr r9 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r9 = r9.mo27163a(r8)
            java.lang.String r9 = (java.lang.String) r9
            java.lang.Object r10 = r8.mo27156c()
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x00e5
            com.google.android.gms.internal.ads.zzacr r9 = com.google.android.gms.internal.ads.zzyt.m25670e()
            java.lang.Object r8 = r9.mo27163a(r8)
            java.lang.String r8 = (java.lang.String) r8
            goto L_0x00e7
        L_0x00e5:
            java.lang.String r8 = "#extension GL_OES_EGL_image_external : require\n#define INV_PI 0.3183\nprecision highp float;varying vec3 pos;uniform samplerExternalOES uSplr;uniform mat3 uVMat;uniform float uFOVx;uniform float uFOVy;void main() {  vec3 ray = vec3(pos.x * tan(uFOVx), pos.y * tan(uFOVy), -1);  ray = (uVMat * ray).xyz;  ray = normalize(ray);  vec2 texCrd = vec2(    0.5 + atan(ray.x, - ray.z) * INV_PI * 0.5, acos(ray.y) * INV_PI);  gl_FragColor = vec4(texture2D(uSplr, texCrd).xyz, 1.0);}"
        L_0x00e7:
            int r7 = m20652a((int) r7, (java.lang.String) r8)
            if (r7 != 0) goto L_0x00ee
            goto L_0x00be
        L_0x00ee:
            int r8 = android.opengl.GLES20.glCreateProgram()
            java.lang.String r9 = "createProgram"
            m20653a(r9)
            if (r8 == 0) goto L_0x0143
            android.opengl.GLES20.glAttachShader(r8, r1)
            java.lang.String r1 = "attachShader"
            m20653a(r1)
            android.opengl.GLES20.glAttachShader(r8, r7)
            java.lang.String r1 = "attachShader"
            m20653a(r1)
            android.opengl.GLES20.glLinkProgram(r8)
            java.lang.String r1 = "linkProgram"
            m20653a(r1)
            int[] r1 = new int[r5]
            r7 = 35714(0x8b82, float:5.0046E-41)
            android.opengl.GLES20.glGetProgramiv(r8, r7, r1, r6)
            java.lang.String r7 = "getProgramiv"
            m20653a(r7)
            r1 = r1[r6]
            if (r1 == r5) goto L_0x013b
            java.lang.String r1 = "SphericalVideoRenderer"
            java.lang.String r7 = "Could not link program: "
            android.util.Log.e(r1, r7)
            java.lang.String r1 = android.opengl.GLES20.glGetProgramInfoLog(r8)
            java.lang.String r7 = "SphericalVideoRenderer"
            android.util.Log.e(r7, r1)
            android.opengl.GLES20.glDeleteProgram(r8)
            java.lang.String r1 = "deleteProgram"
            m20653a(r1)
            goto L_0x00be
        L_0x013b:
            android.opengl.GLES20.glValidateProgram(r8)
            java.lang.String r1 = "validateProgram"
            m20653a(r1)
        L_0x0143:
            r14.f18821u = r8
            android.opengl.GLES20.glUseProgram(r8)
            java.lang.String r1 = "useProgram"
            m20653a(r1)
            int r1 = r14.f18821u
            java.lang.String r7 = "aPosition"
            int r1 = android.opengl.GLES20.glGetAttribLocation(r1, r7)
            r9 = 3
            r10 = 5126(0x1406, float:7.183E-42)
            r11 = 0
            r12 = 12
            java.nio.FloatBuffer r13 = r14.f18824x
            r8 = r1
            android.opengl.GLES20.glVertexAttribPointer(r8, r9, r10, r11, r12, r13)
            java.lang.String r7 = "vertexAttribPointer"
            m20653a(r7)
            android.opengl.GLES20.glEnableVertexAttribArray(r1)
            java.lang.String r1 = "enableVertexAttribArray"
            m20653a(r1)
            int[] r1 = new int[r5]
            android.opengl.GLES20.glGenTextures(r5, r1, r6)
            java.lang.String r7 = "genTextures"
            m20653a(r7)
            r1 = r1[r6]
            r7 = 36197(0x8d65, float:5.0723E-41)
            android.opengl.GLES20.glBindTexture(r7, r1)
            java.lang.String r8 = "bindTextures"
            m20653a(r8)
            r8 = 10240(0x2800, float:1.4349E-41)
            r9 = 9729(0x2601, float:1.3633E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m20653a(r8)
            r8 = 10241(0x2801, float:1.435E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m20653a(r8)
            r8 = 10242(0x2802, float:1.4352E-41)
            r9 = 33071(0x812f, float:4.6342E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r8 = "texParameteri"
            m20653a(r8)
            r8 = 10243(0x2803, float:1.4354E-41)
            android.opengl.GLES20.glTexParameteri(r7, r8, r9)
            java.lang.String r7 = "texParameteri"
            m20653a(r7)
            int r7 = r14.f18821u
            java.lang.String r8 = "uVMat"
            int r7 = android.opengl.GLES20.glGetUniformLocation(r7, r8)
            r14.f18822v = r7
            r8 = 9
            float[] r8 = new float[r8]
            r8 = {1065353216, 0, 0, 0, 1065353216, 0, 0, 0, 1065353216} // fill-array
            android.opengl.GLES20.glUniformMatrix3fv(r7, r5, r6, r8, r6)
            int r7 = r14.f18821u
            if (r7 == 0) goto L_0x01cc
            r7 = 1
            goto L_0x01cd
        L_0x01cc:
            r7 = 0
        L_0x01cd:
            if (r0 == 0) goto L_0x038c
            if (r7 != 0) goto L_0x01d3
            goto L_0x038c
        L_0x01d3:
            android.graphics.SurfaceTexture r0 = new android.graphics.SurfaceTexture
            r0.<init>(r1)
            r14.f18819s = r0
            r0.setOnFrameAvailableListener(r14)
            java.util.concurrent.CountDownLatch r0 = r14.f18825y
            r0.countDown()
            com.google.android.gms.internal.ads.c8 r0 = r14.f18806f
            r0.mo25769a()
            r14.f18804E = r5     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
        L_0x01e9:
            boolean r0 = r14.f18805F     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            if (r0 != 0) goto L_0x0337
        L_0x01ed:
            int r0 = r14.f18823w     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            if (r0 <= 0) goto L_0x01fc
            android.graphics.SurfaceTexture r0 = r14.f18819s     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r0.updateTexImage()     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r0 = r14.f18823w     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r0 = r0 - r5
            r14.f18823w = r0     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            goto L_0x01ed
        L_0x01fc:
            com.google.android.gms.internal.ads.c8 r0 = r14.f18806f     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r1 = r14.f18807g     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            boolean r0 = r0.mo25771a((float[]) r1)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r1 = 5
            r7 = 4
            r8 = 1070141403(0x3fc90fdb, float:1.5707964)
            if (r0 == 0) goto L_0x0282
            float r0 = r14.f18814n     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            boolean r0 = java.lang.Float.isNaN(r0)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            if (r0 == 0) goto L_0x0277
            float[] r0 = r14.f18807g     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r9 = new float[r2]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r10 = 0
            r9[r6] = r10     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r11 = 1065353216(0x3f800000, float:1.0)
            r9[r5] = r11     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r9[r3] = r10     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r10 = new float[r2]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r11 = r0[r6]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r11 = r11 * r12
            r12 = r0[r5]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = r0[r3]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r13 = r9[r3]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r10[r6] = r11     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r11 = r0[r2]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r11 = r11 * r12
            r12 = r0[r7]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = r0[r1]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r13 = r9[r3]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r10[r5] = r11     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r11 = 6
            r11 = r0[r11]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r12 = r9[r6]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r11 = r11 * r12
            r12 = 7
            r12 = r0[r12]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r13 = r9[r5]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r12 = r12 * r13
            float r11 = r11 + r12
            r12 = 8
            r0 = r0[r12]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r9 = r9[r3]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r0 = r0 * r9
            float r11 = r11 + r0
            r10[r3] = r11     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r0 = r10[r5]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            double r11 = (double) r0     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r0 = r10[r6]     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            double r9 = (double) r0     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            double r9 = java.lang.Math.atan2(r11, r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r0 = (float) r9     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r0 = r0 - r8
            float r0 = -r0
            r14.f18814n = r0     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
        L_0x0277:
            float[] r0 = r14.f18812l     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r9 = r14.f18814n     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r10 = r14.f18815o     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r9 = r9 + r10
            m20656b(r0, r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            goto L_0x0291
        L_0x0282:
            float[] r0 = r14.f18807g     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r9 = -1077342245(0xffffffffbfc90fdb, float:-1.5707964)
            m20654a((float[]) r0, (float) r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r0 = r14.f18812l     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r9 = r14.f18815o     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            m20656b(r0, r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
        L_0x0291:
            float[] r0 = r14.f18808h     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            m20654a((float[]) r0, (float) r8)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r0 = r14.f18809i     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r8 = r14.f18812l     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r9 = r14.f18808h     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            m20655a((float[]) r0, (float[]) r8, (float[]) r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r0 = r14.f18810j     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r8 = r14.f18807g     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r9 = r14.f18809i     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            m20655a((float[]) r0, (float[]) r8, (float[]) r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r0 = r14.f18811k     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r8 = r14.f18816p     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            m20654a((float[]) r0, (float) r8)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r0 = r14.f18813m     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r8 = r14.f18811k     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r9 = r14.f18810j     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            m20655a((float[]) r0, (float[]) r8, (float[]) r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r0 = r14.f18822v     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float[] r8 = r14.f18813m     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            android.opengl.GLES20.glUniformMatrix3fv(r0, r5, r6, r8, r6)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            android.opengl.GLES20.glDrawArrays(r1, r6, r7)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            java.lang.String r0 = "drawArrays"
            m20653a(r0)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            android.opengl.GLES20.glFinish()     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            javax.microedition.khronos.egl.EGL10 r0 = r14.f18800A     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            javax.microedition.khronos.egl.EGLDisplay r1 = r14.f18801B     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            javax.microedition.khronos.egl.EGLSurface r7 = r14.f18803D     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r0.eglSwapBuffers(r1, r7)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            boolean r0 = r14.f18804E     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            if (r0 == 0) goto L_0x031d
            int r0 = r14.f18818r     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r1 = r14.f18817q     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            android.opengl.GLES20.glViewport(r6, r6, r0, r1)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            java.lang.String r0 = "viewport"
            m20653a(r0)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r0 = r14.f18821u     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            java.lang.String r1 = "uFOVx"
            int r0 = android.opengl.GLES20.glGetUniformLocation(r0, r1)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r1 = r14.f18821u     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            java.lang.String r7 = "uFOVy"
            int r1 = android.opengl.GLES20.glGetUniformLocation(r1, r7)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r7 = r14.f18818r     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r8 = r14.f18817q     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            r9 = 1063216883(0x3f5f66f3, float:0.87266463)
            if (r7 <= r8) goto L_0x030c
            android.opengl.GLES20.glUniform1f(r0, r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            int r0 = r14.f18817q     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r0 = (float) r0     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r0 = r0 * r9
            int r7 = r14.f18818r     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r0 = r0 / r7
            android.opengl.GLES20.glUniform1f(r1, r0)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            goto L_0x031b
        L_0x030c:
            int r7 = r14.f18818r     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r7 = (float) r7     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r7 = r7 * r9
            int r8 = r14.f18817q     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r8 = (float) r8     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            float r7 = r7 / r8
            android.opengl.GLES20.glUniform1f(r0, r7)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
            android.opengl.GLES20.glUniform1f(r1, r9)     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
        L_0x031b:
            r14.f18804E = r6     // Catch:{ IllegalStateException -> 0x0366, all -> 0x0347 }
        L_0x031d:
            java.lang.Object r0 = r14.f18826z     // Catch:{ InterruptedException -> 0x01e9 }
            monitor-enter(r0)     // Catch:{ InterruptedException -> 0x01e9 }
            boolean r1 = r14.f18805F     // Catch:{ all -> 0x0334 }
            if (r1 != 0) goto L_0x0331
            boolean r1 = r14.f18804E     // Catch:{ all -> 0x0334 }
            if (r1 != 0) goto L_0x0331
            int r1 = r14.f18823w     // Catch:{ all -> 0x0334 }
            if (r1 != 0) goto L_0x0331
            java.lang.Object r1 = r14.f18826z     // Catch:{ all -> 0x0334 }
            r1.wait()     // Catch:{ all -> 0x0334 }
        L_0x0331:
            monitor-exit(r0)     // Catch:{ all -> 0x0334 }
            goto L_0x01e9
        L_0x0334:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0334 }
            throw r1     // Catch:{ InterruptedException -> 0x01e9 }
        L_0x0337:
            com.google.android.gms.internal.ads.c8 r0 = r14.f18806f
            r0.mo25772b()
            android.graphics.SurfaceTexture r0 = r14.f18819s
            r0.setOnFrameAvailableListener(r4)
            r14.f18819s = r4
            r14.m20657d()
            return
        L_0x0347:
            r0 = move-exception
            java.lang.String r1 = "SphericalVideoProcessor died."
            com.google.android.gms.internal.ads.zzbad.m20520b(r1, r0)     // Catch:{ all -> 0x037b }
            com.google.android.gms.internal.ads.zzawm r1 = com.google.android.gms.ads.internal.zzk.zzlk()     // Catch:{ all -> 0x037b }
            java.lang.String r2 = "SphericalVideoProcessor.run.2"
            r1.mo27734a((java.lang.Throwable) r0, (java.lang.String) r2)     // Catch:{ all -> 0x037b }
            com.google.android.gms.internal.ads.c8 r0 = r14.f18806f
            r0.mo25772b()
            android.graphics.SurfaceTexture r0 = r14.f18819s
            r0.setOnFrameAvailableListener(r4)
            r14.f18819s = r4
            r14.m20657d()
            return
        L_0x0366:
            java.lang.String r0 = "SphericalVideoProcessor halted unexpectedly."
            com.google.android.gms.internal.ads.zzbad.m20523d(r0)     // Catch:{ all -> 0x037b }
            com.google.android.gms.internal.ads.c8 r0 = r14.f18806f
            r0.mo25772b()
            android.graphics.SurfaceTexture r0 = r14.f18819s
            r0.setOnFrameAvailableListener(r4)
            r14.f18819s = r4
            r14.m20657d()
            return
        L_0x037b:
            r0 = move-exception
            com.google.android.gms.internal.ads.c8 r1 = r14.f18806f
            r1.mo25772b()
            android.graphics.SurfaceTexture r1 = r14.f18819s
            r1.setOnFrameAvailableListener(r4)
            r14.f18819s = r4
            r14.m20657d()
            throw r0
        L_0x038c:
            javax.microedition.khronos.egl.EGL10 r0 = r14.f18800A
            int r0 = r0.eglGetError()
            java.lang.String r0 = android.opengl.GLUtils.getEGLErrorString(r0)
            java.lang.String r1 = "EGL initialization failed: "
            java.lang.String r0 = java.lang.String.valueOf(r0)
            int r2 = r0.length()
            if (r2 == 0) goto L_0x03a7
            java.lang.String r0 = r1.concat(r0)
            goto L_0x03ac
        L_0x03a7:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r1)
        L_0x03ac:
            com.google.android.gms.internal.ads.zzbad.m20519b(r0)
            com.google.android.gms.internal.ads.zzawm r1 = com.google.android.gms.ads.internal.zzk.zzlk()
            java.lang.Throwable r2 = new java.lang.Throwable
            r2.<init>(r0)
            java.lang.String r0 = "SphericalVideoProcessor.run.1"
            r1.mo27734a((java.lang.Throwable) r2, (java.lang.String) r0)
            r14.m20657d()
            java.util.concurrent.CountDownLatch r0 = r14.f18825y
            r0.countDown()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzbdd.run():void");
    }

    /* renamed from: a */
    public final void mo27971a(int i, int i2) {
        synchronized (this.f18826z) {
            this.f18818r = i;
            this.f18817q = i2;
            this.f18804E = true;
            this.f18826z.notifyAll();
        }
    }

    /* renamed from: b */
    private static void m20656b(float[] fArr, float f) {
        double d = (double) f;
        fArr[0] = (float) Math.cos(d);
        fArr[1] = (float) (-Math.sin(d));
        fArr[2] = 0.0f;
        fArr[3] = (float) Math.sin(d);
        fArr[4] = (float) Math.cos(d);
        fArr[5] = 0.0f;
        fArr[6] = 0.0f;
        fArr[7] = 0.0f;
        fArr[8] = 1.0f;
    }

    /* renamed from: a */
    public final void mo25863a() {
        synchronized (this.f18826z) {
            this.f18826z.notifyAll();
        }
    }

    /* renamed from: a */
    public final void mo27970a(float f, float f2) {
        float f3;
        float f4;
        float f5;
        int i = this.f18818r;
        int i2 = this.f18817q;
        if (i > i2) {
            f4 = (f * 1.7453293f) / ((float) i);
            f3 = f2 * 1.7453293f;
            f5 = (float) i;
        } else {
            f4 = (f * 1.7453293f) / ((float) i2);
            f3 = f2 * 1.7453293f;
            f5 = (float) i2;
        }
        this.f18815o -= f4;
        float f6 = this.f18816p - (f3 / f5);
        this.f18816p = f6;
        if (f6 < -1.5707964f) {
            this.f18816p = -1.5707964f;
        }
        if (this.f18816p > 1.5707964f) {
            this.f18816p = 1.5707964f;
        }
    }

    /* renamed from: a */
    private static void m20655a(float[] fArr, float[] fArr2, float[] fArr3) {
        fArr[0] = (fArr2[0] * fArr3[0]) + (fArr2[1] * fArr3[3]) + (fArr2[2] * fArr3[6]);
        fArr[1] = (fArr2[0] * fArr3[1]) + (fArr2[1] * fArr3[4]) + (fArr2[2] * fArr3[7]);
        fArr[2] = (fArr2[0] * fArr3[2]) + (fArr2[1] * fArr3[5]) + (fArr2[2] * fArr3[8]);
        fArr[3] = (fArr2[3] * fArr3[0]) + (fArr2[4] * fArr3[3]) + (fArr2[5] * fArr3[6]);
        fArr[4] = (fArr2[3] * fArr3[1]) + (fArr2[4] * fArr3[4]) + (fArr2[5] * fArr3[7]);
        fArr[5] = (fArr2[3] * fArr3[2]) + (fArr2[4] * fArr3[5]) + (fArr2[5] * fArr3[8]);
        fArr[6] = (fArr2[6] * fArr3[0]) + (fArr2[7] * fArr3[3]) + (fArr2[8] * fArr3[6]);
        fArr[7] = (fArr2[6] * fArr3[1]) + (fArr2[7] * fArr3[4]) + (fArr2[8] * fArr3[7]);
        fArr[8] = (fArr2[6] * fArr3[2]) + (fArr2[7] * fArr3[5]) + (fArr2[8] * fArr3[8]);
    }

    /* renamed from: a */
    private static void m20654a(float[] fArr, float f) {
        fArr[0] = 1.0f;
        fArr[1] = 0.0f;
        fArr[2] = 0.0f;
        fArr[3] = 0.0f;
        double d = (double) f;
        fArr[4] = (float) Math.cos(d);
        fArr[5] = (float) (-Math.sin(d));
        fArr[6] = 0.0f;
        fArr[7] = (float) Math.sin(d);
        fArr[8] = (float) Math.cos(d);
    }

    /* renamed from: a */
    private static int m20652a(int i, String str) {
        int glCreateShader = GLES20.glCreateShader(i);
        m20653a("createShader");
        if (glCreateShader == 0) {
            return glCreateShader;
        }
        GLES20.glShaderSource(glCreateShader, str);
        m20653a("shaderSource");
        GLES20.glCompileShader(glCreateShader);
        m20653a("compileShader");
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        m20653a("getShaderiv");
        if (iArr[0] != 0) {
            return glCreateShader;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("Could not compile shader ");
        sb.append(i);
        sb.append(":");
        Log.e("SphericalVideoRenderer", sb.toString());
        Log.e("SphericalVideoRenderer", GLES20.glGetShaderInfoLog(glCreateShader));
        GLES20.glDeleteShader(glCreateShader);
        m20653a("deleteShader");
        return 0;
    }

    /* renamed from: a */
    private static void m20653a(String str) {
        int glGetError = GLES20.glGetError();
        if (glGetError != 0) {
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
            sb.append(str);
            sb.append(": glError ");
            sb.append(glGetError);
            Log.e("SphericalVideoRenderer", sb.toString());
        }
    }
}
