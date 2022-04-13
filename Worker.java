
public class Worker {

//Для того, чтобы класс Worker мог вернуть резлультат своей работы, реализуйте собственный функциональный интерфейс OnTaskDoneListener. В нем определите только один метод onDone() без реализации и пометьте интерфейс аннотацией @FunctionalInterface:

    //Добавьте в класс Worker переменную callback типа OnTaskDoneListener:
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    //Передайте в класс Worker ее значение через конструктор:
    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;


    }

    //Смоделируйте выполнение классом Worker какой либо работы, например:
    public void start() {
        for (int i = 0; i < 100; i++) {
            callback.onDone("Task " + i + " is Done");
            if (i == 33) {
                errorCallback.onError("Task " + i + " is UNDONE");
            }
        }
    }
}