package com.lntu.data.hikes.entity

import io.realm.kotlin.types.RealmObject
import io.realm.kotlin.types.annotations.PrimaryKey
import org.mongodb.kbson.BsonObjectId
import org.mongodb.kbson.ObjectId

class HikesDb : RealmObject {
    @PrimaryKey
    var id: ObjectId = BsonObjectId()
    var name: String = ""
    var date: Long = 0
}