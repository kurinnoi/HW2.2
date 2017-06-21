package com.dgerom89;
/*
Kurinnoi Andrii
ДЗ 02.2
Необходимо реализовать коллекцию, которая имеет фиксированный размер.
Размер задаётся:
по умолчанию 16
по указанию пользователя.
Размер коллекции после инициализации меняться не может.
Каждый новый элемент добавляется в конец. После того, как количество элементов достигло максимума - при добавлении нового элемента коллекция "сдвигается" влево.
1-й элемент удаляется, а каждый следующий смещается на один элемент влево.
Результатом выполнения задания должен быть репозиторий с коллекцией, классом, тестирующим данную коллекцию, описанием задания и README файлом с инструкцией по запуску приложения
    */


public class Main {
    /**
     * Меню выбора действий
     * @param args
     */
    public static void main(String[] args) {
        QueueMethods queueMethods = new QueueMethods();
        int possibilities;
        do {
            System.out.println("Максимальный размер коллекции " + queueMethods.getQueueSize());
            System.out.println("Что будем делать с коллекцией:");
            System.out.println("1) изменять размер коллекции;");
            System.out.println("2) добавлять новый элемент;");
            System.out.println("3) не сегодня - выходим :)");
            possibilities = QueueMethods.getIntegerFromScanner();
            switch (possibilities) {
                case 1: {
                    queueMethods.changeQueueSize();
                    break;
                }

                case 2: {
                    queueMethods.addElement();
                    break;
                }
                case 3: {
                    System.out.println("Хорошего дня! Удачи!");
                    break;
                }
                default: {
                    System.out.println("НЕВЕРНЫЙ ВВОД! Попробуйте еще раз!");
                }
            }
        } while (possibilities != 3);
    }
}


