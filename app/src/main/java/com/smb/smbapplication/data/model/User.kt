package com.smb.smbapplication.data.model
/**
 * Created by Shijil Kadambath on 03/08/2018
 * for NewAgeSMB
 * Email : shijil@newagesmb.com
 */
import androidx.annotation.NonNull
import androidx.room.Entity
import com.google.gson.annotations.SerializedName

@Entity(primaryKeys = ["id"])
data class User(
        @field:SerializedName("speciality")
        val name:String,

        @NonNull
        @field:SerializedName("spec_id")
        val id:Integer
)