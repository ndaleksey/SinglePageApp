import {Component, OnInit} from '@angular/core';
import {TaskService} from "../task.service";

@Component({
  selector: 'app-tasks-add',
  templateUrl: './tasks-add.component.html',
  styleUrls: ['./tasks-add.component.css']
})
export class TasksAddComponent implements OnInit {
  addTaskValue: any;

  constructor(private taskService: TaskService) {
  }

  ngOnInit() {
  }

  onTaskAdd(event) {
    // this.taskService.addTask(event.)
  }
}
