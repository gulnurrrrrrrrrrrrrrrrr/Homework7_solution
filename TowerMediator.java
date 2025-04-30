public interface TowerMediator {
    void broadcast(String msg, Aircraft sender);  // Для передачи сообщений между самолетами
    boolean requestRunway(Aircraft a);  // Запрос на использование полосы (true, если разрешено)
}