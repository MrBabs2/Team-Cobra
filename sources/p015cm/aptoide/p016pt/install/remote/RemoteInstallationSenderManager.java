package p015cm.aptoide.p016pt.install.remote;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.AsyncTask;
import android.os.Build;
import android.os.Handler;
import android.util.Log;
import java.io.IOException;
import java.net.Inet4Address;
import java.net.InetAddress;
import java.net.UnknownHostException;
import p368r.p369a.C11592a;
import p368r.p369a.C11597c;
import p368r.p369a.C11598d;
import p368r.p369a.C11600e;

/* renamed from: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager */
public class RemoteInstallationSenderManager {
    static final int DISCOVERY_TO = 20000;
    static final String INVALID_PAYLOAD_RESPONSE = "INVALIDPAYLOAD";
    static final String PAYLOAD_TAG = "apkinstall_appid=";
    static final String SERVER_TAG_TO_REMOVE = ".local.";
    static final String SERVICE_TYPE = "_aptoide-rmtinst._tcp.local.";
    static final String SUCCESS_TAG = "receivedpayload=";
    static final String TAG = "RemoteInstallationSenderManager";
    static final int TIMEOUT = 10000;
    SocketClientThread clientServerThread;
    Context context;
    Handler handler = new Handler();
    C11592a jmDNS;
    RemoteInstallationSenderListener listener;
    WifiManager.MulticastLock multicastLock;

    /* renamed from: cm.aptoide.pt.install.remote.RemoteInstallationSenderManager$SocketClientThread */
    private class SocketClientThread extends AsyncTask<Void, Void, Boolean> {
        private String app;
        private ReceiverDevice device;

        public SocketClientThread(ReceiverDevice receiverDevice, String str) {
            this.device = receiverDevice;
            this.app = str;
        }

        /* access modifiers changed from: protected */
        /* JADX WARNING: Removed duplicated region for block: B:80:0x019a  */
        /* JADX WARNING: Removed duplicated region for block: B:82:0x019f A[SYNTHETIC, Splitter:B:82:0x019f] */
        /* JADX WARNING: Removed duplicated region for block: B:96:0x01dd  */
        /* JADX WARNING: Removed duplicated region for block: B:98:0x01e2 A[SYNTHETIC, Splitter:B:98:0x01e2] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public java.lang.Boolean doInBackground(java.lang.Void... r11) {
            /*
                r10 = this;
                java.lang.String r11 = "Remote Install - SocketClientThread BR Closing Error: "
                java.lang.String r0 = "Remote Install - SocketClientThread Closing Error: "
                r1 = 0
                r2 = 0
                java.net.Socket r3 = new java.net.Socket     // Catch:{ IOException -> 0x0171, all -> 0x016d }
                cm.aptoide.pt.install.remote.ReceiverDevice r4 = r10.device     // Catch:{ IOException -> 0x0171, all -> 0x016d }
                java.net.InetAddress r4 = r4.getAddress()     // Catch:{ IOException -> 0x0171, all -> 0x016d }
                cm.aptoide.pt.install.remote.ReceiverDevice r5 = r10.device     // Catch:{ IOException -> 0x0171, all -> 0x016d }
                int r5 = r5.getPort()     // Catch:{ IOException -> 0x0171, all -> 0x016d }
                r3.<init>(r4, r5)     // Catch:{ IOException -> 0x0171, all -> 0x016d }
                r4 = 10000(0x2710, float:1.4013E-41)
                r3.setSoTimeout(r4)     // Catch:{ IOException -> 0x0169, all -> 0x0164 }
                java.io.PrintWriter r4 = new java.io.PrintWriter     // Catch:{ IOException -> 0x0169, all -> 0x0164 }
                java.io.OutputStream r5 = r3.getOutputStream()     // Catch:{ IOException -> 0x0169, all -> 0x0164 }
                r6 = 1
                r4.<init>(r5, r6)     // Catch:{ IOException -> 0x0169, all -> 0x0164 }
                java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch:{ IOException -> 0x0162, all -> 0x015f }
                java.io.InputStreamReader r7 = new java.io.InputStreamReader     // Catch:{ IOException -> 0x0162, all -> 0x015f }
                java.io.InputStream r8 = r3.getInputStream()     // Catch:{ IOException -> 0x0162, all -> 0x015f }
                r7.<init>(r8)     // Catch:{ IOException -> 0x0162, all -> 0x015f }
                r5.<init>(r7)     // Catch:{ IOException -> 0x0162, all -> 0x015f }
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                r2.<init>()     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                java.lang.String r7 = "apkinstall_appid="
                r2.append(r7)     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                java.lang.String r7 = r10.app     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                r2.append(r7)     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                java.lang.String r2 = r2.toString()     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                r4.println(r2)     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                java.lang.String r2 = p015cm.aptoide.p016pt.install.remote.RemoteInstallationSenderManager.TAG     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                r7.<init>()     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                java.lang.String r8 = "Remote Install - SocketClientThread Sent: apkinstall_appid="
                r7.append(r8)     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                java.lang.String r8 = r10.app     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                r7.append(r8)     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                android.util.Log.i(r2, r7)     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                java.lang.String r2 = r5.readLine()     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                java.lang.String r7 = p015cm.aptoide.p016pt.install.remote.RemoteInstallationSenderManager.TAG     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                java.lang.StringBuilder r8 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                r8.<init>()     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                java.lang.String r9 = "Remote Install - SocketClientThread Received: "
                r8.append(r9)     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                r8.append(r2)     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                java.lang.String r8 = r8.toString()     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                android.util.Log.i(r7, r8)     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                r7.<init>()     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                java.lang.String r8 = "receivedpayload="
                r7.append(r8)     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                java.lang.String r8 = r10.app     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                r7.append(r8)     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                java.lang.String r7 = r7.toString()     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                boolean r7 = r2.equals(r7)     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                if (r7 == 0) goto L_0x00d5
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r6)     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                boolean r2 = r3.isClosed()
                if (r2 != 0) goto L_0x00b8
                r3.close()     // Catch:{ IOException -> 0x00a3 }
                goto L_0x00b8
            L_0x00a3:
                r2 = move-exception
                java.lang.String r3 = p015cm.aptoide.p016pt.install.remote.RemoteInstallationSenderManager.TAG
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r0)
                r6.append(r2)
                java.lang.String r0 = r6.toString()
                android.util.Log.e(r3, r0)
            L_0x00b8:
                r4.close()
                r5.close()     // Catch:{ IOException -> 0x00bf }
                goto L_0x00d4
            L_0x00bf:
                r0 = move-exception
                java.lang.String r2 = p015cm.aptoide.p016pt.install.remote.RemoteInstallationSenderManager.TAG
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r11)
                r3.append(r0)
                java.lang.String r11 = r3.toString()
                android.util.Log.e(r2, r11)
            L_0x00d4:
                return r1
            L_0x00d5:
                java.lang.String r6 = "INVALIDPAYLOAD"
                boolean r2 = r2.equals(r6)     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                if (r2 == 0) goto L_0x011d
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ IOException -> 0x016b, all -> 0x015d }
                boolean r2 = r3.isClosed()
                if (r2 != 0) goto L_0x0100
                r3.close()     // Catch:{ IOException -> 0x00eb }
                goto L_0x0100
            L_0x00eb:
                r2 = move-exception
                java.lang.String r3 = p015cm.aptoide.p016pt.install.remote.RemoteInstallationSenderManager.TAG
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r0)
                r6.append(r2)
                java.lang.String r0 = r6.toString()
                android.util.Log.e(r3, r0)
            L_0x0100:
                r4.close()
                r5.close()     // Catch:{ IOException -> 0x0107 }
                goto L_0x011c
            L_0x0107:
                r0 = move-exception
                java.lang.String r2 = p015cm.aptoide.p016pt.install.remote.RemoteInstallationSenderManager.TAG
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r11)
                r3.append(r0)
                java.lang.String r11 = r3.toString()
                android.util.Log.e(r2, r11)
            L_0x011c:
                return r1
            L_0x011d:
                boolean r2 = r3.isClosed()
                if (r2 != 0) goto L_0x013c
                r3.close()     // Catch:{ IOException -> 0x0127 }
                goto L_0x013c
            L_0x0127:
                r2 = move-exception
                java.lang.String r3 = p015cm.aptoide.p016pt.install.remote.RemoteInstallationSenderManager.TAG
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r0)
                r6.append(r2)
                java.lang.String r0 = r6.toString()
                android.util.Log.e(r3, r0)
            L_0x013c:
                r4.close()
                r5.close()     // Catch:{ IOException -> 0x0143 }
                goto L_0x0158
            L_0x0143:
                r0 = move-exception
                java.lang.String r2 = p015cm.aptoide.p016pt.install.remote.RemoteInstallationSenderManager.TAG
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r11)
                r3.append(r0)
                java.lang.String r11 = r3.toString()
                android.util.Log.e(r2, r11)
            L_0x0158:
                java.lang.Boolean r11 = java.lang.Boolean.valueOf(r1)
                return r11
            L_0x015d:
                r1 = move-exception
                goto L_0x0167
            L_0x015f:
                r1 = move-exception
                r5 = r2
                goto L_0x0167
            L_0x0162:
                r5 = r2
                goto L_0x016b
            L_0x0164:
                r1 = move-exception
                r4 = r2
                r5 = r4
            L_0x0167:
                r2 = r3
                goto L_0x01ba
            L_0x0169:
                r4 = r2
                r5 = r4
            L_0x016b:
                r2 = r3
                goto L_0x0173
            L_0x016d:
                r1 = move-exception
                r4 = r2
                r5 = r4
                goto L_0x01ba
            L_0x0171:
                r4 = r2
                r5 = r4
            L_0x0173:
                java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)     // Catch:{ all -> 0x01b9 }
                if (r2 == 0) goto L_0x0198
                boolean r3 = r2.isClosed()
                if (r3 != 0) goto L_0x0198
                r2.close()     // Catch:{ IOException -> 0x0183 }
                goto L_0x0198
            L_0x0183:
                r2 = move-exception
                java.lang.String r3 = p015cm.aptoide.p016pt.install.remote.RemoteInstallationSenderManager.TAG
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r0)
                r6.append(r2)
                java.lang.String r0 = r6.toString()
                android.util.Log.e(r3, r0)
            L_0x0198:
                if (r4 == 0) goto L_0x019d
                r4.close()
            L_0x019d:
                if (r5 == 0) goto L_0x01b8
                r5.close()     // Catch:{ IOException -> 0x01a3 }
                goto L_0x01b8
            L_0x01a3:
                r0 = move-exception
                java.lang.String r2 = p015cm.aptoide.p016pt.install.remote.RemoteInstallationSenderManager.TAG
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r11)
                r3.append(r0)
                java.lang.String r11 = r3.toString()
                android.util.Log.e(r2, r11)
            L_0x01b8:
                return r1
            L_0x01b9:
                r1 = move-exception
            L_0x01ba:
                if (r2 == 0) goto L_0x01db
                boolean r3 = r2.isClosed()
                if (r3 != 0) goto L_0x01db
                r2.close()     // Catch:{ IOException -> 0x01c6 }
                goto L_0x01db
            L_0x01c6:
                r2 = move-exception
                java.lang.String r3 = p015cm.aptoide.p016pt.install.remote.RemoteInstallationSenderManager.TAG
                java.lang.StringBuilder r6 = new java.lang.StringBuilder
                r6.<init>()
                r6.append(r0)
                r6.append(r2)
                java.lang.String r0 = r6.toString()
                android.util.Log.e(r3, r0)
            L_0x01db:
                if (r4 == 0) goto L_0x01e0
                r4.close()
            L_0x01e0:
                if (r5 == 0) goto L_0x01fb
                r5.close()     // Catch:{ IOException -> 0x01e6 }
                goto L_0x01fb
            L_0x01e6:
                r0 = move-exception
                java.lang.String r2 = p015cm.aptoide.p016pt.install.remote.RemoteInstallationSenderManager.TAG
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r3.append(r11)
                r3.append(r0)
                java.lang.String r11 = r3.toString()
                android.util.Log.e(r2, r11)
            L_0x01fb:
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: p015cm.aptoide.p016pt.install.remote.RemoteInstallationSenderManager.SocketClientThread.doInBackground(java.lang.Void[]):java.lang.Boolean");
        }

        /* access modifiers changed from: protected */
        public void onPostExecute(Boolean bool) {
            if (bool.booleanValue()) {
                RemoteInstallationSenderManager.this.listener.onAppSendSuccess();
            } else {
                RemoteInstallationSenderManager.this.listener.onAppSendUnsuccess();
            }
            super.onPostExecute(bool);
        }
    }

    public RemoteInstallationSenderManager(Context context2) {
        this.context = context2;
    }

    public void discoverAptoideTVServices(RemoteInstallationSenderListener remoteInstallationSenderListener) {
        this.listener = remoteInstallationSenderListener;
        new Thread(new Runnable() {
            public void run() {
                try {
                    RemoteInstallationSenderManager.this.multicastLock = ((WifiManager) RemoteInstallationSenderManager.this.context.getSystemService("wifi")).createMulticastLock(RemoteInstallationSenderManager.this.context.getClass().getName());
                    RemoteInstallationSenderManager.this.multicastLock.setReferenceCounted(true);
                    RemoteInstallationSenderManager.this.multicastLock.acquire();
                    RemoteInstallationSenderManager.this.jmDNS = C11592a.m37922a(RemoteInstallationSenderManager.this.getAddress(), Build.MODEL);
                    RemoteInstallationSenderManager.this.jmDNS.mo37841a(RemoteInstallationSenderManager.SERVICE_TYPE, (C11600e) new C11600e() {
                        public void serviceAdded(C11597c cVar) {
                            String str = RemoteInstallationSenderManager.TAG;
                            Log.i(str, "Remote Installation - A service has been added: " + cVar.mo37847c());
                        }

                        public void serviceRemoved(C11597c cVar) {
                            C11598d c = cVar.mo37847c();
                            final Inet4Address inet4Address = c.mo37855e()[0];
                            final int i = c.mo37859i();
                            final String m = c.mo37863m();
                            if (m.contains(RemoteInstallationSenderManager.SERVER_TAG_TO_REMOVE)) {
                                m = m.substring(0, m.length() - 7);
                            }
                            String str = RemoteInstallationSenderManager.TAG;
                            Log.i(str, "Remote Installation - A service has been removed: " + cVar.mo37847c());
                            RemoteInstallationSenderManager.this.runOnUiThread(new Runnable() {
                                public void run() {
                                    RemoteInstallationSenderManager.this.listener.onAptoideTVServiceLost(new ReceiverDevice(m, inet4Address, i));
                                }
                            });
                        }

                        public void serviceResolved(C11597c cVar) {
                            C11598d c = cVar.mo37847c();
                            final Inet4Address inet4Address = c.mo37855e()[0];
                            final int i = c.mo37859i();
                            final String m = c.mo37863m();
                            if (m.contains(RemoteInstallationSenderManager.SERVER_TAG_TO_REMOVE)) {
                                m = m.substring(0, m.length() - 7);
                            }
                            String str = RemoteInstallationSenderManager.TAG;
                            Log.i(str, "Remote Installation - A service has been resolved: " + cVar.mo37847c());
                            RemoteInstallationSenderManager.this.runOnUiThread(new Runnable() {
                                public void run() {
                                    RemoteInstallationSenderManager.this.listener.onAptoideTVServiceFound(new ReceiverDevice(m, inet4Address, i));
                                }
                            });
                        }
                    });
                    RemoteInstallationSenderManager.this.runOnUiThread(new Runnable() {
                        public void run() {
                            RemoteInstallationSenderManager.this.listener.onDiscoveryStarted();
                        }
                    });
                } catch (IOException e) {
                    RemoteInstallationSenderManager.this.runOnUiThread(new Runnable() {
                        public void run() {
                            RemoteInstallationSenderManager.this.listener.onNoNetworkAccess();
                        }
                    });
                    String str = RemoteInstallationSenderManager.TAG;
                    Log.i(str, "Remote Installation - Error on discover: " + e);
                }
            }
        }).start();
        runOnUiThread(new Runnable() {
            public void run() {
                RemoteInstallationSenderManager.this.stopDiscoveringAptoideTVServices();
            }
        }, 20000);
    }

    /* access modifiers changed from: package-private */
    public InetAddress getAddress() throws UnknownHostException {
        int ipAddress = ((WifiManager) this.context.getSystemService("wifi")).getConnectionInfo().getIpAddress();
        return InetAddress.getByAddress(new byte[]{(byte) (ipAddress & 255), (byte) ((ipAddress >> 8) & 255), (byte) ((ipAddress >> 16) & 255), (byte) ((ipAddress >> 24) & 255)});
    }

    /* access modifiers changed from: package-private */
    public void runOnUiThread(Runnable runnable) {
        this.handler.post(runnable);
    }

    public void sendAppId(ReceiverDevice receiverDevice, String str) {
        SocketClientThread socketClientThread = new SocketClientThread(receiverDevice, str);
        this.clientServerThread = socketClientThread;
        socketClientThread.execute(new Void[0]);
    }

    public void stopDiscoveringAptoideTVServices() {
        new AsyncTask<Void, Void, Void>() {
            private boolean closed = false;

            /* access modifiers changed from: protected */
            public Void doInBackground(Void... voidArr) {
                try {
                    if (RemoteInstallationSenderManager.this.jmDNS != null) {
                        RemoteInstallationSenderManager.this.jmDNS.mo37842t();
                        RemoteInstallationSenderManager.this.jmDNS.close();
                        this.closed = true;
                        RemoteInstallationSenderManager.this.jmDNS = null;
                    }
                    if (RemoteInstallationSenderManager.this.multicastLock != null) {
                        RemoteInstallationSenderManager.this.multicastLock.release();
                        RemoteInstallationSenderManager.this.multicastLock = null;
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
                return null;
            }

            /* access modifiers changed from: protected */
            public void onPostExecute(Void voidR) {
                if (this.closed) {
                    RemoteInstallationSenderManager.this.listener.onDiscoveryStopped();
                }
                super.onPostExecute(voidR);
            }
        }.execute(new Void[]{null});
    }

    /* access modifiers changed from: package-private */
    public void runOnUiThread(Runnable runnable, long j) {
        this.handler.postDelayed(runnable, j);
    }
}
