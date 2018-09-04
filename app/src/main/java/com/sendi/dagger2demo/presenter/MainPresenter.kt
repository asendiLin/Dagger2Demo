package com.sendi.dagger2demo.presenter

import com.sendi.dagger2demo.IMainView
import com.sendi.dagger2demo.model.IModel
import javax.inject.Inject

/**
 * @Date:2018/9/4
 * @Author: Asendi
 * @Description:
 */
class MainPresenter @Inject constructor(val mainView: IMainView, val mainModel: IModel) : IPresenter {

    override fun getName(id: Int) {
        val name = mainModel.getName(id)
        mainView.showName(name)
    }
}