package com.dgerom89;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by Dgerom on 21.06.2017.
 */
public class QueueMethods {
    private Queue<Integer> queue = new LinkedList<Integer>() {

    };

    private int queueSize = 16;
    private boolean initialSize = true;
    private static Scanner in = new Scanner(System.in);

    int getQueueSize() {
        return queueSize;
    }

    /**
     * Изменение размера коллекции
     */
    void changeQueueSize() {
        if (!initialSize) {
            System.out.println("Размер коллекции изменился! Теперь он имеет размер" + queueSize);
        } else {
            System.out.println("Размер коллекции " + queueSize);
            initialSize = false;
            System.out.println("Введите новый размер коллекции: ");
            queueSize = getIntegerFromScanner();
            while (queue.size() > queueSize) {
                queue.remove();
            }
        }
        showQueue();
    }

    /**
     * Добавление элемента в коллекцию
     */
    void addElement() {
        System.out.print("Введите добавляемый элемент коллекции: ");
        if (queue.size() == queueSize) {
            queue.remove();
        }
        queue.add(getIntegerFromScanner());
        showQueue();
    }

    /**
     * Вывод всей коллекции на экран
     * используется в методах addElement и changeQueueSize
     */
    private void showQueue() {
        System.out.println(queue);
    }

    static int getIntegerFromScanner() {
        int i;
        try {
            i = in.nextInt();
        } catch (Exception e) {
            System.out.println("НЕВЕРНЫЙ ВВОД! Попробуйте еще раз!");
            in.next();
            i = getIntegerFromScanner();
        }
        return i;
    }
}
