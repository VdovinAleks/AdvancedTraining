package HomeWork6.service;

import HomeWork6.data.Computer;

import java.util.List;

public interface Printable<T extends Computer> { // типизированный интерфейс
    void print(List <Computer> computers);

    //TODO: Создать интерфейс Printable, содержащий описание метода void print(List<Computer>)+

    // на вход метода подаётся коллекция, ничего не возвращается


}


//<> diamond operator