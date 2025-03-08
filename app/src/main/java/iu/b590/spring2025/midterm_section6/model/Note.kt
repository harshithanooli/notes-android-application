package iu.b590.spring2025.midterm_section6.model

import com.google.firebase.firestore.PropertyName

data class Note(
    var description: String="",
    var user: User?=null,
    var title: String="",
    @get:PropertyName("creation_time") @set:PropertyName("creation_time")
    var creation_time:Long=0,
    var documentId: String? = null
)