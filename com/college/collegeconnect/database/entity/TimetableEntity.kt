package com.college.collegeconnect.database.entity

import androidx.room.Entity

@Entity
open class TimetableEntity(
        val subjectName: String,
        val startTime: String,
        val startTimeShow: String,
        val endTime: String,
        val endTimeShow: String,
        val roomNumber: String
)