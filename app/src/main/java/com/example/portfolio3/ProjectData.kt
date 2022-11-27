package com.example.portfolio3

import android.os.Parcel
import android.os.Parcelable

data class ProjectData(
    val id:Int,
    val title:String?,
    val techStack:String?,
    val type:String?,
    val overview:String?,
    val link:String?
):Parcelable{
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString(),
        parcel.readString()
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(id)
        parcel.writeString(title)
        parcel.writeString(techStack)
        parcel.writeString(type)
        parcel.writeString(overview)
        parcel.writeString(link)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<ProjectData> {
        override fun createFromParcel(parcel: Parcel): ProjectData {
            return ProjectData(parcel)
        }

        override fun newArray(size: Int): Array<ProjectData?> {
            return arrayOfNulls(size)
        }
    }


}
