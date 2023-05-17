public class MyList<E> {
    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;
    private Object elements[];

    public MyList() {
        elements = new Object[DEFAULT_CAPACITY];
    }
    public void add(E e){
        if(size == elements.length){
            ensureCapa();
        }
        elements[size++]=e;
    }
    public void ensureCapa(){
        Object newElement[]=new Object[size*2-1];
        System.arraycopy(elements,0,newElement,0,size);
        elements=newElement;
    }
    public E get(int i){
        if(i<0||i>=size){
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }else {
            return (E) elements[i-1];
        }
    }
}
