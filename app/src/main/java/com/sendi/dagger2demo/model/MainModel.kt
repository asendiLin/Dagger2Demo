package com.sendi.dagger2demo.model

/**
 * @Date:2018/9/4
 * @Author: Asendi
 * @Description:
 */
class MainModel : IModel {

    override fun getName(id: Int): String {
        return if (id % 2 == 0) {
            "sendi first"
        } else {
            "sendi second"
        }
    }
}