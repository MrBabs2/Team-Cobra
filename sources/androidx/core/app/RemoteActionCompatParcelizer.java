package androidx.core.app;

import android.app.PendingIntent;
import android.os.Parcelable;
import androidx.core.graphics.drawable.IconCompat;
import androidx.versionedparcelable.C0793b;
import androidx.versionedparcelable.VersionedParcel;

public class RemoteActionCompatParcelizer {
    public static RemoteActionCompat read(VersionedParcel versionedParcel) {
        RemoteActionCompat remoteActionCompat = new RemoteActionCompat();
        remoteActionCompat.f1637a = (IconCompat) versionedParcel.mo4486a(remoteActionCompat.f1637a, 1);
        remoteActionCompat.f1638b = versionedParcel.mo4488a(remoteActionCompat.f1638b, 2);
        remoteActionCompat.f1639c = versionedParcel.mo4488a(remoteActionCompat.f1639c, 3);
        remoteActionCompat.f1640d = (PendingIntent) versionedParcel.mo4485a(remoteActionCompat.f1640d, 4);
        remoteActionCompat.f1641e = versionedParcel.mo4500a(remoteActionCompat.f1641e, 5);
        remoteActionCompat.f1642f = versionedParcel.mo4500a(remoteActionCompat.f1642f, 6);
        return remoteActionCompat;
    }

    public static void write(RemoteActionCompat remoteActionCompat, VersionedParcel versionedParcel) {
        versionedParcel.mo4497a(false, false);
        versionedParcel.mo4506b((C0793b) remoteActionCompat.f1637a, 1);
        versionedParcel.mo4507b(remoteActionCompat.f1638b, 2);
        versionedParcel.mo4507b(remoteActionCompat.f1639c, 3);
        versionedParcel.mo4505b((Parcelable) remoteActionCompat.f1640d, 4);
        versionedParcel.mo4509b(remoteActionCompat.f1641e, 5);
        versionedParcel.mo4509b(remoteActionCompat.f1642f, 6);
    }
}
