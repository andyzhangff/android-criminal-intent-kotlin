package com.example.criminalintentnew.database

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Query
import com.example.criminalintentnew.Crime
import java.util.*

@Dao
interface CrimeDao {

    @Query("SELECT * FROM Crime")
    fun getCrimes(): LiveData<List<Crime>>

    @Query("SELECT * FROM Crime WHERE id=(:id)")
    fun getCrime(id: UUID): LiveData<Crime?>
}