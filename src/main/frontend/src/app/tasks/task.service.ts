import {Http, Response} from "@angular/http";
import {Injectable} from "@angular/core";
import {map} from "rxjs/operators";
import {Task} from './tasks.model';


@Injectable({
  providedIn: 'root',
})
export class TaskService {

  constructor(private http: Http) {
  }

  getTasks() {
    return this.http.get('/api/tasks').pipe(map((res: Response) => {
      console.log(res.json());
      return res.json();
    }));
  }

  saveTask(task: Task, checked: boolean) {
    task.completed = checked;
    return this.http.post('/api/tasks/save', task).pipe(map((res:Response)=>res.json()));
  }

  addTask(task: Task, checked: boolean) {
    return this.http.post('/api/tasks/save', task).pipe(map((res:Response)=>res.json()));
  }
}
