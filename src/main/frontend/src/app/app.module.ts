import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http'

import { AppComponent } from './app.component';
import { TasksComponent } from './tasks/tasks.component';
// import {TaskService} from "./tasks/task.service";
import { TasksListComponent } from './tasks/tasks-list/tasks-list.component';
import { TasksAddComponent } from './tasks/tasks-add/tasks-add.component';

@NgModule({
  declarations: [
    AppComponent,
    TasksListComponent,
    TasksComponent,
    TasksAddComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
