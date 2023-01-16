package DSA.array;

public class OwnArrayList<T> {

    public static final int SIZE = 3;
    private int size;

    private Object[] array;

    public OwnArrayList() {
        this.size = SIZE;
        array = new Object[this.size];
    }

    public OwnArrayList(int size) {
        this.size = size;
        array = new Object[this.size];
    }

    public static void main(String[] args) {
        OwnArrayList<Integer> ownArrayList = new OwnArrayList();
        ownArrayList.add(10);
        ownArrayList.add(20);
        //ownArrayList.add(30);
        System.out.println(ownArrayList.get(0));

        ownArrayList.display();
    }

    public <T> void add(T t) {
        if (this.size() > this.size) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0; i < this.size; i++) {
            if (array[i] == null) {
                array[i] = t;
                break;
            }
        }
    }

    public Object get(int index) {
        if (index <= this.size) {
            return array[index];
        }
        return new ArrayIndexOutOfBoundsException();
    }

    public int size() {
        int count = 0;
        while (array[count] != null) {
            count++;
        }
        return count;
    }

    public void display() {
        Object[] currentArray = new Object[this.size()];

        System.arraycopy(array, 0, currentArray, 0, this.size());
        for (int j = 0; j < currentArray.length; j++) {
            if (j != currentArray.length - 1)
                System.out.print(currentArray[j] +", ");
            else
                System.out.print(currentArray[j]);
        }
    }

    /*public Object remove(Object obj) {
        
    }*/
}
