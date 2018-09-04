package com.sendi.dagger2demo.di

import com.sendi.dagger2demo.MainActivity
import dagger.Component

/**
 * @Date:2018/9/4
 * @Author: Asendi
 * @Description:
 */
@Component(modules = [
    (MainModule::class),
    (BindModule::class)
])
interface AppComponent {

    fun inject(activity: MainActivity)

}