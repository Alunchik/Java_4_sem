package task8.iterator;

public class Client {
    public static void main(String[] args) {
        String[] qualities = {"kind", "open-hearted", "mean", "jealous", "responsible"};
        Human human = new Human("Kirill", qualities);
        Iterator it = human.getIterator();
        System.out.println("Qualities: ");
        while (it.hasNext()){
            System.out.print(it.next().toString() + " ");
        }
    }


}
