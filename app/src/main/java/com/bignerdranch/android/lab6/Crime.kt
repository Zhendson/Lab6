package com.bignerdranch.android.lab6

import java.util.*
import java.util.Date

data class Crime(val id: UUID =
                     UUID.randomUUID(),
                 var title: String = "",
                 var date: Date = Date(),
                 var isSolved: Boolean = false)