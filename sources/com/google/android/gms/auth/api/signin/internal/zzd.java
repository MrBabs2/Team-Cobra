package com.google.android.gms.auth.api.signin.internal;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.PendingResults;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.StatusPendingResult;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.logging.Logger;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public final class zzd implements Runnable {

    /* renamed from: h */
    private static final Logger f13594h = new Logger("RevokeAccessOperation", new String[0]);

    /* renamed from: f */
    private final String f13595f;

    /* renamed from: g */
    private final StatusPendingResult f13596g = new StatusPendingResult((GoogleApiClient) null);

    private zzd(String str) {
        Preconditions.m16046b(str);
        this.f13595f = str;
    }

    /* renamed from: a */
    public static PendingResult<Status> m15210a(String str) {
        if (str == null) {
            return PendingResults.m15360a(new Status(4), (GoogleApiClient) null);
        }
        zzd zzd = new zzd(str);
        new Thread(zzd).start();
        return zzd.f13596g;
    }

    public final void run() {
        Status status = Status.f13684l;
        try {
            String valueOf = String.valueOf(this.f13595f);
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(valueOf.length() != 0 ? "https://accounts.google.com/o/oauth2/revoke?token=".concat(valueOf) : new String("https://accounts.google.com/o/oauth2/revoke?token=")).openConnection();
            httpURLConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            int responseCode = httpURLConnection.getResponseCode();
            if (responseCode == 200) {
                status = Status.f13682j;
            } else {
                f13594h.mo25435b("Unable to revoke access!", new Object[0]);
            }
            Logger logger = f13594h;
            StringBuilder sb = new StringBuilder(26);
            sb.append("Response Code: ");
            sb.append(responseCode);
            logger.mo25433a(sb.toString(), new Object[0]);
        } catch (IOException e) {
            Logger logger2 = f13594h;
            String valueOf2 = String.valueOf(e.toString());
            logger2.mo25435b(valueOf2.length() != 0 ? "IOException when revoking access: ".concat(valueOf2) : new String("IOException when revoking access: "), new Object[0]);
        } catch (Exception e2) {
            Logger logger3 = f13594h;
            String valueOf3 = String.valueOf(e2.toString());
            logger3.mo25435b(valueOf3.length() != 0 ? "Exception when revoking access: ".concat(valueOf3) : new String("Exception when revoking access: "), new Object[0]);
        }
        this.f13596g.mo25012a(status);
    }
}
