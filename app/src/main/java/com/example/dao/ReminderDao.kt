package com.example.dao

import androidx.room.*
import com.example.reminder.Reminder

@Dao
interface ReminderDao {
    @Query("SELECT * FROM reminderTable")
    fun getAllReminders(): List<Reminder>

    @Insert
    fun insertReminder(reminder: Reminder)

    @Delete
    fun deleteReminder(reminder: Reminder)

    @Update
    fun updateReminder(reminder: Reminder)
}