package com.zkxl.www.mvvm.model.bean

/**
 * Create by Panda on 2019/3/12
 */

data class StateBean<T>(val errorCode: Int, val data: T?, val errorMsg: String) {

    companion object {
        const val SUCCESS = 0
        const val ERROR = 1
        const val EXCEPTION = 2
        const val LOADING = 3

        fun <T> success(data: T?) = StateBean(SUCCESS, data, "success")

        fun <T> error(msg: String, data: T?) = StateBean(ERROR, data, msg)

        fun <T> exception(msg: String, data: T?) = StateBean(ERROR, data, msg)

        fun <T> loading(data: T?) = StateBean(LOADING, data, "loading")
    }

}