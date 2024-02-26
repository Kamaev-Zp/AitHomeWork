package homeWork29;


class DoubleNode {
    Pokemon pokemon;
    DoubleNode prev;  // Ссылка на предыдущий узел
    DoubleNode next;  // Ссылка на следующий узел

    public DoubleNode(Pokemon pokemon) {
        this.pokemon = pokemon;
        this.prev = null;  // По умолчанию предыдущий узел не задан
        this.next = null;  // По умолчанию следующий узел не задан
    }
}

class DoublyLinkedList {
    DoubleNode head;  // Начало списка
    DoubleNode tail;  // Конец списка

    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Метод для добавления покемона в конец списка
    public void addPokemon(Pokemon pokemon) {
        DoubleNode newNode = new DoubleNode(pokemon);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
        }
    }

    // Метод для удаления последнего покемона из списка
    public void removeLastPokemon() {
        if (tail != null) {
            if (tail.prev == null) {  // Если в списке только один покемон
                head = tail = null;
            } else {
                tail = tail.prev;
                tail.next = null;
            }
        }
    }

    // Метод для отображения всех покемонов в списке
    public void displayPokemon() {
        if (head == null) {
            System.out.println("Список покемонов пуст.");
            return;
        }

        System.out.println("Список покемонов:");
        DoubleNode current = head;
        while (current != null) {
            System.out.println(current.pokemon);
            current = current.next;
        }
    }
}
