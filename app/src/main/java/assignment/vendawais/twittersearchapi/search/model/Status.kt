package assignment.vendawais.twittersearchapi.search.model

import android.databinding.Bindable
import com.google.gson.annotations.SerializedName

class Status {
    @SerializedName("contributors")
    var contributors: Any? = null
    @SerializedName("coordinates")
    var coordinates: Any? = null
    @SerializedName("created_at")
    var createdAt: String? = null
    @SerializedName("entities")
    val entities: Any? = null
    @SerializedName("favorite_count")
    var favoriteCount: Long? = null
    @SerializedName("favorited")
    var favorited: Boolean? = null
    @SerializedName("geo")
    var geo: Any? = null
    @SerializedName("id")
    var id: Long? = null
    @SerializedName("id_str")
    var idStr: String? = null
    @SerializedName("in_reply_to_screen_name")
    var inReplyToScreenName: Any? = null
    @SerializedName("in_reply_to_status_id")
    var inReplyToStatusId: Any? = null
    @SerializedName("in_reply_to_status_id_str")
    var inReplyToStatusIdStr: Any? = null
    @SerializedName("in_reply_to_user_id")
    var inReplyToUserId: Any? = null
    @SerializedName("in_reply_to_user_id_str")
    var inReplyToUserIdStr: Any? = null
    @SerializedName("is_quote_status")
    var isQuoteStatus: Boolean? = null
    @SerializedName("lang")
    var lang: String? = null
    @SerializedName("metadata")
    val metadata: Any? = null
    @SerializedName("place")
    var place: Any? = null
    @SerializedName("possibly_sensitive")
    var possiblySensitive: Boolean? = null
    @SerializedName("retweet_count")
    var retweetCount: String? = null
    @SerializedName("retweeted")
    var retweeted: Boolean? = null
    @SerializedName("source")
    var source: String? = null
    @Bindable
    @SerializedName("text")
    var text: String? = null
    @SerializedName("truncated")
    var truncated: Boolean? = null
    @Bindable
    @SerializedName("user")
    var user: User? = null

}
