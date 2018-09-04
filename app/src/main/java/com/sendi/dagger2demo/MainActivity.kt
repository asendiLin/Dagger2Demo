package com.sendi.dagger2demo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.sendi.dagger2demo.di.DaggerAppComponent
import com.sendi.dagger2demo.di.MainModule
import com.sendi.dagger2demo.presenter.IPresenter
import javax.inject.Inject

class MainActivity : AppCompatActivity(), IMainView {

    private lateinit var mTvName: TextView
    @Inject
    lateinit var mPresenter: IPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        DaggerAppComponent
                .builder()
                .mainModule(MainModule(this))
                .build()
                .inject(this)

        mTvName = findViewById(R.id.main_name_tv)

        mPresenter.getName(0)
    }

    override fun showName(name: String) {
        mTvName.text = name
    }
}
