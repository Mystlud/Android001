package retrofit

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch
import retrofit.network.NewsApi
import retrofit.network.NewsApiService

class NewsModel : ViewModel(){ //temapt menampung data-data ui
    fun getTopHeadLine(){
        viewModelScope.launch {
            val response = NewsApi.retrofitService.getTopHeadLine()
            Log.d("response",response)
        }
    }
}