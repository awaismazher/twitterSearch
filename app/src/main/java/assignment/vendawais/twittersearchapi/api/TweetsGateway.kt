package assignment.vendawais.twittersearchapi.api

import assignment.vendawais.twittersearchapi.search.model.Tweets
import retrofit2.http.GET
import retrofit2.http.Query
import rx.Observable

/**
 * Created by syed.awais.mazhar on 2/7/2018.
 */

interface TweetsGateway {
    @GET("1.1/search/tweets.json")
    fun getTweets(@Query("q") query: String, @Query("count") count: String): Observable<Tweets>
}
