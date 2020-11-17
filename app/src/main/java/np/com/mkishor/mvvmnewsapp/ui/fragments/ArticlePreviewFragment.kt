package np.com.mkishor.mvvmnewsapp.ui.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import np.com.mkishor.mvvmnewsapp.R
/**
 * @author:  Kishor Mainali
 * @date:  17/11/2020 17:31
 * @email:  mainalikishor@outlook.com
 *
 */

class ArticlePreviewFragment : Fragment(R.layout.fragment_article_preview) {
    private val TAG = "ArticlePreviewFragment"

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        Log.d(TAG, "onViewCreated: ArticlePreviewFragment")
    }

}