package koller.learningspring.Service;

import koller.learningspring.Model.TodoData;
import koller.learningspring.Model.TodoItem;

public interface TodoItemService {

    void addItem(TodoItem todoItem);
    void removeItem(int id);
    void updateItem(TodoItem todoItem);
    TodoData getData();
    TodoItem getItem(int id);
}
