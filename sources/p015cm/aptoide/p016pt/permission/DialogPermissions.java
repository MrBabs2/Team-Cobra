package p015cm.aptoide.p016pt.permission;

import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TableLayout;
import android.widget.TextView;
import androidx.appcompat.app.C0074c;
import androidx.fragment.app.Fragment;
import com.bumptech.glide.C5874c;
import java.util.ArrayList;
import java.util.List;
import p015cm.aptoide.p016pt.C1086R;
import p015cm.aptoide.p016pt.permissions.ApkPermissionGroup;
import p015cm.aptoide.p016pt.util.AppUtils;
import p015cm.aptoide.p016pt.utils.AptoideUtils;
import p015cm.aptoide.p016pt.view.fragment.BaseDialogFragment;

/* renamed from: cm.aptoide.pt.permission.DialogPermissions */
public class DialogPermissions extends BaseDialogFragment {
    private String appName;
    private String icon;
    private String size;
    private List<String> usedPermissions;
    private String versionName;

    public static DialogPermissions newInstance(String str, String str2, String str3, String str4, List<String> list) {
        DialogPermissions dialogPermissions = new DialogPermissions();
        dialogPermissions.appName = str;
        dialogPermissions.versionName = str2;
        dialogPermissions.icon = str3;
        dialogPermissions.size = str4;
        dialogPermissions.usedPermissions = list;
        return dialogPermissions;
    }

    /* renamed from: a */
    public /* synthetic */ void mo13322a(View view) {
        dismiss();
    }

    public Dialog onCreateDialog(Bundle bundle) {
        View inflate = LayoutInflater.from(getActivity()).inflate(C1086R.layout.layout_dialog_permissions, (ViewGroup) null);
        C0074c.C0075a aVar = new C0074c.C0075a(new ContextThemeWrapper(getContext(), this.themeManager.getAttributeForTheme(C1086R.attr.dialogsTheme).resourceId));
        aVar.mo229b(inflate);
        C0074c a = aVar.mo225a();
        inflate.findViewById(C1086R.C1088id.dialog_ok_button).setOnClickListener(new C3569a(this));
        ((TextView) inflate.findViewById(C1086R.C1088id.dialog_app_info)).setText(getString(C1086R.string.dialog_version_size, this.versionName, this.size));
        ((TextView) inflate.findViewById(C1086R.C1088id.dialog_app_name)).setText(this.appName);
        C5874c.m11483a((Fragment) this).mo19999a(this.icon).mo19991a((ImageView) inflate.findViewById(C1086R.C1088id.dialog_appview_icon));
        TableLayout tableLayout = (TableLayout) inflate.findViewById(C1086R.C1088id.dialog_table_permissions);
        ArrayList<ApkPermissionGroup> fillPermissionsGroups = AppUtils.fillPermissionsGroups(AptoideUtils.SystemU.parsePermissions(getContext(), this.usedPermissions));
        if (fillPermissionsGroups.size() == 0) {
            TextView textView = new TextView(getContext());
            textView.setText(getString(C1086R.string.no_permissions_required));
            textView.setPadding(5, 5, 5, 5);
        } else {
            AppUtils.fillPermissionsForTableLayout(getContext(), tableLayout, fillPermissionsGroups);
        }
        return a;
    }

    public void onPause() {
        dismiss();
        super.onPause();
    }
}
