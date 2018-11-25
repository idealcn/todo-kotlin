package com.idealcn.todo.kotlin.task

import com.idealcn.todo.kotlin.TaskDataRepository
import dagger.Component

/**
 * author:guoning
 * date: 2018/11/25 21:58
 * 描述:
 */
@Component(modules = [TaskModule::class])
interface TaskComponent {

    fun inject(activity: TaskActivity)

    fun getTaskDataRepository(repository: TaskDataRepository) : TaskDataRepository
}