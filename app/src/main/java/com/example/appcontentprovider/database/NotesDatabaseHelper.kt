package com.example.appcontentprovider.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper
import android.provider.BaseColumns._ID

class NotesDatabaseHelper (
    context: Context
):SQLiteOpenHelper(context, "databaseNotes", null, 1){
    override fun onCreate(db: SQLiteDatabase?) {
        db?.execSQL("CREATE TABLE_$TABLE_NOTES (" + "$_ID INTEGER NOT NULL PRIMARY KEY" +
                "$_ID INTEGER NOT NULL PRIMARY KEY, " +
                "$TITLES_NOTES TEXT NOT NULL, " +
                "$DESCRIPTION_NOTES TEXT NOT NULL)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }
    companion object{
        const val TABLE_NOTES: String = "Notes"
        const val TITLES_NOTES: String = "title"
        const val DESCRIPTION_NOTES: String = "description"
    }

}