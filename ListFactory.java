// Factory para List
public class ListFactory {
    public static <E> Lista<E> getList(String type) {
        switch (type) {
            case "Simple": return new SimpleLinkedList<>();
            case "Double": return new DoubleLinkedList<>();
            default: return null;
        }
    }
}
