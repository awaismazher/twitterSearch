package assignment.vendawais.twittersearchapi.di.module;

import java.util.concurrent.TimeUnit;

import assignment.vendawais.twittersearchapi.api.TweetsGateway;
import assignment.vendawais.twittersearchapi.util.ApiKeys;
import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava.RxJavaCallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import se.akerfeldt.okhttp.signpost.OkHttpOAuthConsumer;
import se.akerfeldt.okhttp.signpost.SigningInterceptor;

/**
 * Created by syed.awais.mazhar on 2/6/2018.
 */

@Module
public class NetModule {

    private final String mBaseUrl;

    public NetModule(String baseUrl){
        this.mBaseUrl = baseUrl;
    }

    @Provides
    public RxJavaCallAdapterFactory provideRxJavaCallAdapterFactory() {
        return RxJavaCallAdapterFactory.create();
    }
    @Provides
    public OkHttpOAuthConsumer provideOkHttpOAuthConsumer(){
        OkHttpOAuthConsumer consumer = new OkHttpOAuthConsumer(ApiKeys.CONSUMER_KEY.getKey(),
                ApiKeys.CONSUMER_SECRET.getKey());
        consumer.setTokenWithSecret(ApiKeys.ACCESS_TOKEN.getKey(),
                ApiKeys.TOKEN_SECRET.getKey());
        return consumer;
    }
    @Provides
    public SigningInterceptor provideSigningInterceptor(OkHttpOAuthConsumer okHttpOAuthConsumer){
        return new SigningInterceptor(okHttpOAuthConsumer);
    }
    @Provides
    public OkHttpClient provideOkHttpClient( SigningInterceptor signingInterceptor){
        return new OkHttpClient.Builder()
                .connectTimeout(20, TimeUnit.SECONDS)
                .readTimeout(20, TimeUnit.SECONDS)
                .addInterceptor(signingInterceptor)
                .build();
    }

    @Provides
    public GsonConverterFactory proivdeGsonConverterFactory(){
        return GsonConverterFactory.create();
    }

    @Provides
    public Retrofit provideRetrofit(OkHttpClient client, GsonConverterFactory converterFactory, RxJavaCallAdapterFactory adapterFactory) {
        return new Retrofit.Builder()
                .baseUrl(mBaseUrl)
                .addConverterFactory(converterFactory)
                .addCallAdapterFactory(adapterFactory)
                .client(client)
                .build();
    }

    @Provides
    public TweetsGateway provideTweetsGateway(Retrofit retrofit){
        return retrofit.create(TweetsGateway.class);
    }
}
