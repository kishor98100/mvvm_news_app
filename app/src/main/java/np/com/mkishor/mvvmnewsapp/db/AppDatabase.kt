package np.com.mkishor.mvvmnewsapp.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import np.com.mkishor.mvvmnewsapp.models.Article


/**
 * @author:  Kishor Mainali
 * @date:  17/11/2020 17:30
 * @email:  mainalikishor@outlook.com
 *
 */
@Database(entities = [Article::class], version = 1, exportSchema = false)
@TypeConverters(Converters::class)
abstract class AppDatabase : RoomDatabase() {

    abstract fun articleDao(): ArticleDao

    companion object {
        @Volatile
        private var instance: AppDatabase? = null
        private val LOCK = Any()

        operator fun invoke(context: Context) = instance ?: synchronized(LOCK) {
            instance ?: createDatabase(context).also {
                instance = it
            }
        }

        private fun createDatabase(context: Context) =
            Room.databaseBuilder(context, AppDatabase::class.java, "mvvm_database.db").build()
    }

}