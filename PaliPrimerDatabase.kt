package com.example.data

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(
    entities = [
        Vocabulary::class,
        GrammarRule::class,
        Exercise::class
    ],
    version = 2,                  // v2: bilingual schema — pali_myanmar, title_mm, source_*, target_*
    exportSchema = false
)
abstract class PaliPrimerDatabase : RoomDatabase() {

    abstract fun vocabularyDao(): VocabularyDao
    abstract fun grammarRuleDao(): GrammarRuleDao
    abstract fun exerciseDao(): ExerciseDao

    companion object {
        @Volatile
        private var INSTANCE: PaliPrimerDatabase? = null

        fun getDatabase(context: Context): PaliPrimerDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    PaliPrimerDatabase::class.java,
                    "pali_primer.db"
                )
                    .createFromAsset("databases/pali_primer.db")
                    .fallbackToDestructiveMigration()   // OK: v2 asset DB replaces v1 on upgrade
                    .build()
                INSTANCE = instance
                instance
            }
        }
    }
}
