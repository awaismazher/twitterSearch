package assignment.vendawais.twittersearchapi.search.view.activity

import android.os.Bundle
import android.view.View
import assignment.vendawais.twittersearchapi.R
import assignment.vendawais.twittersearchapi.common.BaseActivity
import assignment.vendawais.twittersearchapi.di.component.AppComponent
import assignment.vendawais.twittersearchapi.search.view.presenter.Presenter
import assignment.vendawais.twittersearchapi.search.view.presenter.TweetsPresenter
import javax.inject.Inject

abstract class MainActivity : BaseActivity(),TweetsPresenter.View {
    @Inject
    var presenter: Presenter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)
        presenter?.setView(this)

    }

    override fun   setupComponent(appComponent: AppComponent?) {
        /*DaggerTweetComponent.builder()
                .appComponent(appComponent)
                .netModule(NetModule(BASE_URL))
                .tweetsModule(TweetsModule(this))
                .build()
                .inject(this)*/
    }
    fun onHelloClicked(view: View){
        presenter?.fetchTweets(null)
    }
    override fun showProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun hideProgress() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun showMessage(message: String?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }


}
