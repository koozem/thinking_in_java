package ru.kiskiny.koozem.chapter06.task08;

public class ConnectionManager {
    private static int count; //счетчик созданных объектов
    private ConnectionManager() {} //конструктор сделать private

    private static ConnectionManager[] cm = { //определить массив объектов
            new ConnectionManager(),
            new ConnectionManager(),
            new ConnectionManager(),
            new ConnectionManager(),
            new ConnectionManager(),
    };

    //функция возвращающая ссылку на объект,
    //если лимит объектов не исчерпан
    //иначе вернуть null
    static ConnectionManager connect() {
        ConnectionManager x;
        switch (count) {
            case 0:
                x = cm[0]; break;
            case 1:
                x = cm[1]; break;
            case 2:
                x = cm[2]; break;
            case 3:
                x = cm[3]; break;
            case 4:
                x = cm[4]; break;
            default:
                x = null;
        }
        count++;
        return x;
    }
}

class Connection {

    public static void main(String[] args) {
        //! ConnectionManager con = new ConnectionManager(); нельзя

        ConnectionManager a = ConnectionManager.connect();
        ConnectionManager b = ConnectionManager.connect();
        ConnectionManager c = ConnectionManager.connect();
        ConnectionManager d = ConnectionManager.connect();
        ConnectionManager e = ConnectionManager.connect();
        ConnectionManager f = ConnectionManager.connect();
        ConnectionManager g = ConnectionManager.connect();

        System.out.println(b);
        System.out.println(a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
    }
}