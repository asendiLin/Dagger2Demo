package com.sendi.dagger2demo.di

import com.sendi.dagger2demo.IMainView
import com.sendi.dagger2demo.model.IModel
import com.sendi.dagger2demo.model.MainModel
import dagger.Module
import dagger.Provides

/**
 * @Date:2018/9/4
 * @Author: Asendi
 * @Description:
 */
@Module
class MainModule constructor(private val mMainView: IMainView) {

    @Provides
    fun providesMainView(): IMainView {
        return mMainView
    }

    @Provides
    fun providesMainModel(): IModel {
        return MainModel()
    }

}