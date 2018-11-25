package com.idealcn.todo.kotlin

/**
 * author:guoning
 * date: 2018/11/25 15:31
 * 描述:
 */
class TaskDataRepository : TaskDataSource {

    companion object {
        var INSTANCE : TaskDataRepository? = null
                       get() {
                           return TaskDataRepository()
                       }
    }


    override fun getTaskList() {

    }
}