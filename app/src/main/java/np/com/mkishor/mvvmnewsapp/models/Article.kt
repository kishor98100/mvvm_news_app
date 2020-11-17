package np.com.mkishor.mvvmnewsapp.models

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.io.Serializable


/**
 * @author:  Kishor Mainali
 * @date:  17/11/2020 17:33
 * @email:  mainalikishor@outlook.com
 *
 */
@Entity(tableName = "articles")
data class Article(
    @PrimaryKey(autoGenerate = true)
    val id: Int? = null,
    val author: String?,
    val title: String?,
    val description: String?,
    val url: String?,
    val urlToImage: String?,
    val publishedAt: String?,
    val content: String?,
    val source: Source?,
) : Serializable

