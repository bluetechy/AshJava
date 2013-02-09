package net.richardlord.ash.core;

public class EntityList {
    private Entity head;
    private Entity tail;
    private int size;

    public EntityList() {
        size = 0;
    }

    public void add(Entity entity) {
        if (isEmpty()) {
            head = entity;
            tail = entity;
            entity.setNext(null);
            entity.setPrevious(null);
        } else {
            tail.setNext(entity);
            entity.setPrevious(tail);
            entity.setNext(null);
            tail = entity;
        }
        size++;
    }

    public void remove(Entity entity) {
        if (head == entity) {
            head = head.getNext();
        }

        if (tail == entity) {
            tail = tail.getPrevious();
        }

        if (entity.hasPrevious()) {
            entity.getPrevious().setNext(entity.getNext());
        }

        if (entity.hasNext()) {
            entity.getNext().setPrevious(entity.getPrevious());
        }
        size--;
    }

    public void clear() {
        while (!isEmpty()) {
            Entity entity = head;
            head = entity.getNext();
            remove(entity);
        }
        tail = null;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public Entity getHead() {
        return head;
    }

    public void setHead(Entity head) {
        this.head = head;
    }

    public Entity getTail() {
        return tail;
    }

    public void setTail(Entity tail) {
        this.tail = tail;
    }

    public int getSize() {
        return size;
    }

}
