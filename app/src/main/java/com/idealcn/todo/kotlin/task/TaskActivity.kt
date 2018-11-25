package com.idealcn.todo.kotlin.task

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import com.idealcn.todo.kotlin.R
import com.idealcn.todo.kotlin.TaskApplication
import com.idealcn.todo.kotlin.TaskDataRepository
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject

class TaskActivity : AppCompatActivity() {

    @Inject
    lateinit var presenter: TaskPresenter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val taskComponent = DaggerTaskComponent.builder()
            .taskModule(TaskModule())
            .build()
        taskComponent .inject(this)
        val taskDataRepository = taskComponent.getTaskDataRepository(TaskDataRepository.INSTANCE!!)
        taskDataRepository.getTaskList()
        setToolBar()


        presenter.getTaskList("")
    }

    private fun setToolBar() {
        setSupportActionBar(taskToolBar)
        taskToolBar.title = getString(R.string.app_name)
        taskToolBar.logo = getDrawable(R.drawable.ic_menu)
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menu?.let {
             menuInflater.inflate(R.menu.menu_task,it)
        }
        return super.onCreateOptionsMenu(menu)
    }


    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        item?.let {
            val itemId = it.itemId
            when (itemId) {
                R.id.menu_sort -> {

                }
                R.id.menu_refresh -> {

                }
                else -> {

                }
            }
        }
        return super.onOptionsItemSelected(item)
    }

}
