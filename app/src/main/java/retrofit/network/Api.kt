package retrofit.network

import retrofit2.Retrofit
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.http.GET

val BASE_URL = ""

val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface NewsApiService {
    @GET("")
    suspend fun getTopHeadLine(): String

    @GET("")
    suspend fun getEverything(): String
}

object NewsApi{
    val retrofitService: NewsApiService by lazy {
        retrofit.create(NewsApiService::class.java)
    }
} //object singultan, hanya punya satu instance, lebih menjamin state dari object dapat dikontrol dari seluruh