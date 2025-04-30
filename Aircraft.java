public abstract class Aircraft {
    protected String id;
    protected boolean isMayday = false;  // Флаг для аварийной ситуации

    public Aircraft(String id) {
        this.id = id;
    }

    public abstract void receive(String msg);

    public void send(String msg, TowerMediator m) {
        m.broadcast(msg, this);
        if ("MAYDAY".equals(msg)) {
            isMayday = true;
            m.broadcast(msg, this);
    }

    public String getId() {
        return id;
    }

    public boolean isMayday() {
        return isMayday;
    }
}
