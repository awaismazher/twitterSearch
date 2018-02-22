package assignment.vendawais.twittersearchapi.search.model;

import android.databinding.BindingAdapter;
import android.support.v7.widget.RecyclerView;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import jp.wasabeef.picasso.transformations.CropCircleTransformation;

/**
 * Created by syed.awais.mazhar on 2/12/2018.
 */

public class UserProfileView {
    @BindingAdapter({"bind:image_url"})
    public static void loadImage(ImageView imageView, String url) {
        Picasso.with(imageView.getContext())
                .load(url)
                .transform(new CropCircleTransformation())
                .resize(200, 200)
                .into(imageView);
    }
}
