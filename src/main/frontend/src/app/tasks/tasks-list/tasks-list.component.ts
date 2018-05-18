import {Component, OnInit} from '@angular/core';
import {Task} from "../tasks.model";

@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

  tasks: Task[] = [];

  constructor() {
  }

  ngOnInit() {
    this.tasks.push(new Task(1, "Task 1", true, "05/01/2018"));
    this.tasks.push(new Task(2, "Task 2", false, "05/02/2018"));
    this.tasks.push(new Task(3, "Task 3", false, "05/03/2018"));
    this.tasks.push(new Task(4, "Task 4", false, "05/04/2018"));
  }

  getDueDateLabel(task: Task) {
    return task.completed ? 'label-success' : 'label-primary';
  }

  onTaskChange(event, task: Task) {
    // this.taskService.saveTask(task,  event.target.checked).subscribe();
    console.log("Task has changed");
  }
}
