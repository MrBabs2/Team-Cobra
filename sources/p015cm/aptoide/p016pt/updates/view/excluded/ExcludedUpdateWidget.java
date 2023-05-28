package p015cm.aptoide.p016pt.updates.view.excluded;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.database.room.RoomUpdate;
import p015cm.aptoide.p016pt.networking.image.ImageLoader;
import p015cm.aptoide.p016pt.view.recycler.widget.Widget;

/* renamed from: cm.aptoide.pt.updates.view.excluded.ExcludedUpdateWidget */
public class ExcludedUpdateWidget extends Widget<ExcludedUpdateDisplayable> {
    private ImageView icon;
    private CheckBox isExcluded;
    private TextView name;
    private TextView packageName;
    private TextView versionCode;

    public ExcludedUpdateWidget(View view) {
        super(view);
    }

    /* access modifiers changed from: protected */
    public void assignViews(View view) {
        this.icon = (ImageView) view.findViewById(C1086R.C1088id.icon);
        this.name = (TextView) view.findViewById(C1086R.C1088id.name);
        this.versionCode = (TextView) view.findViewById(C1086R.C1088id.version_code);
        this.packageName = (TextView) view.findViewById(C1086R.C1088id.apk_id);
        this.isExcluded = (CheckBox) view.findViewById(C1086R.C1088id.is_excluded);
    }

    public void bindView(ExcludedUpdateDisplayable excludedUpdateDisplayable, int i) {
        RoomUpdate roomUpdate = (RoomUpdate) excludedUpdateDisplayable.getPojo();
        ImageLoader.with(getContext()).load(roomUpdate.getIcon(), this.icon);
        this.name.setText(roomUpdate.getLabel());
        this.versionCode.setText(roomUpdate.getUpdateVersionName());
        this.packageName.setText(roomUpdate.getPackageName());
        this.isExcluded.setOnCheckedChangeListener(new C4427a(excludedUpdateDisplayable));
        this.isExcluded.setChecked(excludedUpdateDisplayable.isSelected());
    }
}
