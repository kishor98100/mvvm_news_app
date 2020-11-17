package np.com.mkishor.mvvmnewsapp.models


/**
 * @author:  Kishor Mainali
 * @date:  17/11/2020 17:32
 * @email:  mainalikishor@outlook.com
 *
 */

data class NewsResponse(
    val status: String,
    val totalResults: Int,
    val articles: MutableList<Article>
)