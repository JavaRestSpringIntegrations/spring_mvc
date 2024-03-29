package xenon.learnprogramming.service;

import xenon.learnprogramming.model.TodoData;
import xenon.learnprogramming.model.TodoItem;

public interface TodoItemService {
    void addItem(TodoItem toAdd);
    void removeItem(int id);
    TodoItem getItem(int id);
    void updateItem(TodoItem toUpdate);
    TodoData getData();
}
