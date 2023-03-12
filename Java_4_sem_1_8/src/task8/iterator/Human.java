package task8.iterator;

public class Human  implements Collection{
    private String name;
    private  String[] qualities;

    public Human(String name, String[] qualities) {
        this.name = name;
        this.qualities = qualities;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getQualities() {
        return qualities;
    }

    public void setQualities(String[] qualities) {
        this.qualities = qualities;
    }

    @Override
    public Iterator getIterator() {
        return new QualityIterator();
    }

    private class QualityIterator implements Iterator{
        int index;

        @Override
        public boolean hasNext() {
            if(index<qualities.length){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            return qualities[index++];
        }
    }
}
