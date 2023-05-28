package p015cm.aptoide.p016pt.account.view.store;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C12412a;
import org.parceler.C12419d;
import org.parceler.ParcelerRuntimeException;
import p015cm.aptoide.p016pt.themes.StoreTheme;

/* renamed from: cm.aptoide.pt.account.view.store.ManageStoreViewModel$$Parcelable */
public class ManageStoreViewModel$$Parcelable implements Parcelable, C12419d<ManageStoreViewModel> {
    public static final Parcelable.Creator<ManageStoreViewModel$$Parcelable> CREATOR = new Parcelable.Creator<ManageStoreViewModel$$Parcelable>() {
        public ManageStoreViewModel$$Parcelable createFromParcel(Parcel parcel) {
            return new ManageStoreViewModel$$Parcelable(ManageStoreViewModel$$Parcelable.read(parcel, new C12412a()));
        }

        public ManageStoreViewModel$$Parcelable[] newArray(int i) {
            return new ManageStoreViewModel$$Parcelable[i];
        }
    };
    private ManageStoreViewModel manageStoreViewModel$$0;

    public ManageStoreViewModel$$Parcelable(ManageStoreViewModel manageStoreViewModel) {
        this.manageStoreViewModel$$0 = manageStoreViewModel;
    }

    public static ManageStoreViewModel read(Parcel parcel, C12412a aVar) {
        StoreTheme storeTheme;
        int readInt = parcel.readInt();
        if (!aVar.mo40463a(readInt)) {
            int a = aVar.mo40460a();
            ManageStoreViewModel manageStoreViewModel = new ManageStoreViewModel();
            aVar.mo40462a(a, manageStoreViewModel);
            manageStoreViewModel.storeDescription = parcel.readString();
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            manageStoreViewModel.newAvatar = z;
            manageStoreViewModel.pictureUri = parcel.readString();
            manageStoreViewModel.storeName = parcel.readString();
            String readString = parcel.readString();
            if (readString == null) {
                storeTheme = null;
            } else {
                storeTheme = (StoreTheme) Enum.valueOf(StoreTheme.class, readString);
            }
            manageStoreViewModel.storeTheme = storeTheme;
            manageStoreViewModel.storeId = parcel.readLong();
            aVar.mo40462a(readInt, manageStoreViewModel);
            return manageStoreViewModel;
        } else if (!aVar.mo40466c(readInt)) {
            return (ManageStoreViewModel) aVar.mo40465b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(ManageStoreViewModel manageStoreViewModel, Parcel parcel, int i, C12412a aVar) {
        String str;
        int a = aVar.mo40461a((Object) manageStoreViewModel);
        if (a != -1) {
            parcel.writeInt(a);
            return;
        }
        parcel.writeInt(aVar.mo40464b((Object) manageStoreViewModel));
        parcel.writeString(manageStoreViewModel.storeDescription);
        parcel.writeInt(manageStoreViewModel.newAvatar ? 1 : 0);
        parcel.writeString(manageStoreViewModel.pictureUri);
        parcel.writeString(manageStoreViewModel.storeName);
        StoreTheme storeTheme = manageStoreViewModel.storeTheme;
        if (storeTheme == null) {
            str = null;
        } else {
            str = storeTheme.name();
        }
        parcel.writeString(str);
        parcel.writeLong(manageStoreViewModel.storeId);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.manageStoreViewModel$$0, parcel, i, new C12412a());
    }

    public ManageStoreViewModel getParcel() {
        return this.manageStoreViewModel$$0;
    }
}
