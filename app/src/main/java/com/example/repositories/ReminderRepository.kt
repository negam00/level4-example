package com.example.repositories

import android.content.Context
import com.example.dao.ReminderDao
import com.example.models.ReminderRoomDatabase
import com.example.reminder.Reminder

public class ReminderRepository(context: Context) {
    private var reminderDao: ReminderDao?

    init {
        val reminderRoomDatabase = ReminderRoomDatabase.getDatabase(context)
        reminderDao = reminderRoomDatabase?.reminderDao()
    }

    fun getAllReminders(): List<Reminder> {
        return reminderDao?.getAllReminders() ?: emptyList()
    }

    fun insertReminder(reminder: Reminder) {
        reminderDao?.insertReminder(reminder)
    }

    fun deleteReminder(reminder: Reminder) {
        reminderDao?.deleteReminder(reminder)
    }

    fun updateReminder(reminder: Reminder) {
        reminderDao?.updateReminder(reminder)
    }

}


