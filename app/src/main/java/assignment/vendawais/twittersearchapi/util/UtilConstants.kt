package assignment.vendawais.twittersearchapi.util

/**
 * Created by syed.awais.mazhar on 2/7/2018.
 */

object Constants {
    val LAHORE = "lahore"
    val COUNT = "50"
}
enum class ApiKeys(val key: String){
    CONSUMER_KEY("ZDmOMMdc7gUfLQ2tjyigSYahw"),
    CONSUMER_SECRET("ygt0atWfkou7B6qgmQtFFQU4jjveSKiwXQDjb8GVyW26TFtXss"),
    ACCESS_TOKEN("52298550-EuaE8gPO0CevyFLe0yTfz8wFA33JoyU47UL0i375w"),
    TOKEN_SECRET("vK3UrGq65bEe2EYqjkXZRU6lykbmaEywbLZBFHhDGMzl7")
}
object EndPoints{
    val BASE_URL = "https://api.twitter.com/"
    val SEARCH = "1.1/search/tweets.json"
}
