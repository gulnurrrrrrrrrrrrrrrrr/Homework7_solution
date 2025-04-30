public abstract class Aircraft {
    protected String id;

    public Aircraft(String id) {
        this.id = id;
    }

    public abstract void receive(String msg);  // Получить сообщение

    public void send(String msg, TowerMediator m) {  // Отправить сообщение через медиатор
        m.broadcast(msg, this);
    }

    public String getId() {
        return id;
    }
}
