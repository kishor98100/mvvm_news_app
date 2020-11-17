package np.com.mkishor.mvvmnewsapp.db

import androidx.room.TypeConverter
import np.com.mkishor.mvvmnewsapp.models.Source


/**
 * @author:  Kishor Mainali
 * @date:  17/11/2020 17:43
 * @email:  mainalikishor@outlook.com
 *
 */
class Converters {

    @TypeConverter
    fun fromSource(source: Source): String {
        return source.name
    }

    @TypeConverter
    fun toSource(name: String): Source {
        return Source(name, name)
    }
}