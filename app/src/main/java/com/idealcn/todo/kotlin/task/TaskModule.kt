package com.idealcn.todo.kotlin.task

import com.idealcn.todo.kotlin.TaskDataRepository
import dagger.Module
import dagger.Provides

/**
 * author:guoning
 * date: 2018/11/25 21:59
 * 描述:
 */
@Module
class TaskModule {

    @Provides
    fun provideTaskDataRepository(repository: TaskDataRepository) : TaskDataRepository = repository

}