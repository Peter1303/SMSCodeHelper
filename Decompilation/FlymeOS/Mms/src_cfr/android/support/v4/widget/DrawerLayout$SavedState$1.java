/*
 * Decompiled with CFR 0_110.
 * 
 * Could not load the following classes:
 *  android.os.Parcel
 *  android.os.Parcelable
 *  android.os.Parcelable$Creator
 *  java.lang.Object
 */
package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.widget.DrawerLayout;

final class DrawerLayout$SavedState$1
implements Parcelable.Creator<DrawerLayout.SavedState> {
    DrawerLayout$SavedState$1() {
    }

    public DrawerLayout.SavedState createFromParcel(Parcel parcel) {
        return new DrawerLayout.SavedState(parcel);
    }

    public DrawerLayout.SavedState[] newArray(int n2) {
        return new DrawerLayout.SavedState[n2];
    }
}
