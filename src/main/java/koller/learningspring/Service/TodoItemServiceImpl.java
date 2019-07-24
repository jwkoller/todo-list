package koller.learningspring.Service;

import koller.learningspring.Model.TodoData;
import koller.learningspring.Model.TodoItem;
import lombok.Getter;
import org.springframework.stereotype.Service;

@Service
public class TodoItemServiceImpl implements TodoItemService{

    //-- fields --
    @Getter
    private final TodoData data = new TodoData();

    //--public methods --
    @Override
    public void addItem(TodoItem todoItem) {
        data.addItem(todoItem);

    }

    @Override
    public void removeItem(int id) {
        data.removeItem(id);

    }

    @Override
    public void updateItem(TodoItem todoItem) {
        data.updateItem(todoItem);

    }

    @Override
    public TodoItem getItem(int id) {
        return data.getItem(id);
    }
}
