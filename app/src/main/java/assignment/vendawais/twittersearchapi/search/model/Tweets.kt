package assignment.vendawais.twittersearchapi.search.model

import com.google.gson.annotations.SerializedName


class Tweets {

    @SerializedName("statuses")
    val statuses: List<Status>? = null
}
