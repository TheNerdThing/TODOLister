package com.example.asdf.todolister;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Objects;

public class  TaskList  implements Serializable {
    public class Task{
        private boolean     taskCompleate;

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Task task = (Task) o;
            return  taskName.equals(task.getTaskName())  &&
                    taskDescription.equals(task.getTaskDescription());
        }



        private String      taskName;
        private String      taskDescription;

        public Task(boolean taskCompleate, String taskName, String taskDescription) {
            this.taskCompleate = taskCompleate;
            this.taskName = taskName;
            this.taskDescription = taskDescription;
        }

        public boolean isTaskCompleate() {
            return taskCompleate;
        }

        public void setTaskCompleate(boolean taskCompleate) {
            this.taskCompleate = taskCompleate;
        }

        public String getTaskName() {
            return taskName;
        }

        public void setTaskName(String taskName) {
            this.taskName = taskName;
        }

        public String getTaskDescription() {
            return taskDescription;
        }

        public void setTaskDescription(String taskDescription) {
            this.taskDescription = taskDescription;
        }
    }

    private ArrayList<Task>     list ;
    private String              name;

    public TaskList(ArrayList<Task> list, String name) {
        this.list = list;
        this.name = name;
    }

    public void add(Task add){
        list.add(add);
    }

    public Task get(int i)  {
        return list.get(i);
    }

    public void remove(Task remove){
        for(int i = 0; i < list.size(); i++){
            if( list.get(i).equals(remove)){
                list.remove(i);
                return;
            }

        }
    }

}

