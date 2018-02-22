package assignment.vendawais.twittersearchapi.search.model

import android.databinding.Bindable
import com.google.gson.annotations.SerializedName

class User {

    @SerializedName("contributors_enabled")
    var contributorsEnabled: Boolean? = null
    @SerializedName("created_at")
    var createdAt: String? = null
    @SerializedName("default_profile")
    var defaultProfile: Boolean? = null
    @SerializedName("default_profile_image")
    var defaultProfileImage: Boolean? = null
    @SerializedName("description")
    var description: String? = null
    @SerializedName("entities")
    var entities: Any? = null
    @SerializedName("favourites_count")
    var favouritesCount: Long? = null
    @SerializedName("follow_request_sent")
    var followRequestSent: Boolean? = null
    @SerializedName("followers_count")
    var followersCount: Long? = null
    @SerializedName("following")
    var following: Boolean? = null
    @SerializedName("friends_count")
    var friendsCount: Long? = null
    @SerializedName("geo_enabled")
    var geoEnabled: Boolean? = null
    @SerializedName("has_extended_profile")
    var hasExtendedProfile: Boolean? = null
    @SerializedName("id")
    var id: Long? = null
    @SerializedName("id_str")
    var idStr: String? = null
    @SerializedName("is_translation_enabled")
    var isTranslationEnabled: Boolean? = null
    @SerializedName("is_translator")
    var isTranslator: Boolean? = null
    @SerializedName("lang")
    var lang: String? = null
    @SerializedName("listed_count")
    var listedCount: Long? = null
    @SerializedName("location")
    var location: String? = null
    @Bindable
    @SerializedName("name")
    var name: String? = null
    @SerializedName("notifications")
    var notifications: Boolean? = null
    @SerializedName("profile_background_color")
    var profileBackgroundColor: String? = null
    @SerializedName("profile_background_image_url")
    var profileBackgroundImageUrl: Any? = null
    @SerializedName("profile_background_image_url_https")
    var profileBackgroundImageUrlHttps: Any? = null
    @SerializedName("profile_background_tile")
    var profileBackgroundTile: Boolean? = null
    @Bindable
    @SerializedName("profile_image_url")
    var profileImageUrl: String? = null
    @SerializedName("profile_image_url_https")
    @Bindable
    var profileImageUrlHttps: String? = null
    @SerializedName("profile_link_color")
    var profileLinkColor: String? = null
    @SerializedName("profile_sidebar_border_color")
    var profileSidebarBorderColor: String? = null
    @SerializedName("profile_sidebar_fill_color")
    var profileSidebarFillColor: String? = null
    @SerializedName("profile_text_color")
    var profileTextColor: String? = null
    @SerializedName("profile_use_background_image")
    var profileUseBackgroundImage: Boolean? = null
    @SerializedName("protected")
    var protected: Boolean? = null
    @SerializedName("screen_name")
    var screenName: String? = null
    @SerializedName("statuses_count")
    var statusesCount: Long? = null
    @SerializedName("time_zone")
    var timeZone: Any? = null
    @SerializedName("translator_type")
    var translatorType: String? = null
    @SerializedName("url")
    var url: Any? = null
    @SerializedName("utc_offset")
    var utcOffset: Any? = null
    @SerializedName("verified")
    var verified: Boolean? = null

}
