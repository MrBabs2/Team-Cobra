package p015cm.aptoide.p016pt.account.view.user;

import android.os.Parcel;
import android.os.Parcelable;
import org.parceler.C12412a;
import org.parceler.C12419d;
import org.parceler.ParcelerRuntimeException;
import p015cm.aptoide.p016pt.account.view.user.ManageUserFragment;

/* renamed from: cm.aptoide.pt.account.view.user.ManageUserFragment$ViewModel$$Parcelable */
public class ManageUserFragment$ViewModel$$Parcelable implements Parcelable, C12419d<ManageUserFragment.ViewModel> {
    public static final Parcelable.Creator<ManageUserFragment$ViewModel$$Parcelable> CREATOR = new Parcelable.Creator<ManageUserFragment$ViewModel$$Parcelable>() {
        public ManageUserFragment$ViewModel$$Parcelable createFromParcel(Parcel parcel) {
            return new ManageUserFragment$ViewModel$$Parcelable(ManageUserFragment$ViewModel$$Parcelable.read(parcel, new C12412a()));
        }

        public ManageUserFragment$ViewModel$$Parcelable[] newArray(int i) {
            return new ManageUserFragment$ViewModel$$Parcelable[i];
        }
    };
    private ManageUserFragment.ViewModel viewModel$$0;

    public ManageUserFragment$ViewModel$$Parcelable(ManageUserFragment.ViewModel viewModel) {
        this.viewModel$$0 = viewModel;
    }

    public static ManageUserFragment.ViewModel read(Parcel parcel, C12412a aVar) {
        int readInt = parcel.readInt();
        if (!aVar.mo40463a(readInt)) {
            int a = aVar.mo40460a();
            ManageUserFragment.ViewModel viewModel = new ManageUserFragment.ViewModel();
            aVar.mo40462a(a, viewModel);
            boolean z = true;
            if (parcel.readInt() != 1) {
                z = false;
            }
            viewModel.hasNewPicture = z;
            viewModel.name = parcel.readString();
            viewModel.pictureUri = parcel.readString();
            aVar.mo40462a(readInt, viewModel);
            return viewModel;
        } else if (!aVar.mo40466c(readInt)) {
            return (ManageUserFragment.ViewModel) aVar.mo40465b(readInt);
        } else {
            throw new ParcelerRuntimeException("An instance loop was detected whild building Parcelable and deseralization cannot continue.  This error is most likely due to using @ParcelConstructor or @ParcelFactory.");
        }
    }

    public static void write(ManageUserFragment.ViewModel viewModel, Parcel parcel, int i, C12412a aVar) {
        int a = aVar.mo40461a((Object) viewModel);
        if (a != -1) {
            parcel.writeInt(a);
            return;
        }
        parcel.writeInt(aVar.mo40464b((Object) viewModel));
        parcel.writeInt(viewModel.hasNewPicture ? 1 : 0);
        parcel.writeString(viewModel.name);
        parcel.writeString(viewModel.pictureUri);
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        write(this.viewModel$$0, parcel, i, new C12412a());
    }

    public ManageUserFragment.ViewModel getParcel() {
        return this.viewModel$$0;
    }
}
