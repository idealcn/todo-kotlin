package com.idealcn.todo.kotlin.contract

/**
 * author:guoning
 * date: 2018/11/24 22:37
 * 描述:
 */
interface TaskContract {
    interface IView {

    }

    interface Presenter {
        fun getTaskList(taskId: String)
    }
}