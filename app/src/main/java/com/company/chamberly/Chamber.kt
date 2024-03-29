package com.company.chamberly

import com.google.firebase.firestore.FieldValue
import java.io.Serializable

data class Chamber(
    val authorName: String = "", // Display name of the chamber author (retrieved from cache)
    val authorUID: String = "", // UID of the chamber author (retrieved from cache)
    val blockedUsers: List<String> = listOf(), // Empty array of blocked users
    val forPool: Boolean = false, // Set to false
    var groupChatId: String = "", // DocumentID generated by Firestore
    val groupTitle: String = "", // Chamber title entered by the user
    val isLocked: Boolean = false,
    //val locked: Boolean = false, // Set to false
    val membersLimit: Int = 2, // Set to 2
    val publishedPool: Boolean = true, // Set to true
    val timestamp: Any = FieldValue.serverTimestamp() // Timestamp of chamber creation
): Serializable